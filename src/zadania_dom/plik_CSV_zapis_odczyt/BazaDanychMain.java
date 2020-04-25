package zadania_dom.plik_CSV_zapis_odczyt;

import zadania_dom.plik_CSV_zapis_odczyt.zadanie1.Zamowienie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class BazaDanychMain {

    static ArrayList<BazaDanych> lista = new ArrayList();
    //  static String sciezka;
    //  static String naglowki;
    //  private static String linia;
    public static int nowyId = 0;
    // public static BazaDanych element;
    //  public static String imie;

    public static void main(String[] args) {

  //     String to = String.format("###-###-###");
      // String.format(to, )= "753-444-666";
//        System.out.println(to);



        odczytDane();
        for (BazaDanych element : lista) {
            System.out.println(element);
        }
        System.out.println(lista);


//        imie = "tomek";
//
        dodajDane();
        nowyId++;
        dodajDane();
        nowyId++;

////        for (BazaDanych element : lista) {
////            System.out.println(element);
////        }
//        System.out.println(lista);
        zapiszDane();

    }


    public static void dodajDane() {

        BazaDanych nowy = new BazaDanych(nowyId);
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        nowy.setImie(skaner.nextLine());
        if(nowy.getImie().length() ==0){
            System.out.println("OKOKOKOK");
        }
        if (nowy.getImie().equals("")) {
            nowy.setImie("0");
        }

                Integer.parseInt(nowy.getImie());
     //   System.out.println(Integer.parseInt(nowy.getImie()));  //Sprawdzenie czy jest text

        System.out.println("Podaj nazwisko: ");
        nowy.setNazwisko(skaner.nextLine());
        System.out.println("Podaj wiek: ");
        try {
            nowy.setWiek(skaner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Podaj liczbę !!");
        }

        lista.add(nowy);
    }

    private static void zapiszDane() {

        try {
            Files.writeString(Paths.get("plik.csv"), lista.toString(), StandardOpenOption.CREATE); //, StandardOpenOption.APPEND);
            //CStandardOpenOption.CREATE - utwórz nowy plik jesli nie istnieje

        } catch (IOException e) {
            System.out.println("Błąd na pliku");
            e.printStackTrace();
        }
    }

    private static void odczytDane() {
        try {
            //     List<String> plik = Files.readAllLines(Paths.get("plik.sp"));
            List<String> odczyt;
            // String odczyt;
            odczyt = Files.readAllLines(Paths.get("plik.csv"));
            String odczytana = odczyt.toString();
            odczytana = odczytana.replace("[", "");
            odczytana = odczytana.replace("]", "");

            String[] rozdzielNaPliki = odczytana.split(",");
            int j = 0;
            for (int i = 1; rozdzielNaPliki.length >= i; i++, j++) {
                rozdzielNaPliki[j] = rozdzielNaPliki[j].trim();
                String[] rozdzielNaDane = rozdzielNaPliki[j].split(" ");
                BazaDanych bazaDanych = new BazaDanych(
                        Integer.parseInt(rozdzielNaDane[0]), //ID
                        rozdzielNaDane[1], // imie
                        rozdzielNaDane[2], // nazwisko
                        Integer.parseInt(rozdzielNaDane[3]) // wiek
                );
                System.out.println("bazadanych" + bazaDanych);
                lista.add(bazaDanych);
            }
        } catch (IOException exception) {
            System.out.println("Brak pliku!");
        } catch (NumberFormatException e) {
            System.out.println("Plik pusty lub nieprawidłowe dane");
        }


    }
}