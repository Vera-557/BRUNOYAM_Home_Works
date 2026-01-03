package HomeWork7.Hard.RockPaperScissors;
/*Написать игру “Камень, ножницы, бумага, колодец” У каждого из участников в наличии имеется 4 карты, на каждой
из которых изображён один из элементов игры: камень, ножницы, бумага и колодец. По команде ведущего участники
произвольно кладут на стол одну из карт. Побеждает тот, чья карта «покрыла» карту соперника, исходя из правил
игры (камень покрывает ножницы, бумага — камень и колодец, ножницы — бумагу, колодец — ножницы и камень).
Игра должны быть написана в ООП стиле, с использованием классов и методов. У игроков должен быть свой счёт,
который отображается на консоли в конце игры.
 */
public class Game {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        System.out.println("0 = Камень - 1 = ножницы - 2 = бумага - 3 = колодец?");
        System.out.println("Первый игрок вводит свое имя");
        player1.getName();
        System.out.println("Второй игрок вводит свое имя");
        player2.getName();

        System.out.println("Кладите карту на стол! \n 0 = Камень - 1 = ножницы - 2 = бумага - 3 = колодец");
        System.out.println(player1.name + " Кидает карту");
        int card1 = player1.makeChoice();
        System.out.println(player2.name + " Кидает карту");
        int card2 = player2.makeChoice();
        if (card1 == card2){
            System.out.println("Ничья");
        } else if (card1 == 0 && card2 == 1 || card1 == 1 && card2 == 2 || card1 == 2 && card2 == 0 || card1 == 3 && card2 == 1){
            System.out.println(player1.name + " Победил");
            player1.getCount();
        } else if (card1 == 2 && card2 == 3 || card1 == 3 && card2 == 0){
            System.out.println(player1.name + " Победил");
            player1.getCount();
        } else { System.out.println(player2.name + " Победил");
        player2.getCount();
        }

        System.out.println("Счёт " + player1.name + " " + player1.count);
        System.out.println("Счёт " + player2.name + " " + player2.count);
    }
}
