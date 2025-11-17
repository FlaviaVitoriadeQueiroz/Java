public class Carro {
    String modelo;
    int ano;

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro();  // objeto
        meuCarro.modelo = "Gol"; // atributo
        meuCarro.ano = 2015; // atributo
        meuCarro.exibirInfo(); // método
    }
}

/*A Programação Orientada a Objetos (POO) traz vários pontos positivos, como a melhor organização do código, a facilidade de reutilização por meio de herança,
a proteção de dados através do encapsulamento e a possibilidade de modelar situações do mundo real de forma mais clara e estruturada.
Isso torna o desenvolvimento mais seguro, flexível e fácil de manter.

Uma classe é um modelo que descreve quais características (atributos) e ações (métodos) um determinado tipo de elemento vai ter.
Já um objeto é a materialização dessa classe, ou seja, um exemplo concreto criado a partir dela.

Por exemplo, podemos ter uma classe chamada Carro, e um objeto seria meuCarro, criado a partir desse modelo. */