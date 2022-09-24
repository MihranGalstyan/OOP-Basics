/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Dog {
    String name;
    String breed;
    int speed;

    void run(){
        System.out.print(name + " is ");
        for (int i = 0; i < speed; i++) {
            System.out.print("running ");
        }
        System.out.println();
    }

    String info(){
        return "Name: " + name + ", \nBreed: " + breed + ", \nSpeed: " + speed;
    }
}
