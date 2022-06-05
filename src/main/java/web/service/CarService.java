package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> listCar();
    public List<Car> countCar(int count);
    public void getCars(int count);
}
