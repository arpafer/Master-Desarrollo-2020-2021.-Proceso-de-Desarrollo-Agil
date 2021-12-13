package usantatecla.tictactoe.views.console;

import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.controllers.StartController;
import usantatecla.tictactoe.views.Message;
import usantatecla.tictactoe.views.WithLogicView;

class StartView extends WithLogicView {

    private StartController startController;    
    
    StartView(StartController startController) {
        this.startController = startController;
    }

    StartView(Logic logic) {
       super(logic);
    }
    
    void interact() {
        new MessageView().writeln(Message.TITLE);
        new BoardView().write(this.startController);
    }

}
