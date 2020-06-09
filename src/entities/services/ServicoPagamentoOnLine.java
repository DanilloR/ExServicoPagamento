package entities.services;

public interface ServicoPagamentoOnLine  {
	
	double taxaPagamento (double montante);
	double parcelamento (double montante, int meses);

}
