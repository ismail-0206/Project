import java.util.Scanner;


public class QuadraticEquationSolver {
    public static void main(String[]args) {
        Scanner scan =new Scanner(System.in);


        System.out.print("Enter a: ");
        double a = scan.nextDouble();

        System.out.print("Enter b: ");
        double b = scan.nextDouble();

        System.out.print("Enter c: ");
        double c = scan.nextDouble();
        

        double dis = b*b-4*a*c;
        if (dis>0){
            double root1 = (-b+Math.sqrt(dis)/(2*a));
            double root2 = (-b-Math.sqrt(dis)/(2*a));

            System.out.println("Roots are real and different.");
            System.out.println("Root1: "+root1);
            System.out.println("Root2: "+root2); }
        else if (dis==0){
            double root = -b/(2*a);
            System.out.println("Roots are real and same.");
            System.out.println("Root: "+root); }
        else{
            System.out.println("Roots are complex and different."); }
        scan.close();
}}