//Program to print stars
import java.util.*;

public class Main {
    public static void main(String[] args) {
      for(int i =1;i<=5;i++){
      
        for(int j=1;j<=5;j++){
          System.out.print(" * ");
        }
      System.out.println();
    }}
}

//Program to print acending stars
import java.util.*;

public class Main {
    public static void main(String[] args) {
      for(int i =1;i<=4;i++){
      
        for(int j=1;j<=i;j++){
          System.out.print(" * ");
          
        }
      System.out.println();
    }}
}

//Program to print decending stars
import java.util.*;

public class Main {
    public static void main(String[] args) {
      for(int i =1;i<=4;i++){
      
        
        for(int j=4;j>=i;j--){

          System.out.print(" * ");
          
        }
      System.out.println();
    }}
}


//IMP Program TO PRINT HOLLOW SQUARE MIGHT BE ASKED IN EXAM!!!

import java.util.*;

public class Main {
    public static void main(String[] args) {
      for(int i =1;i<=5;i++){
        for (int j=1;j<=5-i;j++){
          System.out.print(" ");

        }
        for(int j=1;j<=i;j++){
          System.out.print("*");
          
        }
      System.out.println();
    }}
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      for(int i =1;i<=5;i++){
      
        for(int j=1;j<=i;j++){
          System.out.print(j);
          
        }
      System.out.println();
    }}
}


//to print increasing nuber in acending order
import java.util.*;


public class Main {
    public static void main(String[] args) {
      int num1 =1;
      for(int i =1;i<=5;i++){
      
      
        for(int j=1;j<=i;j++){
          System.out.print(num1+" ");
          num1++;
          
        }
      System.out.println();
    }}}