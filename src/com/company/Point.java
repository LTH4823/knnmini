package com.company;

public class Point {
    String name;
    int x, y;
    String kind;

    public Point(String name, int x, int y, String kind) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Point{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", kind='" + kind + '\'' +
                '}';
    }
}
