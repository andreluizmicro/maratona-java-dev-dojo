package src.academy.devdojo.javacore.Dconstrutores.test;

import src.academy.devdojo.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime =  new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");
        anime.imprime();

    }
}
