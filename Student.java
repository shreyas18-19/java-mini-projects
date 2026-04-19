
import java.util.Scanner;

class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter marks of subject 1:");
        int m1 = sc.nextInt();

        System.out.println("Enter marks of subject 2:");
        int m2 = sc.nextInt();

        System.out.println("Enter marks of subject 3:");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 75) {
            System.out.println("Grade: A");
        } else if (percentage >= 50) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        sc.close();
    }
}