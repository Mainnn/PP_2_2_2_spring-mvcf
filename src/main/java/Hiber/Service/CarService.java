package Hiber.Service;

import Hiber.model.Car;

import java.util.List;


public interface CarService {
    void add(Car car);
    List<Car> getCountCar(int count);
}
