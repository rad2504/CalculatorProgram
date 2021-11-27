public class Calculator {
    public int add(int input1,int input2)
    {
        return input1+input2;
    }

    public int subtraction(int input1, int input2) {
        return input1-input2;
    }

    public int multiply(int input1, int input2) {
        return input1*input2;
    }

    public int division(int input1, int input2) {
        if(input1==0 || input2==0)
        {
            throw new IllegalArgumentException("Number Cant be Divided By Zero);
        }
        return input1/input2;

    }
}
