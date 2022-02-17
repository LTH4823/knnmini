package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int x = 0,y = 0;
        double minDistance = Double.MAX_VALUE;
        Point minPoint = null;

        Point[] arr = new Point[6];
        Point movie0 = new Point("kick01",1,10,"action");
        Point movie1 = new Point("kick01",2,7,"action");
        Point movie2 = new Point("kick01",13,13,"action");
        Point movie3 = new Point("kick01",13,1,"action");
        Point movie4 = new Point("kick01",7,3,"action");
        Point movie5 = new Point("kick01",10,2,"action");

        arr[0] = movie0;
        arr[1] = movie1;
        arr[2] = movie2;
        arr[3] = movie3;
        arr[4] = movie4;
        arr[5] = movie5;

        System.out.println("영화 명을 입력해 주십시오.");
        name = scanner.nextLine();
        System.out.println("액션씬 횟수를 입력해 주십시오.");
        x=Integer.parseInt(scanner.nextLine());
        System.out.println("로맨스씬 횟수를 입력해 주십시오.");
        y=Integer.parseInt(scanner.nextLine());

        Point target = new Point(name,x,y, null);

        for (Point temp: arr) {
            double distance =
                    Math.sqrt( Math.pow( temp.x - target.x  ,2) +
                            Math.pow( temp.y - target.y  ,2));
            if(distance < minDistance){
                minDistance = distance;
                minPoint = temp;
            }
        }
        target.kind = minPoint.kind;
        System.out.println("\n입력하신 영화 "+target.name+"은 "+target.kind+" 영화입니다.");
    }
}
