package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.models.Contrato;
import entities.models.Prestacao;
import entities.services.ServicoContrato;
import entities.services.ServicoPayPal;

public class ProgramaContrato {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe os dados do contrato");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/aaaa): ");
		Date data = sdf.parse(sc.nextLine());
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		sc.nextLine();
		System.out.println("Número de parcelas: ");
		int parcelas = sc.nextInt();
		
		Contrato contrato = new Contrato (numero, data, valor);
		ServicoContrato servico = new ServicoContrato(new ServicoPayPal());
		servico.processaContrato(contrato, parcelas);
		
		System.out.println("Parcelas: ");
		for (Prestacao x : contrato.getPrestacoes()) {
			System.out.println(x);
		}
		
		
		sc.close();

	}

}
