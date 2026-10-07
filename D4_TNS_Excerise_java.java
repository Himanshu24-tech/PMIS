//Java EXcercise 10 Question D4

//01 Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class Main {

  public static Float find_avg( Float num1,Float num2,Float num3) {
        Float avg = (num1 + num2 + num3) / 3;
        return avg;
        
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        float num1 = sc.nextFloat();
        System.out.print("Enter 2nd Number :");
        float num2 = sc.nextFloat();
        System.out.print("Enter 3rd Number :");
        float num3 = sc.nextFloat();
        Float result = find_avg(num1, num2, num3);
        System.out.println("Average = " + result);


    }
}




//02 Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

public class Main {

   public static void sumOdd(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of odd numbers = " + sum);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sumOdd(n);
    }


//03 Write a function which takes in 2 numbers and returns the greater of those two. 

import java.util.*;

public class Main {

    public static void big_num(int num1, int num2) {
        if (num1 > num2) {
            System.out.print("num1 is greater");
        } 
        else if (num2 > num1) {
            System.out.print("num2 is greater");
        } 
        else {
            System.out.print("Both numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        big_num(num1, num2);

        sc.close();
    }
}


//04 Write a function that takes in the radius as input and returns the circumference of a circle

import java.util.*;

public class Main {

    public static void circumference_circle(Float radius) {
        Float pi = 3.14159f;
        Float circumference = 2*pi*radius;
        System.out.println("Circumference of circle is = " + circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        Float radius = sc.nextFloat();
        circumference_circle(radius);

    }
}


//05 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote. 
import java.util.*;

public class Main {

    public static void eligible_vote(int age) {
        if(age >= 18){
          System.out.print("Eligible to vote");
        }
        else{
          System.out.println("Not Eligible to vote" );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age ");
        int age = sc.nextInt();
        eligible_vote(age);

    }
}

//06 Write an infinite loop using do while condition. 
import java.util.*;
public class Main {

    public static void main(String[] args) {

        do {
            System.out.println("This is an infinite loop");
        } while (true);

    }
}

//07 Write a program to enter the numbers till the user wants and at the end
// it should display the count of positive, negative and zeros entered.

import java.util.*;
public class Main {

    public static void main(String[] args) {
      Scanner h = new Scanner(System.in);
      int positive =0;
      int negative =0;
      int zero =0;
      char choose;

      do{
        System.out.print("Enter number :");
        int num = h.nextInt();

        if(num >0){
          positive++;
        }
        else if (num <0){
          negative--;
        }
        else{
          zero++;
        }
        System.out.print("do you wanna print another number Y/n: ");
        choose = h.next().charAt(0);
        
      }while(choose == 'Y' || choose == 'y');
      
      System.out.println("Positive "+ positive);
      System.out.println("negative " + negative);
      System.out.println("zero "+ zero);
      h.close();
  

    }
}


// 08 Two numbers are entered by the user, x and n. Write a function to 
// find the value of one number raised to the power of another i.e. 𝑥 𝑛 . 

import java.util.*;

public class Main {

    public static int power(int x, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = power(x, n);

        System.out.println(x + " raised to the power " + n + " = " + result);

        sc.close();
    }
}}


// 09 Write a function that calculates the Greatest Common Divisor of 2 numbers. 

import java.util.*;

public class Main {

    public static int gcd(int num1, int num2) {
        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("GCD = " + gcd(num1, num2));

        sc.close();
    }
}

// 10 Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 .....  In the 
// Fibonacci series, a number is the sum of the previous 2 numbers that came before it. 
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}


