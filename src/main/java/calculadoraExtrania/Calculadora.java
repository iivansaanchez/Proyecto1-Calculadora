package calculadoraExtrania;
import java.util.Objects;

public class Calculadora {
	
	private String number;
	private String ope;
	public String valor;
	
	public Calculadora() {
		super();
		this.valor="";
	}
	
	public static String calcular(String resultado) {
		double res = 0.0;
		String numeroDecimal = "";
		
			
			for(int i = 0; i < resultado.length(); i++) {
				
				if(resultado.charAt(i)!='+' && resultado.charAt(i)!='-') {
					numeroDecimal+=String.valueOf(resultado.charAt(i));
				}else if(resultado.charAt(i)=='+') {
					res+=Double.valueOf(numeroDecimal);
					numeroDecimal="";
				}else if(resultado.charAt(i)=='-') {
					res-=Double.valueOf(numeroDecimal);
					numeroDecimal="";
				}
			}
		
		
		return "= " + res;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getOpe() {
		return ope;
	}

	public void setOpe(String ope) {
		this.ope = ope;
	}

	public String getMenssage() {
		return valor;
	}

	public void setMenssage(String menssage) {
		this.valor = menssage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(valor, number, ope);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		return Objects.equals(valor, other.valor) && Objects.equals(number, other.number)
				&& Objects.equals(ope, other.ope);
	}
}
