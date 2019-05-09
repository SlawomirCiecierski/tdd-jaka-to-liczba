package pl.luczniczQA;

public class JakaToLiczba {

    String jakaToLiczba(int liczba) {

        if (liczba == 0) return "To jest 0";
        else if (liczba < 0 && liczba % 2 != 0) return "Nieparzysta liczba mniejsza od zera";
        else if (liczba < 0 && liczba % 2 == 0) return "Parzysta liczba mniejsza od zera";
        else if (liczba > 0 && liczba % 2 != 0) return "Nieparzysta liczba większa od zera";
        else if (liczba > 0 && liczba % 2 == 0) return "Parzysta liczba większa od zera";



        else {
            return "Błąd";
        }
    }
}
