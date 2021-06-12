package ru.netology.radio;

import javax.swing.*;

public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int currentVolume;

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void maxStation() {
        if ((currentStation + 1) > maxStation) {
            currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void bellowMinStation() {
        if ((currentStation - 1) < minStation) {
            currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public void aboveMaxVolume() {
        if ((currentVolume + 1) >= maxVolume) {
            this.currentVolume = maxVolume;
        } else this.currentVolume = (currentVolume + 1);
    }

    public void bellowMinVolume() {
        if ((currentVolume - 1) <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume = (currentVolume - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }
        if ((currentVolume + 1) >= maxVolume) {
            this.currentVolume = maxVolume;
        }
    }

    public void nextStation() {
        if ((currentStation + 1) > maxStation) {
            currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void reduceVolume() {
        if ((currentVolume - 1) <= minVolume) {
            this.currentVolume = minVolume;
        }
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        }
    }

    public void prewStation() {
        if ((currentStation - 1) < minStation) {
            currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }

    }
}




