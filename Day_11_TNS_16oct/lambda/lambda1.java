// lambda function in unnamed function with no access modifer type anonyomos 

import java.util.function.*;


class lambda1{
    public static void main(String[] args) {
        Function<String, Integer> getLength = name -> name.length();
        System.out.println(getLength.apply("java"));
        System.out.println(getLength.apply("John"));
    }
}

//program to calculate to area of sqaure
