package aula15_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class diarioThousandSunny {

    public static void main(String[] args) {


    List<String> rotaGrandLine = new ArrayList<>(); // por que array? porque, na atividade, é pedida uma lista em ordem

    rotaGrandLine.add("East Blue");
    rotaGrandLine.add("Alabasta");
    rotaGrandLine.add("Water 7");

    for(String n : rotaGrandLine){
        System.out.println(n);
    }

    Iterator iterador = rotaGrandLine.iterator();
    while(iterador.hasNext()){
        System.out.println(iterador.next());
    }

    // declaracao de linkedList (bem parecida com a de arrayList)
    List<Integer> linkedList = new LinkedList<>(); // uma lista no collectionpode representar dois tipos de valores? nao
    // porem o Map pode!



}
}
