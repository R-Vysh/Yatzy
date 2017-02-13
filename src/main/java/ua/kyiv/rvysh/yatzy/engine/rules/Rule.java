package ua.kyiv.rvysh.yatzy.engine.rules;

public interface Rule {
    public int check(int[] dice);
    public boolean isBonusable();
}
