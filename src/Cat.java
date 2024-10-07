public class Cat  extends Animal{
    private String name;
    private static int dish;
    private boolean isSatiety;

    public Cat(String name) {
        this.name = name;
        this.isSatiety = false;
    }

    public boolean isSatiety() {
        return isSatiety;
    }

    public static int getDish() {
        return dish;
    }

    public void setDish(int dish) {
        if(Cat.dish - dish < 0) {
            System.out.println("В миске нет столько еды!");
        } else {
            Cat.dish -= dish;
            this.isSatiety = true;
        }
    }

    public static void onAddEatToDish(int value) {
        Cat.dish += value;
    }

    @Override
    public void run(int value){
        if(value > 200) {
            System.out.println("Максимальное расстояние пробежки не может быть больше 200м\n");
        } else {
            System.out.printf("%s пробежал %dм\n", this.name, value);
        }
    }

    @Override
    public void swim(int value){
        System.out.println("Кот не умее плавать\n");
    }
}
