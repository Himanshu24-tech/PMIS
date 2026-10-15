public class generic6 {
    static double sum(List <? extends Number> list){

        double total =0;
        for (Number n : list){
            total += n.doubleValue();
        }
        return total;
    }
}
public static void main (String[] args){

    List<Integer> integers = List.of(1,2,3);
    List<Integer> integers = List.of(1,2,3);
    List<Integer> integers = List.of(1,2,3);

    System.out.println(sum(integers));
    System.out.println(sum(floats));
    System.out.println(sum(decimals));


}