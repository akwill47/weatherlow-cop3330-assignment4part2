package ucf.assignments;

import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoListModel {

    public String addItem(ArrayList<HashMap<String,String>> list, String date, String description, String completion){
        //make new item hashmap
        HashMap<String,String> newItem = new HashMap<>();
        //add data
        newItem.put("date",date);
        newItem.put("description",description);
        newItem.put("complete",completion);
        //add item to list
        list.add(newItem);
        return "Item successfully added";

    }
    public String removeItem(ArrayList<HashMap<String,String>> list,int index){
                //remove item
                list.remove(index);
        return "Item successfully removed";

    }
    public String editItemDescription(ArrayList<HashMap<String,String>> list,int index,String description){
        //reference index and String

        //adjust index's description
        list.get(index).put("description",description);

        return "Item description successfully changed";

    }
    public String editItemDueDate(ArrayList<HashMap<String,String>> list,int index,String date){
        //reference index and String

        //adjust index's date
        list.get(index).put("date",date);
        return "Item due date successfully changed";

    }
    public String markItemComplete(ArrayList<HashMap<String,String>> list,int index,String complete){
        //reference index and String

        //adjust index's complete status
        list.get(index).put("complete",complete);
        return "Item completion status successfully changed";

    }


    public String displayAllItems(ListView<String> itemList,ObservableList<String> list){
        //reference listview and observable list

        //set listview to overall list
        itemList.setItems(list);
        return "All items displayed";

    }

    public String displayCompleteItems(ArrayList<HashMap<String,String>> completeList,ArrayList<HashMap<String,String>> list) {
        //reference overall list and empty filter list

        //parse overall list for complete items and fill filter list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get("complete").equals("yes")) {
                completeList.add(list.get(i));
            }
        }
        return "All completed items displayed";
    }

    public String displayIncompleteItems(ArrayList<HashMap<String,String>> incompleteList,ArrayList<HashMap<String,String>> list){
        //reference overall list and empty filter list

        //parse overall list for incomplete items and fill filter list
        for(int i=0;i<list.size();i++){
            if(list.get(i).get("complete").equals("no")){
                incompleteList.add(list.get(i));
            }
        }
        return "All uncompleted items displayed";

    }
        // save/loading

    public String saveCurrentList(ArrayList<HashMap<String,String>> todoList){
        //create file in working directory
        //for loop through size of list
        //write in json format to file
        //close file

        return "Current list saved";
    }


    public String loadSingleList(ArrayList<HashMap<String,String>> loadingList){
        //access work directory
        //for loop through to EOF
        //add json format to hashmap and increment index
        //close file after for loop
        return "List loaded";

    }

    public String clearList(ArrayList<HashMap<String,String>> list){
        //reference overall list

        //remove each index one by one
        for(int i=list.size();i>0;i--){
            list.remove(i-1);
        }
        return "List successfully cleared";
    }




}
