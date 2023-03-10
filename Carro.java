// Classe Carro
class Carro {
    // Atributos encapsulados
    private String marca;
    private String modelo;
    private int ano;

    // Construtor da classe
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para imprimir os atributos do carro
    public void imprimirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

// Classe principal do programa
class ProgramaCarro {
    public static void main(String[] args) {
        // Instanciando objetos da classe Carro
        Carro carro1 = new Carro("Chevrolet", "Onix", 2021);
        Carro carro2 = new Carro("Ford", "Fiesta", 2019);

        // Chamando o método imprimirDados() dos objetos criados
        carro1.imprimirDados();
        carro2.imprimirDados();
    }
}
/*
Explicação:
Nesse exemplo, temos uma classe Carroque define três atributos encapsulados: marca, modeloe ano.
Esses atributos são privados, o que significa que só podem ser acessados da própria classe Carro.
A classe também tem um construtor que recebe valores para os atributos e um método imprimirDados()que
imprime na tela os valores dos atributos.
Na classe ProgramaCarro, criamos dois objetos da classe Carro usando uma palavra-chave new e
passando os valores para o construtor. Em seguida, siga o método imprimirDados()dos objetos criados para
exibir seus valores na tela.
Assim, temos um exemplo que demonstra os conceitos de classes, objetos, encapsulamento e instanciação em Java.
 */
