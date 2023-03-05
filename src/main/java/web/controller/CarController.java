package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarRequst;
import web.service.CarRequstlmp;

import java.util.Optional;

@Controller
public class CarController {

    private CarRequst carRequst = new CarRequstlmp();
    @GetMapping(value = "/Cars")
    public String printCars(@RequestParam(value = "count",required = false) Optional<Integer> count, ModelMap model) {
        model.addAttribute("cars",carRequst.getCars(count).stream().toList());
        return "Car/Cars";
    }
}
