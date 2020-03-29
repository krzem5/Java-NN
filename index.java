import com.krzem.NN.NeuralNetwork;



public class index{
	public static void main(String[] args){
		NeuralNetwork nn=new NeuralNetwork(2,new int[]{4},1,7.5e-3);
		// NeuralNetwork nn=NeuralNetwork.fromFile("./data.nn-data");
		double[][][] D={{{0,0},{0}},{{0,1},{1}},{{1,0},{1}},{{1,1},{0}}};
		nn.train_multiple(D,D,200000,0,100,true);
		System.out.println(nn.acc(D));
		nn.toFile("./data2.nn-data");
	}
}