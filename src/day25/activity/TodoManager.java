package day25.activity;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager {

    static ArrayList<String[]> tasks = new ArrayList();
    static Scanner sc = new Scanner(System.in);

    static enum status {
        NA,
        DONE,
        DUE
    };

    public static void main(String[] args) {

        while (true) {
            displayMenu();
        }

    }

    public static void displayMenu() {
        System.out.println("=========== Welcome to Todo Task Manager ===========");
        System.out.println("1 . Create new Task");
        System.out.println("2 . View All Tasks");
        System.out.println("3 . Update Task");
        System.out.println("4 . Delete Task");
        System.out.println("5 . Clear all tasks");
        System.out.println("6 . Exit");
        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                create();
                break;
            case 2:
                read();
                break;
            case 3:
                update();
                break;
            case 4:
                delete();
            case 5:
                clear();
                break;
            case 6:
                System.out.println("Thank you! program exited!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice! please try again!");
                break;
                
        }

    }

    public static void create() {
        sc.nextLine();
        System.out.print("Task Name : ");
        String name = sc.nextLine();
        System.out.print("Due date : ");
        String dueDate = sc.nextLine();
        String[] task = {name, dueDate, status.NA.toString()};
        tasks.add(task);
        System.out.println("Task succfully created!");
    }

    public static void read() {
        System.out.println("Total Task : " + tasks.size());
        System.out.println("");
        if (tasks.isEmpty()) {
            System.out.println("There's no task available!");
        } else {
            System.out.printf("%-15s %-15s %-15s%n", "Todo", "Due Date", "Status");

            for (String[] task : tasks) {
                System.out.printf("%-15s %-15s %-15s%n",
                        task[0], task[1], task[2]);
            }
        }
    }

    public static void update() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.printf("%-5s %-15s %-15s %-10s%n",
                "No.", "Todo", "Due Date", "Status");

        for (int i = 0; i < tasks.size(); i++) {
            String[] task = tasks.get(i);
            System.out.printf("%-5d %-15s %-15s %-10s%n",
                    i, task[0], task[1], task[2]);
        }

        System.out.print("Enter task to update : ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index < 0 || index >= tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        String[] task = tasks.get(index);

        System.out.println("Select field to update");

        for (int i = 0; i < task.length; i++) {
            System.out.println(i + " : " + task[i]);
        }
        System.out.println("Enter Choice : ");

        int choice = sc.nextInt();
        sc.nextLine();
        if (index < 0 || index >= task.length) {
            System.out.println("Invalid Field number.");
            return;
        }
        if (choice == task.length - 1) {
            System.out.print("Enter new Value : (NA / DONE / DUE) ");
            task[choice] = sc.nextLine().toUpperCase();
        } else {
            System.out.print("Enter new Value : ");
            task[choice] = sc.nextLine();
        }

        System.out.println("Task Update successfully!");

    }
    
    public static void delete(){
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        
        System.out.printf("%-5s %-15s %-15s %-10s%n",
                "No.", "Todo", "Due Date", "Status");

        for (int i = 0; i < tasks.size(); i++) {
            String[] task = tasks.get(i);
            System.out.printf("%-5d %-15s %-15s %-10s%n",
                    i, task[0], task[1], task[2]);
        }
        
        System.out.print("Select a task to delete: ");
        int index = sc.nextInt();
        sc.nextLine();
        
        if (index < 0 || index >= tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }
        
        tasks.remove(index);
        
        System.out.println("Task Delete Successfully!");
           
    }
    public static void clear(){
        tasks.clear();
        System.out.println("Tasks has beed cleared!");
    }
}
