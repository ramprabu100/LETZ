package com.bookme.model.enumeration;

public enum TableSize {
    SMALL(2), MEDIUM(4), LARGE(6);

    int numberOfSheats;

    TableSize(final int numberOfSheats) {
        this.numberOfSheats = numberOfSheats;
    }

}
