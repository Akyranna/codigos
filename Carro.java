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
