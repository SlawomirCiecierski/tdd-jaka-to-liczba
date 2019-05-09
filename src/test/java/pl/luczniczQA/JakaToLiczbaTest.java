package pl.luczniczQA;

import org.junit.jupiter.api.Test;


class JakaToLiczbaTest {

    /**
     * definicje danych testowych z zakresu klas równoważności
     */

    final private int LICZBA_ZERO =0;

    final private int LICZBA_MINUS_JEDEN =-1;
    final private int LICZBA_MINUS_DWA =-2;
    final private int LICZBA_MINIMALNA_UJEMNA =Integer.MIN_VALUE; //-2147483648

    final private int LICZBA_JEDEN =1;
    final private int LICZBA_DWA =2;

    final private int LICZBA_DOWOLNA_NIEPARZYSTA_UJEMNA =-3;
    final private int LICZBA_DOWOLNA_NIEPARZYSTA_DODATNIA =35;
    final private int LICZBA_MAKSYMALNA_DODATNIA =Integer.MAX_VALUE; //2147483647

    final private int LICZBA_DOWOLNA_PARZYSTA_UJEMNA =-1880;
    final private int LICZBA_DOWOLNA_PARZYSTA_DODATNIA =550;


    @Test
    void jakaToLiczba() {
    }
}