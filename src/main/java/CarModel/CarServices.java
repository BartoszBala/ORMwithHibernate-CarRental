package CarModel;

import java.util.List;

public class CarServices {

    private CarDao carDao;

    public CarServices() {

        carDao = new CarDao();
    }

    public void persist(Car car){
        carDao.openSessionWithTransaction();
        carDao.persist(car);
        carDao.closeSessionWithTransaction();

    }

    public void update(Car car){
        carDao.openSessionWithTransaction();
        carDao.update(car);
        carDao.closeSessionWithTransaction();
    }
    public void delete(Car car){
        carDao.openSessionWithTransaction();
        carDao.delete(car);
        carDao.closeSessionWithTransaction();

    }

    public Car findCarById(Long id){
        carDao.openSession();
        Car car =carDao.findById(id);
        carDao.closeSession();

        return car;

    }

    public List<Car> findALLCar(){
        carDao.openSession();
        List<Car> cars = carDao.findAll();
        carDao.closeSession();

        return cars;
    }



}
