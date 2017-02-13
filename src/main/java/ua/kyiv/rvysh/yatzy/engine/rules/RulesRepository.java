package ua.kyiv.rvysh.yatzy.engine.rules;

import java.util.Map;

public class RulesRepository {
    private Map<RulesType, Rules> rules;

    RulesRepository(Map<RulesType, Rules> rules) {
        this.rules = rules;
    }

    public Rules getRules(RulesType type) {
        return rules.get(type);
    }
}
