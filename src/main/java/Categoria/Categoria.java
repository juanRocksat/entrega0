package Categoria;

public class Categoria {
	String categoria;
	long cotaInferior;
	double cotaSuperior;
	double cargoFijo ;
	double cargoVariableFactor;
	
	
	
	public Categoria(String r,long cotaMin,double cotaMaxima,double fijo,double variablee) {
		categoria=r;
		cotaInferior=cotaMin;
		cotaSuperior=cotaMaxima;
		cargoFijo=fijo;
		cargoVariableFactor=variablee;
	}
	
	
	
	
	
	//getter y setters
	@Override
	public String toString() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public long getCotaInferior() {
		return cotaInferior;
	}
	public void setCotaInferior(long cotaInferior) {
		this.cotaInferior = cotaInferior;
	}
	public double getCotaSuperior() {
		return cotaSuperior;
	}
	public void setCotaSuperior(double cotaMaxima) {
		this.cotaSuperior = cotaMaxima;
	}
	public double getCargoFijo() {
		return  cargoFijo;
	}
	public void setCargoFijo(double fijo) {
		this.cargoFijo = fijo;
	}
	public double getCargoVariableFactor() {
		return cargoVariableFactor;
	}
	public void setCargoVariableFactor(double variablee) {
		this.cargoVariableFactor = variablee;
	}

	
}
