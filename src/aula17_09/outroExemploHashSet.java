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

        System.out.println(roster.size()); // 5 pq? r: pq nao le indicie, e pq como ja tem mario
        // ele nao adiciona novamente, porque checa que ja existe, ent se ja existe ele ignora
        System.out.println(roster.contains("Luigi")); // true

        roster.remove("Mario");
        System.out.println(roster.size());
    }
}
