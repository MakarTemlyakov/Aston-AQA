import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person [] employees = new Person[5];
        employees[0] =  new Person("Пупки Василий Петрович", "Директор", "director@gmail.com", "+375333328132", 980.49, 26);
        employees[0].getInfo();
        employees[1] = new Person("Сидоров Андрей Петрович", "Инженер", "enginer@gmail.com", "+375333353131", 454.50, 28);
        employees[1].getInfo();
        employees[2] = new Person("Петров Олег Олегович", "Электрик", "electrik@gmail.com", "+375333328918", 345.43, 32);
        employees[2].getInfo();
        employees[3] = new Person("Ершов Артем Палович", "Свращик", "svar@gmail.com", "+3753334823941", 890.30, 41);
        employees[3].getInfo();
        employees[4] = new Person("Жмышенко Валерий Альбертович", "Менеджер", "manager@gmail.com", "+37533447193", 750.43, 35);
        employees[4].getInfo();

        Park park = new Park("ДиснейЛенд", "Париж");
        Date startWorkDate = new Date();
        Calendar calendarStart = Calendar.getInstance();
        calendarStart.setTime(startWorkDate);
        calendarStart.set(Calendar.HOUR_OF_DAY, 9);
        calendarStart.set(Calendar.MINUTE, 0);
        Date starkWork = calendarStart.getTime();
        Date endWorkDate = new Date();
        Calendar calendarEnd =Calendar.getInstance();
        calendarEnd.setTime(endWorkDate);
        calendarEnd.set(Calendar.HOUR_OF_DAY, 20);
        calendarEnd.set(Calendar.MINUTE, 0);
        Date endWork = calendarEnd.getTime();
        park.getInfo();
        Park.Attraction [] attractions = new Park.Attraction[3];
        attractions[0] = park.new Attraction("Горки", 19.20, starkWork,endWork);
        attractions[0].getInfo();
        attractions[1] = park.new Attraction("Качели", 50.20, starkWork, endWork);
        attractions[1].getInfo();
        attractions[2] = park.new Attraction("Вертушка", 70.20, starkWork, endWork);
        attractions[2].getInfo();

    }
}