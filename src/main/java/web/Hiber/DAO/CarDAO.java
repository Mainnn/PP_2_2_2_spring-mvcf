package web.Hiber.DAO;

import web.Hiber.model.Car;

import java.util.List;

public interface CarDAO {
    void add(Car car);
    List<Car> getCountCar(int count);
    List<Car> getAllCar();
}
