package ua.kyiv.rvysh.yatzy.engine.rules;

public class Rules {
    private Rule[] rules;
    private int bonusScore;
    private int bonusTarget;

    public Rules(Rule[] rules, int bonusScore, int bonusTarget) {
        this.rules = rules;
        this.bonusScore = bonusScore;
        this.bonusTarget = bonusTarget;
    }

    public Rule[] getRules() {
        return rules;
    }

    public int getBonusScore() {
        return bonusScore;
    }

    public int getBonusTarget() {
        return bonusTarget;
    }
}
