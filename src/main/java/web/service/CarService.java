package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService implements CarSerivce {

    private List<Car> cars = createCars();

    @Override
    public List<Car> getCars(Optional<Integer> count) {

        int temp = count.isEmpty() ? 0 : count.get();

        if(temp < 5 && temp >= 1){
            System.out.printf("Yes");
            return cars.stream()
                    .limit(temp)
                    .toList();
        }else {
            System.out.println("No");
            return cars;
        }
    }

    private List<Car> createCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Tesla",032,357));
        cars.add(new Car("Forma",031,150));
        cars.add(new Car("KaZ",0355,320));
        cars.add(new Car("MAN",0232,450));
        cars.add(new Car("Volga",0752,85));
        cars.add(new Car("Volga",0752,85));
        cars.add(new Car("Volga",1130752,85));
        return cars;
    }

}
