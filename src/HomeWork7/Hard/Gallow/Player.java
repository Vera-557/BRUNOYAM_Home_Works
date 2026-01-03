package HomeWork7.Hard.Gallow;

import java.util.Scanner;

public class Player {
    String name;

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        name = new Scanner(System.in).next().trim();
        return name;
    }
}
