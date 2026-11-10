package StarterExercises;

import java.time.LocalTime;
import java.util.Scanner;

public class HelloNamer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        LocalTime ti = LocalTime.now();
        if(ti.isBefore(LocalTime.NOON) ){
            System.out.printf("Good morning, %s!", name );
        } else if (ti.isBefore(LocalTime.of(16,0))) {
            System.out.printf("Hello there, %s!", name );
        } else System.out.printf("Good evening, %s!", name );


    }
}
