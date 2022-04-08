
import javax.swing.*;

public class Heap {
		public static void main (String[] args) {
			int arreglo [];
			int num_Elem = 10;
			int op = 0;
			
					
			//CREACION DEL ARREGLO
			arreglo = new int[num_Elem];
			//LLAMADO A LOS METODOS
			generar (arreglo, num_Elem);
					
			do {
					op = Integer.parseInt(JOptionPane.showInputDialog(null,"Elija una Opcion:\n"
					+ "1.IMPRIMIR NUMEROS\n"
					+ "2.IMPRIMIR NUMEROS CON METODO DE ORDENAMIENTO POR MEZCLA DIRECTA\n"
					+ "3.SALIR"));
	
					switch (op) 
					{
						case 1:
							System.out.println ("NUMEROS GENERADOS ALEATORIAMENTE");
							imprimir(arreglo);
							break;
						
						case 2:
							System. out.println ("NUMEROS ORDENADOS CON METODO DE MEZCLA DIRECTA");
							ordenacion_Monticulo(arreglo);
							imprimir(arreglo);
							break;
						
						case 3:
							break;
					}
					
					
				}
			while(op!=3);				
			
		}
		
		//METODO PARA GENERAR LOS NUMEROS ALEATORIAMENTE
		public static void generar (int arreglo [], int num_Elem) 
		{
			//num_Elem = 10;
			for (int i = 0; i < arreglo.length ; i++) 
			{
				arreglo [i] = (int) (Math.random () * num_Elem);
			}
					
						
		}

		//METODO DE ORDENACIÓN POR MONTICULOS
		public static void ordenacion_Monticulo(int arreglo []) 
		{
			final int N = arreglo.length;
			for (int nodo = N/2; nodo>=0; nodo--) 
				{
					hacerMonticulo(arreglo, nodo, N - 1);
				}
			for (int nodo = N-1; nodo>=0; nodo--) 
				{
					int tmp = arreglo[0];
					arreglo[0] = arreglo[nodo];
					arreglo[nodo] = tmp;
					hacerMonticulo(arreglo, 0, nodo-1);
				}

		}
		
		public static void hacerMonticulo(int arreglo [], int nodo, int fin) 
		{
			int izq = 2*nodo+1;
			int der = izq+1;
			int may;
			if(izq>fin)return;
			if(der>fin) may=izq;
			else may = arreglo[izq] > arreglo[der]?izq:der;
			if (arreglo[nodo] < arreglo[may]) 
			{
				int tmp = arreglo[nodo];
				arreglo[nodo] = arreglo[may];
				arreglo[may] = tmp;
				hacerMonticulo(arreglo, may, fin);
			}
		}

		//METODO PARA MOSTRAR EL ARREGLO DESORDENADO Y ORDENADO
		public static void imprimir (int arreglo []) 
		{
			for (int i = 0; i < arreglo.length; i++)
			{
				System.out.println (arreglo [i]);
			}
		}
							
	
}
