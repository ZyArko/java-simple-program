public class multidimentionalarray{
    public static void main(String[] args) {
        int firstarray[][] = {{83, 61, 51}, {51, 31, 21, 31, 41}, {31, 41, 51, 61}};
        int secondarray[][] = {{31, 15, 41}, {31, 41, 51, 61, 41}, {22}};
        int thirdarray[][] = {{11, 3, 4, 56}, {3, 2, 1, 4}};
        
	System.out.println("This is first array");
        display(firstarray);
        System.out.println("This is second array");
        display(secondarray);
        System.out.println("This is third array");
        display(thirdarray);

    }

    public static void display(int x[][]) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
