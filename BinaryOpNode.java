public class BinaryOpNode implements Expression {
    private final Expression left;
    private final String operator;
    private final Expression right;

    public BinaryOpNode(Expression left, String operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public Object evaluate(Environment env) {
        Object leftVal  = left.evaluate(env);
        Object rightVal = right.evaluate(env);

        // Arithmetic and comparison both require numeric operands
        double l = ((Number) leftVal).doubleValue();
        double r = ((Number) rightVal).doubleValue();

        return switch (operator) {
            case "+"  -> l + r;
            case "-"  -> l - r;
            case "*"  -> l * r;
            case "/"  -> l / r;
            case ">"  -> l > r;
            case "<"  -> l < r;
            case "==" -> l == r;
            default   -> throw new RuntimeException("Unknown operator: " + operator);
        };
    }
}
