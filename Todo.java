import java.util.ArrayList;
import java.util.Scanner;

class Todo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n--- TO DO LIST MENU ---");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter task:");
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("Task added successfully!");
            }
            else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks available.");
                } else {
                    System.out.println("Your Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            }
            else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to remove.");
                } else {
                    System.out.println("Enter task number to remove:");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if (index >= 1 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("Task removed successfully!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                }
            }
            else if (choice == 4) {
                System.out.println("Exiting To-Do App...");
                break;
            }
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}