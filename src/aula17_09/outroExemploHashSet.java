package aula17_09;

import java.util.HashSet;
import java.util.Set;

public class outroExemploHashSet {
    public static void main(String[] args) {
        Set<String> roster = new HashSet<>();

        roster.add("Mario");
        roster.add("Luigi");
        roster.add("Peach");
        roster.add("Yoshi");
        roster.add("Toad");

        roster.add("Mario");

        System.out.println(roster.size());
        System.out.println(roster.contains("Luigi"));

        roster.remove("Mario");
        System.out.println(roster.size());
    }
}
