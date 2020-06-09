package entities.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {
	
	private Date dataVencimento;
	private Double montante;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Prestacao(Date dataVencimento, Double montante) {
		this.dataVencimento = dataVencimento;
		this.montante = montante;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}
	
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getMontante() {
		return montante;
	}
	
	public void setMontante (Double montante) {
		this.montante = montante;
	}
	
	public String toString() {
		return sdf.format(dataVencimento)
				+ " - " + String.format("%.2f", montante); 
	}

}
