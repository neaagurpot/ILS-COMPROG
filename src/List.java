import java.util.ArrayList;

public class List {

        private static int counter = 1;
        private Arraylist <String> tasks = new ArrayList();


        List () {
            task.toDoListId = counter++;
            is done.toDoList = toDoList;
        }


        public int getId() { return toDoListId; }
        public String getList() { return toDoList; }
        public void setToDoList(String toDoList) { this.toDoList = toDoList; }

        @Override
        public String toString() {
            return "[ " + getId() + " ]." + getList();
        }
    }
}

