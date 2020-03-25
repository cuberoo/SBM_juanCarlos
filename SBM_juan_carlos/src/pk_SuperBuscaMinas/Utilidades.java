package pk_SuperBuscaMinas;

public class Utilidades {

	/**
	 * Método que imprime una matriz por pantalla
	 */
	public static void imprimeMatrizBotones(BotonMina[][] matrizBotones) {
		for (int fil=0; fil<matrizBotones.length; fil++) {
			for (int col=0; col<matrizBotones.length; col++) { { // Recorro las columnas de la fila "i"
					System.out.print(matrizBotones[fil][col] + "\t"); // Imprimo el valor, con un tabulador y sin \n
				}
				System.out.println();
			}
		}
	}

}
