
/**
 *   인터페이스 Shape - Circle,Rec,Oval 클래스가 상속받을 인터페이스입니다.
 * 
 * @author (2018315005 유제훈) 
 * @version (2019/09/04)
 */
interface Shape
{ 
    final double PI = 3.14; // 상수
    void draw(); // 도형을 그리는 추상 메소드
    double getArea(); // 도형의 면적을 리턴하는 추상 메소드
    default public void redraw(){ // 디폴트 메소드
        System.out.print("--- 다시 그립니다. "); draw(); 
    }
}
