package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Game;

public class Logic {
   private Game game;
   private StartController startController;
   private ResumeController resumeController;
   private PlayController playController;
   
   public Logic(Game game) {
       this.game = game;
       this.startController = new StartController(game);
       this.playController = new PlayController(game);
       this.resumeController = new ResumeController(game);
   }
}
