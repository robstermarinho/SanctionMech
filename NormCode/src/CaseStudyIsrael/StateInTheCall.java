package CaseStudyIsrael;

import jamder.norms.Norm;

/*Classe para armazenar o estado de uma norma quando uma a��o
*de monitoramento for adicionada na fila do agente gerenciador.
*A avalia��o ser� feita quando o gerente puder, mas com dados do
*momento do envio da notifica��o para o gerente.*/
public class StateInTheCall{
	private Norm nor;
	private boolean isActive;
	
	public StateInTheCall(Norm nor) {
		this.nor=nor;
		if (this.nor.isActive())
			this.isActive=true;
		else this.isActive=false;
	}
	public Norm getNorm() {
		return nor;
	}
	public void setNorm(Norm nor) {
		this.nor = nor;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
