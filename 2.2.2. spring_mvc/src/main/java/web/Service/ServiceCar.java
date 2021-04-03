package web.Service;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceCar {

    public List<Car> specifiedNumberOfCars(List<Car> carList, Integer count) {
        List<Car> carList1;
        if (count >= 5) return carList;
        else {
            carList1 = carList.stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }
        return carList1;
    }
}
