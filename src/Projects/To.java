package Projects;
import java.io.*;
import java.util.*;

public class To {
    private List<String> tasks;
    private Scanner sc;

    public To() {
        tasks = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;
        while (true) {
            System.out.println("\n--------To DO List----------\n");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. View All Tasks");
            System.out.println("3. Exit");
            System.out.print("\n Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addTask();
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    displayTask();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }

    private void addTask() {
        System.out.println("Enter Task Name: ");
        String task = sc.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully");
    }
    private void deleteTask() {
        System.out.println("Enter Task no to delete: ");
        int taskNo = sc.nextInt();
        sc.nextLine();
        if(taskNo>0 && taskNo<tasks.size()) {
            tasks.remove(taskNo-1);
            System.out.println("Task deleted successfully");
        }else {
          System.out.println("Invalid task no");
        }
    }
    private void displayTask() {
    if (tasks.isEmpty()){
        System.out.println("No tasks found");
    }
    else {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1)+". " + tasks.get(i));
        }
    }
    }
    public static void main(String[] args) {
        To to = new To();
        to.run();
    }
}
