package ru.job4j.puzzle;

/**
 * Базовый синтаксис
 * 1.1.7.Контрольные вопросы и тестовое задание.
 * 2.Сокобан.Тестовое задание.[#75283#127171]
 * Класс Win осуществляет проверку выигрышной комбинации на игровом поле
 *
 * @version dmitryjob4j
 * @since 08.09.2021
 */
public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkHor(board, i) || checkVer(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkHor(int[][] board, int row) {
        boolean rsl = true;
        for (int cell : board[row]) {
            if (cell == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkVer(int[][] board, int cell) {
        boolean rsl = true;
        for (int[] row : board) {
            if (row[cell] == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
