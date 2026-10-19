import java.util.List;

public class generic6 {
    static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) {
            total += n.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        List<Float> floats = List.of(1.5f, 2.5f, 3.5f);
        List<Double> decimals = List.of(1.1, 2.2, 3.3);

        System.out.println(sum(integers));
        System.out.println(sum(floats));
        System.out.println(sum(decimals));
    }
}