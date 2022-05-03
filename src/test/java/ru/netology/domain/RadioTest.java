package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldGetCurrentRadioStation() {
        int expected = 5;
        radio.setCurrentRadioStation(expected);

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCountRadioStationsUp() {
        Radio radio = new Radio(12);
        int station = 11;
        int expected = 0;
        radio.setCurrentRadioStation(station);
        radio.setNextRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCountRadioStationsDown() {
        Radio radio = new Radio(5);
        int station = 0;
        int expected = 4;
        radio.setCurrentRadioStation(station);
        radio.setPrevRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetNextRadioStation() {
        int station = 5;
        int expected = 6;

        radio.setCurrentRadioStation(station);
        radio.setNextRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetPrevRadioStation() {
        int station = 5;
        int expected = 4;

        radio.setCurrentRadioStation(station);
        radio.setPrevRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchAfterNineStation() {
        int station = 9;
        int expected = 0;

        radio.setCurrentRadioStation(station);
        radio.setNextRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchAfterZeroStationDown() {
        int station = 0;
        int expected = 9;

        radio.setCurrentRadioStation(station);
        radio.setPrevRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCheckStationsLimitsUp() {
        int station = -1;
        int expected = 0;

        radio.setCurrentRadioStation(station);
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCheckStationsLimitDown() {
        int station = 10;
        int expected = 0;

        radio.setCurrentRadioStation(station);
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldGetCurrentVolume() {
        int volume = 50;
        int expected = 50;

        radio.setCurrentVolume(volume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        int volume = 50;
        int expected = 51;

        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        int volume = 50;
        int expected = 49;

        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeUp() {
        int volume = 100;
        int expected = 100;

        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeDown() {
        int volume = 0;
        int expected = 0;

        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitUp() {
        int volume = 110;
        int expected = 0;

        radio.setCurrentVolume(volume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitDown() {
        int volume = -1;
        int expected = 0;

        radio.setCurrentVolume(volume);
        assertEquals(expected, radio.getCurrentVolume());
    }
}