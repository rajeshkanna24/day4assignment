package com.day4assignment;
import java.util.Random;
public class Snakeladder7 {
    static final int startPosition = 0;
    static final int ladderOption = 2;
    static final int snakeOption = 1;
    int position;
    int option;
    int roll = 0;

    public void player() {
        position = startPosition;
        roll++;
        int dieNumber;
        Random rnd = new Random();
        dieNumber = rnd.nextInt(1, 7);
        option = rnd.nextInt(1, 3);
        System.out.println("Die Number = " + dieNumber);

        switch (option) {
            case ladderOption:
                System.out.println("ladder option");
                position += dieNumber;
                break;
            case snakeOption:
                System.out.println("snake option");
                position -= dieNumber;
                if (position < 0) {
                    System.out.println("The player bit by snake");
                    position = 0;
                } else {
                    System.out.println("The player bit by snake");
                }
                break;
            default:
                System.out.println("No Play option");
                break;
        }
        System.out.println("current position : " + position+"\n");
    }
}
