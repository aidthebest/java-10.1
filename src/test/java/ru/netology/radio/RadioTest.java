package ru.netology.radio;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.SocketOption;
import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.setCurrentStation(1);
        rad.setCurrentStation(8);
        rad.setCurrentStation(9);
        rad.setCurrentStation(10);
        rad.setCurrentStation(-1);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setCurrentVolume(1);
        rad.setCurrentVolume(9);
        rad.setCurrentVolume(10);
        rad.setCurrentVolume(11);
        rad.setCurrentVolume(-1);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.maxStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.maxStation();
        int expected = 9;
        int actual = rad.getMaxStation();
        assertEquals(expected, actual);
    }

    @Test
    public void bellowMinStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.bellowMinStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void bellowMinStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.bellowMinStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.aboveMaxVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.aboveMaxVolume();
        int expected = 6;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void bellowMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.bellowMinVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void bellowMinVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.bellowMinVolume();
        int expected = 6;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 10;
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int expected = 6;
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();
        int expected = 9;
        rad.setCurrentStation(8);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio();
        int expected = 0;
        rad.setCurrentStation(9);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation3() {
        Radio rad = new Radio();
        int expected = 1;
        rad.setCurrentStation(0);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        Radio rad = new Radio();
        int expected = 0;
        rad.setCurrentVolume(0);
        rad.reduceVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume2() {
        Radio rad = new Radio();
        int expected = 5;
        rad.setCurrentVolume(6);
        rad.reduceVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume3() {
        Radio rad = new Radio();
        int expected = 0;
        rad.setCurrentVolume(15);
        rad.reduceVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void prewStation() {
        Radio rad = new Radio();
        int expected = 9;
        rad.setCurrentStation(0);
        rad.prewStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prewStation2() {
        Radio rad = new Radio();
        int expected = 0;
        rad.setCurrentStation(1);
        rad.prewStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prewStation3() {
        Radio rad = new Radio();
        int expected = 8;
        rad.setCurrentStation(9);
        rad.prewStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prewStation4() {
        Radio rad = new Radio();
        int expected = 9;
        rad.setCurrentStation(-1);
        rad.prewStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

//    @Test
//    public void setStationandVolume () {
//        Radio rad = new Radio(
//                25,
//                95
//        );
//        assertEquals(25, rad.getMaxStation());
//        assertEquals(95, rad.getMaxVolume());
//    }


}
