package ru.job4j.puzzle;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Базовый синтаксис
 * 1.1.7.Контрольные вопросы и тестовое задание.
 * 2.Сокобан.Тестовое задание.[#75283#127171]
 * Класс Win осуществляет проверку выигрышной комбинации на игровом поле
 * @version dmitryjob4j
 * @since 08.09.2021
 */
public class WinTest {
    @Test
    public void whenVerticalWin() {
        int[][] board = {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
        assertThat(Win.check(board), is(true));
    }

    @Test
    public void whenHorizontalWin() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        assertThat(Win.check(board), is(true));
    }

    @Test
    public void whenNotWin() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0},
        };
        assertThat(Win.check(board), is(false));
    }

    @Test
    public void whenNotWinV() {
        int[][] board = {
                {0, 0, 1, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
        assertThat(Win.check(board), is(false));
    }

    @Test
    public void whenNotWinL() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 1, 1, 0},
        };
        assertThat(Win.check(board), is(false));
    }

    @Test
    public void whenNotWinMy() {
        int[][] board = {
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1},
                {1, 1, 1, 1, 0},
        };
        assertFalse(Win.check(board));
    }
}
