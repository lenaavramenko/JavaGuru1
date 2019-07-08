package com.JavaGuru1.lv.lesson5.tvController;

public class Tv {
    private int currentChanel;
    private int currentVolume;
    private String manufacturer;
    private boolean isOn;

    public Tv(){
        this.currentChanel = 0;
        this.currentVolume = 0;
        this.isOn = true;
    }

    public void nextChanel() {
        if (isOn == true) {
            currentChanel++;
        }
    }

    public void prevChanel() {
        if (isOn == true && currentChanel > 0) {
            currentChanel--;
        }
    }

    public void volumeUp() {
        if (isOn == true) {
            currentVolume++;
        }
    }

    public void volumeDown() {
        if (isOn == true && currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Tv isOn() {
        return isOn;
    }

    public void setOn() {
        isOn = true;
    }

    public void setOff() {
        isOn = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return getCurrentChanel() == tv.getCurrentChanel() &&
                getCurrentVolume() == tv.getCurrentVolume() &&
                isOn() == tv.isOn() &&
                getManufacturer().equals(tv.getManufacturer());
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChanel=" + currentChanel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
