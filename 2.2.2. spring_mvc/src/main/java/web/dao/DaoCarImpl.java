package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoCarImpl implements DaoCar {

    @Override
    public List<Car> createAListOfCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi 100", "Audi 100 Avant", 1982));
        carList.add(new Car("BMW", "BMW X7", 2018));
        carList.add(new Car("Aston Martin", "Aston Martin DBS", 2007));
        carList.add(new Car("Honda", "Honda S-MX", 2002));
        carList.add(new Car("Jeep", "Jeep Patriot", 2010));
        return carList;
    }
}
