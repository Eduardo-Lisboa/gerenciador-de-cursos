package br.com.alura.test;

import br.com.alura.model.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {


        Aula a1 = new Aula("Revisando Arraylist", 21);
        Aula a2 = new Aula("Lista de objetos", 20);
        Aula a3 = new Aula("Relacionamento Lista de objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<Aula>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);



    }


}
