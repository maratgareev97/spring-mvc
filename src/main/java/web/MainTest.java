package web;

import web.service.CarService;
import web.service.CarServiseImpl;

public class MainTest {
    public static void main(String[] args){
        CarService carService = new CarServiseImpl();
        System.out.println(carService.listCar());
    }
}
