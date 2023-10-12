package miprimerproyecto;

public class BucleEjemplo {

	public static void main(String[] args) {
	
		int unNum = 10;
		
		System.out.println("Ciclo WHILE Disminuye");
		
		while(unNum > 0){
		 System.out.println(unNum);
		 unNum = unNum -1; //unNum=--
		 }
		
		for(int otroNum=10;otroNum>	0;otroNum--) {//ciclo infinito ++
			System.out.println(otroNum);
		}	
		
		System.out.println("Ciclo FOR Aumentar");
		for(int otroNum=0;otroNum<10;otroNum++){
			 System.out.println(otroNum);
			 }

		

	}

}
