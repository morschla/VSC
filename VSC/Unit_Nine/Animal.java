public class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }
    public void sleep(){
        System.out.println(name + "goes ZZZZZZZZZZZZZZZZZZ");
    }
    public String speak(){
        return "woop hoop doopty boop";
    }
    public void eat(){
        System.out.println(name + "says NOM NOM");
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return name + " says" + speak;
    }
}