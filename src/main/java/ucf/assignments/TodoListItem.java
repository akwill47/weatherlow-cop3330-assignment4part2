package ucf.assignments;

import java.time.LocalDate;

public class TodoListItem{
    private String description;
    private LocalDate dueDate;
    private String completed;
    //boolean completed;
    public TodoListItem(LocalDate date, String description, String completed){
        this.setDueDate(date);
        this.setDescription(description);
        this.setCompleted(completed);
    }
    public LocalDate getDueDate(){
        return dueDate;
    }

    public String getDescription(){
        return description;
    }
    public String getCompleted(){
        return completed;
    }
    public void setDueDate(LocalDate newDueDate){
        this.dueDate = newDueDate;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    public void setCompleted(String newCompleted){
        this.completed = newCompleted;
    }

    @Override
    public String toString(){
        return "Date: " + this.getDueDate()+ "Description: " + getDescription() + "Completed: " + getDescription();
    }
}
