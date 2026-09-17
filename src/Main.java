import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // collections

        //int num1 = 5; // quero adicionar iisso aqui numa collection, mas ele é um int :(
        //Integer num1Wrapper = num1; // isso aqui transforma o int (variavel primitiva) em um objeto (integer) =D
        // ele nao aceita variaveis do tipo primitivo!
        //Collection<Integer>

        // ArrayList

        String[] nomesPiratasOnePiece = {"Zoro", "Luffy", "Nami", "Sanji", "Chopper", "Brook", "Frank", "Usopp", "Robin", "Jinpe"};
        List<String> arrayListPiratasOnePiece = new ArrayList<>();
        arrayListPiratasOnePiece.add("Ace");
        arrayListPiratasOnePiece.remove("Usopp");

        for (int i = 0; i < arrayListPiratasOnePiece.size(); i++){

        }
    }
}