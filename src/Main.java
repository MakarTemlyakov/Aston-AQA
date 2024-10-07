public class Main {
    public static void main(String[] args) {
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
        Animal.getCount();

        Cat [] cats = new Cat[3];
        Cat.onAddEatToDish(30);
        for(int i =0; i < cats.length; i++) {
            cats[i] = new Cat("cat " + i);
        }
        cats[0].setDish(10);
        System.out.println( cats[0].isSatiety());
        cats[1].setDish(15);
        System.out.println(cats[1].isSatiety());
        cats[2].setDish(10);
        System.out.println(cats[2].isSatiety());
        System.out.println(Cat.getDish());
    }
}