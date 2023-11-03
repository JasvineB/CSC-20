public class Genie extends MagicalCreature{
    private boolean wand;

    public Genie(String name, String type, String color, int age){
        super(name, type, color, age);
        wand = false;
    }

    public String toString(){
        if(wand = true){
            return super.toString() + " I eat leaves, I have a wand";
        }else{
            return super.toString() + " I eat leaves, I have no wand";
        }
    }
    public void setWand(boolean wand){
        this.wand = wand;
    }

    public boolean getWand(){
        return wand;
    }
    public void kill(MagicalCreature other){
        if (this.getWand() == true && other.getType() != "Genie" && other.getType() != "Dragon"){
            other.die();
        }else{
            System.out.println("I cannot kill without my wand");
        }
    }
}
