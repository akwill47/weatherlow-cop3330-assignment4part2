package ucf.assignments;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoListModel {

    public String addItem(String title, ArrayList<HashMap<String,String>> todoList){
        //for i < TotalLists Size
            // if currentList title equal to title
                //add new map with description/due date/complete status
            //redisplay current list
        //end for
        return "Item successfully added";

    }
    public String removeItem(String title, ArrayList<HashMap<String,String>> todoList){
        //if CurrentList size == 0
            //return "No items in list"
        //for i < TotalLists Size
            // if currentList title equal to title
                //for i< CurrentList size
                    //if input equals currentList item name
                        //remove item from map
                        //break

                //end for
            //break;
        //end for

        //redisplay current list
        return "Item successfully removed";

    }
    public String editItemDescription(String title, ArrayList<HashMap<String,String>> todoList){

        //for i < TotalLists Size
            // if currentList title equal to title
                //for i< CurrentList size
                    //if input item's name equals currentList item name
                        //change item's description map to input item's description
                        //break

                //end for
            //break;
        //end for

        //redisplay current list
        return "Item description successfully changed";

    }
    public String editItemDueDate(String title, ArrayList<HashMap<String,String>> todoList){
        //for i < TotalLists Size
            // if currentList title equal to title
                //for i< CurrentList size
                    //if input items name equals currentList item name
                        //change item's due date map to input item's due date
                        //break

                //end for
            //break;

        //end for

        //redisplay current list
        return "Item due date successfully changed";

    }
    public String markItemComplete(String title, ArrayList<HashMap<String,String>> todoList){
        //for i < TotalLists Size
            // if currentList title equal to title
                //for i< CurrentList size
                    //if input items name equals currentList item name
                        //change item's completion status  map to input item's completion status
                    //break

                //end for
            //break;

        //end for

        //redisplay current list
        return "Item completion status successfully changed";

    }

        //display
    public String displayAllItems(String title, ArrayList<HashMap<String,String>> todoList){
        //for i < TotalLists Size
                // if currentList title equal to title
                    //for i< CurrentList size
                        //print name, description, due date and completion status

                    //end for
                //break;
        //end for

        return "All items displayed";

    }

    public String displayCompleteItems(String title, ArrayList<HashMap<String,String>> todoList){
        //for i < TotalLists Size
            // if currentList title equal to title
                //for i< CurrentList size
                    //if Current items completion status is true
                        //print name, description, due date and completion status

                //end for
            //break;
        //end for

        return "All completed items displayed";
    }
    public String displayIncompleteItems(String title, ArrayList<HashMap<String,String>> todoList){
        //for i < TotalLists Size
            // if currentList title equal to title
                //for i< CurrentList size
                    //if Current items completion status is false
                        //print name, description, due date and completion status

                //end for
            //break;
        //end for

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




}
