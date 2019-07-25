package com.JavaGuru1.lv.lesson6.car;

import java.util.Objects;

public class Car {

    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void accelerate(int targetSpeed) {
        if (canAccelerate() == true && targetSpeed > currentSpeed) {
            while (currentSpeed < targetSpeed) {
                if (targetSpeed <= maxSpeed) {
                    currentSpeed++;
                } else {
                    targetSpeed = maxSpeed;
                }
            }
        }
    }

    public void decelerate(int targetSpeed) {
        if (canAccelerate() == true && targetSpeed < currentSpeed) {
            while (currentSpeed > targetSpeed) {
                    currentSpeed--;
            }
        }
    }

    public boolean isDriving() {
        if (currentSpeed > 0) {
            return true;
        }
        return false;
    }

    public boolean isStopped() {
        if (currentSpeed <= 0) {
            return true;
        }
        return false;
    }

    private boolean canAccelerate() {
        if (currentSpeed < maxSpeed) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                currentSpeed == car.currentSpeed &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, maxSpeed, currentSpeed);
    }

    @Override
    public String toString() {
        return "Car [ model: " + model
                + ", color: " + color
                + ", maximum speed: " + maxSpeed
                + " | now = " + currentSpeed + " km/h ]";
    }
}
