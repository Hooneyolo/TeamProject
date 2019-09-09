package Projcet02.myInterface;


/**
 *   인터페이스 Shape - Circle 클래스가 상속받을 인터페이스.
 * 
 * @author (정찬호(이동)/2018315005 유제훈(전 작성) 
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
