package ua.lviv.lgs;

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal("Леопард", 20, 7);
        String leoName = a.getName();
        int leoSpeed = a.getSpeed();
        int leoAge = a.getAge();
        System.out.println("Назва тварини = " + leoName + ", Швидкість тварини = " + leoSpeed + " км/год, Вік тварини = " + leoAge + " років ");

        a.setName("Бик");
        a.setSpeed(2);
        a.setAge(14);
        System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини = " + a.getSpeed() + " км/год, Вік тварини = " + a.getAge() + " років");


    }
}
