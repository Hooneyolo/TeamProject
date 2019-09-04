
/**
 * Cicrel의 PI,반지름을 통해 형태와 넓이를 알려주는 클래스입니다.
 * 
 * @author (2018315005 유제훈) 
 * @version (2019/09/04)
 */
public class Circle implements Shape
{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }

    public void draw(){
        System.out.println("반지름이 "+radius+"인 원입니다.");
    }

    public double getArea(){
        return this.PI * this.radius * this.radius;
    }
}
