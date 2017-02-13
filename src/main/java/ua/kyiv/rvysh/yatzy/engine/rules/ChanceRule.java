package ua.kyiv.rvysh.yatzy.engine.rules;

import ua.kyiv.rvysh.yatzy.engine.utils.ArrayUtils;

public class ChanceRule implements Rule {
    @Override
    public int check(int[] dice) {
        return ArrayUtils.sum(dice);
    }

    @Override
    public boolean isBonusable() {
        return false;
    }
}
