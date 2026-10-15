class Util{
    static <T> void printtwice(T value){ //if we use genrics there is no need to difine datatype wheather its string or int.
        System.out.println(value);
        System.out.println(value);

    }
    static <T> T firstOf(T a, T b){
        return b;
    }
}
public class generic3 {
    public static void main(String[] args) {
        Util.printtwice(24);
        System.out.println(Util.firstOf("hi","hello"));
    }
    
}
