import java.util.Scanner;

public class DIZA {
    public static void main(String[] args) {
        String[] questions = {
            "1. Siapa WAKEPSEK BID PESDIK SEKarang?\n(a) Bu Meta\n(b) Pak Rizam\n(c) Pak Jokowi",
            "2. Siapakah Orang Pertama Yang Mendarat di Bulan\n(a) Donald Trump\n(b) Neil Armstrong\n(c) Joe Biden",
            "3. Siapa Pembina OSIS SMK BI Sekarang?\n(a) Pak Iqbal\n(b) Isaac Newton\n(c) Albert Einstein",
            "4. Apa nama perusahaan Google Sekarang?\n(a) Alphabet Inc dan John L\n(b) Sergey Brin\n(c) Gatau",
            "5. Siapa Presiden Turki Sekarang?\n(a) Pak Jokowi\n(b) Recep Tayyip Erdoğan\n(c) Pak Probowo",
            "6. Siapa nama ibu nya Azka?\n(a) Ibu Eka\n(b) Ibu Meta\n(c) Bambang"
        };

        char[] answers = {'b', 'b', 'a','a','b','c'};
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            char userAnswer = Character.toLowerCase(scanner.nextLine().charAt(0));
            if (userAnswer == answers[i]) {
                System.out.println("Jawaban Anda benar!");
                score++;
            } else {
                System.out.println("Jawaban Anda salah!");
            }
            System.out.println();
        }

        System.out.println("Skor akhir Anda: " + score + " dari " + questions.length);
    }
}
