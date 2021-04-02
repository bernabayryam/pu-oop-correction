package Monsters;

import game.GameTile;

import java.awt.*;

public class DogEatingBug {
    private final int row;
    private final int col;
    private final Color color;
    private GameTile Tile;

    public DogEatingBug(int row, int col, Color color) {
        super();

        this.row = row;
        this.col = col;
        this.color = color;
        String id = "DEB";
        int AP = 10;
        int DP = 2;
        int MP = 8;
        int S = 5;


    }
    public void drawFigure(Graphics g) {


        int x = this.col * GameTile.TILE_SIZE;

        int y = this.row * GameTile.TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(x + 10,y + 10,50,50);
        g.setColor(Color.BLACK);
        g.drawString(" D ", x + 30, y + 40);
    }

}

