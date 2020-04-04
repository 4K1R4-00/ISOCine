package com.ISO;



import java.util.*;

public class ISOCine {

// ==========================================       Method main         ================================================

    public static void main(String[] args) {

        //  Call Scanner
        Scanner sc= new Scanner(System.in);

        //  Declare variables
        String  movie=null, location=null, session=null;
        int     paxChild=0, paxStandard=0, paxSenior=0 ;
        double  paxCPrice=0.00d, paxStPrice=0.00d, paxSePrice=0.00d, totalPrice=0.00d;

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


        //++++++++++++++++++++++++++++++++++++++++++++++++       Location        +++++++++++++++++++++++++++++++++++++++

        System.out.println("\n");
        System.out.println(" ___________________________________________________________________________________ "  );
        System.out.println("|                                    LOCATION                                       |"  );
        System.out.println("|___________________________________________________________________________________|"  );
        System.out.println("|                   1 - Midvalley                                                   |"  );
        System.out.println("|                   2 - Quill City Mall                                             |"  );
        System.out.println("|                   3 - KLCC Shopping Centre                                        |"  );
        System.out.println("|                   4 - Pavillion                                                   |"  );
        System.out.println("|                   5 - 1 Utama Shopping Centre                                     |"  );
        System.out.println("|                   6 - Bangsar South                                               |"  );
        System.out.println("|___________________________________________________________________________________|"  );

        //  Prompt for location
        System.out.print("\nPlease Select No. for Your Location ( 1 - 6 ): ");

        //  Get location
        location = sc.nextLine();

        //  Selection phase to assign value to location variable
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
                location = "Invalid";
                System.out.println("Not Valid!!!");
        }


        //  ++++++++++++++++++++++++++++++++++++++++++        Movie         ++++++++++++++++++++++++++++++++++++++++++++

        System.out.println("\n");
        System.out.println(" ___________________________________________________________________________________ "  );
        System.out.println("|                                   MOVIE                                           |"  );
        System.out.println("|___________________________________________________________________________________|"  );
        System.out.println("|                      1 - Naruto: The Last Movie                                   |"  );
        System.out.println("|                      2 - Kimi no Nawa                                             |"  );
        System.out.println("|                      3 - Boku no Hero Academia                                    |"  );
        System.out.println("|                      4 - Final Fantasy VII: Advent Children                       |"  );
        System.out.println("|                      5 - One Piece: Stampede                                      |"  );
        System.out.println("|___________________________________________________________________________________|"  );

        //  Prompt for movie
        System.out.print("\nPlease Select No. for Your Movie ( 1 - 5 ): ");

        //  Get movie
        movie = sc.nextLine();


