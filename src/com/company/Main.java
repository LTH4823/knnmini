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
        Point kick001 = new Point("kick01",1,10,"action");
        Point kick002 = new Point("kick01",2,7,"action");
        Point kick003 = new Point("kick01",13,13,"action");
        Point romance001 = new Point("kick01",13,1,"action");
        Point romance002 = new Point("kick01",7,3,"action");
        Point romance003 = new Point("kick01",10,2,"action");

        arr[0] = kick001;
        arr[1] = kick002;
        arr[2] = kick003;
        arr[3] = romance001;
        arr[4] = romance002;
        arr[5] = romance003;

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
        System.out.println("입력하신 영화 "+target.name+"은 "+target.kind+" 영화입니다.");
    }
}
