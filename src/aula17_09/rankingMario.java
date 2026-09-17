package aula17_09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class rankingMario {

    public static void main(String[] args) {


        // arraylist, acesso rapido por indice
        // add() adiciona ario, luigi, peach, yoshi a lista
        // get(0) retorna "mario"(o primeiro elemento da lista
        // remove(3): remove yoshi da lista
        // clear(): limpa todos os personagens e deixa o array vazio

        List<String> personagens = new ArrayList<>();
        personagens.add("Mario");
        personagens.add("Luigi");
        personagens.add("Peach");
        personagens.add("Yoshi");

        System.out.println(personagens.get(0)); // "mario"
        personagens.remove(3); // remove yoshi
        personagens.clear(); // limpa tudo
        System.out.println(personagens);

        // LinkedList, insercao/remocao eficientes
        List<String> inimigos = new LinkedList<>();
        inimigos.add("Goomba");
        inimigos.add("Koopa");
        inimigos.remove(0); // remove o primeiro da fila
    }
}
