package com.company;


import java.util.ArrayList;

public class Man {

    private ArrayList<Car> cars = new ArrayList<>();

    public Man() {
    }

    public void addCar(String mark) {
        cars.add(new Car(mark));
    }

    public void recreateCurrentCar(int index, String mark) {
        cars.set(index, new Car(mark));
    }

    public void deleteCar(int index) {
        cars.remove(index);
    }

    public void deleteAllCars() {
        cars.clear();
    }

    public void showAllCars() {
        if (cars.isEmpty()) {
            System.out.println("There are no cars! ");
        } else {
            for (int i = 0; i < cars.size(); i++) {
                System.out.print(cars.get(i).getMark() + ", ");
            }
            System.out.println();
        }
    }

}