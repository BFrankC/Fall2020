/**
 * The query interface.
 * @author Tim
 * @version 1.0
 */
public interface Query extends Visitable {
    /**
     * Returns the name.
     * @return the name
     */
    String getName();

    /**
     * Returns the operator this query represents.
     * @return the operator this query represents
     */
    Operator getOperator();

    /**
     * Class to represent operators.  &&, for example.
     * @author Tim
     * @version 1.0
     */
    class Operator {
        private String symbol;
        private boolean isUnary;

        /**
         * Creates an Operator.
         * @param sym The symbol, &lt; for example
         * @param unary Whether the operator is unary
         */
        public Operator(String sym, boolean unary) {
            this.symbol = sym;
            this.isUnary = unary;
        }

        /**
         * Returns whether the operator is unary.
         * @return whether the operator is unary
         */
        public boolean isUnary() {
            return isUnary;
        }

        /**
         * Returns the operator as a String.
         * @return the operator as a String
         */
        @Override
        public String toString() {
            return symbol;
        }
    }
}
