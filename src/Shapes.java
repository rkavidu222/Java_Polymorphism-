class Shapes {
    void  draw() {

    }
}
class Rectangle extends Shapes{
    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }
}
class Triangle extends Shapes{
    @Override
    void draw() {
        System.out.println("Draw Triangle");
    }
}
class Circle extends Shapes{
    @Override
    void draw() {
        System.out.println("Draw Circle");
    }
}
class Test2{
    public static void main(String[] args) {
        Shapes s;
        s=new Rectangle();
        s.draw();
        s=new Triangle();
        s.draw();
        s=new Circle();
        s.draw();
    }
}
