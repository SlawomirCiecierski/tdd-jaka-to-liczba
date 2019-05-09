package pl.luczniczQA;

public class JakaToLiczba {


    private boolean parzysta(int liczba) {
        if (liczba % 2 == 0) return true;
        else return false;
    }

    String jakaToLiczba(int liczba) {

        if (liczba == 0) return "To jest 0";
        else if (liczba < 0 && !parzysta(liczba)) return "Nieparzysta liczba mniejsza od zera";
        else if (liczba < 0 && parzysta(liczba)) return "Parzysta liczba mniejsza od zera";
        else if (liczba > 0 && !parzysta(liczba)) return "Nieparzysta liczba większa od zera";
        else if (liczba > 0 && parzysta(liczba)) return "Parzysta liczba większa od zera";
        else return "Błąd";
    }
}
