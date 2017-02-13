package ua.kyiv.rvysh.yatzy.engine.rules;

import java.util.List;
import java.util.Map;

import ua.kyiv.rvysh.yatzy.engine.utils.ArrayUtils;

public abstract class OfAKindTotalRule extends OfAKindAbstractRule {

    OfAKindTotalRule(int requiredLength) {
        super(requiredLength);
    }

    @Override
    protected int calculateResult(int[] dice, Map<Integer, List<Integer>> filteredDices) {
        return ArrayUtils.sum(dice);
    }
}
