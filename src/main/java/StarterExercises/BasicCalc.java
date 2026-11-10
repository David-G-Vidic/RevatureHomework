package StarterExercises;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        String op ="";
        double num1 =0,num2 =0;
        boolean l = false, continueCalc = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Calc Program (calc is short for calculator)");
        System.out.println("Entering 2 numbers and an operator returns your answer.\n");

        while (continueCalc){
            do{
                try {
                    l = false;
                    System.out.print("Enter first number: ");
                    num1 = scan.nextDouble();

                } catch (RuntimeException e){
                    System.out.println("Wrong input, you can only enter a number.");
                    l = true;
                    scan.next();
                }
            } while (l);

            do{
                try {
                    l = false;
                    System.out.print("Enter operator (options: +,-,*,/ ): ");
                    op = scan.next();
                    if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")){
                        l = true;
                        throw new RuntimeException("Wrong input");
                    }
                } catch (RuntimeException e){
                    System.out.println("Wrong input, you can only enter +,-,*, or /");
                }
            } while (l);

            do{
                try {
                    l = false;
                    System.out.print("Enter second number: ");
                    num2 = scan.nextDouble();

                } catch (RuntimeException e){
                    System.out.println("Wrong input, you can only enter a number.");
                    l = true;
                    scan.next();
                }
            } while (l);

            System.out.println("\n"+num1+" "+op+" "+num2+" = "+ provideCalc(num1,op,num2));
            System.out.println("\nquit calc? (y/n): ");
            try {
                String quitter = scan.next();
                if (quitter.equalsIgnoreCase("y") || quitter.equalsIgnoreCase("yes") ){
                    continueCalc = false;
                }
            } catch (RuntimeException e) {
                System.out.println("Unrecognized input, closing calc.");
                continueCalc = false;
            }


        }
    }

    public static double provideCalc(double n1,String o1, double n2){
        switch (o1) {
            case "+": return n1 + n2;
            case "-": return n1 - n2;
            case "*": return n1 * n2;
            case "/": return n1 / n2;
            default:
                System.out.println("unknown operator");
                return 0;
        }
    }
}
