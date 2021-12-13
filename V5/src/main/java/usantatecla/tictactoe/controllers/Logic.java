package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.types.Color;
import usantatecla.tictactoe.types.Error;
import usantatecla.tictactoe.types.Coordinate;

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
   
   public Color getColor(Coordinate coordinate) {
        return this.startController.getColor(coordinate);
    }
   
    public boolean areAllTokensOnBoard() {
        return this.playController.areAllTokensOnBoard();
    }
    
     public boolean isTicTacToe() {
        return this.playController.isTicTacToe();
    }

    public void next() {
        this.playController.next();
    }

    public Color getActiveColor() {
        return this.playController.getActiveColor();
    }

    public void putToken(Coordinate coordinate) {
        this.playController.putToken(new Coordinate(coordinate.getRow(), coordinate.getColumn()));
    }

    public Error getPutTokenError(Coordinate coordinate) {
        return this.playController.getPutTokenError(coordinate);
    }

    public void moveToken(Coordinate origin, Coordinate target) {
        this.game.moveToken(
                new Coordinate(origin.getRow(), origin.getColumn()),
                new Coordinate(target.getRow(), target.getColumn())
        );
    }

    public Error getOriginMoveTokenError(Coordinate coordinate) {
        return this.playController.getOriginMoveTokenError(coordinate);
    }

    public Error getTargetMoveTokenError(Coordinate origin, Coordinate target) {
        return this.playController.getTargetMoveTokenError(origin, target);
    }
    
    public void reset() {
        this.resumeController.reset();
    }
}
