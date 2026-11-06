package practice;

import java.util.ArrayList;
import java.util.List;

public class CarDealershipApp {
    List<Car> carList = new ArrayList<>();

    public CarDealershipApp() {
        carList.add(new Car("лада", 1_400_000.00, 2022, 80, 4));
        carList.add(new Car("Toyota Camry", 2_500_000.0, 2020, 45000, 1));
        carList.add(new Car("BMW X5", 5_500_000.0, 2018, 120_000, 3));
        carList.add(new Car("Lada Vesta", 900_000.0, 2015, 250_000, 2));
        carList.add(new Car("Mercedes S-Class", 8_000_000.0, 2022, 15000, 1));
        carList.add(new Car("Audi A6", 4_200_000.0, 2019, 85000, 2));
    }

    public Car mostMileCare() {
        Car mileCar = null;
        for (Car careMileKm : carList) {
            if (mileCar == null || careMileKm.getMileKm() > mileCar.getMileKm()) {
                mileCar = careMileKm;
            }
        }
        return mileCar;
    }

    public Car mostExpensiveCar() {
        Car car = null;
        for (Car expensiveCar : carList) {
            if (car == null || expensiveCar.getPrice() > car.getPrice()) {
                car = expensiveCar;
            }
        }
        return car;
    }

    public Car mostOldCar() {
        Car oldCar = null;
        for (Car oldestCar : carList) {
            if (oldCar == null || oldestCar.getYear() < oldCar.getYear()) {
                oldCar = oldestCar;
            }
        }
        return oldCar;
    }

    public Car numOwners() {
        Car numOwne = null;
        for (Car owner : carList) {
            if (numOwne == null || owner.getNumberOfOwners() > numOwne.getNumberOfOwners()) {
                numOwne = owner;
            }
        }
        return numOwne;
    }

    public static void main(String[] args) {
        CarDealershipApp salon = new CarDealershipApp();
        System.out.println("Самая дорогая машина в салоне: " + salon.mostExpensiveCar());
        System.out.println("Автомобиль с самым большим пробегом в салоне: " + salon.mostMileCare());
        System.out.println("Самый старый автомобиль: " + salon.mostOldCar());
        System.out.println("Машина с наибольшим числом владельцев: " + salon.numOwners());
    }
}