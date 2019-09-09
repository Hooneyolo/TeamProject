package Project02.myInterface;


/**
 *   인터페이스 Shape - Circle 클래스가 상속받을 인터페이스입니다.
 * 
 * @author (전 프로젝트- /이동-2018243087 정찬호) 
 * @version (2019/09/09)
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
