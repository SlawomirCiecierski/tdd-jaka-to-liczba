package pl.luczniczQA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


class JakaToLiczbaTest {

    /**
     * definicje danych testowych z zakresu klas równoważności
     */

    final private int LICZBA_ZERO =0;
    final private String LICZBA_ZERO_KOMUNIKAT="To jest 0";

    final private int LICZBA_MINUS_JEDEN =-1;
    final private int LICZBA_MINUS_DWA =-2;
    final private int LICZBA_MINIMALNA_UJEMNA =Integer.MIN_VALUE; //-2147483648
    final private String LICZBA_UJEMNA_NIEPARZYSTA_KOMUNIKAT ="Nieparzysta liczba mniejsza od zera";


    final private int LICZBA_JEDEN =1;
    final private int LICZBA_DWA =2;

    final private int LICZBA_DOWOLNA_NIEPARZYSTA_UJEMNA =-33;
    final private int LICZBA_DOWOLNA_NIEPARZYSTA_DODATNIA =35;
    final private int LICZBA_MAKSYMALNA_DODATNIA =Integer.MAX_VALUE; //2147483647

    final private int LICZBA_DOWOLNA_PARZYSTA_UJEMNA =-1880;
    final private int LICZBA_DOWOLNA_PARZYSTA_DODATNIA =550;

final private String TEST_OK="_test ok_ dla wartości: ";

    /**
     * testowana metoda powinna zwrócić pożądany komunikat
     */
    @Test
    void powinnoBycZero() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_ZERO)==LICZBA_ZERO_KOMUNIKAT, TEST_OK+LICZBA_ZERO);
    }


    @Test
    void powinnaBycLiczbaUjemnaNieparzystaMinusJeden() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_MINUS_JEDEN)==LICZBA_UJEMNA_NIEPARZYSTA_KOMUNIKAT, TEST_OK+ LICZBA_MINUS_JEDEN);
    }

    @Test
    void powinnaBycLiczbaUjemnaNieparzystaMinimalna() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_MINIMALNA_UJEMNA)==LICZBA_UJEMNA_NIEPARZYSTA_KOMUNIKAT, TEST_OK+ LICZBA_MINIMALNA_UJEMNA);
    }

    @Test
    void powinnaBycLiczbaUjemnaNieparzystaDowolna() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_DOWOLNA_NIEPARZYSTA_UJEMNA)==LICZBA_UJEMNA_NIEPARZYSTA_KOMUNIKAT, TEST_OK+ LICZBA_DOWOLNA_NIEPARZYSTA_UJEMNA);
    }

}