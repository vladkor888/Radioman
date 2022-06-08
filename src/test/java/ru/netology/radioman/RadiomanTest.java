package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    void setCurrentStation() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation1() {
        Radioman radio = new Radioman();

        radio.setCurrentStation(-2);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation2() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(12);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(7);

        int expected = 7;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextStation1() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStation1() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextVolume() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(5);
        radio.nextVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void nextVolume1() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(10);
        radio.nextVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void prevVolume() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(6);
        radio.prevVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void prevVolume1() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(0);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

}