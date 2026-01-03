package HomeWork7.Middle.Frogs;



import java.util.Scanner;

public class Player {
    String name;

    public String getName(){

        return this.name;
    }

    public void setName(String name){
        System.out.println("Введите ваше имя");
        name = new Scanner(System.in).next().trim();
        this.name = name;

    }

}
