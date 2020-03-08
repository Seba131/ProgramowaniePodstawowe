package struktury_danych.stos_lista;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class StosElem {
    private int value;
    private StosElem prev;

    public StosElem(int value){
       this.value = value;
        this.prev = prev;

    }

    public int getValue() {
        return value;
    }

    public StosElem getPrev() {
        return prev;
    }
}
