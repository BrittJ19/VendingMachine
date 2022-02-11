package com.techelevator.view;

import com.techelevator.*;

import javax.swing.text.html.Option;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;

public class Menu {

	private PrintWriter out;
	private Scanner in;


	public Menu(InputStream input, OutputStream output) {
		this.out = new PrintWriter(output);
		this.in = new Scanner(input);
	}

	double money;
	File inventoryList = new File("vendingmachine.csv");
	Inventory inventory = new Inventory(inventoryList);
	Money moneyObject = new Money(money);
	Machine machine = new Machine(inventory);

	public Object getChoiceFromOptions(Object[] options) {
		Object choice = null;
		while (choice == null) {
			displayMenuOptions(options);
			choice = getChoiceFromUserInput(options);
		}
		return choice;
	}

	private Object getChoiceFromUserInput(Object[] options) {
		Object choice = null;
		String userInput = in.nextLine();
		try {
			int selectedOption = Integer.valueOf(userInput);
			if (selectedOption > 0 && selectedOption <= options.length) {
				choice = options[selectedOption - 1];
			}
		} catch (NumberFormatException e) {
			// eat the exception, an error message will be displayed below since choice will be null
		}
		if (choice == null) {
			out.println(System.lineSeparator() + "*** " + userInput + " is not a valid option ***" + System.lineSeparator());
		}
		return choice;
	}

	private void displayMenuOptions(Object[] options) {
		out.println();
		for (int i = 0; i < options.length; i++) {
			int optionNum = i + 1;
			out.println(optionNum + ") " + options[i]);
		}
		out.print(System.lineSeparator() + "Please choose an option >>> ");
		out.flush();
	}

	public Scanner getIn() {
		return in;
	}

	public void getDisplay() {
		for (Map.Entry<String, Slot> entry : inventory.getInventoryMap().entrySet()) {
			String key = entry.getKey();
			Slot value = entry.getValue();
			System.out.println(key + "|" + value.getProduct().getProductName() + "|" + value.getProduct().getPrice() + "|" + value.getQuantity());

		}
	}

	public void feedMoney() {
		System.out.println("Insert Money");
		String inputMoney = in.nextLine();
		double money = Double.parseDouble(inputMoney);
		machine.feedMoney(money);
		System.out.println("Current Money Provided:" + " " + "$" + money
		);

	}

	//	String productName = inventory.getInventoryMap().get().getProduct();
	public void purchase() {
		if (moneyObject.getMoney() < 1){
			System.out.println("Feed Money, select option 2");

		}
		getDisplay();
		System.out.println("Select Slot");
		String inputSlot = in.nextLine();
		if (inventory.getInventoryMap().containsKey(inputSlot)) {
			if (machine.getFunds() < inventory.getInventoryMap().get(inputSlot).getPrice()) {
				System.out.println("Insufficient Funds, Feed in money");
			} else if (inventory.getInventoryMap().get(inputSlot).getQuantity() == 0) {
				System.out.println("SOLD OUT");
			} else {
				Product product = machine.purchaseProduct(inputSlot);

//				inventory.getInventoryMap().get(inputSlot).setQuantity(inventory.getInventoryMap().get(inputSlot).getQuantity() - 1);
				System.out.println("You just bought: " + product.productName + " " + product.getMessage() + " " + machine.getFunds());;
			}

		} else {
			System.out.println("Product does not exist");
		}
	}
}
