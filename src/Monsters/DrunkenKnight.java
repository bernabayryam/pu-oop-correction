package Monsters;

import game.GameTile;

import java.awt.*;

public class DrunkenKnight extends  Piece {

    private final int row;
    private final int col;
    private final Color color;
    private GameTile Tile;

    public DrunkenKnight(int row, int col, Color color) {
        super();

        this.row = row;
        this.col = col;
        this.color = color;
        this.id = "D";
        this.AP = 6;
        this.DP = 2;
        this. = 12;
        this.attackRange = 2;
        this.speed = 2;

    }
    public void drawFigure(Graphics g) {


        int x = this.col * GameTile.TILE_SIZE;

        int y = this.row * GameTile.TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(x + 10,y + 10,50,50);
        g.setColor(Color.BLACK);
        g.drawString(" D ", x + 30, y + 40);
    }

    @Override
    public boolean isMoveValid(int row, int col) {
        return false;
    }
}

