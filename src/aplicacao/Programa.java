package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;
import entidade.Terceirizado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Entre com o número de funcionarios: ");
		int n = sc.nextInt();

		for(int i=0; i<=n; i++) {
			System.out.println("Funcionario #"+ i + "data: ");
			System.out.print("Terceirizado (y/n)?");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			Integer horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Taxa Adicional: ");
				double taxaAdicional = sc.nextDouble();
				Funcionario func = new Terceirizado(nome, horas, valorPorHora, taxaAdicional);
				list.add(func);
			} else {
				Funcionario func = new Funcionario(nome, horas, valorPorHora);
				list.add(func);
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS");
		for (Funcionario func : list) {
			System.out.println(func.getNome() + "- $ " + String.format("%.2f", func.pagamento()));
		}
		
		sc.close();
	}

}
