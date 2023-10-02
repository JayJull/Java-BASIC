public class Loop {
    public static void main(String[] args) {
        // perulangan for        
        var a = 1;
        for (int i = a; i <= 10; i++ ){
            System.out.println(i);
        }

        // perulangan while
        var b = 11;
        while (b <= 20) {
            System.out.println(b);
            b++;
        }

        // perulangan do-while
        var c = 21;
        do {
            System.out.println(c);
            c++;
        } while (c <= 30);

        // perulangan ForEach
        String[] UserName = {
            "Alexia", "John", "Bruce", "Wayne"
        };

        for (String value : UserName) {
            System.out.println(value);
        } // tanpa deklarasi index
    }
}
