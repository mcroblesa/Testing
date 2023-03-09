package org.yoresoftware.testing;

/**
 * <p>Clase representando una calculadora de <strong>decimales de PI</strong>.</p>
 * 
 * @author profesor
 *
 */
public class Testing {

	public static void main(String[] args) {
		String str11 = "ey bro";
		String str12 = "ey2 bro";
		
		String str21 = "ey bro";
		String str22 = "ey bro";
		
		String str31 = "ey2 bro";
		String str32 = "ey bro";
		
		String mensaje = "";
		
		if(esCorrectaContrasena(str11, str12)) {
			mensaje = str12;
		}else {
			mensaje = str11;
			
		}
		

		
		
		
//		if (args.length != 1) {
//			System.err.println("One command-line argument expected: number of " + "digits.");
//		} else {
//			PiCalc piCalc = new PiCalc(Integer.parseInt(args[0]));
//			System.out.println(piCalc.compute());
//			PiCalc piCalc2 = new PiCalc(Integer.parseInt("34"));
//			System.out.println(piCalc2.compute());
//		}
	}
	
	private static boolean esContrasenaCorrecta(String cAntigua, String cNueva) {
		// TODO: Método que devuelve cierto si
		boolean res = false;
		
		return res;
	}
	
	
}