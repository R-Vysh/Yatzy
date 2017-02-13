package ua.kyiv.rvysh.yatzy.engine.rules;

import java.util.List;
import java.util.Map;

import ua.kyiv.rvysh.yatzy.engine.utils.MapUtils;

public abstract class OfAKindAbstractRule implements Rule {
    protected final int requiredLength;

    OfAKindAbstractRule(int requiredLength) {
        this.requiredLength = requiredLength;
    }
    
    @Override
    public int check(int[] dice) {
        Map<Integer, List<Integer>> filteredDices = MapUtils.findTuplesNotShorterThan(DiceUtils.analyze(dice), requiredLength);
        int result = 0;
        if (!filteredDices.isEmpty()) {
            result = calculateResult(dice, filteredDices);
        }
        return result;
    }
    
    protected abstract int calculateResult(int[] dice, Map<Integer, List<Integer>> filteredDices);

    @Override
    public boolean isBonusable() {
        return false;
    }
}
