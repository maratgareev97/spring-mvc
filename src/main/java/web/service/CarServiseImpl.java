package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiseImpl implements CarService {

    List<Car> listCars = new ArrayList<>();

    public CarServiseImpl() {
        this.listCars.add(new Car(1L, "Ваз", 1111));
        this.listCars.add(new Car(1L, "Ваз", 1111));
        this.listCars.add(new Car(1L, "Ваз", 1111));
        this.listCars.add(new Car(1L, "Ваз", 1111));
        this.listCars.add(new Car(1L, "Ваз", 1111));
    }

    @Override
    //@Autowired
    public List<Car> countCar(int count) {
        if (count >= 5) {
            count = 5;
        }
        List<Car> mess = listCars.subList(0, count);
        ;
        System.out.println("1111111 " + listCars);
        return mess;
    }

}
