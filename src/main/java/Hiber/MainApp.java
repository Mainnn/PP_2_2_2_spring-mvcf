package Hiber;

import Hiber.Config.AppConfig;
import Hiber.Service.CarService;
import Hiber.model.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        CarService carService = context.getBean(CarService.class);
//        carService.add(new Car("Tesla",312903,335.6f));
//        carService.add(new Car("Ford",32,155.0f));
//        carService.add(new Car("Tesla",077324,390.6f));
//        carService.add(new Car("Volga",07100,90.0f));
//        carService.add(new Car("Kamaz",0163,350.5f));

        List<Car> cars = carService.getCountCar(7);
        cars.stream().forEach(System.out::println);
        context.close();
    }
}
