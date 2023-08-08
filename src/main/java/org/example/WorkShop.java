package org.example;

import java.util.Arrays;

public class WorkShop {
    public static void main(String[] args) {
        Friend[] friends = new Friend[] {new Friend("Катя", 23, false, 4.3f),
                new Friend("Ваня", 25, true, 3f),
                new Friend("Маша", 19, false, 2.1f),
                new Friend("Коля", 21, false, 5f),
                new Friend("Оля", 30, true, 6.5f)};

        System.out.println("My friends: " + Arrays.toString(friends));
    }
}

class Friend {
    private String name;
    private int age;
    private boolean haveAPet;
    private float hoursSpentTogetherLastWeek;

    public Friend(String name, int age, boolean haveAPet, float hoursSpentTogetherLastWeek) {
        this.name = name;
        this.age = age;
        this.haveAPet = haveAPet;
        this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isFriendFromSchool=" + haveAPet +
                ", hoursSpentTogetherLastWeek=" + hoursSpentTogetherLastWeek +
                '}';
    }
}