package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {


    CarService carService;

    @Autowired
    public HelloController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        System.out.println();
        return "index";
    }

    @GetMapping("/cars")
    public String Cars(HttpServletRequest request, ModelMap modelMap) {
        int count = Integer.parseInt(request.getParameter("n"));
//        CarService carService = new CarServiseImpl();
        modelMap.addAttribute("mess", carService.countCar(count));
        return "cars";
    }

}
