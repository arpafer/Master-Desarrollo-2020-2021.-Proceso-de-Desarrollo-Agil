package usantatecla.tictactoe.views.console;

import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.controllers.PlayController;
import usantatecla.tictactoe.views.Message;

class PlayView {

    private PlayController playController;
    private Logic logic;

    PlayView(PlayController playController) {
        this.playController = playController;
    }
    
    PlayView(Logic logic) {
        this.logic = logic;
    }

    void interact() {
        do {
            new PlayerView(this.playController).interact();
            this.playController.next();
            new BoardView().write(this.playController);
        } while (!this.playController.isTicTacToe());
        new MessageView().writeln(Message.PLAYER_WIN, this.playController.getActiveColor().name());
    }

}
