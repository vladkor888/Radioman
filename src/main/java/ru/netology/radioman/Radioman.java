package ru.netology.radioman;

public class Radioman {

    public int currentStation;
    public int currentVolume;
    int minStation = 0;
    int maxStation = 9;
    int minVolume = 0;
    int maxVolume = 10;

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
