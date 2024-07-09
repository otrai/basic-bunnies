public class Main {
    public static void main(String[] args) {
        Bunny myBunny = makeBunny("Easter", 16);
        System.out.println(myBunny.name);
        System.out.println(myBunny.age);
        Bunny myBunny2 = makeBunny("Trix", 6);
        displayInfo(myBunny);
        displayInfo(myBunny2);
        haveBirthday(myBunny);
        displayInfo(myBunny);
        changeName(myBunny, "Jack");
        displayInfo(myBunny);
        feed(myBunny, "bread", "burger", "shake");
        play(myBunny2);
}

    public static Bunny makeBunny(String name, int age) {
        Bunny newBunny = new Bunny();
        newBunny.age = age;
        newBunny.name = name;
        return newBunny;
    }

    public static void displayInfo(Bunny bunny) {
        System.out.println(bunny.name + " is a " + bunny.age + " year old bunny.");
    }

    public static void haveBirthday(Bunny bunny) {
        bunny.age += 1;
    }

    public static void changeName(Bunny bunny, String name) {
        bunny.name = name;
    }

    public static void feed(Bunny bunny, String appetizer, String main_course, String desert) {
        bunny.eat(appetizer);
        bunny.eat(main_course);
        bunny.eat(desert);
    }

    public static void play(Bunny bunny) {
        bunny.hop();
        bunny.eat("lettuce");
        bunny.eat("carrots");
        bunny.sleep();
    }




}
