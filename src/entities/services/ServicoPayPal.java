package entities.services;

public class ServicoPayPal implements ServicoPagamentoOnLine {
	
	public static final double jurosMensais = 0.01;
	public static final double taxaPagamento = 0.02;

	@Override
	public double taxaPagamento(double montante) {
			
		return montante*taxaPagamento;
	}

	@Override
	public double parcelamento(double montante, int meses) {

		return montante*jurosMensais*meses;
	}

}
