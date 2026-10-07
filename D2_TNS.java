import java.util.*;
//write a program to add two number and calculate thier sum in flaot
/*
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :");
        float a = sc.nextFloat();
        System.out.print("Enter Second Number :");
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.print(sum);
            
    }
}

*/

//covert tem given in fahreheit to celsius using this formula : C=(f-32)*5/9

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tem in fahreheit :");
        float feh = sc.nextFloat();
        float convertion = (feh-32)*5/9;
        System.out.print(convertion);
            
    }
}



//Take user input of month number and then program should output month name using switch case
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number :");
        int month = sc.nextInt();
    
        switch(month){
          case 1: System.out.println("Jan");break;
          case 2: System.out.println("feb");break;
          case 3: System.out.println("mar");break;
          case 4: System.out.println("april");break;
          case 5: System.out.println("may");break;
          case 6: System.out.println("June");break;
          case 7: System.out.println("July");break;
          case 8: System.out.println("Aug");break;
          case 9: System.out.println("Sep");break;
          case 10: System.out.println("Oct");break;
          case 11: System.out.println("Nov");break;
          case 12: System.out.println("Dec");break;
          default: System.out.println("Invaild");
        }
            
    }
}



//Swap the vaalue of two integer variable without using any auxiliary variable but this program is using variable
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Int 1:");
        int i1 = sc.nextInt();
        System.out.print("Enter Int 2:");
        int i2 = sc.nextInt();

        int temp = i1;
        i1 = i2;
        i2 = temp;

        System.out.println("After swaping i1 = "+i1+"i2 ="+i2);

    
            
    }
}



import java.util.*;

//convert total number of second into hours ,minutes,remaining second
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds:");
        long sec = sc.nextLong();
        long hours = sec / 3600;
        long minutes = (sec % 3600) / 60;
        long remainingSeconds = sec % 60;

        System.out.println(hours + " Hour(s) " + minutes + " Minute(s) " + remainingSeconds + " Second(s)");
        
        

    
            
    }
}


import java.util.*;

//find the largest among 3 numbers
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        long num1 = sc.nextLong();
        System.out.print("Enter 2nd Number:");
        long num2 = sc.nextLong();
        System.out.print("Enter 3rd Number:");
        long num3 = sc.nextLong();

        if(num1>=num2 && num1>=num3){
          System.out.println("num1 is largest");

        }
        else if(num2>=num3){
          System.out.println("num2 is largest");

        }
        else {
          System.out.println("num3 is largest");
        }
        

        
            
    }
}



import java.util.*;

//find if a yearis a leap year
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int year = sc.nextInt();
       
         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }
                
    }
}


