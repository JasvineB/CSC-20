public class Goblin extends MagicalCreature{
    public Goblin(String name, String type, String color, int age){
        super(name, type, color, age);
    }

    public String toString(){
        return super.toString() + " I kill elves if they do not have shields";
    }
    
    public void kill(MagicalCreature other){
        if (other.getType() == "Elf" && ((Elf)other).getShield() == false){
            other.die();
        }else{
            System.out.println("I cannot kill the other creature");
        }
    }
}
