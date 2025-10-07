import java.util.*;

class MatrixOperations{
  public static int[][] addMatrices(int[][] a, int[][] b){
    int rows = a.length;
    int cols = a[0].length;
    int[][] result = new int[rows][cols];

    for(int i = 0; i<rows; i++){
      for(int j = 0; j<cols; j++){
        result[i][j] = a[i][j] + b[i][j];
      }
    }
    return result;
  }

  public static int[][] subtract(int[][] a, int[][] b){
    int rows = a.length;
    int cols = a[0].length;
    int[][] result = new int[rows][cols];
    for(int i =0; i<rows; i++){
      for(int j=0; j<cols; j++){
        result[i][j] = a[i][j] - b[i][j];
      }
    }
    return result;
  }

  public static int[][] multiply(int[][] a, int [][] b){
    int rows = a.length;
    int cols = b[0].length;
    int[][] result = new int[rows][cols];
    return result; 
  }
}

public class practice20 {
  public static void main(String[] args){
   

  }
  
}
