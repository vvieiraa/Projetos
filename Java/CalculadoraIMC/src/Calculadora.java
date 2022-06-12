
public class Calculadora {
	
	private double altura;
	private double peso;
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double imc() {
		return peso / (altura * altura);
	}
	
	public String nivel() {
		if (this.imc() < 18.5) {
			return "Magreza";
		} else if (this.imc() >= 18.5 && this.imc() <= 24.9) {
			return "Normal";
		} else if (this.imc() >= 25.0 && this.imc() <= 29.9) {
			return "Sobrepeso";
		} else if (this.imc() >= 30.0 && this.imc() <= 39.9) {
			return "Obesidade";
		} else {
			return "Obesidade Grave";
		}
		
	}
	
}
