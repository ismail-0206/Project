import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int age=2;
        int age1=5;
        System.out.println(age+age1);
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int age5 = s.nextInt();
        System.out.println(age5);
        
        s.close();



    }
}