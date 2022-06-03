package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {
    List<Car> listCar();
    public ArrayList<Car> countCar(int count);
}
