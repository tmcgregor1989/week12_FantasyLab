package rooms;

public enum Exits {

    EAST(1),
    SOUTH(2),
    NORTH(3),
    WEST(4);

    private final int value;


    Exits(int value) {
        this.value = value;
    }
}
