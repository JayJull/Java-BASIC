public class IfElse {
    public static void main(String[] args) {
        var nilai = 70;

        if (nilai >= 90) {
            System.out.println("Selamat Anda Mendapatkan Nilai A.");
        } else if (nilai >= 80) {
            System.out.println("Anda Mendapatkan Nilai B.");
        } else {
            System.out.println("Anda Mendapatkan Nilai C.");
        }

        // ternary operator
        String kata = nilai >= 90 ? "Kamu Lulus" : "Perbaiki Lagi";
        System.out.println(kata + " -ini TernaryOperator");
    }
}
