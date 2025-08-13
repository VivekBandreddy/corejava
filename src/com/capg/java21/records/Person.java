package com.capg.java21.records;

public record Person(String name, int age) {
}

enum Ability {WEAK, AVERAGE, STRONG}

record Player(Person person, Ability ability) {
}

record Doubles(Player p1, Player p2) {
}

record Type<T>(T x, T y) {

}
