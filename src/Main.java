public class Main {
    public static void main(String[] args) {
        Bunny myBunny = makeBunny("Easter", 16);
        System.out.println(myBunny.name);
        System.out.println(myBunny.age);

}

public static Bunny makeBunny (String name, int age) {
    Bunny newBunny = new Bunny();
    newBunny.age = age;
    newBunny.name = name;
    return newBunny;
    }
}
