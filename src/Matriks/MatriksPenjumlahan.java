/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriks;

/**
 *
 * @author Nur
 */
public class MatriksPenjumlahan {
    int[][] A = new int[][]{{1,2},{3,5},{6,7}};
    int[][] B = new int[][]{{8,9},{10,11},{12,13}};
    int[][] hasil = new int[3][2];
    
    public void set_matriksA(int[][] A){
        this.A = A;
    }
    
    public void set_matriksB(int[][] b){
        this.B = b;
    }
    
    public void set_hasil(int[][] hsl){
        this.hasil = hsl;
        for(int x=0; x<2; x++){
            for(int y=0;y<3;y++){
                hasil[x][y] = A[x][y] + B[x][y];
            }
        }
    }
    
    public int[][] get_matriksA(){
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        return A;
    }
    
    public int[][] get_matriksB(){
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        return B;
    }
    
    public int[][] get_hasil(){
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                hasil[i][j] = A[i][j] + B[i][j];
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
        return hasil;
    }
    
    public void tampil(){
        System.out.println("Matriks A : ");
        get_matriksA();
        System.out.println("\n");
        System.out.println("Matriks B : ");
        get_matriksB();
        System.out.println("\n");
        System.out.println("Hasil Penjumlahan : ");
        get_hasil();
    }
}
