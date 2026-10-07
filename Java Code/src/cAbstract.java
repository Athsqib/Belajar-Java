public class cAbstract {
    public static abstract class Shape{
        abstract double area(); //ABSTRACT

        void display(){ //CONCRETE
            System.out.println("This is a shape");
        }
    }

    public static class Circle extends Shape{
        protected double radius;

        public Circle(double radius){
            this.radius = radius;
        }

        public Circle(){
            this (1.0);
        }

        @Override
        public double area(){
            return Math.PI * radius * radius;
        }
    }

    public static class Triangle extends Shape{
        protected double base;
        protected  double height;

        public Triangle(double base, double height){
            this.base = base;
            this.height = height;
        }

        public Triangle(){
            this (1.0, 1.0);
        }

        @Override
        public double area(){
            return 0.5 * base * height;
        }
    }

    public static class Rectangle extends Shape{
        double length;
        double width;

        public Rectangle(double length, double width){
            this.length = length;
            this.width = width;
        }

        public Rectangle(){
            this (1.0, 1.0);
        }

        @Override
        double area(){
            return length * width;
        }
    }

    public static void main(String[] args){
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}