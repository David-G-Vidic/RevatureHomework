package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        var dave = new Human("Dave", 25);
        Human stan = new Human("Stan", 45);

        Human[] peps = {dave, stan};
        for (Human p : peps){
            System.out.println("Hello %s you are like %d years old. Get roasted! + Unk Status"
                    .formatted(p.getName(), p.age + 5));

        }

    }
}