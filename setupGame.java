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
        ,{"You can decide to go through the West door or the East door,"}
        ,{"Write a 'W' to take the West door or 'E' to take the East door: "}};

        String[][] RoomB = {  {"As you enter the room you vaguely start to smell something horrid. "}
        , {"The smell is not coming from this room you realize."}
        , {"You look around and notice the room is filled with spider webs everywhere."}
        , {"You notice a door going North. You can either take that door or go back where you came from "}
        , {"Write a 'N' to take the door going North or 'W' to take the door going West"}};

        String[][] RoomC = {  {"You enter a room that appears to be empty. "}
       , {"However there seems to be some kind of scratching noise coming from the walls. "}
       , {"Must be rats you think to yourself."}
       , {"There appears to be a door leading North"}
       , {"Write a 'N' to take the door going North or 'E' to take the door going East"}};
        
         String[][] RoomD = {  {"As soon as you enter you notice the light peaking through the cracks of a door infront of you, North. "}
       , {"'Could that be the exit out of here' you think to yourself. "}
       , {"You also take notice of the door going East, and the horrid smell that is coming from that direction. "}
       , {"Write a 'N' to take the door going North or 'E' to take the door going East"}};
         
         String[][] RoomE = {  {"As you open the door that horrid smell hits your face and you almost vomit. "}
       , {"You see the outline of something laying in the corner. "}
       , {"As you approach it you see what appears to be a rotting corpse sourrounded by spider web and bugs. "}
       , {"You notice a piece of paper laying next to the corpse. 'Code for the chest is 694' the paper reads. "}          
       , {"You also notice a loud snoring sound coming from behind a door going North. "}
       , {"There is also a door going South and the door going back West where you came from. "}
       , {"Write a 'N' to take the door going North,'S' to take the door going South or 'W' to take the door going West. "}};
         
          String[][] RoomF = {  {"You open the door and instantly you see what the snoring sound was coming from. "}
       , {"A beast of a dragon sleeping! The dragon is huge and takes up almost half the room space. "}
       , {"Right next to the sleeping dragon you spot a chest filled with treasure. "}
       , {"To get to the treasure you have to move cautiously to not wake the dragon up. "}
       , {"There appears to be a padlock with a 3 digit code on the treasure chest. "}};           
  
        
       
         
       // Dungeon.outputArray(RoomA); 
      //  Dungeon.outputArray(RoomB); 
    }
                  }

        

