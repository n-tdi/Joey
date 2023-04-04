package world.ntdi.joey;

import world.ntdi.joey.core.Brain;

import java.util.Scanner;

public final class Joey {
    public static void main(String[] args) {
        Brain joey = new Brain();
        joey.createEyes();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("You > ");
            String response = input.nextLine();

            joey.readText(response);
            System.out.println();
        }
    }
}
