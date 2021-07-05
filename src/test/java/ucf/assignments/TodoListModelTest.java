package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class TodoListModelTest {

    @Test
    void addList() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="List successfully added";
        String actual = todoAction.addList(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void removeList() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="List successfully removed";
        String actual = todoAction.removeList(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void editListTitle() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="title Successfully changed";
        String actual = todoAction.editListTitle(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void addItem() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="Item successfully added";
        String actual = todoAction.addItem(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void removeItem() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="Item successfully removed";
        String actual = todoAction.removeItem(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void editItemDescription() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="Item description successfully changed";
        String actual = todoAction.editItemDescription(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void editItemDueDate() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="Item due date successfully changed";
        String actual = todoAction.editItemDueDate(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void markItemComplete() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="Item completion status successfully changed";
        String actual = todoAction.markItemComplete(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void displayAllItems() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="All items displayed";
        String actual = todoAction.displayAllItems(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void displayCompleteItems() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="All completed items displayed";
        String actual = todoAction.displayCompleteItems(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void displayIncompleteItems() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="All uncompleted items displayed";
        String actual = todoAction.displayIncompleteItems(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void saveCurrentList() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="Current list saved";
        String actual = todoAction.saveCurrentList(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void saveAllLists() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="All lists saved";
        String actual = todoAction.saveAllLists(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void loadSingleList() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="List loaded";
        String actual = todoAction.loadSingleList(title,temp);
        assertEquals(expected,actual);
    }

    @Test
    void loadAllLists() {
        TodoListModel todoAction = new TodoListModel();
        String title = "temp";
        ArrayList<ArrayList<HashMap<String,String>>> temp = new ArrayList<>();
        String expected ="All lists from directory loaded";
        String actual = todoAction.loadAllLists(title,temp);
        assertEquals(expected,actual);
    }
}