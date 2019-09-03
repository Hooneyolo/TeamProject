
/**
 * Write a description of class Oval here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Oval implements Shape
{
    int radius1;
    int radius2;
    public Oval(int radius1, int radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }
    public void draw() {
        System.out.println(this.radius1+"x"+this.radius2+"에 내접하는 타원입니다.");
    }
    public double getArea() {
        return this.radius1 * this.radius2 * PI;
    }
}
