package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import web.Service.ServiceCar;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private ServiceCar serviceCar;

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping("/cars")
    public String fromCar(@RequestParam(value = "count",required = false) Integer count, ModelMap model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi 100", "Audi 100 Avant", 1982));
        carList.add(new Car("BMW", "BMW X7", 2018));
        carList.add(new Car("Aston Martin", "Aston Martin DBS", 2007));
        carList.add(new Car("Honda", "Honda S-MX", 2002));
        carList.add(new Car("Jeep", "Jeep Patriot", 2010));
        if (count == null) model.addAttribute("cars", carList);
        else {
            model.addAttribute("cars", serviceCar.specifiedNumberOfCars(carList, count));
        }

        return "cars";
    }

}