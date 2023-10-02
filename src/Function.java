public class Function {
    
    // function tanpa parameter
    static void HelloWorld(){
        System.out.println("Hello World!");
    }

    // function parameter
    static void HelloJayJull(String FirstName){
        System.out.println("Hello " + FirstName + "!");
    }

    // function return
    static int Sum(int a, int b){
        int c = a + b;
        return c;
    }

    // function overloading
    static void sayHi(){
        System.out.println("Hi");
    }
    static void sayHi(String Name){
        System.out.println("Hi " + Name + "!");
    }

    // function recursive
    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    public static void main(String[] args) {
        HelloWorld();
        HelloJayJull("JayJull");
        
        var o = Sum(12, 3);
        System.out.println(o);

        sayHi(); // original
        sayHi("JayJull"); // overload

        System.out.println(factorialRecursive(5));
        // cara kerja rekursif 5 * 4 = 20 * 3 = 60 * 2 = 120 * 1 = 120
    }
    
}
