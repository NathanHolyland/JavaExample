// Overloading

public class Polymorphism {
    public static int sum(int a, int b) {
        return a+b;
    }
    public static int sum(String a, String b) {
        try {
            int num_a = Integer.parseInt(a);
            int num_b = Integer.parseInt(b);
            return num_a+num_b;
        }
        catch(Exception e) {
            System.out.println(e);
            return 0;
        }

    }
    public static void main(String[] args) {
        System.out.println(sum(5, 3)+"\n");
        System.out.println(sum("5", "3")+"\n");
        System.out.println(sum("asdf", "3"));
    }
}
