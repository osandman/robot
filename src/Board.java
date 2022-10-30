public class Board {
    public static final int MAX_Y = 4;//вертикаль
    public static final int MIN_Y = -3;
    public static final int MAX_X = 8;//горизонталь
    public static final int MIN_X = -5;
    public static final int HEIGHT = Math.abs(MIN_Y) + MAX_Y + 1;//количество строк
    public static final int WIDTH = Math.abs(MIN_X) + MAX_X + 1;//количество столбцов
    public static final String defaultCell = "░"; // u2591
    private final String[][] board;

    public void setCell(int x, int y, Direction direction) {
        board[MAX_Y-y][x - MIN_X] = direction.toString();
    }

    //в конструкторе создаем двумерный массив строк и заполняем его строкой defaultCell;
    public Board() {
        board = new String[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                board[i][j] = defaultCell;
            }
        }
    }

    //печать поля в консоли с маркировкой осей координат
    public void printBoard(String prompt) {
        System.out.println(prompt);
        StringBuilder upStr = new StringBuilder("  ");

        for (int i = 0; i < WIDTH; i++) {
            upStr.append(String.format(" %2d", i + MIN_X));
        }
        System.out.println(upStr);

        for (int i = 0; i < HEIGHT; i++) {
            System.out.printf("%2d ", MAX_Y - i);
            for (int j = 0; j < WIDTH; j++) {
                System.out.printf("%2s ", board[i][j]);
            }
            System.out.print(MAX_Y - i);
            System.out.println();
        }
        System.out.println(upStr);
    }
}
