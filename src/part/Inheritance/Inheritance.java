package part.Inheritance;

class Main {
    public static void main(String[] args) {
        Child1 thing1 = new Child1();
        Child2 thing2 = new Child2("thing2");

        thing1.printInfo();
        thing2.printInfo();

        thing1.changeA(2);
        int[] arr = {3, 2, 1, 4};
        thing1.changeB(arr);
        thing1.multiply(5);

        thing2.changeName("thing2?");

        thing1.printInfo();
        thing2.printInfo();
    }
}

class Parent {
    private int a = 0;
    private int[] b = {0};

    public void changeA(int x) {a = x;}
    public void changeB(int[] x) {b = x;}
    public int getA() {return a;}
    public int[] getB() {return b;}

    public void printInfo() {
        System.out.println("A = "+a);
        String bStr = "{";
        for (int i = 0; i < b.length; i ++) {
            if (i == b.length-1) {
                bStr = bStr + i + "}";
            }
            else {
                bStr = bStr + i + ", ";
            }
        }
        System.out.println("B = "+bStr+"\n");
    }
}

// Inheritance
class Child1 extends Parent {
    public void multiply(int n) {
        int a_val = this.getA();
        this.changeA(a_val*n);

        int[] b_list = this.getB();
        for (int i : b_list) {
            i = i * n;
        }
        this.changeB(b_list);
    }
}

class Child2 extends Parent {
    String name;
    public Child2(String new_name) {name = new_name;}
    public void changeName(String new_name) {name = new_name;};


    @Override
    public void printInfo() {
        System.out.println("name = "+name);
        System.out.println("A = "+this.getA());
        int[] b_list = this.getB();
        String bStr = "{";
        for (int i = 0; i < b_list.length; i ++) {
            if (i == b_list.length-1) {
                bStr = bStr + i + "}";
            }
            else {
                bStr = bStr + i + ", ";
            }
        }
        System.out.println("B = "+bStr+"\n");
    }

}