package ucf.assignments;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
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
import java.util.List;


public class ListController {
    TodoListModel func = new TodoListModel();
    @FXML
    DatePicker addDate;
    @FXML
    TextField addDescription;
    @FXML
    TextField isComplete;
    @FXML
    ListView<HashMap<String,String>>itemList;

    ObservableList<HashMap<String,String>> list = FXCollections.observableArrayList();
    ArrayList<HashMap<String,String>>todoLists = new ArrayList<>();
    String title;


    public void AddListItem(ActionEvent actionEvent) {
        HashMap<String,String> newItem = new HashMap<>();
        newItem.put("date",(addDate.getValue().toString()));
        newItem.put("description",addDescription.getText());
        newItem.put("complete",isComplete.getText());
        list.add(newItem);
        itemList.setItems(list);
        refresh();


    }
    private void refresh(){
        addDate.setValue(LocalDate.now());
        addDescription.setText(null);
        isComplete.setText(null);
    }

    public void removeItem(ActionEvent actionEvent) {
        int index = itemList.getSelectionModel().getSelectedIndex();
        if(index >= 0){
            itemList.getItems().remove(index);
        }
        refresh();
        //func.removeItem(title,todoLists);

    }

    public void editDescription(ActionEvent actionEvent) {
        int index = itemList.getSelectionModel().getSelectedIndex();
        if(index >= 0){
            itemList.getItems().get(index).put("description",addDescription.getText());
        }
        refresh();
        //func.editItemDescription(title,todoLists);
    }

    public void editDueDate(ActionEvent actionEvent) {
        //func.editItemDueDate(title,todoLists);
        int index = itemList.getSelectionModel().getSelectedIndex();
        if(index >= 0){
            itemList.getItems().get(index).put("date",(addDate.getValue().toString()));
        }
        refresh();
    }

    public void markComplete(ActionEvent actionEvent) {
        //func.markItemComplete(title,todoLists);
        int index = itemList.getSelectionModel().getSelectedIndex();
        if(index >= 0){
            itemList.getItems().get(index).put("complete",isComplete.getText());
        }
        refresh();
    }

    public void displayAll(ActionEvent actionEvent) {
        //func.displayAllItems(title,todoLists);
        itemList.setItems(list);
    }

    public void displayComplete(ActionEvent actionEvent) {
        ObservableList<HashMap<String,String>> completeList = FXCollections.observableArrayList();
        //func.displayCompleteItems(title,todoLists);
        for(int i=0;i<list.size();i++){
            if(list.get(i).get("complete").equals("yes")){
                completeList.add(list.get(i));
            }
        }
        itemList.setItems(completeList);

    }

    public void displayIncomplete(ActionEvent actionEvent) {
        ObservableList<HashMap<String,String>> incompleteList = FXCollections.observableArrayList();
        //func.displayIncompleteItems(title,todoLists);
        for(int i=0;i<list.size();i++){
            if(list.get(i).get("complete").equals("no")){
                incompleteList.add(list.get(i));
            }
        }
        itemList.setItems(incompleteList);
    }

    public void saveCurrent(ActionEvent actionEvent) {
        //func.saveCurrentList(title,todoLists);
        ArrayList<HashMap<String,String>>todoLists = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            todoLists.add(list.get(i));
        }

        List<JsonObject> jsonObj = new ArrayList<>();

        for(HashMap<String, String> item : todoLists) {
            JsonObject obj = new JsonObject(item);
            jsonObj.add(obj);
        }
        JsonArray test = new JsonArray(jsonObj);
    }

    public void loadOne(ActionEvent actionEvent) {
        func.loadSingleList(title,todoLists);
    }

}
