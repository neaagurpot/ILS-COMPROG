package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<task> tasks = new ArrayList<>();

    public static void addTask(Scanner sc) {
        System.out.println("How many task you like to add?");
        int addTaskNum = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < addTaskNum; i++) {
            System.out.println("Enter task " + (i + 1) + ": ");
            String task = sc.nextLine();
            tasks.add(task);
            System.out.println("Task added!");
        }
    }

    public static void showTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks for today");
        } else {
            System.out.println("To do list");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }

        public void viewDoneTasks() {
            boolean found = false;
            for (Task task : tasks) {
                if (task.isDone()) {
                    System.out.println(task);
                    found = true;
                }
            }
            if System.out.println("No done tasks yet.");
        }

        public void viewPendingTasks() {
            boolean found = false;
            for (Task task : tasks) {
                if (task.isDone()) {
                    System.out.println(task);
                    found = true;
                }
            } else {
                System.out.println("No pending tasks.");
            }

        public void markTaskDone(){
                showTask();
               if (num <1 || num >task.size ()) {
                   System.out.println("Invalid task number");
                   return;
               }

        public void



            }

        }

    }

}