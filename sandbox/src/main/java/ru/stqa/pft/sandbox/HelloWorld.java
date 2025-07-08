package ru.stqa.pft.sandbox;

class HelloWorld {
    public static void main(String[] args) {
        hello("world");
        hello("user");

        Square s = new Square(5); // создаем объект типа Square. new = для создания объектов заданного типа
        // сначала создаем новый объект и передаем значения в коструктор
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
        //s.area() - обращаемся к функции в классе, соответствующему объекту и вызывает функцию

        Rectangle r = new Rectangle(5,6);
        System.out.println("Площадь прямоуголькина со сторонами " + r.a + " и "+ r.b + " = " + r.area());



    }
    public static void hello(String somebody){
        System.out.println("Hello "+somebody+"!");
    }





}