package com.capg.java21.records;

public class TestPatternMatching {

    public static void main(String[] args) {
        Person tom = new Person("tom", 3);
        Person cat = new Person("Jerry", 2);

        Ability ability = Ability.WEAK;
        Player player1 = new Player(tom, ability);
        Player player2 = new Player(cat, Ability.STRONG);
        Player player3 = new Player(null, null);
        Doubles doubles = new Doubles(player1, player2);
        Type<String> type = new Type<>("Hi", "Harlow");
        Type<Player> playerType = new Type<>(player1, player2);

        TestPatternMatching.recordPatternMatching(tom);
        TestPatternMatching.recordPatternMatching(cat);
        TestPatternMatching.recordPatternMatching(ability);
        TestPatternMatching.recordPatternMatching(player1);
        TestPatternMatching.recordPatternMatching(player3);
        TestPatternMatching.recordPatternMatching(doubles);
        TestPatternMatching.recordPatternMatching(type);
        TestPatternMatching.recordPatternMatching(playerType);
    }

    public static void recordPatternMatching(Object obj) {

        if (obj instanceof Person p)
            System.out.println("Name : " + p.name() + ", Age : " + p.age());
        if (obj instanceof Ability a)
            System.out.println("Ability : " + a);
        if (obj instanceof Player p)
            System.out.println("Player  : " + p);
       /* if (obj instanceof Player(var p, Ability a))
            System.out.println("person  : " + p + ", Ability : " + a);*/
        if (obj instanceof Doubles d)
            System.out.println("Double players  : " + d);
        if (obj instanceof Type t)
            System.out.println("Type  : " + t.x() + " " + t.y());

    }
}
