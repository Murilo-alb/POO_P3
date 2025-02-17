package exercicio2;

public class TesteColaborador {
	public static void main(String[] args) {
		Empregado empregrado1 = new Empregado("Murilo", "Antonio Saad", "16/02/2025", "Programador Java", 5000.0, 123);
		Estagiario estagiario1 = new Estagiario("Douglas","Moita Bonita","25/12/2024","Programador C",1700.0, 564);
		Empresa empresa1 = new Empresa("Fanta", "Eua","15/03/2005", 150, "Patrocinio", 45345);
		Autonomo autonomo1 = new Autonomo("Eduardo","Mexico","27/08/2019", 800,"Testador", 167345);
	
	
			System.out.println(empregrado1.exibirEmpregado());
			System.out.println(estagiario1.exibirEstagiario());
			System.out.println(empresa1.exibirEmpresa());
			System.out.println(autonomo1.exibirAutonomo());
			
	}
}
