package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BishopBlackTest {
    /**
     * Test Cell position()
     */
    @Test
    public void whenPositionC8() {
        Figure bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position(), is(Cell.C8));
    }

    @Test
    public void whenPositionB6() {
        Figure bishopBlack = new BishopBlack(Cell.B6);
        assertThat(bishopBlack.position(), is(Cell.B6));
    }

    /**
     * Test Cell[] way(Cell dest)
     */
    @Test
    public void whenWayC1toF4() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.F4);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4};
        assertThat(expected, is(result));
    }

    @Test
    public void whenWayH8toA1() {
        Figure bishopBlack = new BishopBlack(Cell.H8);
        Cell[] result = bishopBlack.way(Cell.A1);
        Cell[] expected = {Cell.G7, Cell.F6, Cell.E5,
                Cell.D4, Cell.C3, Cell.B2, Cell.A1
        };
        assertThat(expected, is(result));
    }

    @Test
    public void whenWayF1toA6() {
        Figure bishopBlack = new BishopBlack(Cell.F1);
        Cell[] result = bishopBlack.way(Cell.A6);
        Cell[] expected = {Cell.E2, Cell.D3,
                Cell.C4, Cell.B5, Cell.A6
        };
        assertThat(expected, is(result));
    }

    @Test
    public void whenWayD8toH4() {
        Figure bishopBlack = new BishopBlack(Cell.D8);
        Cell[] result = bishopBlack.way(Cell.H4);
        Cell[] expected = {Cell.E7, Cell.F6, Cell.G5, Cell.H4};
        assertThat(expected, is(result));
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenWayExceptionD8toH3() {
        Figure bishopBlack = new BishopBlack(Cell.D8);
        Cell[] result = bishopBlack.way(Cell.H3);
    }

    /**
     * Test boolean isDiagonal(Cell source, Cell dest)
     */
    @Test
    public void whenIsDiagonalF8toA3ThenTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        boolean rsl = bishopBlack.isDiagonal(bishopBlack.position(), Cell.A3);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenIsDiagonalF8toD5ThenFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        boolean rsl = bishopBlack.isDiagonal(bishopBlack.position(), Cell.D5);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenIsDiagonalG2toB7ThenTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G2);
        boolean rsl = bishopBlack.isDiagonal(bishopBlack.position(), Cell.B7);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenIsDiagonalG2toB8ThenFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G2);
        boolean rsl = bishopBlack.isDiagonal(bishopBlack.position(), Cell.B8);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenIsDiagonalC1toH6ThenTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean rsl = bishopBlack.isDiagonal(bishopBlack.position(), Cell.H6);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenIsDiagonalC1toH1ThenFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean rsl = bishopBlack.isDiagonal(bishopBlack.position(), Cell.H1);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenIsDiagonalD7toH3ThenTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D7);
        boolean rsl = bishopBlack.isDiagonal(bishopBlack.position(), Cell.H3);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenIsDiagonalD7toH1ThenFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D7);
        boolean rsl = bishopBlack.isDiagonal(bishopBlack.position(), Cell.H1);
        Assert.assertFalse(rsl);
    }

    /**
     * Test Figure copy(Cell dest)
     */
    @Test
    public void whenCopyC8toG4() {
        Figure bishopBlack = new BishopBlack(Cell.C8);
        Figure copyBishopBlack = bishopBlack.copy(Cell.G4);
        assertThat(copyBishopBlack.position(), is(Cell.G4));
    }

    @Test
    public void whenCopyG4toD1() {
        Figure bishopBlack = new BishopBlack(Cell.G4);
        Figure copyBishopBlack = bishopBlack.copy(Cell.D1);
        assertThat(copyBishopBlack.position(), is(Cell.D1));
    }
}