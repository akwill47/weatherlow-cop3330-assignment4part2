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
    ListView<String>itemList;

    ArrayList<HashMap<String,String>> tempList = new ArrayList<>();
    ObservableList<String> list = FXCollections.observableArrayList();

    public String prettyString(HashMap<String,String> item){
        //turns the hashmaps into a string so it looks nice on listview
        return "Due Date: " + item.get("date") + "\tDescription: " + item.get("description") + "\t\t\t\t\tCompleted: " + item.get("complete");
    }
    public void AddListItem(ActionEvent actionEvent) {
        //calls add item func
        func.addItem(tempList,addDate.getValue().toString(),addDescription.getText(),isComplete.getText());
        //converts the hashmap to a string and makes it look pretty and assigned it to the observable list
        list.add(prettyString(tempList.get(tempList.size()-1)));
        //sets the current list to the updated list
        itemList.setItems(list);
        refresh();


    }
    private void refresh(){
        //resets the textfields/datepicker
        addDate.setValue(LocalDate.now());
        addDescription.setText(null);
        isComplete.setText(null);
    }

    public void removeItem(ActionEvent actionEvent) {
        int index = itemList.getSelectionModel().getSelectedIndex();
        if(index >= 0){
            //calls remove item func and removes the hashmap of the index
            func.removeItem(tempList,index);
            list.remove(index);
        }
        refresh();


    }

    public String editDescription(ActionEvent actionEvent) {
        int index = itemList.getSelectionModel().getSelectedIndex();
        if(index >= 0){
            //calls edit item description func and changes the hashmap of the index
            func.editItemDescription(tempList,index,addDescription.getText());
        }
        //converts the hashmap to a string and makes it look pretty and assigned it to the observable list
        list.set(index,prettyString(tempList.get(index)));
        refresh();
        return "Description edited successfully";
    }

    public void editDueDate(ActionEvent actionEvent) {
        int index = itemList.getSelectionModel().getSelectedIndex();
        if(index >= 0){
            //calls edit due date func and changes the hashmap of the index
            func.editItemDueDate(tempList,index,addDate.getValue().toString());
        }
        //converts the hashmap to a string and makes it look pretty and assigned it to the observable list
        list.set(index,prettyString(tempList.get(index)));
        refresh();
    }

    public void markComplete(ActionEvent actionEvent) {
        int index = itemList.getSelectionModel().getSelectedIndex();
        if(index >= 0){
            //calls mark item func and changes the hashmap of the index
            func.markItemComplete(tempList,index,isComplete.getText());
        }
        //converts the hashmap to a string and makes it look pretty and assigned it to the observable list
        list.set(index,prettyString(tempList.get(index)));
        refresh();
    }

    public void displayAll(ActionEvent actionEvent) {
        func.displayAllItems(itemList,list);
    }

    public void displayComplete(ActionEvent actionEvent) {
        ArrayList<HashMap<String,String>> tempComplete = new ArrayList<>();
        //calls func to separate complete items
        func.displayCompleteItems(tempComplete,tempList);

        ObservableList<String> completeList = FXCollections.observableArrayList();
        for(int i=0;i<tempComplete.size();i++){
            //converts the hashmap to a string and makes it look pretty and assigned it to the observable list
            completeList.add(prettyString(tempComplete.get(i)));
        }
        itemList.setItems(completeList);

    }

    public void displayIncomplete(ActionEvent actionEvent) {
        ArrayList<HashMap<String,String>> tempIncomplete = new ArrayList<>();
        //calls func to separate incomplete items
        func.displayIncompleteItems(tempIncomplete,tempList);
        ObservableList<String> incompleteList = FXCollections.observableArrayList();
        for(int i=0;i<tempIncomplete.size();i++){
            //converts the hashmap to a string and makes it look pretty and assigned it to the observable list
            incompleteList.add(prettyString(tempIncomplete.get(i)));
        }
        itemList.setItems(incompleteList);
    }

    public void saveCurrent(ActionEvent actionEvent) {
        //func.saveCurrentList(title,todoLists);
        //ArrayList<HashMap<String,String>>todoLists = new ArrayList<>();

        //for(int i=0;i<list.size();i++){
            //todoLists.add(list.get(i));
       // }

        //List<JsonObject> jsonObj = new ArrayList<>();

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
        //calls clearList func and removes all the elements in the list
        func.clearList(tempList);
        //clears the observable list
        list.removeAll();
        //updates listview
        itemList.setItems(list);
    }
}
