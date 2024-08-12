import java.util.Scanner;
import java.util.Arrays;


public class sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num= new int[5];
        System.out.println("Enter some number:");
        for (int i=0;i<5;i++) {
            num[i]=scanner.nextInt();
        }
        Arrays.sort(num);
        System.out.println("");
        System.out.print("[");
        for (int i=0;i<5;i++) {
            System.out.print(num[i]);
            if (i<4) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }
}
