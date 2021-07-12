package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class TodoListModelTest {


    @Test
    void addItem() {
        TodoListModel todoAction = new TodoListModel();
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        String date = "10/25/2021";
        String description = "Get food";
        String complete = "yes";
        String expected ="Item successfully added";
        String actual = todoAction.addItem(list,date,description,complete);
        assertEquals(expected,actual);
    }

    @Test
    void removeItem() {
        TodoListModel todoAction = new TodoListModel();
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        HashMap<String,String> newItem = new HashMap<>();
        int index=0;
        newItem.put("date","5/25/2021");
        newItem.put("description","get food");
        newItem.put("complete","yes");
        list.add(newItem);
        String actual = todoAction.removeItem(list,index);
        String expected = "Item successfully removed";
        assertEquals(expected,actual);
    }

    @Test
    void editItemDescription() {
        TodoListModel todoAction = new TodoListModel();
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        HashMap<String,String> newItem = new HashMap<>();
        int index=0;
        newItem.put("date","5/25/2021");
        newItem.put("description","get food");
        newItem.put("complete","yes");
        list.add(newItem);
        String description = "get food and sleep";
        String actual = todoAction.editItemDescription(list,index,description);
        String expected = "Item description successfully changed";
        assertEquals(expected,actual);
    }

    @Test
    void editItemDueDate() {
        TodoListModel todoAction = new TodoListModel();
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        HashMap<String,String> newItem = new HashMap<>();
        int index=0;
        newItem.put("date","5/25/2021");
        newItem.put("description","get food");
        newItem.put("complete","yes");
        list.add(newItem);
        String date = "5/25/2065";
        String actual = todoAction.editItemDueDate(list,index,date);
        String expected = "Item due date successfully changed";
        assertEquals(expected,actual);
    }

    @Test
    void markItemComplete() {
        TodoListModel todoAction = new TodoListModel();
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        HashMap<String,String> newItem = new HashMap<>();
        int index=0;
        newItem.put("date","5/25/2021");
        newItem.put("description","get food");
        newItem.put("complete","yes");
        list.add(newItem);
        String complete = "no";
        String actual = todoAction.markItemComplete(list,index,complete);
        String expected = "Item completion status successfully changed";
        assertEquals(expected,actual);
    }

    @Test
    void displayCompleteItems() {
        TodoListModel todoAction = new TodoListModel();
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        ArrayList<HashMap<String,String>> completeList = new ArrayList<>();
        HashMap<String,String> newItem = new HashMap<>();
        newItem.put("date","5/25/2021");
        newItem.put("description","get food");
        newItem.put("complete","yes");
        list.add(newItem);
        String actual = todoAction.displayCompleteItems(completeList,list);
        String expected = "All completed items displayed";
        assertEquals(expected,actual);
    }

    @Test
    void displayIncompleteItems() {
        TodoListModel todoAction = new TodoListModel();
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        ArrayList<HashMap<String,String>> incompleteList = new ArrayList<>();
        HashMap<String,String> newItem = new HashMap<>();
        newItem.put("date","5/25/2021");
        newItem.put("description","get food");
        newItem.put("complete","yes");
        list.add(newItem);
        String actual = todoAction.displayIncompleteItems(incompleteList,list);
        String expected = "All uncompleted items displayed";
        assertEquals(expected,actual);
    }

    @Test
    void saveCurrentList() {
        TodoListModel todoAction = new TodoListModel();
        ArrayList<HashMap<String,String>> temp = new ArrayList<>();
        String expected ="Current list saved";
        String actual = todoAction.saveCurrentList(temp);
        assertEquals(expected,actual);
    }



    @Test
    void loadSingleList() {
        TodoListModel todoAction = new TodoListModel();
        ArrayList<HashMap<String,String>> temp = new ArrayList<>();
        String expected ="List loaded";
        String actual = todoAction.loadSingleList(temp);
        assertEquals(expected,actual);
    }

    @Test
    void clearList(){
        TodoListModel todoAction = new TodoListModel();
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        HashMap<String,String> newItem = new HashMap<>();
        newItem.put("date","5/25/2021");
        newItem.put("description","get food");
        newItem.put("complete","yes");

        String actual = todoAction.clearList(list);
        String expected = "List successfully cleared";
        assertEquals(expected,actual);
    }


}