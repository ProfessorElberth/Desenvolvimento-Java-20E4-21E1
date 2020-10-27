public class Primeiro{
	static String nome;
	static String sobrenome;
	static int idade;
	static float salario;
	static boolean javadev;
    static int qtdeMeses;
	
	private static void tratarParametros(String[] parametros){
		nome = parametros[0];
		sobrenome = parametros[1];
		idade = Integer.valueOf(parametros[2]);
		salario = Float.valueOf(parametros[3]);
		javadev = Boolean.valueOf(parametros[4]);
		qtdeMeses = Integer.valueOf(parametros[5]);
	}	
	private static boolean validar(int qtde){		
		return qtde == 6 ? true : false;
	}
	private static int definirAnoNascimento(){
		return 2020 - idade;
	}
	private static float calcularValorTotal(){
		return salario * qtdeMeses;
	}
	private static String obterPerfilPorIdade(){
		return idade < 50 ? "iniciante" : "veterano";
	}
	private static String obterPerfilPorSalario(float valor){
		return valor > 1000 ? "estavel" : "instavel";
	}
	
	private static void imprimir(){
		float valorTotal = calcularValorTotal();

		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.printf("Idade: %d\n", idade);
		System.out.println("Ano de nascimento: " + definirAnoNascimento());
		System.out.printf("Salario: %.2f\n", salario);
		System.out.printf("Valor total: %.2f\n", valorTotal);
		System.out.println("Javadev: " + javadev);
		System.out.printf("Perfil: %s | %s\n", obterPerfilPorIdade(), obterPerfilPorSalario(valorTotal));
	}

	public static void main(String[] args){

		if(validar(args.length)){
			
			tratarParametros(args);

			imprimir();
		}else{		
			System.out.println("Problemas nos argumentos!!!");
		}
	}
}