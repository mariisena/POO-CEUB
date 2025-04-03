public class Imc {
    private float imc;
    private String classificacao;

    // Construtor que calcula o imc
    public Imc(Pessoa pessoa) {
        this.imc = calcularImc(pessoa.getPeso(), pessoa.getAltura());
        this.classificacao = classificarImc (this.imc);
        exibirIMC();
    }

    // Método para cálculo do IMC da Classe Pessoa
    private float calcularImc(float peso, float altura) {
    //Fórmula do IMC = Peso ÷ (Altura × Altura)
        return peso / (altura * altura);
    }

    private String classificarImc(float imc){
        if (imc < 18.5) {
            return "BAIXO PESO. É recomendado procurar um médico para avaliação criteriosa do resultado. Pode indicar um estado de consumo do organismo, com poucas reservas e riscos associados.";
        } else if (imc < 24.9) {
            return "PESO ADEQUADO. Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros da composição corporal, para compreender se estão dentro do recomendado. Algumas pessoas apresentam IMC dentro da normalidade, mas têm circunferência abdominal maior que a recomendada e/ou quantidade de massa gorda acima do ideal.";
        } else if (imc < 29.9) {
            return "SOBREPESO. O sobrepeso está associado ao risco de doenças como diabetes e hipertensão. Então, atenção! Consulte um médico e reveja hábitos para reverter o quadro. Também é importante avaliar outros parâmetros, como a circunferência abdominal.";
        } else if (imc < 34.9) {
            return "OBESIDADE GRAU I. É importante buscar orientação médica e nutricional para entender melhor o seu caso, mesmo que os exames (colesterol e glicemia, por exemplo) estejam normais.";
        } else if (imc < 39.9) {
            return "OBESIDADE GRAU II. Indica um quadro de obesidade mais evoluído em relação à classificação anterior e, mesmo com exames laboratoriais dentro da normalidade, não se deve atrasar a busca por orientação médica e nutricional.";
        } else {
            return "OBESIDADE GRAU III. Nesse ponto, a chance de já estarmos diante de outras doenças associadas é mais elevada. É fundamental buscar orientação médica.";
        }
    }

    public void exibirIMC() {
        System.out.println("IMC: " + imc);
        System.err.println("Resultado: " + classificarImc(imc));
    }      
}