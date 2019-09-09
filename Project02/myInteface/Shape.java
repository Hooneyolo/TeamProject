package Project02.myInteface;


/**
 *   인터페이스 Shape - 여기에 인터페이스 설명을 작성하십시오.
 * 
 * @author (2018315005 유제훈(전 프로젝트)/2018243087 정찬호(이동)) 
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
