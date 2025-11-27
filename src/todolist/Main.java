package todolist;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListManager manager = new ListManager();
        int choice;
        int id = 0;
        do {
            try {
                System.out.println("""
	                		      ---------------------------------------
	                		                  WELCOME USER!            
	                		      ---------------------------------------
	                        [1]. Add TO DO LIST.                 
	                        [2]. VIEW LIST.                      
	                        [3]. MARK TASK
	                        [4]. delete list.                    
	                        [5]. EXIT                            
	                        ---------------------------------------
	                                  Enter your Choice.          
	                        ---------------------------------------
	                        """);
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                Thread.currentThread().interrupt();
                System.out.println("Choice must be a Number");
                break;
            }

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter task");
                    String toDoList = sc.nextLine();
                    manager.addList(toDoList);
                }
                case 2 -> {
                    System.out.println("\n=== TO DO LIST ===");
                    System.out.println("---------------------------------------");
                    manager.viewList();
                }
                case 3 -> {
                    manager.markTask();
                }
                case 4 -> {
                    try {
                        System.out.print("Enter id to Delete: ");
                        id = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Input must be a number");
                        return;
                    }
                    manager.deleteListById(id);
                }
                case 5 -> {
                    System.out.println("Exiting");

                        try {
                            for (int i = 0; i < 5; i++) {
                                Thread.sleep(400);
                                System.out.println(".");
                                System.exit(0);
                                sc.close();
                            }
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            System.exit(0);
                            sc.close();
                        }
                    }
                }
            } while (choice != 5);
        }

    }


