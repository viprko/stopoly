package back.stolenpoly.service.impl;

import static org.junit.jupiter.api.Assertions.assertTrue;

import back.stolenpoly.service.DiceService;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DiceServiceImplTest {
    private static final int MAX_SUM = 12;
    private static final int MIN_SUM = 2;
    private static final int MIN_DICE_VALUE = 1;
    private static DiceService diceService;

    @BeforeAll
    static void beforeAll() {
        diceService = new DiceServiceImpl();
    }

    @Test
    void roll_loopTesting() {
        for (int i = 0; i < 20; i++) {
            int[] roll = diceService.roll();
            roll_invalidDiceValue_NotOk(roll);
            roll_resultLessThanMaxSum_Ok(roll);
            roll_resultMoreThanMinSum_ok(roll);
        }
    }

    private void roll_resultLessThanMaxSum_Ok(int[] roll) {
        int sum = Arrays.stream(roll).sum();
        int firstDice = roll[0];
        int secondDice = roll[1];
        assertTrue(sum <= MAX_SUM,
                "Sum of dices values = " + sum + " and cannot be more than " + MAX_SUM
                + System.lineSeparator() + "\tfirst dice = " + firstDice
                + System.lineSeparator() + "\tsecondDice = " + secondDice);
    }

    private void roll_resultMoreThanMinSum_ok(int[] roll) {
        int sum = Arrays.stream(roll).sum();
        int firstDice = roll[0];
        int secondDice = roll[1];
        assertTrue(sum >= MIN_SUM,
                "Sum of dices values = " + sum + " and cannot be less than " + MIN_SUM
                + System.lineSeparator() + "\tfirst dice = " + firstDice
                + System.lineSeparator() + "\tsecondDice = " + secondDice);
    }

    private void roll_invalidDiceValue_NotOk(int[] roll) {
        int firstDice = roll[0];
        int secondDice = roll[1];
        assertTrue(firstDice >= MIN_DICE_VALUE,
                "Dice value = " + firstDice + " and should be more than " + MIN_DICE_VALUE);
        assertTrue(secondDice >= MIN_DICE_VALUE,
                "Dice value = " + secondDice + " and should be more than " + MIN_DICE_VALUE);
    }
}
