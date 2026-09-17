package aula17_09;

public class PriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> fila = new PriorityQueue<>();

        // goomba=10,, piranha=15, koopa=20

        fila.add(10);
        fila.add(20);
        fila.add(15);

        //peek : quem aparece primeiro? sem remover

        // peek mostra o que esta no topo da fila
        System.out.println(fila.peek()); // 10 (goomba)

        // poll: goomba entra em cena e sai da fila

        System.out.println(fila.poll()); // 10
        System.out.println(fila.peek()); // 15 (piranha)
        System.out.println(fila.poll()); // 15
        System.out.println(fila.peek()); // 20


    }
}
