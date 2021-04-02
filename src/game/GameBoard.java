package game;
import Figures.Piece;
import sun.print.PathGraphics;

import javax.swing.*;
import java.awt.*;

class GameBoard extends JFrame {


    GameBoard() {

        this.setTitle();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocation(1200, 1200);
        new GamePanel();

    }

    private void setTitle() {
    }

    private static class GamePanel {


        /**
         * Method which draw the game board
         *
         * @param g
         */
        public void paint(Graphics g) {
            for (int row = 0; row < 12; row++) {
                for (int col = 0; col < 12; col++) {

                    this.renderTiles(g, row, col);
                    GameOver();
                }

            }

        }

        private void GameOver() {
        }

        private void renderTiles(Graphics g, int row, int col) {
        }
    }
}