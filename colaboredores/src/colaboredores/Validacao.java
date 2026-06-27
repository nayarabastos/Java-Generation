package colaboredores;

public class Validacao {
	public static void validarNome(String nome) {
		if(nome == null || nome.trim().isEmpty())
			throw new IllegalArgumentException("Não não pode ser vazio!");
	}
	public static void validarEmail(String email) {
		if(email.matches(""))
			throw new IllegalArgumentException("Digite um e-mail válido!");
	}
	public static void validarSalario(double salario) {
		if (salario <= 0)
			throw new IllegalArgumentException("O salário deve ser maio que zero!");
	}
	public static void validarBonus(double bonus) {
		if (bonus < 0)
			throw new IllegalArgumentException("O salário deve ser maio que zero!");
	}
}

