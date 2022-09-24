/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class TestRun {
    public static void main(final String[] args) {
        Test object1 = new Test();

        System.out.println(object1.square10());
        System.out.println(object1.square(10));

        Box box = new Box();
        box.setDimens(10.2,47.6,68.6);
        System.out.println(box.volume());

        Rectangle newRec = new Rectangle();
        newRec.setDimens(10,14);

        System.out.println(newRec.perimeter());
        System.out.println(newRec.square());
    }
}
