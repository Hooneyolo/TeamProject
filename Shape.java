
/**
 * Shape 인터페이스- Circle, Oval, Rec가 상속받을 인터페이스입니다.
 * 
 * @author (2018315056 우메모토 세이야) 
 * @version (20190902)
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
