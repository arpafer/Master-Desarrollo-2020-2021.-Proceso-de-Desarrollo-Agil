package usantatecla.tictactoe.views.console;

import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.views.Message;
import usantatecla.tictactoe.views.WithLogicView;
import usantatecla.utils.views.YesNoDialog;

class ResumeView extends WithLogicView {

    private ResumeController resumeController;    

    ResumeView(ResumeController resumeController) {
        this.resumeController = resumeController;
    }
    
    ResumeView(Logic logic) {
        super(logic);
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
