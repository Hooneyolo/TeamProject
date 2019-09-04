
/**
 * Rec 클래스는 직사각형의 형태와 넓이를 알려주는 클래스입니다.
 * 
 * @author (2019243087 정찬호) 
 * @version (2019/09/03)
 */
public class Rec implements Shape
{
    private int width;
    private int hight;
    public Rec(int width, int hight){
        this.width=width;
        this.hight=hight;
    }
    public void draw(){
        System.out.println(this.width+"x"+this.hight+"크기의 사각형입니다.");
    }
    public double getArea(){
        return this.width*this.hight;
    }
}
