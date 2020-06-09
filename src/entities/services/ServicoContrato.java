package entities.services;

import java.util.Calendar;
import java.util.Date;

import entities.models.Contrato;
import entities.models.Prestacao;

public class ServicoContrato {
	
	private ServicoPagamentoOnLine servicoPagamentoOnline;

	public ServicoContrato(ServicoPagamentoOnLine servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	
	private Date adicionaMeses (Date data, int n) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
	
	public void processaContrato (Contrato contrato, int meses) {
		
		double valorBrutoContrato = contrato.getValorContrato()/meses;
		
		for (int i=0;i<meses;i++) {
			Date data = adicionaMeses(contrato.getData(), i);
			double atualizaParcela = valorBrutoContrato + servicoPagamentoOnline.parcelamento(valorBrutoContrato, i);
			double valorFinalParcela = atualizaParcela + servicoPagamentoOnline.taxaPagamento(atualizaParcela);
			contrato.addPrestacao(new Prestacao(data, valorFinalParcela));
		}
	}
	

}
