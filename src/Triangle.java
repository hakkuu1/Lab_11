public class Triangle {
    int a,b,c;
    int error = 0;
    public Triangle(int a,int b,int c){
        if (a+b > c & a+c>b & b+c>a){
        this.a = a;
        this.b = b;
        this.c = c;
        } else {
            error = 1;
        }
    }
    public void side(){
        System.out.println("a = " + a + "\n" + "b = " + b + "\n" + "c = " + c );
    }
    public int perimeter(){
        return a+b+c;
    }
    public double square(){
        double p = ((double) a + (double) b + (double) c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)+(p-c));
    }
    public static void main(String[] args){
        Triangle treug = new Triangle(3,4,6);
        if (treug.error == 0) {
        treug.side();
        System.out.println("Площадь = " + treug.square() + "\n" + "Периметр = " + treug.perimeter());
        } else {
            System.out.println("There is no such triangle.");
        }

    }
}
