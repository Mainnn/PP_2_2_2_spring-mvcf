package Hiber.DAO;

import Hiber.model.Car;

import java.util.List;

public interface CarDAO {
    void add(Car car);
    List<Car> getCountCar(int count);
}
