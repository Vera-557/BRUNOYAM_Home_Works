package HomeWork7.Middle.Frogs;

import java.util.Random;

public class Frog {

    int jumpСount;

    public void jump() {
        int summ = takeRandomNumber();
        System.out.println("Ваша лягушка прыгнула " + summ);
        jumpСount = summ + jumpСount;
    }

    public int getJumpСount() {
        return jumpСount;
    }
    public String throwBone(){
        String printMove = " бросает кубик \uD83C\uDFB2";
        return printMove;

    }
    public int takeRandomNumber (){
        Random random = new Random();
        int number = random.nextInt(5) + 1;
        return number;
    }

    public boolean isWon(){
        return jumpСount >= 30;
    }

}
