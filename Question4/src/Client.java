public class Client implements MathOperation {
    public void main(String[] args) {
        Context contextAdd = new Context(new AddOperation() {
            @Override
            public int performOperation(int num1, int num2) {
                return 0;
            }

            @Override
            public void AddOperation() {

            }

            @Override
            public void SubtractOperation() {

            }

            @Override
            public void MultiplyOperation() {

            }
        });
        System.out.println(contextAdd.execute(5, 15)); // Expects 20
        Context contextSubtract = new Context(new SubtractOperation());
        System.out.println(contextSubtract.execute(50, 40)); // Expects 10
        Context contextMultiply = new Context(new MultiplyOperation() {
            @Override
            public int performOperation(int num1, int num2) {
                return 0;
            }

            @Override
            public void AddOperation() {

            }

            @Override
            public void SubtractOperation() {

            }

            @Override
            public void MultiplyOperation() {

            }
        });
        System.out.println(contextMultiply.execute(4, 25)); // Expects 100
    }

    @Override
    public int performOperation(int num1, int num2) {
        return 0;
    }

    @Override
    public void AddOperation() {

    }

    @Override
    public void SubtractOperation() {

    }

    @Override
    public void MultiplyOperation() {

    }
}
