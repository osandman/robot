public enum Direction {
    UP("^"),
    DOWN("v"),
    LEFT("<"),
    RIGHT(">");
    final String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return direction;
    }
}
