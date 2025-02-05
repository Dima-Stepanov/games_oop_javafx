package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class LogicTest {

    @Test(expected = OccupiedCellException.class)
    public void whenMoveByExeptionOccupiedCellException() throws Exception {
        Logic logic = new Logic();
        Figure bishopBlack = new BishopBlack(Cell.C8);
        Figure pawnBlack = new PawnBlack(Cell.D7);
        logic.add(bishopBlack);
        logic.add(pawnBlack);
        logic.move(Cell.C8, Cell.E6);
    }

    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenMoveByFigureNotFoundException() throws Exception {
        Logic logic = new Logic();
        logic.move(Cell.C8, Cell.E6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenMoveByExeptionImpossibleMoveException() throws Exception {
        Logic logic = new Logic();
        Figure bishopBlack = new BishopBlack(Cell.C8);
        logic.add(bishopBlack);
        logic.move(Cell.C8, Cell.E7);
    }
}