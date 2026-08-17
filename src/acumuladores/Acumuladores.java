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
		
		if (mat.length==0 || nColum>=mat[0].length || nColum<0) {
			return false;
		}
		
		int sumaColum=0;	
		boolean existeAlguna= false;
		
		for (int f=0;f<mat.length;f++) {
			sumaColum=sumaColum+mat[f][nColum];
		}
		
		for (int i=0; i<mat.length;i++) {
			existeAlguna = existeAlguna || filaMayor(mat[i],sumaColum);
		}
		
		return existeAlguna;
	}
	
	public boolean filaMayor(int fila[], int sumaColum) {
		int sumaFila=0;
		for (int i=0;i<fila.length;i++) {
			sumaFila=sumaFila + fila[i];
		}
		return sumaFila>sumaColum;
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
		if (mat1.length==0 || mat2.length==0 || mat1[0].length!= mat2[0].length) {
			 return false;
		}
		
		boolean todasLasColumnas=true;
		
		for (int c=0; c<mat1[0].length;c++) {
			todasLasColumnas = todasLasColumnas && columnaConInterseccion(mat1,mat2,c);
		}
		return todasLasColumnas;
	}
	
	public boolean columnaConInterseccion(int[][] mat1, int[][] mat2, int numCol) {
		boolean hayInterseccion = false;
		for (int f1=0;f1<mat1.length;f1++) {
			for (int f2=0;f2<mat2.length;f2++) {
				hayInterseccion= hayInterseccion || mat1[f1][numCol]==mat2[f2][numCol];
			}
		}
		return hayInterseccion;
	}
}
