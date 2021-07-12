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

    ArrayList<HashMap<String,String>> tempList = new ArrayList<>();
    ObservableList<HashMap<String,String>> list = FXCollections.observableArrayList();


    public void AddListItem(ActionEvent actionEvent) {
        func.addItem(tempList,addDate.getValue().toString(),addDescription.getText(),isComplete.getText());
        list.add(tempList.get(tempList.size()-1));
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

            func.removeItem(tempList,index);
            list.remove(index);
        }
        refresh();


    }

    public String editDescription(ActionEvent actionEvent) {
        int index = itemList.getSelectionModel().getSelectedIndex();
        if(index >= 0){
            func.editItemDescription(tempList,index,addDescription.getText());
        }
        list.set(index,tempList.get(index));
        refresh();
        return "Description edited successfully";
    }

    public void editDueDate(ActionEvent actionEvent) {
        int index = itemList.getSelectionModel().getSelectedIndex();
        if(index >= 0){
            func.editItemDueDate(tempList,index,addDate.getValue().toString());
        }
        list.set(index,tempList.get(index));
        refresh();
    }

    public void markComplete(ActionEvent actionEvent) {
        int index = itemList.getSelectionModel().getSelectedIndex();
        if(index >= 0){
            func.markItemComplete(tempList,index,isComplete.getText());
        }
        list.set(index,tempList.get(index));
        refresh();
    }

    public void displayAll(ActionEvent actionEvent) {
        func.displayAllItems(itemList,list);
        //itemList.setItems(list);
    }

    public void displayComplete(ActionEvent actionEvent) {
        ArrayList<HashMap<String,String>> tempComplete = new ArrayList<>();
        func.displayCompleteItems(tempComplete,tempList);

        ObservableList<HashMap<String,String>> completeList = FXCollections.observableArrayList(tempComplete);
        itemList.setItems(completeList);

    }

    public void displayIncomplete(ActionEvent actionEvent) {
        ArrayList<HashMap<String,String>> tempIncomplete = new ArrayList<>();
        func.displayIncompleteItems(tempIncomplete,tempList);
        //for(int i=0;i<list.size();i++){
            //if(list.get(i).get("complete").equals("no")){
                //incompleteList.add(list.get(i));
            //}
        //}
        ObservableList<HashMap<String,String>> incompleteList = FXCollections.observableArrayList(tempIncomplete);
        itemList.setItems(incompleteList);
    }

    public void saveCurrent(ActionEvent actionEvent) {
        //func.saveCurrentList(title,todoLists);
        ArrayList<HashMap<String,String>>todoLists = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            todoLists.add(list.get(i));
        }

        List<JsonObject> jsonObj = new ArrayList<>();

        //for(HashMap<String, String> item : todoLists) {
            //JsonObject obj = new JsonObject(item);
            //jsonObj.add(obj);
        //}
        //JsonArray test = new JsonArray(jsonObj);
    }

    public void loadOne(ActionEvent actionEvent) {
        //func.loadSingleList(title,todoLists);
    }

    public void clearList(ActionEvent actionEvent) {
        func.clearList(tempList);
        list = FXCollections.observableArrayList(tempList);
        itemList.setItems(list);
    }
}
