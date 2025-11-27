package todolist;

public class List {
    private static int counter = 1;
    private final int toDoListId;
    private String toDoList;

    public List(String toDoList) {
        this.toDoListId = counter++;
        this.toDoList = toDoList;
    }

    public List(int id, String toDoList) {
        this.toDoListId = id;
        this.toDoList = toDoList;

        if (id >= counter) counter = id + 1;
    }

    public int getId() {
        return toDoListId;
    }

    public String getList() {
        return toDoList;
    }

    public void setToDoList(String toDoList) {
        this.toDoList = toDoList;
    }

    public String toFileFormat() {
        return "ID: " + toDoListId + " | List: " + toDoList;
    }

    @Override
    public String toString() {
        return toFileFormat();
    }

    public static List fromFile(String line) {
        String[] parts = line.split("\\|");

        int id = Integer.parseInt(parts[0].replace("ID:", "").trim());
        String list = parts[1].replace("List:", "").trim();

        return new List(id, list);
    }
}
