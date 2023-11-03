public class Dragon extends MagicalCreature{

    public Dragon(String name, String type, String color, int age){
        super(name, type, color, age);
    }
    public String toString(){
        return super.toString() + " I breathe fire";
    }
    public void kill(MagicalCreature other){
        if (this.getAge() < other.getAge() && this.getAge() < 40){
            System.out.println("I am too young to kill!");
        }else{
            other.die();
        }
    }
    public void die(){
        System.out.println("I am a dragon - nobody gets to kill me!");
    }
}
