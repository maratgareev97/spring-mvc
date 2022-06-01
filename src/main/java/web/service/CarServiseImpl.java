package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiseImpl implements CarService {

    @Override
    public List<String> listCar() {
        Car car1 = new Car(1L, "Ваз", 1111);
        Car car2 = new Car(2L, "Газ", 2222);
        Car car3 = new Car(3L, "Паз", 3333);
        Car car4 = new Car(4L, "Маз", 4444);
        Car car5 = new Car(5L, "Заз", 5555);
        List<String> listCars = new ArrayList<>();
        listCars.add(String.valueOf(car1));
        listCars.add(String.valueOf(car2));
        listCars.add(String.valueOf(car3));
        listCars.add(String.valueOf(car4));
        listCars.add(String.valueOf(car5));


        return listCars;
    }
}
