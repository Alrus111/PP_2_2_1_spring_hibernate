package hiber.service;

import hiber.dao.CarDaoImp;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImp {
    private final CarDaoImp carDaoImp;

    public CarServiceImp(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    @Transactional
    public void add(Car car) {
        carDaoImp.add(car);
    }

    @Transactional(readOnly = true)
    public List<Car> listCars() {
        return carDaoImp.listCars();
    }


}
