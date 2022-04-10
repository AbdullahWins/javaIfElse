package com.abdullahwins;

import java.util.Scanner;

public class games {
    Scanner sc = new Scanner(System.in);
    String gameName = sc.next();

    public void gameSource() {
        if (gameName.equals("csgo")) {
            String developer = ("Steam");
            int releaseYear = 2012;
            int sizeinGB = 10;
            System.out.println(gameName + (" was developed by ") + developer + (", got released in ") + releaseYear + (" and it is ") + sizeinGB + (" GB in size!!"));
        }
        else if (gameName.equals("valorant")) {
            String developer = ("Riot Games");
            int releaseYear = 2020;
            int sizeinGB = 15;
            System.out.println(gameName + (" was developed by ") + developer + (", got released in ") + releaseYear + (" and it is ") + sizeinGB + (" GB in size!!"));
        }
        else if (gameName.equals("pubg")){
                String developer = ("Krafton");
                int releaseYear = 2018;
                int sizeinGB = 15;
                System.out.println(gameName + (" was developed by ") + developer + (", got released in ") + releaseYear + (" and it is ") + sizeinGB + (" GB in size!!"));
        }
        else if (gameName.equals("apex")){
            String developer = ("Respawn");
            int releaseYear = 2016;
            int sizeinGB = 35;
            System.out.println(gameName + (" was developed by ") + developer + (", got released in ") + releaseYear + (" and it is ") + sizeinGB + (" GB in size!!"));
        }
        else if (gameName.equals("r6")){
            String developer = ("Ubisoft");
            int releaseYear = 2015;
            int sizeinGB = 120;
            System.out.println(gameName + (" was developed by ") + developer + (", got released in ") + releaseYear + (" and it is ") + sizeinGB + (" GB in size!!r"));
        }
        else {
            System.out.println("Sorry, I have no data about this Game!!");
        }
    }
}