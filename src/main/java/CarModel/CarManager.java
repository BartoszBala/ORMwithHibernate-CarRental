package CarModel;

import java.time.LocalDate;
import java.util.List;

public class CarManager {

    private static CarServices carServices;

    public static void main(String[] args) throws InterruptedException {

        carServices=new CarServices();
        List<Car> cars = carServices.findALLCar();
        System.out.println("przed dodaniem");
        cars.stream().forEach(x-> System.out.println(x));

        LocalDate registry = LocalDate.of(2018,1,1);
        Car opel = new Car(102l,"Ford","Focus","sedan",registry,21000,true);
        System.out.println("po dodaniu");
//        Thread.sleep(1000);

        carServices.persist(opel);
//        System.out.println("po dodaniu");
//         cars = carServices.findALLCar();
//
//        cars.stream().forEach(x-> System.out.println(x));
    }


}
