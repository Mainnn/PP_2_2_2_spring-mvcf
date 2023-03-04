package web.Hiber.Service;

import web.Hiber.model.Car;

import java.util.List;


public interface CarService {
    void add(Car car);
    List<Car> getCountCar(int count);
    List<Car> getAllCar();
}
