package Agate;

import Agate.help.Utils;
import java.util.Scanner;

public class Uygulama {


    public static void main(String[] args) {

        int choice;

        while(true) {
            //Brand UI
            Utils.printLine(49);
            Utils.print("|                                               |");
            Utils.print("|                   AGATE LTD                   |");
            Utils.print("|                                               |");

            //Menu UI
            Utils.printLine(49);
            Utils.print("|     1- Add a new client                       |");
            Utils.print("|     2- Add a new campaign                     |");
            Utils.print("|     5- Assign staff to work on a campaign     |");
            Utils.print("|     11- Add a new advert to a campaign        |");
            Utils.print("|     12- Add a new member of staff             |");
            Utils.print("|     999- Exit                                 |");
            Utils.printLine(49);

            Utils.print("Enter a number=> ");
            choice = new Scanner(System.in).nextInt();
            Utils.printLine(49);
            switch(choice) {

                case 1:
                    Utils.print("|          =>Start add a new client<=           |");
                    break;
                case 2:
                    Utils.print("add a new campaign");
                    break;
                case 5:
                    Utils.print("assign staff to work on a campaign");
                    break;
                case 10:
                    Utils.print("add a new advert to a campaign; record completion of an advert");
                    break;
                case 11:
                    Utils.print("add a new advert to a campaign");
                    break;
                case 999:
                    Utils.print("exit");
                    System.exit(0);
                    break;
                default:
                    Utils.print("error, try enter a number");
                    break;
            }
        }

    }

}
