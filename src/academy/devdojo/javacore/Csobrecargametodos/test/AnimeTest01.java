package src.academy.devdojo.javacore.Csobrecargametodos.test;

import src.academy.devdojo.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12);
        anime.setGenero("Ação");
        anime.imprime();
    }
}
