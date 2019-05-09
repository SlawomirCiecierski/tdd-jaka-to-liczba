package pl.luczniczQA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class JakaToLiczbaTest {

    /**
     * oczekiwane komunikaty
     */

    final private String LICZBA_UJEMNA_NIEPARZYSTA_KOMUNIKAT = "Nieparzysta liczba mniejsza od zera";
    final private String LICZBA_UJEMNA_PARZYSTA_KOMUNIKAT = "Parzysta liczba mniejsza od zera";
    final private String LICZBA_DODATNIA_PARZYSTA_KOMUNIKAT = "Parzysta liczba większa od zera";
    final private String LICZBA_DODATNIA_NIEPARZYSTA_KOMUNIKAT = "Nieparzysta liczba większa od zera";
    final private String LICZBA_ZERO_KOMUNIKAT = "To jest 0";

    /**
     * definicje danych testowych z zakresu klas równoważności
     */

    final private int LICZBA_ZERO = 0;

    final private int LICZBA_MINUS_JEDEN = -1;
    final private int LICZBA_MINUS_DWA = -2;
    final private int LICZBA_DOWOLNA_NIEPARZYSTA_UJEMNA = -33;
    final private int LICZBA_MINIMALNA_UJEMNA_PARZYSTA = Integer.MIN_VALUE; //-2147483648
    final private int LICZBA_MINIMALNA_UJEMNA_NIEPARZYSTA = Integer.MIN_VALUE + 1; //-2147483647
    final private int LICZBA_DOWOLNA_PARZYSTA_UJEMNA = -1880;


    final private int LICZBA_JEDEN = 1;
    final private int LICZBA_DWA = 2;
    final private int LICZBA_DOWOLNA_NIEPARZYSTA_DODATNIA = 35;
    final private int LICZBA_MAKSYMALNA_DODATNIA_NIEPARZYSTA = Integer.MAX_VALUE; //2147483647
    final private int LICZBA_MAKSYMALNA_DODATNIA_PARZYSTA = Integer.MAX_VALUE - 1; //2147483646
    final private int LICZBA_DOWOLNA_PARZYSTA_DODATNIA = 550;

    final private String TEST_OK = "_test ok_ dla wartości: ";


    /**
     * testowana metoda powinna zwrócić pożądany komunikat
     */
    @Test
    void powinnoBycZero() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_ZERO) == LICZBA_ZERO_KOMUNIKAT, TEST_OK + LICZBA_ZERO);
    }

//liczby ujemne nieparzyste

    @Test
    void powinnaBycLiczbaMinusJeden() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_MINUS_JEDEN) == LICZBA_UJEMNA_NIEPARZYSTA_KOMUNIKAT, TEST_OK + LICZBA_MINUS_JEDEN);
    }

    @Test
    void powinnaBycLiczbaUjemnaNieparzystaMinimalna() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_MINIMALNA_UJEMNA_NIEPARZYSTA) == LICZBA_UJEMNA_NIEPARZYSTA_KOMUNIKAT, TEST_OK + LICZBA_MINIMALNA_UJEMNA_NIEPARZYSTA);
    }

    @Test
    void powinnaBycLiczbaUjemnaNieparzystaDowolna() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_DOWOLNA_NIEPARZYSTA_UJEMNA) == LICZBA_UJEMNA_NIEPARZYSTA_KOMUNIKAT, TEST_OK + LICZBA_DOWOLNA_NIEPARZYSTA_UJEMNA);
    }

    //liczby ujemne parzyste

    @Test
    void powinnaBycLiczbaUjemnaMinusDwa() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_MINUS_DWA) == LICZBA_UJEMNA_PARZYSTA_KOMUNIKAT, TEST_OK + LICZBA_MINUS_DWA);
    }

    @Test
    void powinnaBycLiczbaUjemnaParzystaMinimalna() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_MINIMALNA_UJEMNA_PARZYSTA) == LICZBA_UJEMNA_PARZYSTA_KOMUNIKAT, TEST_OK + LICZBA_MINIMALNA_UJEMNA_PARZYSTA);
    }

    @Test
    void powinnaBycLiczbaUjemnaParzystaDowolna() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_DOWOLNA_PARZYSTA_UJEMNA) == LICZBA_UJEMNA_PARZYSTA_KOMUNIKAT, TEST_OK + LICZBA_DOWOLNA_PARZYSTA_UJEMNA);
    }

//liczby dodatnie nieparzyste

    @Test
    void powinnaBycLiczbaJeden() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_JEDEN) == LICZBA_DODATNIA_NIEPARZYSTA_KOMUNIKAT, TEST_OK + LICZBA_JEDEN);
    }

    @Test
    void powinnaBycLiczbaDodatniaNieparzystaMaksymalna() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_MAKSYMALNA_DODATNIA_NIEPARZYSTA) == LICZBA_DODATNIA_NIEPARZYSTA_KOMUNIKAT, TEST_OK + LICZBA_MAKSYMALNA_DODATNIA_NIEPARZYSTA);
    }

    @Test
    void powinnaBycLiczbaDodatniaNieparzystaDowolna() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_DOWOLNA_NIEPARZYSTA_DODATNIA) == LICZBA_DODATNIA_NIEPARZYSTA_KOMUNIKAT, TEST_OK + LICZBA_DOWOLNA_NIEPARZYSTA_DODATNIA);
    }

    //liczby dodatnie parzyste

    @Test
    void powinnaBycLiczbaDwa() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_DWA) == LICZBA_DODATNIA_PARZYSTA_KOMUNIKAT, TEST_OK + LICZBA_DWA);
    }

    @Test
    void powinnaBycLiczbaDodatniaParzystaMaksymalna() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_MAKSYMALNA_DODATNIA_PARZYSTA) == LICZBA_DODATNIA_PARZYSTA_KOMUNIKAT, TEST_OK + LICZBA_MAKSYMALNA_DODATNIA_PARZYSTA);
    }

    @Test
    void powinnaBycLiczbaDodatniaParzystaDowolna() {

        JakaToLiczba liczba = new JakaToLiczba();

        assertTrue(liczba.jakaToLiczba(LICZBA_DOWOLNA_PARZYSTA_DODATNIA) == LICZBA_DODATNIA_PARZYSTA_KOMUNIKAT, TEST_OK + LICZBA_DOWOLNA_PARZYSTA_DODATNIA);
    }


}