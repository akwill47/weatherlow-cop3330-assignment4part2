package ucf.assignments;

import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoListModel {

    public String addItem(ArrayList<HashMap<String,String>> list, String date, String description, String completion){
        HashMap<String,String> newItem = new HashMap<>();
        newItem.put("date",date);
        newItem.put("description",description);
        newItem.put("complete",completion);
        list.add(newItem);
        return "Item successfully added";

    }
    public String removeItem(ArrayList<HashMap<String,String>> list,int index){
                list.remove(index);
        return "Item successfully removed";

    }
    public String editItemDescription(ArrayList<HashMap<String,String>> list,int index,String description){
        list.get(index).put("description",description);

        return "Item description successfully changed";

    }
    public String editItemDueDate(ArrayList<HashMap<String,String>> list,int index,String date){
        list.get(index).put("date",date);
        return "Item due date successfully changed";

    }
    public String markItemComplete(ArrayList<HashMap<String,String>> list,int index,String complete){
        list.get(index).put("complete",complete);
        return "Item completion status successfully changed";

    }

        //display
    public String displayAllItems(ListView<HashMap<String,String>> itemList,ObservableList<HashMap<String,String>> list){
        itemList.setItems(list);
        return "All items displayed";

    }

    public String displayCompleteItems(ArrayList<HashMap<String,String>> completeList,ArrayList<HashMap<String,String>> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get("complete").equals("yes")) {
                completeList.add(list.get(i));
            }
        }
        return "All completed items displayed";
    }

    public String displayIncompleteItems(ArrayList<HashMap<String,String>> incompleteList,ArrayList<HashMap<String,String>> list){
        for(int i=0;i<list.size();i++){
            if(list.get(i).get("complete").equals("no")){
                incompleteList.add(list.get(i));
            }
        }
        return "All uncompleted items displayed";

    }
        // save/loading

    public String saveCurrentList(String title, ArrayList<HashMap<String,String>> todoList){
        //create file in working directory
        //find index of current list title
        //write in json format to file
        //close file

        return "Current list saved";
    }


    public String loadSingleList(String title, ArrayList<HashMap<String,String>> todoList){
        //access work directory
        //for loop through all list titles
        //match to do list with title
        //grab json format of that specific list
        return "List loaded";

    }

    public String clearList(ArrayList<HashMap<String,String>> list){
        for(int i=list.size();i>0;i--){
            System.out.print(list.size());
            list.remove(i-1);
        }
        return "List successfully cleared";
    }




}
