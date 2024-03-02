import java.util.List;

public class Main {


    //input for each test case
    static double [][] X= {
            {0,0},
            {1,0},
            {0,1},
            {1,1}
    };

    //output for each test case
    static double [][] Y= {
            {0},
            {0},
            {0},
            {1}
    };

    public static void main(String[] args) {
        //declare the neural network
        //first input is number of input nodes
        //second input is number of hidden nodes
        //third input is number of output nodes
        NeuralNetwork nn = new NeuralNetwork(2, 10, 1);

        //fits the neural network to the test cases given in X and Y
        nn.fit(X, Y, 50000);

        //example inputs
        double[][] input = {{0,1}, {0,0}};
        List<Double> output;

        //runs through each test input and prints the output
        for(double[] d : input) {
            //predict will return a list doubles where each element represents a node in the output layer
            output = nn.predict(d);
            System.out.println(output.toString());
        }
    }



}