package ua.kyiv.rvysh.yatzy.engine.rules;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import ua.kyiv.rvysh.yatzy.engine.utils.MapUtils;

public abstract class PairRule implements Rule {
    private final int numberOfPairs;

    PairRule(int numberOfPairs) {
        this.numberOfPairs = numberOfPairs;
    }

    @Override
    public int check(int[] dice) {
        Map<Integer, List<Integer>> filteredDices = MapUtils.findTuplesNotShorterThan(DiceUtils.analyze(dice), 2);
        int result = 0;
        if (filteredDices.keySet().size() >= numberOfPairs) {
            for (int i = 0; i < numberOfPairs; i++) {
                Integer maxKey = Collections.max(filteredDices.keySet());
                result += maxKey.intValue() * 2;
                filteredDices.remove(maxKey);
            }
        }
        return result;
    }

    @Override
    public boolean isBonusable() {
        return false;
    }
}
