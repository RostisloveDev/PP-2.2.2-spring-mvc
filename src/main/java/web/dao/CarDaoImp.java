package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class CarDaoImp implements CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Mazda", 3, 456_879));
        cars.add(new Car("Mercedes", 1, 90_134));
        cars.add(new Car("Honda", 2, 179_980));
        cars.add(new Car("Toyota", 4, 247_192));
        cars.add(new Car("Lada", 9, 893_129));
    }

    @Override
    public List<Car> showCars(int num) {
        return cars.subList(0, num);
    }
}
