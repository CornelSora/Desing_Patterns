package other_example;

import java.util.Map;

public interface Expression {
    public int interpret(Map<String, Expression> context);
}
