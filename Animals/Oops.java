package Animals;
 class Animal{
    String name;
    int legs ;

    public void info() {
        System.out.println("The animal is "+this.name + " and has "+this.legs + " legs");
    }
}


public class Oops {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Kitty";
        dog.legs = 4;
        System.out.println(dog.name);
        dog.info();
    }
}
