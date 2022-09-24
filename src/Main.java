/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        Box myBox = new Box();

        myBox.height = 10.2;
        myBox.width = 15;
        myBox.length = 11.3;

        double volume = myBox.length * myBox.width * myBox.height;
        System.out.println(volume);

        Box box2 = new Box();
        box2.height = 5;
        box2.width = 5;
        box2.length = 5;

        Box box3 = new Box();
        box3.height = 10;
        box3.width = 10;
        box3.length = 10;

//        Box box4 = box3;
//        box4.height = 1000;

        double volume2 = box2.height * box2.width * box2.length;
        double volume3 = box3.height * box3.width * box3.length;

        System.out.println("First box volume = " + volume +
                "\nSecond box volume = " + volume2 +
                "\nTreed box volume = " + volume3);

        Human human1 = new Human();
        human1.name = "Karen";
        human1.age = 34;
        human1.weigh = 65.8;

        Human human2 = new Human();
        human2.name = "Susan";
        human2.age = 25;
        human2.weigh = 57.6;

        Human human3 = new Human();
        human3.name = "Georg";
        human3.age = 38;
        human3.weigh = 75.2;

        Human human4 = new Human();
        human4.name = "Tim";
        human4.age = 45;
        human4.weigh = 78.7;

        Human human5 = new Human();
        human5.name = "Teodor";
        human5.age = 31;
        human5.weigh = 68.2;

        double avgAge = (double) (human1.age + human2.age + human3.age + human4.age + human5.age) / 5;
        System.out.println("All humans average age is " + avgAge);


        box2.showVolume();
        box3.showVolume();

        double myBoxVolume = myBox.volume();
        System.out.println(myBoxVolume);

        Dog bullDog = new Dog();
        bullDog.name = "Boxer";
        bullDog.breed = "Bulldog";
        bullDog.speed = 3;

        bullDog.run();
        System.out.println(bullDog.info());
    }
}
