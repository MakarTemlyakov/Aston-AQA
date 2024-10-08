import Task1.Animal;
import Task1.Cat;
import Task1.Dog;
import Task1.Plate;
import Task2.Circle;
import Task2.Rectangle;
import Task2.Triangle;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------Задание 1 -----------------------");
        Dog dog = new Dog("bobik");
        dog.run(400);
        Dog dog1 = new Dog("barsik");
        dog1.run(520);
        dog1.swim(10);
        Cat cat1 = new Cat("vasya");
        cat1.run(200);
        Cat cat2 = new Cat("kolya");
        cat2.run(230);
        cat2.swim(230);
        Animal animal = new Animal();
        animal.run(100);
        Animal.getCount();
        Cat.getCount();
        Dog.getCount();
        Plate plate = new Plate(10);

        Cat[] cats = new Cat[3];
        plate.onAddEat(20);
        for(int i =0; i < cats.length; i++) {
            cats[i] = new Cat("cat " + i);
        }
        cats[0].onEat(plate, 10);
        System.out.printf("Сытость кота 1: %b\n", cats[0].isSatiety());
        cats[1].onEat(plate, 15);
        System.out.printf("Сытость кота 2: %b\n", cats[1].isSatiety());
        cats[2].onEat(plate, 15);
        System.out.printf("Сытость кота 3: %b\n", cats[2].isSatiety());
        System.out.printf("Количетсов еды в миске: %d", plate.getFood());

        System.out.println("\n-------Задание 2 -----------------------");


        Circle circle = new Circle(20);
        circle.setBackgroundColor("Красный");
        circle.setFillColor("Зеленый");
        System.out.printf("Площадь круга равна: %f\n",circle.calculateArea());
        System.out.printf("Периметр круга равен: %f\n", circle.calculatePerimeter());
        System.out.printf("Цвет фона круга: %s\n", circle.getBackgroundColor());
        System.out.printf("Цвет заливки круга: %s\n", circle.getFillColor());

        Rectangle rectangle = new Rectangle(20, 20);
        rectangle.setBackgroundColor("Черный");
        rectangle.setFillColor("Фиолетовый");
        System.out.printf("Площадь прямоугольника равна: %f\n", rectangle.calculateArea());
        System.out.printf("Периметр прямоугольника равен: %f\n", rectangle.calculatePerimeter());
        System.out.printf("Цвет фона прямоугольника: %s\n", rectangle.getBackgroundColor());
        System.out.printf("Цвет заливки прямоугольника: %s\n", rectangle.getFillColor());

        Triangle triangle = new Triangle(3,3,3);
        triangle.setFillColor("Белый");
        triangle.setBackgroundColor("Оранжевый");
        System.out.printf("Площадь треугольника равна: %f\n", triangle.calculateArea());
        System.out.printf("Периметр треугольника равен: %f\n", triangle.calculatePerimeter());
        System.out.printf("Цвет фона треугольника: %s\n", triangle.getBackgroundColor());
        System.out.printf("Цвет заливки треугольника: %s\n", triangle.getFillColor());



    }
}