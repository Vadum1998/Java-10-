package ru.netology.domain;


public class Radio {
    private int currentStation;//-------Номер текущей радиостанции----
    private int currentVolume;//--------Громкость звука-------

    public int getCurrentStation() {// получить № станции
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {//установить текущую станцию Тута
        if (currentStation < 0) {//меньше минимума
            return;
        }
        if (currentStation > 9) {//больше максимума
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {//+1 станция
        this.currentStation = currentStation + 1;
        if (currentStation > 9) {//станций 0-9 >= 10
            this.currentStation = 0;
        }
    }

    public void prev() {//нажал на кнопку предыдущая
        this.currentStation = currentStation - 1;
        if (currentStation == -1) {//было 0 стало -1 =9
            this.currentStation = 9;
        }
    }

    public void stationInput(int currentStation) {//задать № станции
        if (currentStation < 0) { //отриц быть не должно
            return;
        }
        if (currentStation > 9) {//>9 быть не должно
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {//получить урзвука
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {//установить урзвука
        this.currentVolume = currentVolume;
    }

    public void volumePlus() {//громкость+ максимального
        this.currentVolume = currentVolume + 1;
        if (currentVolume >= 10) { //(в пределах от 0 до 10)
            this.currentVolume = 10;
        }
    }

    public void volumeMinus() {//громкость- низшего
        this.currentVolume = currentVolume - 1;
        if (currentVolume <= 0) { //(в пределах от 0 до 10)
            this.currentVolume = 0;
        }
    }
}