
/**
 * Oval 클래스는 타원의 형태와 넓이를 알려주는 클래스입니다.
 *
 * @author (2018315056 우메모토 세이야)
 * @version (2019/09/03)
 */
public class Oval implements Shape
{
    private int radius1;
    private int radius2;
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
