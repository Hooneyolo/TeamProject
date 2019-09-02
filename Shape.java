
/**
 *   인터페이스 Shape - 여기에 인터페이스 설명을 작성하십시오.
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
