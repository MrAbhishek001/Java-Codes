import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        String fullName = sc.nextLine();
        System.out.println(fullName);
        int number = sc.nextInt();
        System.out.println(number);
        float price = sc.nextFloat();
        System.out.println(price);
        boolean answer = sc.nextBoolean();
        System.out.println(answer);
        long BigNumber = sc.nextLong();
        System.out.println(BigNumber);
    }
}
