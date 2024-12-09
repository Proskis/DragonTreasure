
package com.mycompany.dragontreasureuppgift;
import java.util.Scanner;


public class setupGame {
    
    public static void main(String[] args) {
        
}
        public static void StartGame(){
         Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the DragonTreasure game. Before we begin, please enter your name:  ");
            String player = input.next();
            
            System.out.println("Welcome! " + player + ". To the DragonTreasure game");

}
    public static void RoomCreation(){
       String[][] RoomA = {  {"It is very dark but you can just barely see the outline of a door to your left and a door to your right"} 
, {"You can decide to go through the West door or the East door,"},
{"Write a 'W' to take the West door or 'E' to take the East door"} };
       
       String[][] RoomB = {  {"the outline of a door to your left and a door to your right"} 
, {"You can decide to go through the West door or the East door,"},
{"Write a 'W' to take the West door or 'E' to take the East door"} };

        
       
         System.out.println("You take a step into a mysterious room you found in your basement");
     //   outputArray(RoomA); 
     //   outputArray(RoomB); 
    }
    

        }

    

