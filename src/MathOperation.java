public class MathOperation {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c;

        // tambah (+)
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        
        // minus (-)
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);

        // kali (*)
        c = a * b;
        System.out.println(a + " x " + b + " = " + c);

        // bagi
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);

        // hasil bagi / modulu / sisa bagi
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);

        // operasi diri sendiri

        int d = 10;
        int f = 10;
        int g = 10;
        int h = 10;
        int i = 10;


        d += 10; // d = d + 10
        System.out.println(d);

        f -= 10; // f = f - 10
        System.out.println(f);

        g /= 10; // g = g / 10
        System.out.println(g);

        h *= 10; // h = h * 10
        System.out.println(h);

        i %= 10; // i = i % 10
        System.out.println(i);

        // operasi perbandingan
        int value1 = 2;
        int value2 = 3;

        System.out.println(value1 < value2); // kurang dari
        System.out.println(value1 > value2); // lebih dari
        System.out.println(value1 <= value2); // kurang dari samadengan
        System.out.println(value1 >= value2); // lebih dari samadengan
        System.out.println(value1 == value2); // samadengan
        System.out.println(value1 != value2); // tidak samadengan
    }
}
