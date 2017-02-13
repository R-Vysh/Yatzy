package ua.kyiv.rvysh.yatzy.engine.rules;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ua.kyiv.rvysh.yatzy.engine.utils.MapUtils;

public class DiceUtils {
    private DiceUtils() {
    }

    // Returns Map of dice -> positions in array
    public static Map<Integer, List<Integer>> analyze(int[] dice) {
        Map<Integer, List<Integer>> result = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < dice.length; i++) {
            MapUtils.addToValuesList(result, dice[i], i);
        }
        return result;
    }
}
