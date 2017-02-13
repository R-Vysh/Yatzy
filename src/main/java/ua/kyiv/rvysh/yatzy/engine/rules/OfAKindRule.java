package ua.kyiv.rvysh.yatzy.engine.rules;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class OfAKindRule extends OfAKindAbstractRule {
    OfAKindRule(int requiredLength) {
        super(requiredLength);
    }

    @Override
    protected int calculateResult(int[] dice, Map<Integer, List<Integer>> filteredDices) {
        return Collections.max(filteredDices.keySet()).intValue() * requiredLength;
    }
}
