package homework9;

public class Main {
    public static void main(String[] args) {
        Printable[] printable_Arrays = new Printable[4];
        printable_Arrays[0] = new Book();
        System.out.println(printable_Arrays[0]);
        printable_Arrays[1] = new Shop();
        System.out.println(printable_Arrays[1]);
        printable_Arrays[2] = new Book();
        System.out.println(printable_Arrays[2]);
        printable_Arrays[3] = new Shop();
        System.out.println(printable_Arrays[3]);
        }
    }


