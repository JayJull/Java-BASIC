public class Array {
    public static void main(String[] args) {
    
    // Array 0ne Dimension

    int[] arrayNumber = {
        1, 2, 3,
        4, 5, 6,
    };

    System.out.println(arrayNumber[2]); // call index 2

    char[] arrayChar = {
        'a', 'b', 'c',
        'd', 'e', 'f'
    };

    System.out.println(arrayChar); // call all index

    // Array Two Dimension

    String[][] arrayString2D = {
        {"John", "Doe"},
        {"Alexa", "Firmino"},
        {"Mohammed", "Anam"}
    };

    System.out.println(arrayString2D[0][1]); // call column 1 index 1
    System.out.println(arrayString2D[1][0]); // call column 2 index 0

    }
}