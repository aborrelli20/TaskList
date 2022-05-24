package TaskListPackage;



public class MainArea {	
	
	public static void main(String[] args) throws Exception {
		//task manager
			//display menu
		 boolean running = true;
		 
		 do {
			 methods.displayMenu();
			 int menuChoice = methods.readUserInput();
			 
			 try {
			 
			 switch(menuChoice) {
				 case 1: 
					 System.out.println("What do you want to add?");
					 //add task method
					 String taskName = methods.userInput.nextLine();
					 methods.addTask(taskName);
					 System.out.println(taskName + " added. \n");
					 
					 break;
				 case 2:
					 System.out.println("Task to be removed: ");
					 methods.listTasks();
					 int removeId = methods.readUserInput();
					 methods.removeTask(removeId); 
					 System.out.println("Item number " + removeId + " removed. \n");
					 break;
				 case 3:
					 System.out.println("Item to complete: ");
					 methods.listTasks();
					 int completeId = methods.readUserInput();
					 methods.completeTask(completeId);
					 System.out.println(completeId + " completed. \n");
					 break;
				 case 4:
					 //list method
					 methods.listTasks();
					 if(methods.tasks.size() == 0) {
						 System.out.println("Task list is empty.");
					 }
					 System.out.println("\n");
					 break;
				
				 case 0:
					 running = false;
					 break;
				 default:
					 System.out.println("UNKNOWN");
			 }
			 } catch (Exception e) {
				 System.out.println("Invalid user input. Please choose a number from the list. \n \n");
				 continue;
			 }
		 } while(running);
		 
	
	}
	
	
}
