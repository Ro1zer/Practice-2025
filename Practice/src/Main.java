import java.util.Scanner;
import Service.OneDimentionalArrayTask;

public class Main {

    public static void main(String[] args) {
        OneDimentionalArrayTask obj = new OneDimentionalArrayTask();
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.println("Setup your array using range from 0 to 80");
        while (true) {
            System.out.print("["+(counter)+"]: ");
            float number = sc.nextFloat();
            System.out.println("----");
            if(number == -100) {
                break;
            }
            if(obj.put(number)) {
                counter++;
            }
        }
        System.out.print("Enter the number: ");
        obj.calculate(sc.nextFloat());
    }
}