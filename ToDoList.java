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
                    addTask(tasks, input);
                    break;
                case 2:
                    removeTask(tasks, input);
                    break;
                case 3:
                    viewTask(tasks);
                    break;
                case 4:
                    updateTask(tasks, input);
                    break;
                case 5:
                    System.out.println("Good Bye User :)");
                    isTrue = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
    static void addTask(ArrayList<String> tasks, Scanner input){
        System.out.println("Enter the task You want to Add :");
        input.nextLine();
        String getTask = input.nextLine();
        tasks.add(getTask);
        System.out.println("Task added Successfully");
    }
    static void removeTask(ArrayList<String> tasks, Scanner input){
        if(tasks.isEmpty()){
            System.out.println("No tasks to remove!");
            return;
        }
        viewTask(tasks);
        System.out.print("Enter task number to remove: ");
        int index = input.nextInt();
        if(index >= 1 && index <= tasks.size()){
            String removedTask = tasks.remove(index - 1);
            System.out.println("Removed: " + removedTask);
        } else {
            System.out.println("Invalid task number!");
        }
    }
    static void viewTask(ArrayList<String> tasks){
        if(tasks.isEmpty()){
            System.out.println("No tasks added");
        }else{
            System.out.println("Your Tasks :");
            for(int i = 0 ; i < tasks.size() ; i++){
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    static void updateTask(ArrayList<String> tasks, Scanner input){
        if(tasks.isEmpty()){
            System.out.println("No tasks to update!");
            return;
        }
        viewTask(tasks);
        System.out.print("Enter task number to update: ");
        int index = input.nextInt();
        input.nextLine();
        if(index >= 1 && index <= tasks.size()){
            System.out.print("Enter new task: ");
            String newTask = input.nextLine();
            tasks.set(index - 1, newTask);
            System.out.println("Task updated successfully!");
        } else {
            System.out.println("Invalid task number!");
        }
    }
}