//Create a Java program called DateExplorer that asks the user to enter a date in the format yyyy-MM-dd. The program should then display a menu that allows the user to explore different details about that date.
//
//        For example, the user enters 2026-10-26 and gets the following menu:
//
//Requirements
//1. Ask the user to input a date using Scanner.
//2. Use LocalDate.parse() to convert the input into a LocalDate object.
//        3. Use a switch statement to handle the menu options.
//        4. Use minusMonths() to look back by a number of months specified by the user.
//        5. Use getMonth(), getYear(), and getDayOfWeek() to display date information.
//        6. Use an if-else statement to check whether the entered year is a leap year.
//7. Use a loop to keep displaying the menu until the user chooses Exit.
//8. Create a DateExplorer class with methods such as displayMonth(), displayYear(), and lookBackMonths().

import java.time.LocalDate;
import java.util.Scanner;

class datetime_problem {

    private LocalDate date;

    // Constructor
    datetime_problem(LocalDate date) {
        this.date = date;
    }

    void displayMonth() {
        System.out.println("Month: " + date.getMonth());
    }

    void displayYear() {
        System.out.println("Year: " + date.getYear());
    }

    void displayDay() {
        System.out.println("Day of the week: " + date.getDayOfWeek());
    }

    void lookBackMonths(int months) {
        if (months < 0) {
            System.out.println("Please enter a positive number.");
        } 
        else {
            LocalDate pastDate = date.minusMonths(months);
            System.out.println(months + " months before " + date
                    + " is " + pastDate);
        }
    }

    void checkLeapYear() {
        if (date.isLeapYear()) {
            System.out.println(date.getYear() + " is a leap year.");
        } else {
            System.out.println(date.getYear() + " is not a leap year.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        LocalDate userDate = LocalDate.parse(input);

        datetime_problem explorer = new datetime_problem(userDate);

        int choice;

        do {
            System.out.println(
                    "\n========== DATE EXPLORER ==========");
            System.out.println("1. Display Month");
            System.out.println("2. Display Year");
            System.out.println("3. Display Day of the Week");
            System.out.println("4. Look Back by Custom Months");
            System.out.println("5. Check Leap Year");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    explorer.displayMonth();
                    break;

                case 2:
                    explorer.displayYear();
                    break;

                case 3:
                    explorer.displayDay();
                    break;

                case 4:
                    System.out.print(
                            "How many months do you want to look back? ");
                    int months = scanner.nextInt();
                    explorer.lookBackMonths(months);
                    break;

                case 5:
                    explorer.checkLeapYear();
                    break;

                case 6:
                    System.out.println("Exiting Date Explorer. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}