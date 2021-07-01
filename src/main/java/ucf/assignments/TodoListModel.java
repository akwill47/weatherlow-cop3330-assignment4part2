package ucf.assignments;

public class TodoListModel {

        //modifying lists
    public String addList(){
        //add hashmap title
        //add ArrayList hashmap of 0 items

        return "List successfully added";

    }
    public String removeList(String title){
        //if TotalLists is 0
            //return "No lists to remove";

        //else if title equals list title
            //remove list
            //redisplay current list

        return "List successfully removed";
    }
    public String editListTitle(){
        //for i < TotalLists Size

            // if currentList title equal to title
                // make input equal to title;
                //redisplay list;
                //break;

        //end for loop

        return "title Succesfully changed";
    }
    public String addItem(){
        //for i < TotalLists Size
            // if currentList title equal to title
                //add new map with description/due date/complete status
            //redisplay current list
        //end for
        return "Item successfully added";

    }
    public String removeItem(){
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
        return "Item successfully added";

    }
    public String editItemDescription(){

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
    public String editItemDueDate(){
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
        return "Item description successfully changed";

    }
    public String markItemComplete(){
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
    public String displayAllItems(){
        //for i < TotalLists Size
                // if currentList title equal to title
                    //for i< CurrentList size
                        //print name, description, due date and completion status

                    //end for
                //break;
        //end for

        return "All items displayed";

    }

    public String displayCompleteItems(){
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
    public String displayIncompleteItems(){
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

    public String saveCurrentList(){

    }

    public String saveAllLists(){

    }
    public String loadSingleList(){

    }
    public String loadAllLists(){

    }



}
