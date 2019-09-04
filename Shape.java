
/**
 * Shape 인터페이스- Circle, Oval, Rec가 상속받을 인터페이스입니다.
 * 
 * @author (2018315005 유제훈)
 * @version (2019/09/02)
 */

public interface Shape
{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}
