
public class Verificacion {
	
	private String a;
	int[] codes = {2345,5679,1245,9853,3456};
	String[] receta = {"Citromicina cada 5 horas", "Aspirina cada 12 horas", "Homeprazon cada 7 horas",
			"Paracetamol cada 24 horas", "Amlodipina cada mañana", "Atorvastatina depués de almuezo"};
	
	
	
	public String veriCode(int code) {
		a = "";
		veriCode(code, codes);
		return a;
	}
	
	private void veriCode(int code1, int[] code2) {
		for(int i=0; i < codes.length; i++) {
			if(code1 == codes[i]) {
				a = receta[i];
				break;
			}
		}

	}
	
	/*private String rec(int i) {
		for(int x=0; x < receta.length; x++) {
			if(receta[x] == receta[i]) {
				String a = receta[x];
				return a;
			}
		}
		
	}*/
}