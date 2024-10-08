package Task1;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        if(food < 0) {
            System.out.println("Ко-во еды не может быть отрицательным!");
        } else {
            this.food = food;
        }
    }

    public int getFood() {
        return food;
    }

    public void onAddEat(int value) {
        this.food += value;
    }

}
