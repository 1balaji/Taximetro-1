package br.com.mobyapps.taximetro.model;

//import java.sql.Date;
//import java.sql.Time;

public class Corrida {
	private Long id;
	private String diaDaSemana;
	private String dataDaCorrida;
	private String inicioDaCorrida;
	private String fimDaCorrida;
	private double precoDaCorrida;
	private String tempoDaCorrida;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiaDaSemana() {
		return diaDaSemana;
	}
	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	public String getDataDaCorrida() {
		return dataDaCorrida;
	}
	public void setDataDaCorrida(String dataDaCorrida) {
		this.dataDaCorrida = dataDaCorrida;
	}
	public String getInicioDaCorrida() {
		return inicioDaCorrida;
	}
	public void setInicioDaCorrida(String inicioDaCorrida) {
		this.inicioDaCorrida = inicioDaCorrida;
	}
	public String getFimDaCorrida() {
		return fimDaCorrida;
	}
	public void setFimDaCorrida(String fimDaCorrida) {
		this.fimDaCorrida = fimDaCorrida;
	}
	public double getPrecoDaCorrida() {
		return precoDaCorrida;
	}
	public void setPrecoDaCorrida(double precoDaCorrida) {
		this.precoDaCorrida = precoDaCorrida;
	}
	public String getTempoDaCorrida() {
		return tempoDaCorrida;
	}
	public void setTempoDaCorrida(String tempoDaCorrida) {
		this.tempoDaCorrida = tempoDaCorrida;
	}

	
}
