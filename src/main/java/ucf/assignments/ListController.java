package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.HashMap;


public class ListController {
    TodoListModel func = new TodoListModel();
    @FXML
    ListView<TodoListItem> ItemList;
    @FXML
    DatePicker addDate;
    @FXML
    TextField description;
    @FXML
    TextField isComplete;

    ObservableList<TodoListItem> list = FXCollections.observableArrayList();
    ArrayList<ArrayList<HashMap<String,String>>>todoLists = new ArrayList<>();
    String title= "test";


    public void AddListItem(ActionEvent actionEvent) {
        func.addItem(title,todoLists);

    }

    public void removeList(ActionEvent actionEvent) {
        func.removeList(title,todoLists);
    }

    public void removeItem(ActionEvent actionEvent) {
        func.removeItem(title,todoLists);
    }

    public void editDescription(ActionEvent actionEvent) {
        func.editItemDescription(title,todoLists);
    }

    public void editDueDate(ActionEvent actionEvent) {
        func.editItemDueDate(title,todoLists);
    }

    public void markComplete(ActionEvent actionEvent) {
        func.markItemComplete(title,todoLists);
    }

    public void displayAll(ActionEvent actionEvent) {
        func.displayAllItems(title,todoLists);
    }

    public void displayComplete(ActionEvent actionEvent) {
        func.displayCompleteItems(title,todoLists);
    }

    public void displayIncomplete(ActionEvent actionEvent) {
        func.displayIncompleteItems(title,todoLists);
    }

    public void saveCurrent(ActionEvent actionEvent) {
        func.saveCurrentList(title,todoLists);
    }

    public void saveAll(ActionEvent actionEvent) {
        func.saveAllLists(title,todoLists);
    }

    public void loadOne(ActionEvent actionEvent) {
        func.loadSingleList(title,todoLists);
    }

    public void loadAll(ActionEvent actionEvent) {
        func.loadAllLists(title,todoLists);
    }

    public void AddList(ActionEvent actionEvent) {
        func.addList(title,todoLists);
    }
}
