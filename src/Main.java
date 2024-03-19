// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Car car= new Car();
//        Car nexia = new Car("qora", "nexia", "avtomat");
//
//        nexia.getInfo();
//        car.rang("oq");
//        car.setModel("nexia");
//        car.setTuzilma("mexanika");
//        if (car.tuzilma.equalsIgnoreCase("mexanika"))
//            car.narxi = 100000000;
//        else if (car.tuzilma.equalsIgnoreCase("avtomat"))
//            car.narxi = 120000000;
//        System.out.println("Mashina  haqida qisqacha:" +
//                 car.model+" " + car.rang + " " + " " + car.tuzilma + " \nnarxi:" + car.narxi + "so'm");
//
//        Person odam = new Person();
//        odam.setJinsi("erkak");
//        odam.setYoshi(25);
//        odam.getInfo();
        T_B_Uchburchak uchburchak = new T_B_Uchburchak();
        System.out.println(uchburchak.yuzi(2.5,2));
        Car car= new Car();
        car.rang("oq");
        car.setModel("nexia");
        car.setTuzilma("mexanika");
        if (car.tuzilma.equalsIgnoreCase("mexanika"))
            car.narxi = 100000000;
        else if (car.tuzilma.equalsIgnoreCase("avtomat"))
            car.narxi = 120000000;
        System.out.println("Mashina  haqida qisqacha:" +
                 car.model+" " + car.rang + " " + " " + car.tuzilma + " \nnarxi:" + car.narxi + "so'm");

        Person odam = new Person();
        odam.setJinsi("erkak");
        odam.setYoshi(25);
        odam.getInfo();
    }
}

