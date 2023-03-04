package web.controller;

import web.Hiber.Config.AppConfig;
import web.Hiber.Service.CarService;
import web.Hiber.model.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {

    @GetMapping(value = "/Cars")
    public String printCars(@RequestParam(value = "count",required = false) Optional<Integer> count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        System.out.printf(String.valueOf(count));
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        CarService carService = context.getBean(CarService.class);
        int temp = count.isEmpty() ? 0 : count.get();

        if(temp < 5 && temp > 1){
            cars = carService.getCountCar(temp);
        }else {
            cars = carService.getAllCar();
        }
        model.addAttribute("cars",cars);
        return "Car/Cars";
    }
}
