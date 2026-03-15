package br.com.fiap;

public class Executavel {
    public static void main(String[] args) {
        Gato meuGato = new Gato();

        // Atributo que veio da classe Animal
        meuGato.nome = "Floco";

        // Método que veio da classe Animal
        meuGato.comer();

        // Método que só o Gato tem
        meuGato.miar();
    }
}
