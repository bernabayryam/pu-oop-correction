package Monsters;
import game.GameTile;

import java.awt.*;

public class MagicCat extends Piece{

    private final int row;
    private final int col;
    private final Color color;
    private GameTile Tile;

    public MagicCat(int row, int col, Color color) {
        super();

        this.row = row;
        this.col = col;
        this.color = color;
        String id = "MC";
        int AP = 8;
        int DP = 5;
        int MP = 10;
        int s = 1;


    }
    public void drawFigure(Graphics g) {


        int x = this.col * GameTile.TILE_SIZE;

        int y = this.row * GameTile.TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(x + 10,y + 10,50,50);
        g.setColor(Color.BLACK);
        g.drawString(" MC ", x + 30, y + 40);
    }

}


