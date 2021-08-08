/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoalukl7;

/**
 *
 * @author maylany hellena
 */
public class LatihanSoalUkl7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println("========= Latihan 7A - Operasi Perkalian Matriks ===========");
        int matriksA [] [] = {{6, 3}, {4, 8}};
        int matriksB [] [] = {{1}, {2}};

        int hasilKali [] [] = new int [matriksA.length] [matriksB[0].length];

        System.out.println("Matriks A * Matriks B : ");

        for (int m = 0; m < matriksA.length; m++ ){         //BARIS matriksA
            for (int n = 0; n < matriksB[0].length; n++){   //Kolom matriksB

                for (int k =0; k < matriksB.length; k++){   //kolom matriksA atau baris  matriksB 
                    hasilKali [m] [n] += matriksA [m] [k] * matriksB [k] [n];
                }
                    System.out.print(hasilKali [m] [n] + "  ");
            }
                    System.out.println(" ");
        }




    }


   }

    

