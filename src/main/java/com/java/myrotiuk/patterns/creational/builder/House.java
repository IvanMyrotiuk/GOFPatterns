package com.java.myrotiuk.patterns.creational.builder;

import lombok.Builder;
import lombok.ToString;

/**
 * Created by Ivan on 22.02.2021. All rights reserved.
 */
//@Builder
@ToString
public class House {
    private String name;
    private Integer numberOfWindow;
    private Double width;
    private Double length;
    private Double high;

    House(String name, Integer numberOfWindow, Double width, Double length, Double high) {
        this.name = name;
        this.numberOfWindow = numberOfWindow;
        this.width = width;
        this.length = length;
        this.high = high;
    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    public static class HouseBuilder {
        private String name;
        private Integer numberOfWindow;
        private Double width;
        private Double length;
        private Double high;

        HouseBuilder() {
        }

        public HouseBuilder name(String name) {
            this.name = name;
            return this;
        }

        public HouseBuilder numberOfWindow(Integer numberOfWindow) {
            this.numberOfWindow = numberOfWindow;
            return this;
        }

        public HouseBuilder width(Double width) {
            this.width = width;
            return this;
        }

        public HouseBuilder length(Double length) {
            this.length = length;
            return this;
        }

        public HouseBuilder high(Double high) {
            this.high = high;
            return this;
        }

        public House build() {
            return new House(name, numberOfWindow, width, length, high);
        }

        public String toString() {
            return "House.HouseBuilder(name=" + this.name + ", numberOfWindow=" + this.numberOfWindow + ", width=" + this.width + ", length=" + this.length + ", high=" + this.high + ")";
        }
    }
}
