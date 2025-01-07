
package dragontreasure;


public class Item {
    String name;
    String description;
    int dmgHp;
    
    public Item(String name, String description, int dmgHp) {
        this.name = name;
        this.description = description;
        this.dmgHp = dmgHp;
    }
    
    //getter rum namnen 
    public String getName() {
        return name;
    }
    
    //getter för beskrivning av rum
    public String getDescription() {
        return description;
    }
     public int getdmgHp() {
        return dmgHp;
    }
}    

