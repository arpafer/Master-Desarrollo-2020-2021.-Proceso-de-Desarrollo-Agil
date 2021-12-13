package usantatecla.tictactoe.views;

import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.controllers.PlayController;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.controllers.StartController;

public abstract class View extends WithLogicView {

    protected StartController startController;
    protected PlayController playController;
    protected ResumeController resumeController;
       
    public View(StartController startController, PlayController playController, ResumeController resumeController) {
        this.startController = startController;
        this.playController = playController;
        this.resumeController = resumeController;
    }

    public View(Logic logic) {
        super(logic);
    }
    
    public abstract void start();

    public abstract void play();

    public abstract boolean resume();

}
