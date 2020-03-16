package com.ISO;


import java.io.PrintStream;
import java.time.Clock;
import java.util.*;

public class ISOCine {

    public static void main(String[] args) {
        //Declare var
        Scanner sc= new Scanner(System.in);
        String  movie, location, session = null;
        int     paxChild = 0, paxStandard = 0, paxSenior ;
        double  paxCPrice = 0.00, paxStPrice= 0.00, paxSePrice = 0.00, totalPrice = 0.00 ;

        // Title: ISOCine (Ascii Syntax)
        System.out.println("         /$$$$$$  /$$$$$$   /$$$$$$   /$$$$$$  /$$                          ");
        System.out.println("        |_  $$_/ /$$__  $$ /$$__  $$ /$$__  $$|__/                          ");
        System.out.println("          | $$  | $$  \\__/| $$  \\ $$| $$  \\__/ /$$ /$$$$$$$   /$$$$$$    ");
        System.out.println("          | $$  |  $$$$$$ | $$  | $$| $$      | $$| $$__  $$ /$$__  $$      ");
        System.out.println("          | $$   \\____  $$| $$  | $$| $$      | $$| $$  \\ $$| $$$$$$$$    ");
        System.out.println("          | $$   /$$  \\ $$| $$  | $$| $$    $$| $$| $$  | $$| $$_____/     ");
        System.out.println("         /$$$$$$|  $$$$$$/|  $$$$$$/|  $$$$$$/| $$| $$  | $$|  $$$$$$$      ");
        System.out.println("        |______/ \\______/  \\______/  \\______/ |__/|__/  |__/ \\_______/  ");

        System.out.println("        =============================================================== ");
        System.out.println("                          Welcome to ISOCine Cinema                     ");
        System.out.println("        =============================================================== ");


        System.out.println("\n");
        System.out.println("1 - Midvalley");

        System.out.println("2 - Quill City Mall");

        System.out.println("3 - KLCC Shopping Centre");

        System.out.println("4 - Pavillion");

        System.out.println("5 - 1 Utama Shopping Centre");

        System.out.println("6 - Bangsar South");

        System.out.print("\nPlease Select No. for Your Location ( 1 - 6 ): ");  //Prompt for location
        location = sc.nextLine();                                                //Get location
        switch (location){
            case "1":
                location = "MidValley";
                break;
            case "2":
                location = "Quill City Mall";
                break;
            case "3":
                location = "KLCC Shopping Centre";
                break;
            case "4":
                location = "Pavilion";
                break;
            case "5":
                location = "1 Utama Shopping Centre";
                break;
            case "6":
                location = "Bangsar South";
                break;
            default:
                System.out.println("Not Valid!!!");
        }

        System.out.println("\n");
        System.out.println("1 - Naruto: The Last Movie");

        System.out.println("2 - Kimi no Nawa");

        System.out.println("3 - Boku no Hero Academia");

        System.out.println("4 - Final Fantasy VII: Advent Children");

        System.out.println("5 - One Piece: Stampede");

        System.out.print("\nPlease Select No. for Your Movie ( 1 - 5 ): ");     //Prompt for movie
        movie = sc.nextLine();                                                   //Get movie

        System.out.print("\n\n");

        if ("1".equals(movie)) {
            movie = "Naruto: The Last Movie";

            System.out.println("1 - 11.15am");

            System.out.println("2 -  4.30pm");

            System.out.println("3 -  4.50pm");

            System.out.println("4 -  7.10pm");


            System.out.print("\nPlease Select No. for Your Session (1 - 4): ");  //Prompt for location

            session = sc.nextLine();                                    //Get location

            switch (session){
                case "1":
                    session = "11.45am";
                    break;
                case "2":
                    session = "4.30pm";
                    break;
                case "3":
                    session = "4.50pm";
                    break;
                case "4":
                    session = "7.10pm";
                    break;
                default:
                    System.out.println("Invalid!!!");
            }

        } else if ("2".equals(movie)) {
            movie = "Kimi no Nawa";

            System.out.println("1 - 2.40pm");

            System.out.println("2 - 4.00pm");


            System.out.print("\nPlease Select No. for Your Session (1 or 2): ");  //Prompt for location

            session = sc.nextLine();                                    //Get location

            switch (session){
                case "1":
                    session = "2.40pm";
                    break;
                case "2":
                    session = "4.00pm";
                    break;
                default:
                    System.out.println("Invalid!!!");
            }
        } else if ("3".equals(movie)) {
            movie = "Boku no Hero Academia";

            System.out.println("1 - 1.30pm");

            System.out.println("2 - 5.15pm");

            System.out.println("3 - 7.45pm");

            System.out.print("\nPlease Select No. for Your Session (1 - 3): ");  //Prompt for location

            session = sc.nextLine();                                    //Get location

            switch (session){
                case "1":
                    session = "1.30pm";
                    break;
                case "2":
                    session = "5.15pm";
                    break;
                case "3":
                    session = "7.45pm";
                    break;
                default:
                    System.out.println("Invalid!!!");
            }

        } else if ("4".equals(movie)) {
            movie = "Final Fantasy VII: Advent Children";

            System.out.println("1 - 11.30am");

            System.out.println("2 - 2.45pm");

            System.out.print("\nPlease Select No. for Your Session (1 or 2): ");  //Prompt for location

            session = sc.nextLine();                                    //Get location

            switch (session){
                case "1":
                    session = "11.30am";
                    break;
                case "2":
                    session = "2.45pm";
                    break;
                default:
                    System.out.println("Invalid!!!");
            }

        } else if ("5".equals(movie)) {
            movie = "One Piece: Stampede";

            System.out.println("1 - 4.15pm");

            System.out.println("2 - 5.45pm");

            System.out.println("3 - 8.20pm");

            System.out.println("4 - 9.10pm");

            System.out.print("\nPlease Select No. for Your Session (1 - 4): ");  //Prompt for location

            session = sc.nextLine();                                    //Get location

            switch (session){
                case "1":
                    session = "4.15pm";
                    break;
                case "2":
                    session = "5.45pm";
                    break;
                case "3":
                    session = "8.20pm";
                    break;
                case "4":
                    session = "9.10pm";
                    break;
                default:
                    System.out.println("Invalid!!!");
            }

        } else {
            System.out.println("Not Valid!!!!");
        }

        System.out.println("\n\n");

        System.out.print("Please enter total of child ( 4 y/o - 12 y/o):                ");
        paxChild = sc.nextInt();
        paxCPrice = paxChild * 8 ;

        System.out.print("Please enter total of standard (13 y/o - 35 y/o):             ");
        paxStandard = sc.nextInt();
        paxStPrice = paxStandard * 12 ;

        System.out.print("Please enter total of senior citizen: (36 y/o and above):     ");
        paxSenior = sc.nextInt();
        paxSePrice = paxSenior * 10 ;

        totalPrice = paxCPrice + paxSePrice + paxStPrice ;

        System.out.println("\n");
        System.out.println("==============================================================================  ");
        System.out.println("                                RECEIPT                                         ");
        System.out.println("==============================================================================  ");
        System.out.println("(" + movie + ")");
        System.out.println("Time                                      : "          + session       );
        System.out.println("Location                                  : "          + location      );
        System.out.println("Pax of Child            (RM  8 per head)  : RM "        + paxCPrice     );
        System.out.println("Pax of Standard         (RM 12 per head)  : RM "        + paxStPrice    );
        System.out.println("Pax of Senior Citizen   (RM 10 per head)  : RM "        + paxSePrice    );
        System.out.println("-----------------------------------------------------------------------------   ");
        System.out.println("                             Total Price  : RM "        + totalPrice    );






    }
}
