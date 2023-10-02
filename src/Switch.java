public class Switch {
    public static void main(String[] args) {
        var nilai = 'E';

        // Switch biasa
        switch (nilai) {
            case 'A' :
            System.out.println("Wow, Kamu Berhasil Mendapat Nilai A. Kamu Lulus!");
            break;

            case 'B' :
            System.out.println("Kamu Berhasil Mendapat Nilai B. Kamu Lulus");
            break;

            case 'C' :
            System.out.println("Kamu Mendapat Nilai C. Perbaiki Lagi");
            break;

            case 'D' :
            System.out.println("Kamu Mendapat Nilai D. Kamu Mengulang Tahun Ini");
            break;

            default:
            System.out.println("Kategori Nilai Tidak Ada");
        }

        // Switch Lambda
        switch (nilai) {
            case 'A' -> System.out.println("Wow, Kamu Berhasil Mendapat Nilai A. Kamu Lulus! -ini Lambda");
            default -> System.out.println("Kategori Nilai Tidak Ada -ini lambda");
        }
    }
}
