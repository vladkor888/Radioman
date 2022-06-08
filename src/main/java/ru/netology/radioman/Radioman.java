package ru.netology.radioman;

public class Radioman {

    private int currentStation;
    private int currentVolume;
    private final int minStation = 0;
    private final int maxStation = 9;
    private final int minVolume = 0;
    private final int maxVolume = 10;

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
