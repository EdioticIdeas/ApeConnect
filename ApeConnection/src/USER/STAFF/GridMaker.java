package USER.STAFF;

public class GridMaker {
    private static int gridRow = 5; // R = length
    private static int gridCol = 5; // C = height
    private static int[][] grid = new int[gridRow][gridCol];
    private static int totalSteps = (gridRow * gridCol); // total blocks on the grid
    private static int location = 1; // location refers to the number in the box, ie. 1, 2, 3, etc.
    private static int rowLength = 1;

    public static void main(String[] args) {
        grid[Calc.findArrayCenter(gridRow)][Calc.findArrayCenter(gridRow)] = 1;
        rowBrowser();
        colBrowser();

    for (int r = 0; r < gridRow; r++){
        for (int c = 0; c < gridCol; c++){
            System.out.print(grid[r][c] + " ");
        }
        System.out.println("");
    }
}

public static void rowBrowser() {
    int rowCount = 1;
    int x = 1;
    int stepsInvolved = 2;

    if (x < stepsInvolved) {
        if (Calc.isOdd(rowCount) == true) {
            grid[Calc.findArrayCenter(gridRow)][Calc.findArrayCenter(gridCol) + x] = location + 1;
            stepsInvolved++;
        }
    }
    location++;
    x++;
}

private static void colBrowser() {

}
}

class Calc {
public static int findArrayCenter(int center) {
    int fcenter = 0;
    if (center % 2 != 0)
        fcenter = (int) ((center / 2));
    else
        fcenter = (center / 2);
    return fcenter;
}

public static boolean isOdd(int num) {
    boolean result = true;
    if (num % 2 == 0)
        result = false; // false = even, true = odd
    return result;
}
}