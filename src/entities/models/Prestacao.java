package entities.models;

import java.util.Date;

public class Prestacao {
	
	private Date dataVencimento;
	private Double montante;
	
	public Prestacao(Date dataVencimento, Double montante) {
		this.dataVencimento = dataVencimento;
		this.montante = montante;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public Double getMontante() {
		return montante;
	}
	

}
