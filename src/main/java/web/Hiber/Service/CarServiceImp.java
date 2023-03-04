package web.Hiber.Service;

import web.Hiber.DAO.CarDAO;
import web.Hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDAO carDAO;
    @Transactional
    @Override
    public void add(Car car) {
        carDAO.add(car);
    }
    @Transactional(readOnly = true)
    @Override
    public List<Car> getCountCar(int count) {
        return carDAO.getCountCar(count);
    }
    @Transactional
    @Override
    public List<Car> getAllCar() {
        return  carDAO.getAllCar();
    }
}
