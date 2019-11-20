package EstruturaDeDados;

import java.sql.SQLOutput;
import java.util.*;

public class Aula1 {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Abacaxi");
        frutas.add("Tomate");
        frutas.add("Figo");
        frutas.add("Morango");

        frutas.addAll(Arrays.asList("Jaca", "Caju"));
        Imprimir(frutas, "Frutas inciais: ");
        frutas.add("Banana");
        Imprimir(frutas, "Mais frutas: ");

        System.out.println("Primeira Banana: " + frutas.indexOf("Banana"));
        System.out.println("Última banana: " + frutas.lastIndexOf("Banana"));

        frutas.remove("Banana");
        Imprimir(frutas, "Sem uma banana: ");

        frutas.remove(1);
        Imprimir(frutas, "Removendo o segundo");
        frutas.remove(1);
        Imprimir(frutas, "Removendo o segundo novamente");
        frutas.add(1, "Jambo");
        Imprimir(frutas, "Adicionando no segundo");

        frutas.removeAll(Arrays.asList("Figo", "Caju"));
        Imprimir(frutas, "Removendo vários: ");

        frutas.removeIf(f -> f.startsWith("J"));
        Imprimir(frutas, "Removendo os que começam com J: ");

        System.out.println("Com for indexado: ");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }
    }

    public static void Imprimir (List<String> titulo, String texto){
        System.out.println(texto + titulo);
    }

    //Método que retorne os nomes das cores que você mais gosta

    public static List<String> cores() {
        List<String> coresfavs = new ArrayList<>();
        coresfavs.addAll(Arrays.asList("Azul", "Preto", "Branco", "Cinza"));
        return coresfavs;
    }

    ////Método que dado uma lista retorne a quantidade de itens

    public static Integer quantitensnalista(List<String> titulo){
        return titulo.size();
    }

    //Método que receba 3 Strings, adicione todos em uma lista e remova a segunda posição

    public static void listade3strings(String text1, String text2, String text3){
        List<String> listastrings = new ArrayList<>();
        listastrings.addAll(Arrays.asList(text1, text2, text3));
        listastrings.remove(1);
        System.out.println(listastrings);
    }

    //Método que imprima a lista de cores do primeiro método

    public static void imprimelistadecores(List<String> titulo){
        List<String> coresfavs = cores();
        System.out.println("Minhas cores favoritas são: " + coresfavs);
    }

    //Método que imprima as cores do primeiro método em ordem alfabética

    public static void ordemalfabeticadascores(){
        List<String>  titulo = cores();
        Collections.sort(titulo);
        System.out.println(titulo);
    }

    //Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida

    public static void removeumacor(String corremover){
        List<String> listacores = cores();
        listacores.remove(corremover);
    }

    //Método que receba a lista de cores que você gosta e imprima em ordem decrescente (alfabética)

    public static void ordemdecrescente() {
        List<String> listacores = cores();
        Collections.sort(listacores);
        Collections.reverse(listacores);
        System.out.println(listacores);
    }

    //Método que receba uma lista de números e retorne um mapa com listas de números pares e ímpares

    public static void mapnumerospares(){
        List<Integer> numeros = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        for(int x = 0; x <= 20; x++){
            numeros.add(x);
        }
        Map<String, List<Integer>> pareimpar = new HashMap<>();
        for(int x = 0; x <= 20; x++){
            if(numeros.get(x) % 2 == 0){
                pares.add(numeros.get(x));
            }
            else{
                impares.add(numeros.get(x));
            }
        }
        pareimpar.put("Pares", pares);
        pareimpar.put("Ímpares", impares);
        for(Map.Entry<String, List<Integer>> entry : pareimpar.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
