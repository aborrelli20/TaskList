package TaskListPackage;


import java.util.ArrayList;

import java.util.Scanner;

public class methods {
	static Scanner userInput = new Scanner(System.in);
	static  ArrayList<TaskProperties> tasks = new ArrayList<TaskProperties>();
	
	public static void displayMenu() {
		System.out.println("--Task Master--");
		System.out.println("1. Add item to the list");
		System.out.println("2. Remove item from the list");
		System.out.println("3. Complete item");
		System.out.println("4. Show list");
		System.out.println("0. End of line----");
		System.out.println("Your choice: ");
	}
	
	public static int readUserInput() {
		int result = userInput.nextInt();
		userInput.nextLine();
		return result;
	}
	
	//add task
	public static void addTask(String name) {
		tasks.add(new TaskProperties(name));
	}
	
	//remove task
	public static void removeTask(int id){
		tasks.remove(id - 1);
		}
	
	//complete task
	public static void completeTask(int id) {
		tasks.get(id - 1).setComplete(true);
	}
	
	//list tasks
	public static void listTasks() {
		System.out.println("--To Do list--");
		for(int i = 0; i < tasks.size(); i++) {
			System.out.println(i + 1 + ". " + tasks.get(i).toString());
		}
	}
	
	
}
