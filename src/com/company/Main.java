package com.company;

import java.util.*;

public class Main {

    static boolean EXIT_FLAG = true;
    public static void main(String[] args) {
        int [][] year_Array = {
                {0,31,29,31,30,31,30,31,31,30,31,30,31},
                {1,31,28,31,30,31,30,31,31,30,31,30,31}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份:");
        int year = scanner.nextInt();
        System.out.print("请输入天数:");
        int days = scanner.nextInt();

        int flag = (year%4==0 && year%100!=0)||year%400==0 ? 0 : 1;

        while(EXIT_FLAG){
            for (int i=1;i<13;i++){
                if(days <= year_Array[flag][i]){
                    System.out.println(i+"月"+days+"日");
                    EXIT_FLAG = false;
                    break;
                }else{
                    days -= year_Array[flag][i];
                }
            }
        }
    }
}
