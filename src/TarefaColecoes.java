import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TarefaColecoes {
    public static void main(String[] args) {
        listaNomes();
        listaNomeseGeneros();
        separandoGeneros();
    }

    private static void listaNomes () {
        System.out.println("Nomes: ");
        List<String> lista = new ArrayList<>();
        lista.add("Gustavo");
        lista.add("Gabrielle");
        lista.add("Victor");
        lista.add("Victoria");
        System.out.println(lista);
        System.out.println("");
    }

    private static void listaNomeseGeneros () {
        System.out.println("Nomes e Gêneros: ");
        List<Caracteristicas> lista = new ArrayList<>();
        Caracteristicas a = new Caracteristicas("Gustavo", "Masculino");
        Caracteristicas b = new Caracteristicas("Gabrielle", "Feminino");
        Caracteristicas c = new Caracteristicas("Victor", "Masculino");
        Caracteristicas d = new Caracteristicas("Victoria", "Feminino");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        System.out.println("Lista: " + lista);
        Collections.sort(lista);
        System.out.println("");
    }
    private static void separandoGeneros () {
        System.out.println("Separando por Gênero: ");
        List<Caracteristicas> M = new ArrayList<Caracteristicas>();
        Caracteristicas a = new Caracteristicas("Gustavo", "Masculino");
        Caracteristicas c = new Caracteristicas("Victor", "Masculino");
        M.add(a);
        M.add(c);
        List<Caracteristicas> F = new ArrayList<Caracteristicas>();
        Caracteristicas b = new Caracteristicas("Gabrielle", "Feminino");
        Caracteristicas d = new Caracteristicas("Victoria", "Feminino");
        F.add(b);
        F.add(d);
        Collections.sort(M);
        Collections.sort(F);
        System.out.println(M);
        System.out.println(F);
    }
}
