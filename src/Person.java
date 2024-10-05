public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.printf("Информация о сотруднике:\n ФИО:%s \n Должность:%s \n Email:%s \n Номер телефона:%s \n Зарплата: %f \n Возраст:%d \n", fullName, position, email, phone, salary, age );
    }
}
