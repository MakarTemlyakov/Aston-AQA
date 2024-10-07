public class Dog extends Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int value){
       if(value > 500) {
           System.out.println("Максимальное расстояние пробежки не может быть больше 500м\n");
       } else {
           System.out.printf("%s пробежал %dм\n", this.name, value);
       }
    }

    @Override
    public void swim(int value){
        if(value > 10) {
            System.out.println("Максимальное расстояние при плавании не может быть больше 10м\n");
        } else {
            System.out.printf("%s пробежал %dм\n", this.name, value);
        }
    }
}
