package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.DaoCarImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceCarImpl implements ServiceCar {

    private DaoCarImpl daoCarImpl;
    @Autowired
    public ServiceCarImpl(DaoCarImpl daoCarImpl) {
        this.daoCarImpl = daoCarImpl;
    }

    @Override
    public List<Car> specifiedNumberOfCars(Integer count) {
        if (count == null || count >= 5) return daoCarImpl.createAListOfCars();
        return daoCarImpl.createAListOfCars().stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
