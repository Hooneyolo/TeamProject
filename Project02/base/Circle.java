package Project02.base;
import Project02.myInterface.Shape;
/**
 * 좌표와 반지름의 길이를 입력받아 좌표의 위치를 비교하는 클래스
 *
 * @author (2018315056 우메모토 세이야)
 * @version (2019/09/09)
 */
public class Circle implements Shape
{
    private int x, y, radius;
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(){
        System.out.println("반지름이 "+this.radius+"인 원입니다.");
    }

    public double getArea(){
        return this.PI * this.radius * this.radius;
    }
    
    public String toString() {
        return "Circle(" + this.x + "," + 
                        this.y + ")" + ", " + "반지름은 " + this.radius;
    }
    
    public boolean equals(Object obj) {
        Circle c = (Circle)obj;
        if(this.x == c.x && this.y == c.y) return true;
        else return false;
    }
}
