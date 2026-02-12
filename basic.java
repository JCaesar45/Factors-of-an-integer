import java.util.ArrayList;
import java.util.List;

public class Factors {
    
    public static List<Integer> factors(int num) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                result.add(i);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(factors(45));  // [1, 3, 5, 9, 15, 45]
        System.out.println(factors(53));  // [1, 53]
        System.out.println(factors(64));  // [1, 2, 4, 8, 16, 32, 64]
    }
}
