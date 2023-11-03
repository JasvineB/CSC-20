public class Elf extends MagicalCreature{
    private boolean shield;

    public Elf(String name, String type, String color, int age){
        super(name, type, color, age);
        shield = false;
    }

    public String toString(){
        if(shield == true){
            return super.toString() + " I eat leaves, I have a shield";
        }else{
            return super.toString() + " I eat leaves, I have no shield";
        }
    }

    public void setShield(boolean shield){
        this.shield = shield;
    }
    
    public boolean getShield(){
        return shield;
    }
}
