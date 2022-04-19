package com.lecuong.bai_4;

import java.util.List;

public class Town {

    private List<Family> families;

    public Town() {
    }

    public Town(List<Family> families) {
        this.families = families;
    }

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    @Override
    public String toString() {
        return "Town{" +
                "families=" + families +
                '}';
    }
}
