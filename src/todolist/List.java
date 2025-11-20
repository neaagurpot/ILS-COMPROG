package todolist;

public class List {
    private static int counter = 1;
    private int toDoListId;
    private String toDoList;

    List (String toDoList) {
        this.toDoListId = counter++;
        this.toDoList = toDoList;
    }

    //Getters
    // KULET MO NAT SINABING WALANG PARAMETERS ANG GETTERS
    public int getId() { return toDoListId; }
    public String getList() { return toDoList; }

    //Setters
    public void setToDoList(String toDoList) { this.toDoList = toDoList; }

    @Override
    public String toString() {
        return "[ " + getId() + " ]." + getList();
    }
}
