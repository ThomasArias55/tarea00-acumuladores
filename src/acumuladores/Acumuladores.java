package acumuladores;

public class Acumuladores {

	/**
	 * Dada una matriz de enteros y un número, verifica si existe alguna fila 
	 * donde todos sus elementos sean múltiplos del número recibido por 
	 * parámetro.
	 * 
	 * Si la matriz está vacía o si el número no es positivo, devuelve falso.
	 * 
	 * @param mat
	 * @param num
	 * @return
	 */
	
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) { 
		boolean hayAlgunaFila= false;
		
		if (num<1 || mat.length==0 )
			return hayAlgunaFila;
		
		for (int f=0; f<mat.length;f++) {
			hayAlgunaFila=hayAlgunaFila||filaConTodosMultiplos(mat[f],num);	
			}
		return hayAlgunaFila;
	}	
	

	public boolean filaConTodosMultiplos(int [] fila, int num) {
		boolean todosMultiplos= true;
		for (int i=0; i<fila.length;i++) {
			todosMultiplos= todosMultiplos && fila[i]%num==0;
		}
		return todosMultiplos;
		
	}
	
	/**
	 * Dado 2 matrices se verifica si hay intersección entre las filas de cada
	 * matriz, fila a fila.
	 * 
	 * Si las matrices tienen distinta cantidad de filas o si alguna matriz 
	 * está vacía, devuelve falso.
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) { 
		
		if (mat1.length==0 || mat2.length==0 || mat1.length!= mat2.length) {
			 return false;
		}
		
		boolean todasLasFilas=true;
		
		for (int i=0; i<mat1.length;i++) {
			todasLasFilas = todasLasFilas && filaConInterseccion(mat1[i],mat2[i]);
		}
		return todasLasFilas;
	}
	
	public boolean filaConInterseccion(int[] fila1, int[] fila2) {
		boolean hayInterseccion = false;
		for (int i=0;i<fila1.length;i++) {
			for (int j=0;j<fila2.length;j++) {
				hayInterseccion= hayInterseccion || fila1[i]==fila2[j];
			}
		}
		return hayInterseccion;
		
	}
	
	/**
	 * Dada una matriz y el índice de una columna, se verifica si existe alguna
	 * fila cuya suma de todos sus elementos sea mayor estricto que la suma de
	 * todos los elementos de la columna indicada por parámetro.
	 * 
	 * Si el índice de la columna es inválido o la matriz está vacía, devuelve 
	 * falso.
	 * 
	 * @param mat
	 * @param nColum
	 * @return
	 */
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) { 
		throw new RuntimeException("Metodo no implementado aun!!!");
	}
	
	/**
	 * Dadas 2 matrices, se verifica si hay intersección entre las columnas de
	 * cada matriz, columna a columna.
	 * 
	 * Si las matrices tienen distinta cantidad de columnas o alguna matriz 
	 * está vacía, devuelve falso. 
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) { 
		throw new RuntimeException("Metodo no implementado aun!!!");
	}
}
