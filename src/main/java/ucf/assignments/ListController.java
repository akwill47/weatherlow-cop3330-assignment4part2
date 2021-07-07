package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;


public class ListController {
    TodoListModel func = new TodoListModel();
    @FXML
    DatePicker addDate;
    @FXML
    TextField description;
    @FXML
    TextField isComplete;
    @FXML
    ListView<HashMap<String,String>>itemList;

    ObservableList<HashMap<String,String>> list = FXCollections.observableArrayList();
    ArrayList<HashMap<String,String>>todoLists = new ArrayList<>();
    String title;

    @FXML
    public void AddListItem(ActionEvent actionEvent) {
        HashMap<String,String> newItem = new HashMap<>();
        newItem.put("date",(addDate.getValue().toString()));
        newItem.put("description",description.getText());
        newItem.put("complete",isComplete.getText());
        list.add(newItem);
        itemList.setItems(list);


    }
    private void refresh(){
        addDate.setValue(LocalDate.now());
        description.setText(null);
        isComplete.setText(null);
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

    public void loadOne(ActionEvent actionEvent) {
        func.loadSingleList(title,todoLists);
    }

}
