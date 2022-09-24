/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Rectangle {
    double length;
    double width;

    void setDimens(double length, double width){
        this.length = length;
        this.width = width;
    }

    double perimeter() {

        return (length + width) * 2;
    }

    double square() {
        return length * width;
    }
}