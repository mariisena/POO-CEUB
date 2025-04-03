public class Pessoa {
    // Atributos da Classe Pessoa
    private String nome;
    private float peso;
    private float altura;

    // Construtor da Classe Pessoa
    public Pessoa(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    //Método getters
    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    // Método para mostrar a Pessoa e resultado do cálculo do IMC
    public void mostrarImcPessoa(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Peso:" + this.peso);
        System.out.println("Altura:" + this.altura);
    }
}