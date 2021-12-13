package usantatecla.tictactoe;

import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.views.graphics.GraphicsView;

class GraphicsTicTacToe extends TicTacToe {

    @Override
    protected GraphicsView createView(Logic logic) {
        return new GraphicsView(this.startController, this.playController, this.resumeController);
    }

    public static void main(String[] args) {
        new GraphicsTicTacToe().play();
    }

}
