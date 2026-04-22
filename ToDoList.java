import java.io.*;
import java.util.*;
public class ToDoList{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        boolean isTrue = true;
        while(isTrue){
            System.out.println("-----To Do List-----");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Task");
            System.out.println("4. Update Task");
            System.out.println("5. Exit");
            System.out.println("Enter Choice :");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    addTask(tasks,input);
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    viewTask(tasks);
                    break;
                case 4:
                    updateTask();
                    break;
                case 5:
                    System.exit(0);                    
                
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
    static void addTask(ArrayList<String> tasks , Scanner input){
        System.out.println("Enter the task You want to Add :");
        input.nextLine();
        String getTask = input.nextLine();
        tasks.add(getTask);
        System.out.println("Task added Succcessfully");
    }
    static void removeTask(){
        System.out.println("Task Removed");
    }
    static void updateTask(){
        System.out.println("Task Updated");
    }
    static void viewTask(ArrayList<String> tasks){
        if(tasks.isEmpty()){
            System.out.println("No tasks added");
        }else{
            System.out.println("Your Tasks :");
            for(int i = 0 ; i < tasks.size() ; i++){
                System.out.println(tasks.get(i));
            }
        }
    }
}