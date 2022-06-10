package ru.netology.radioman;

public class Radioman {

    private int currentStation;
    private int currentVolume;
    private int minStation;
    private int maxStation = 9;
    private int minVolume;
    private final int maxVolume = 100;
    private int sumStation;

    public Radioman(int sumStation) {
       this.maxStation = sumStation - 1;
    }
    public Radioman() {

    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentVolume() {

        return  currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        this.currentStation = currentStation + 1;
        if (currentStation > maxStation) {
            this.currentStation = minStation;
        }
    }

    public void prevStation() {
        this.currentStation = currentStation - 1;
        if (currentStation < minStation) {
            this.currentStation = maxStation;
        }
    }

    public void nextVolume() {
        this.currentVolume = currentVolume + 1;
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        }
    }

    public void prevVolume() {
        this.currentVolume = currentVolume - 1;
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
        }
    }

}
