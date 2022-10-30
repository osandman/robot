public class Run {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        Board board = new Board();
        board.setCell(robot.getX(), robot.getY(), robot.getDirection());
        board.printBoard(robot.toString());
        moveRobotAdv(robot, 3, 2);
        board.setCell(robot.getX(), robot.getY(), robot.getDirection());
        board.printBoard(robot.toString());
    }

    public static void moveRobotAdv(Robot robot, int toX, int toY) {
        robot.stepForward();
    }
}
