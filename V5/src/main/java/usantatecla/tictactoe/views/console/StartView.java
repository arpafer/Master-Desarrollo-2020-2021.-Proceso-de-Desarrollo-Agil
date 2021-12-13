package usantatecla.tictactoe.views.console;

import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.controllers.StartController;
import usantatecla.tictactoe.views.Message;

class StartView{

    private StartController startController;
    private Logic logic;
    
    StartView(StartController startController) {
        this.startController = startController;
    }

    StartView(Logic logic) {
       this.logic = logic;
    }
    
    void interact() {
        new MessageView().writeln(Message.TITLE);
        new BoardView().write(this.startController);
    }

}
