package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.types.Color;
import usantatecla.tictactoe.types.Coordinate;
import usantatecla.tictactoe.types.Error;

public class PlayController extends Controller {

    public PlayController(Game game) {
        super(game);
    }

    public boolean areAllTokensOnBoard() {
        return this.game.areAllTokensOnBoard();
    }

    public boolean isTicTacToe() {
        return this.game.isTicTacToe();
    }

    public void next() {
        this.game.next();
    }

    public Color getActiveColor() {
        return this.game.getActiveColor();
    }

    public void putToken(Coordinate coordinate) {
        this.game.putToken(new Coordinate(coordinate.getRow(), coordinate.getColumn()));
    }

    public Error getPutTokenError(Coordinate coordinate) {
        return this.game.getPutTokenError(coordinate);
    }

    public void moveToken(Coordinate origin, Coordinate target) {
        this.game.moveToken(
                new Coordinate(origin.getRow(), origin.getColumn()),
                new Coordinate(target.getRow(), target.getColumn())
        );
    }

    public Error getOriginMoveTokenError(Coordinate coordinate) {
        return this.game.getOriginMoveTokenError(coordinate);
    }

    public Error getTargetMoveTokenError(Coordinate origin, Coordinate target) {
        return this.game.getTargetMoveTokenError(origin, target);
    }

}
