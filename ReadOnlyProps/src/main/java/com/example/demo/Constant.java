package com.example.demo;

import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;

public class Constant {
    private final ReadOnlyIntegerWrapper numWrapper;

    public Constant(int number) {
        this.numWrapper = new ReadOnlyIntegerWrapper(number);
    }

    public ReadOnlyIntegerProperty getReadOnlyNumber() {
        return numWrapper.getReadOnlyProperty();
    }

    public void changeConstant(int number) {
        numWrapper.set(number);
    }

}
