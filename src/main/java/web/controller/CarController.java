package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarSerivce;
import web.service.CarService;

import java.util.Optional;

@Controller
public class CarController {

    private CarSerivce carRequst;
    @Autowired
    public CarController(CarSerivce carRequst) {
        this.carRequst = carRequst;
    }

    @GetMapping(value = "/Cars")
    public String printCars(@RequestParam(value = "count",required = false) Optional<Integer> count, ModelMap model) {
        model.addAttribute("cars",carRequst.getCars(count).stream().toList());
        return "Car/Cars";
    }
}