        //++++++++++++++++++++++++++++++++++++++++++        Session         ++++++++++++++++++++++++++++++++++++++++++++
        if ("1".equals(movie)) {
            movie = "Naruto: The Last Movie";

            System.out.println(" ____________________________________________________________________________________ ");
            System.out.println("|                                 SESSION                                            |");
            System.out.println("|____________________________________________________________________________________|");
            System.out.println("|                               1 - 11.15am                                          |");
            System.out.println("|                               2 -  4.30pm                                          |");
            System.out.println("|                               3 -  4.50pm                                          |");
            System.out.println("|                               4 -  7.10pm                                          |");
            System.out.println("|____________________________________________________________________________________|");

            //  Prompt for session
            System.out.print("\nPlease Select No. for Your Session (1 - 4): ");

            //  Get session
            session = sc.nextLine();

            //  Selection phase to assign value to session variable
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
                    session = "Invalid";
                    System.out.println("Invalid!!!");
            }

        } else if ("2".equals(movie)) {
            movie = "Kimi no Nawa";

            System.out.println(" ___________________________________________________________________________________ ");
            System.out.println("|                                   SESSION                                         | ");
            System.out.println("|___________________________________________________________________________________| ");
            System.out.println("|                                1 - 2.40pm                                         |" );
            System.out.println("|                                2 - 4.00pm                                         |" );
            System.out.println("|___________________________________________________________________________________|");

            //  Prompt for location
            System.out.print("\nPlease Select No. for Your Session (1 or 2): ");

            //  Get location
            session = sc.nextLine();

            //  Selection phase to assign value to session variable
            switch (session){
                case "1":
                    session = "2.40pm";
                    break;
                case "2":
                    session = "4.00pm";
                    break;
                default:
                    session = "Invalid";
                    System.out.println("Invalid!!!");
            }

        } else if ("3".equals(movie)) {
            movie = "Boku no Hero Academia";

            System.out.println(" ____________________________________________________________________________________ ");
            System.out.println("|                                     SESSION                                        |");
            System.out.println("|____________________________________________________________________________________|");
            System.out.println("|                                   1 - 1.30pm                                       |");
            System.out.println("|                                   2 - 5.15pm                                       |");
            System.out.println("|                                   3 - 7.45pm                                       |");
            System.out.println("|____________________________________________________________________________________|");

            //  Prompt for session
            System.out.print("\nPlease Select No. for Your Session (1 - 3): ");

            //  Get session
            session = sc.nextLine();

            //  Selection phase to assign value to session variable
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
                    session = "Invalid";
                    System.out.println("Invalid!!!");
            }

        } else if ("4".equals(movie)) {
            movie = "Final Fantasy VII: Advent Children";

            System.out.println("  ___________________________________________________________________________________");
            System.out.println(" |                                    SESSION                                        |");
            System.out.println(" |___________________________________________________________________________________|");
            System.out.println(" |                                 1 - 11.30am                                       |");
            System.out.println(" |                                 2 -  2.45pm                                       |");
            System.out.println(" |___________________________________________________________________________________|");

            //  Prompt for session
            System.out.print("\nPlease Select No. for Your Session (1 or 2): ");

            //  Get session
            session = sc.nextLine();

            //  Selection phase to assign value to session variable
            switch (session){
                case "1":
                    session = "11.30am";
                    break;
                case "2":
                    session = "2.45pm";
                    break;
                default:
                    session = "Invalid";
                    System.out.println("Invalid!!!");
            }

        } else if ("5".equals(movie)) {
            movie = "One Piece: Stampede";

            System.out.println(" ____________________________________________________________________________________ ");
            System.out.println("|                                     SESSION                                        |");
            System.out.println("|____________________________________________________________________________________|");
            System.out.println("|                                  1 - 4.15pm                                        |");
            System.out.println("|                                  2 - 5.45pm                                        |");
            System.out.println("|                                  3 - 8.20pm                                        |");
            System.out.println("|                                  4 - 9.10pm                                        |");
            System.out.println("|____________________________________________________________________________________|");

            //  Prompt for session
            System.out.print("\nPlease Select No. for Your Session (1 - 4): ");

            //  Get session
            session = sc.nextLine();

            //  Selection phase to assign value to session variable
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
                    session = "Invalid";
                    System.out.println("Invalid!!!");
            }

        } else {
            session = "Invalid";
            movie = "Invalid";
            System.out.print("Not Valid!!!!");
        }

        System.out.println("\n");

        //+++++++++++++++++++++++++++++++++++++     Total Price by Category of Age      ++++++++++++++++++++++++++++++++

        //  Child Ticket
        //  Prompt for Child Pax
        System.out.print("Please enter total of child ( 4 y/o - 12 y/o):                ");

        //  Get Child Pax
        paxChild = sc.nextInt();

        //  Total Price for Child
        paxCPrice = paxChild * 8 ;

        //  Standard Ticket
        //  Prompt for Standard Pax
        System.out.print("Please enter total of standard (13 y/o - 35 y/o):             ");

        //  Get Standard Pax
        paxStandard = sc.nextInt();

        //  Total Price for Standard
        paxStPrice = paxStandard * 12 ;

        //  Senior Citizen Ticket
        //  Prompt for Senior Citizen Pax
        System.out.print("Please enter total of senior citizen: (36 y/o and above):     ");

        //  Get Senior Citizen Pax
        paxSenior = sc.nextInt();

        //  Total Price for Senior Citizen Pax
        paxSePrice = paxSenior * 10 ;

        //  Total price for Child, Standard and Senior Citizen
        totalPrice = paxCPrice + paxSePrice + paxStPrice ;

        //+++++++++++++++++++++++++++++++++++++++++++       Receipt     ++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("\n");
        System.out.println("==============================================================================  "         );
        System.out.println("                                RECEIPT                                         "         );
        System.out.println("==============================================================================  "         );
        System.out.println("(" + movie + ")");
        System.out.println("Time                                         : "          +                  session      );
        System.out.println("Location                                     : "          +                  location     );
        System.out.println("Pax of Child            (RM  8 per head) x "+ paxChild    +" : RM "        + paxCPrice    );
        System.out.println("Pax of Standard         (RM 12 per head) x "+ paxStandard +" : RM "        + paxStPrice   );
        System.out.println("Pax of Senior Citizen   (RM 10 per head) x "+ paxSenior   +" : RM "        + paxSePrice   );
        System.out.println("-----------------------------------------------------------------------------   "         );
        System.out.println("                             Total Price  : RM "        + totalPrice                      );






    }
}
