package zadania_dom;


public class ProbyA {


    public void sumujElementyTablicy(int[] tab) {
        int suma = 0;
        for (int i = tab.length - 1; i >= 0; --i) {
            suma += tab[i];
        }
        System.out.println(suma);
    }

    public int sumujTablicaDwuWymiarowa(int[][] tab1) {
        int suma = 0, suma1 = 0;
        for (int i = tab1[0].length - 1; i >= 0; --i) {
            suma += tab1[0][i];
        }
        for (int i = tab1[1].length - 1; i >= 0; --i) {
            suma1 += tab1[1][i];
        }
        return suma;


    }

    public static void main(String[] args) {
        ProbyA tablica = new ProbyA();
        int tab[] = {2, 4, 6, 7, 8};
        tablica.sumujElementyTablicy(tab);
        int tab1[][] = {{1, 1, 1}, {1, 1, 1, 1, 0, 0}};
        int suma = tablica.sumujTablicaDwuWymiarowa(tab1);
        System.out.println(suma);
        System.out.println("...................................................");

        int liczba = 8;
        liczba %= 2;
        if (liczba == 0) {
            System.out.println("liczba podzielna ");
        } else {
            System.out.printf("Liczba nie podzielna ");
        }
        System.out.println("............................................................");

        for (int a = 0; a < 31; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a = 30; a >= 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a = 0; a < 31; a++) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
        int a = -20;
        int b = 10;
        for (; a <= b; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        int tabl[] = new int[10];
        for (a = 0; a < tabl.length; a++) {
            tabl[a] = a * 2;
        }
        // System.out.println();
        for (a = tabl.length - 1; a >= 0; a--) {
            System.out.print(tabl[a] + " ");
        }
        int sumuj = 0;
        System.out.println();
        for (a = 0; a < tabl.length; a++) {
            sumuj += tabl[a];

        }
        System.out.println(sumuj);
        a = 5;
        sumuj = 1;
        for (int q = 1; q <= a; q++) {
            sumuj *= q;
        }
        System.out.println("silnia: " + sumuj);

        a = 10;
        for (int q = 0; q <= a; q++) {
            for (int w = 0; w < q; w++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int q = 0; q <= a; q++) {
            for (int e = q; e < a; e++) {
                System.out.print(" ");
            }
            for (int w = 0; w < q; w++) {
                System.out.print("*");
            }
            System.out.println();
        }
        b = 8;
        for (int i = 0; i <= b; i++) {
            for (int j = i; j < b; j++) {
                System.out.print(" ");
            }
            for (int w = 0; w < i; w++) {
                System.out.print("*");
                if (w > 0) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }


}


