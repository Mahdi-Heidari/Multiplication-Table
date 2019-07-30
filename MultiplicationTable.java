package multiplicationtable;

public class MultiplicationTable {

    public static void main(String[] args) {

        displayMultiplicationTable(15);
    }

    public static void displayMultiplicationTable(int number) {

//        Displays the title (Multiplication Table) in the middle.
        for (int i = 0; i < number / 2; i++) {
            System.out.print("\t");
        }
        System.out.println("Multiplication Table");

//        Displays the rows of the multiplication table.
        for (int i = 1; i <= number; i++) {
            System.out.printf("\t%d", i);
        }
        System.out.println("");

        for (int i = 0; i <= number * 8; i++) {
            System.out.print("-");
        }
        System.out.println("");

//        Display the result of multiplication.
        for (int i = 1; i <= number; i++) {
            System.out.printf("%d |", i);
            for (int j = 1; j <= number; j++) {
                System.out.printf("\t%d", i * j);
            }
            System.out.println("");
        }
    }

}
