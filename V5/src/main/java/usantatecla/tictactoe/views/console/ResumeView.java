package usantatecla.tictactoe.views.console;

import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.views.Message;
import usantatecla.utils.views.YesNoDialog;

class ResumeView {

    private ResumeController resumeController;
    private Logic logic;

    ResumeView(ResumeController resumeController) {
        this.resumeController = resumeController;
    }
    
    ResumeView(Logic logic) {
        this.logic = logic;
    }

    boolean interact() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            this.resumeController.reset();
        }
        return isResumed.isAffirmative();
    }

}
