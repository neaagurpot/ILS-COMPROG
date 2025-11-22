package todolist;
import java.util.Scanner;
import java.util.LinkedList;
public class ListManager {
    private LinkedList<List> listManager = new LinkedList<>();
    private Scanner sc = new Scanner(System.in);

    public void addList(String toDoList) {
        List list = new List(toDoList);
        listManager.add(list);
        System.out.println("Task Added!: " + list.getId() + " " +toDoList);
    }

    public void viewList() {
        if (listManager.isEmpty()) {
            System.out.println("You are free today!");
            return;
        }

        for (List list : listManager) {

            System.out.println(list);

        }
    }

    public void accessToDoListById(int id) {
        List listToSearch = listManager.get(id);

        if (id != listToSearch.getId()) {
            System.out.println("FOUND: " + listToSearch.getList());
        } else {
            System.out.println("Invalid ID");
        }

    }

    public void deleteListById(int id) {

        if (listManager.isEmpty()) {
            System.out.println("There's nothing to delete");
            return;
        }

        List list =  listManager.remove(id);
        if (id != list.getId()) {
            System.out.println("Removed Successfully: " + list.getList());
        } else {
            System.out.println("Task number not found");
        }
    }

    public void markTask() {
        viewList();

        if (!listManager.isEmpty()) {
            System.out.println("Enter a task number to MARK DONE");
            int id = sc.nextInt();
            int index = id - 1;
            if (index >= 0 && index < listManager.size()) {
                System.out.println();
                List completedTask = listManager.get(index);
                completedTask.setToDoList(completedTask.getList() + " - ✅");
                System.out.println("Marked as Done: " + completedTask.getList());
            } else {
                System.out.println(" - PENDING");
            }
        }

    }
}