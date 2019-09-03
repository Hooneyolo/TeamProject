
/**
 * MyApp 클래스는 메인메소드를 포함한 클래스입니다.
 *
 * @author (2018 유재훈)
 * @version (20190902)
 */
public class MyApp
{
    public static void main(String[] args) {
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rec(10, 40);
        
        for(int i=0; i<list.length; i++)
            list[i].redraw();
        for(int i=0; i<list.length; i++)
            System.out.println("면적은 " + list[i].getArea());
    }
}
