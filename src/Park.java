import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Park {
    private String name;
    private String city;

    public Park(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void getInfo() {
        System.out.printf("\nИмя парка: %s  Город: %s\n", name, city);
    }

    class Attraction {
        private String name;
        private double price;
        private Date startWork;
        private Date endWork;

        public Attraction(String name, double price, Date startWork, Date endWork) {
            this.price = price;
            this.startWork = startWork;
            this.endWork = endWork;
            this.name = name;
        }

        private String getFormatTime(Date date){
            DateFormat dateFormat = new SimpleDateFormat("HH:mm");
            return dateFormat.format(date);
        }

        public void getInfo(){
            String startWork = getFormatTime(this.startWork);
            String endWork = getFormatTime(this.endWork);
            System.out.printf("Информация об аттракционе: \n Название: %s \n Стоимость: %f\n Время работы с " + startWork + " до " + endWork + "\n", name, price);

        }
    }
}
