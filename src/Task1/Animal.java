package Task1;

public class Animal {
    private static int count;

    public Animal() {
        count++;
    }

    public void swim(int value){
        System.out.println("Животнрое проплыло" + value);
    }
    public void run(int value){
        System.out.println("Животное пробежало" + value);
    }

    public static void getCount(){
        System.out.println("Количество созданных животных: " + count);
    }
}
