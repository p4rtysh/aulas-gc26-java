package aula17_09;

import java.util.HashMap;
import java.util.Map;

public class hashMapExemplo {
    public static void main(String[] args) {
        Map<String, String> habilidades = new HashMap<>();

        habilidades.put("Mario", "Fireball");
        habilidades.put("Luigi", "Poltergust");
        habilidades.put("Yoshi", "Flutter Jump");
        habilidades.put("Peach", "Float");
        habilidades.put("Toad", "Speed Boost");

        // busca direta pela chave

        String h = habilidades.get("Luigi");
        System.out.println(h); // "Poltergust"

        // iterar sobre todos
        for (Map.Entry<String, String> e: habilidades.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
