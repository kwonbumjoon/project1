package tetris.projectt.block;

public class ZBlock extends Block {

    public ZBlock() {
        super(new int[][][]{
                {{0, 0}, {1, 0}, {1, 1}, {2, 1}}, // 0도
                {{2, 0}, {2, 1}, {1, 1}, {1, 2}}, // 90도
                {{0, 1}, {1, 1}, {1, 2}, {2, 2}}, // 180도
                {{1, 0}, {1, 1}, {0, 1}, {0, 2}}  // 270도
        });
        this.type = "Z";
    }
}

