package com.company;
import java.util.Scanner;

public class Main {
public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
       float  [] tab=new float  [4];
        System.out.println("Wybierz kolor dla pierwszej cyfry: \n 0.Czarny \n 9. Biały \n 8.Szary \n 7.Fioletowy \n 6.Niebieski \n 5.Zielony \n 4.Żółty \n 3.Pomarańczowy \n 2.Czerwony \n 1.Brązowy ");
       tab[0]= scan.nextInt();
        System.out.println("Wybierz kolor dla pierwszej cyfry: \n 0.Czarny \n 9. Biały \n 8.Szary \n 7.Fioletowy \n 6.Niebieski \n 5.Zielony \n 4.Żółty \n 3.Pomarańczowy \n 2.Czerwony \n 1.Brązowy ");
        tab[1]= scan.nextInt();
        System.out.println("Wybierz kolor dla drugiej cyfry: \n 10.Złoty \n 11.Srebny \n 9. Biały \n 8.Szary \n 7.Fioletowy \n 6.Niebieski \n 5.Zielony \n 4.Żółty \n 3.Pomarańczowy \n 2.Czerwony \n 1.Brązowy \n 0 Czarny" );
        int  x = scan.nextInt();
      if (x<10 ) {
          tab[3] = 10 ^ x;
      }
       else if (x == 10)
      {
          tab[3]=-1;
      }
      else if (x == 11)
      {
          tab[3]=-2;
      }
        double R ;
       R= (tab[0]*10 +tab[1]);

        System.out.println("Szukany opór to :" + R +  "\n razy  10^"+ tab[3]);

    }
}

