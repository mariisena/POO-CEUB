import java.util.Scanner;
    public class ImcPessoaValoresEntradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o peso (kg): ");
        float peso = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Digite a altura (m): ");
        float altura = scanner.nextFloat();

        Pessoa pessoa = new Pessoa(nome, peso, altura);
        Imc imc = new Imc(pessoa);


        scanner.close();
    }
}
