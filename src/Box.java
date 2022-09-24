/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Box {
    double width;
    double height;
    double length;

    void showVolume (){
        double volume = height * width * length;
        System.out.println(volume);
    }

    double volume(){
        return height * width * length;
    }

    void setDimens (double width,double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }
}
