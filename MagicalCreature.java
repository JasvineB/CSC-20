public class MagicalCreature{
    private String name;
    private String type;
    private String color;
    private int age;
    private boolean isAlive;

    public MagicalCreature(String name, String type, String color, int age){
        this.name = name;
        this.type = type;
        this.color = color;
        this.age = age;
        this.isAlive = true;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String getColor(){
        return color;
    }

    public int getAge(){
        return age;
    }

    public boolean getIsAlive(){
        return isAlive;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setIsAlive(boolean isAlive){
        this.isAlive = isAlive;
    }

    public void kill(){
        System.out.println("I do not have the license to kill");
    }

    public void die(){
        isAlive = false;
    }

    public String toString(){
        return "My name is " + name + " I am a " + color + " " + type + " I am " + age + " years old";
    }
}