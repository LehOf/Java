
public class Nota {
	
	public String nome;
	public double np1;
	public double np2;
	public double np3;
		
	public double media() {
		return np1 + np2 + np3;
	}
	public double Aprovacao () {
		if (media() < 60 ) {
			return 60 - media();	
		}else {
			return 0.0;	
		}
	}
	
}

