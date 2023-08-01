package guru.qa;

import java.sql.SQLOutput;
import java.util.*;

public class Human {
    final String name;
    final int age;
    final boolean isClever;
    final char size;

    Set<Human> friends;
    Map<Integer, Human> friendsAsMap = new HashMap<>();

    public Human(String name, int age, boolean isClever, char size) {
        this.name = name;
        this.age = age;
        this.isClever = isClever;
        this.size = size;
    }

    public void print() {
        System.out.println(this);
    }

    public Human rename(String newName) {
        return new Human(newName, this.age, this.isClever, this.size);
    }

    public Human setNewAge(int age) {
        Human human = new Human(this.name, age, this.isClever, this.size);
        return human;
    }


    public void addFriend(int passportNumber, Human friend) {
        friendsAsMap.put(passportNumber, friend);
    }

    public void addFriend(Set<Human> friends) {
        this.friends = friends;


        for (Human friend : this.friends) {
            if (friend.age >= 30) {
                continue;
            }
            System.out.println("Congrats!");
            friend.print();
        }

//        int i = 0;
//        while (i < this.friends.length) {
//            System.out.print("Friend: ");
//            this.friends[i].print();
//            i++;
//        }
//
//        do {
//            System.out.print("Friend: ");
//            this.friends[i].print();
//            i++;
//        } while (i < this.friends.length);

    }

    public Human getFriendByPassport(int passportNumber) {
        Set<Map.Entry<Integer, Human>> entries = friendsAsMap.entrySet();


        return friendsAsMap.get(passportNumber);


    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", isClever=" + isClever +
                ", size=" + size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && isClever == human.isClever && size == human.size && Objects.equals(name, human.name) && Objects.equals(friends, human.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isClever, size, friends);
    }
}
