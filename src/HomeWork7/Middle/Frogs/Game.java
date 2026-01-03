package HomeWork7.Middle.Frogs;

/*Игра “Лягушки”.
Играют 2 человека. Каждому игроку создаётся по лягушке (объект класса Frog).
Игроки по-очереди бросают кость (в данном случае рандомное число от 1 до 6) и сколько выпало,
столько лягушка прыжков и сделает. Кто первый сделает 30 прыжков — тот и победил. Подсказка: в классе Frog
добавьте поле jumpСount — количество прыжков, и при каждом прыжке увеличивайте это количество
 */
public class Game {
    public static void main(String[] args) {
        Frog frog1 = new Frog();
        Frog frog2 = new Frog();
        Player player1 = new Player();
        player1.setName(" ");
        System.out.println("Первый игрок " + player1.getName());
        Player player2 = new Player();
        player2.setName(" ");
        System.out.println("Второй игрок " + player2.getName());

        while (true){
            System.out.println(player1.getName() + frog1.throwBone());
            frog1.jump();
            System.out.println("summ " + frog1.getJumpСount());
            if (frog1.isWon()) {
                System.out.println(player1.getName() + " выиграл");
                break;
            } else System.out.println(player2.getName() + frog2.throwBone());
            frog2.jump();
            System.out.println("summ " + frog2.getJumpСount());
            if (frog2.isWon()) {
                System.out.println(player2.getName() + " выиграл");
                break;
            }
        }


    }
}
