public class Rectangle {
    int a, b;
    public Rectangle(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void side(){
        System.out.println("a = " + a + "\n" + "b = " + b);
    }
    public int perimeter(){
        return (a+b)*2;
    }
    public double square(){
        return a*b;
    }
    public static void main(String[] args){
        Rectangle pramoug = new Rectangle(5,8);
        pramoug.side();
        System.out.println("Площадь = " + pramoug.square() + "\n" + "Периметр = " + pramoug.perimeter());
    }
}
