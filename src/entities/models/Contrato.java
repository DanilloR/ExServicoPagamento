package entities.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private int numeroContrato;
	private Date data;
	private Double valorContrato;
	
	List <Prestacao> prestacoes = new ArrayList<>();

	public Contrato(int numeroContrato, Date data, Double valorContrato) {
		this.numeroContrato = numeroContrato;
		this.data = data;
		this.valorContrato = valorContrato;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public Date getData() {
		return data;
	}

}
