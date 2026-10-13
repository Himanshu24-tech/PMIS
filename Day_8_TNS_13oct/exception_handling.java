package Day_8_TNS_13oct;

//exception handling to handle arthematic exception 
// class exception_handling{
//     public static void main(String[] args){
//         int a = 10;
//         int b=0;

//         try{
//             int rest = a/b;
//             System.out.println("The result is: "+rest);
//         } catch(ArithmeticException e){
//             System.out.println("Error: Division by zero is not allowed.");
//         }

//     }
// }


//to handle both array index out of bounds and arithmetic exception
// class exception_handling{
//     public static void main(String[] args){
//         try{
//             int[] numbers = {10,20,30};
//             System.out.println(numbers[5]);
//             int res = 10/0;
//             System.out.println("The result is: "+res);
//         }
        
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Error: Array index is out of bounds.");
//         }
//         catch(ArithmeticException e){
//             System.out.println("Error: Division by zero is not allowed.");
//         }
        
//     }
// }


//with finally block
// class exception_handling{
//     public static void main(String[] args){
//         try{
//             int res = 10/5;
//             System.out.println("The result is: "+res);
//         }
        
//         catch(ArithmeticException e){
//             System.out.println("Error: Division by zero is not allowed.");
//         }finally{
//             System.out.println("This block is always executed.");
//         }
        
//     }
// }


//throw exception
// import java.util.Scanner;
// class exception_handling{


//     public static void main(String[] args){
//         System.out.println("Enter a age: ");
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age<18){
//             throw new IllegalArgumentException("Age must be greater than 18");
//         }
//         System.out.println("Age is valid: "+age);
        
// }
// }


//throws Exception   main difference between throw & throws is that in throws we can 
//delacre multiple exceptions using comma but in throw we can declare only one exception at a time

// import java.io.*;
// class exception_handling{
//     static void readFile() throws IOException{
//         FileReader file = new FileReader("test.txt");
//         System.out.println("File opened successfully.");
//     }

//     public static void main(String[] args){
//         try{
//             readFile();
//         }catch(IOException e){
//             System.out.println("could not find the file: " + e.getMessage());
//         }
//     }
// }


// ATM windrawal system
// class exception_handling{
    
//     public static void main(String[] args){
//         int balance = 1000;
//         int withdrawAmount = 1500;
//         try{
//             if (withdrawAmount > balance){
//                 throw new IllegalArgumentException("Insufficient balance");
//             }
//             balance -= withdrawAmount;
//             System.out.println("Withdrawal successful. Remaining balance: "+balance);
//         }catch(IllegalArgumentException e){
//             System.out.println("Error: "+e.getMessage());
//         }
//         System.out.println("Transaction completed.");
//     }
// }


// Problem Statement:
// Write a program that takes two integer inputs from the user and calculates 
// their division. If the second number is zero, handle the resulting 
// ArithmeticException gracefully and print an error message instead of crashing.
import java.util.Scanner;
class exception_handling{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        try{
            int result = num1 / num2;
            System.out.println("The result of division is: " + result);
        } catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            sc.close();
        }
    }
}


