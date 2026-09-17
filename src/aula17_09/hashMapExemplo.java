package aula17_09;

import java.util.HashMap;
import java.util.Map;

public class hashMapExemplo {
    public static void main(String[] args) {
        Map<String, String> habilidades = new HashMap<>();

        // put ("mario", "fireball"): insere o par do personagem -> habilidade
        // cada personagem ter sua habilidade UNICA, nao se repete, outro personagem nao pode ter a mesma
        // habilidade que outro
        // get("Luigi"): retorna a habilidade do Luigi diretamente pela chave

        habilidades.put("Mario", "Fireball");
        habilidades.put("Luigi", "Poltergust");
        habilidades.put("Yoshi", "Flutter Jump");
        habilidades.put("Peach", "Float");
        habilidades.put("Toad", "Speed Boost");

        Map<String, Integer> colegas = new HashMap<>();
        colegas.put("Paulino", 67);
        colegas.put("Anna", 67);
        colegas.put("Lucas", 67);
        colegas.put("Gabriel", 0);
        colegas.put("Babi", 10);

        Integer c = colegas.get("Anna");
        System.out.println(c);

        for (Map.Entry<String, Integer> f : colegas.entrySet()){

            System.out.println(f.getKey() + " -> " + f.getValue());
        }
        // busca direta pela chave
        // busca na direcao esquerda->direita (que nem em arvore binaria)

        String h = habilidades.get("Luigi");
        System.out.println(h); // "Poltergust"

        // iterar sobre todos
        for (Map.Entry<String, String> e : habilidades.entrySet()){ // o entryset serve como um "get", mas para puxar 2 elementos
            // entry é uma interface
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }// o hashmap não garante ordem. use treemap para manter ordenacao ou linkedHashMap para preservar a insercao
}
