package back.stolenpoly.service.impl;

import back.stolenpoly.service.DiceService;
import back.stolenpoly.util.RandomUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DiceServiceImpl implements DiceService {
    private static final int DICE_QUANTITY = 2;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 6;

    @Override
    public int[] roll() {
        int[] diceResults = new int[DICE_QUANTITY];
        diceResults[0] = RandomUtil.random.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        diceResults[1] = RandomUtil.random.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        return diceResults;
    }
}
