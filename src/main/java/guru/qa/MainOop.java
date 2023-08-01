package guru.qa;

import java.util.List;
import java.util.Set;

public class MainOop {
    public static void main(String[] args) {
        Human dima = new Human("Dima", 34, true, 'L');
        Human valera = new Human("Valera", 35, true, 'M');
        Human maria = new Human("Maria", 25, true, 'S');
        Human andrew = new Human("Anrew", 20, true, 'S');

        dima.print();

        dima.addFriend(1345, valera);
        dima.addFriend(4523, maria);
        dima.addFriend(7777, andrew);

        dima.getFriendByPassport(4523).print();
    }
}
