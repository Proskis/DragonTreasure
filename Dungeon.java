
package com.mycompany.dragontreasureuppgift;


 class Dungeon {
    
     
     public static void main(String[] args) {
     }
     
public static void outputArray(String[][] array){
        for (int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
               System.out.printf(" %s", array[row] [col]); 
            }
            System.out.println("");
     }
}
 }
