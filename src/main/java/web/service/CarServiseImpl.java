package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiseImpl implements CarService {

    @Override
    public List<Car> listCar() {
        Car car1 = new Car(1L, "Ваз", 1111);
        Car car2 = new Car(2L, "Газ", 2222);
        Car car3 = new Car(3L, "Паз", 3333);
        Car car4 = new Car(4L, "Маз", 4444);
        Car car5 = new Car(5L, "Заз", 5555);
        List<Car> listCars = new ArrayList<>();
        listCars.add(car1);
        listCars.add(car2);
        listCars.add(car3);
        listCars.add(car4);
        listCars.add(car5);

        return listCars;
    }

    @Override
    public ArrayList<Car> countCar(int count) {

        CarService carService = new CarServiseImpl();
        if (count >= 5) {
            count = 5;
        }
        List<Car> mess = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            mess.add(carService.listCar().get(i));
        }
        return (ArrayList<Car>) mess;
    }
}
