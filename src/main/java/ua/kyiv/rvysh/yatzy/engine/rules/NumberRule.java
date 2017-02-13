package ua.kyiv.rvysh.yatzy.engine.rules;

public abstract class NumberRule implements Rule {
    private final int number;

    NumberRule(int number) {
        this.number = number;
    }

    @Override
    public int check(int[] dice) {
        int result = 0;
        for (int e : dice) {
            if (e == number) {
                result += number;
            }
        }
        return result;
    }

    @Override
    public boolean isBonusable() {
        return true;
    }
}
