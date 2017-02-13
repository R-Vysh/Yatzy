package ua.kyiv.rvysh.yatzy.engine.rules;

import java.util.Arrays;

public class StraightRule implements Rule {

    private final int straightLength;
    private final int minValue;
    private final int score;

    public StraightRule(int straightLength, int minValue, int score) {
        this.straightLength = straightLength;
        this.minValue = minValue;
        this.score = score;
    }

    @Override
    public int check(int[] dice) {
        int[] sortedDice = Arrays.copyOf(dice, dice.length);
        Arrays.sort(sortedDice);
        int beginningIndex = 0;
        if (minValue != 0) {
            for (int i = 0; i < sortedDice.length; i++) {
                if (!(sortedDice[i] == minValue)) {
                    beginningIndex = i;
                }
            }
        }
        int straight = 1;
        for (int i = beginningIndex; i < sortedDice.length - 1; i++) {
            if (sortedDice[i + 1] == sortedDice[i] + 1) {
                straight++;
            }
            if (sortedDice[i + 1] == sortedDice[i]) {
                // straight remains the same
                continue;
            } else {
                // if straight ends for this value, then no continuation
                if (minValue != 0) {
                    return 0;
                }
                straight = 1;
            }
            if (straight == straightLength) {
                return score;
            }
        }
        return 0;
    }

    @Override
    public boolean isBonusable() {
        return false;
    }
}
