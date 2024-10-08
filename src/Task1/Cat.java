package Task1;

public class Cat  extends Animal{
    private String name;
    private static int count;

    public void setSatiety(boolean satiety) {
        isSatiety = satiety;
    }

    private boolean isSatiety;

    public Cat(String name) {
        this.name = name;
        this.isSatiety = false;
        count++;
    }

    public boolean isSatiety() {
        return isSatiety;
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
        System.out.println("Кот не умеет плавать\n");
    }

    public void onEat(Plate plate, int food) {
        int currentFood = plate.getFood();
        if(currentFood - food < 0) {
            System.out.println("В миске нет столько еды! Остаток ко-ва еды: " + currentFood);
        } else {
            currentFood -= food;
            plate.setFood(currentFood);
            this.setSatiety(true);
            System.out.printf("Кот наелся. В миске осталось %d ко-ва еды \n", plate.getFood());
        }
    }

    public static void getCount(){
        System.out.println("Количество созданных котов: " + count);
    }
}
