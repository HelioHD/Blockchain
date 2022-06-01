import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Bloco> blockChain = new ArrayList<Bloco>();
		
		ArrayList<String> temp = new ArrayList<String>();

		temp.clear();
		temp.add("10 jr -> bob");
		temp.add("50 alice -> mary");
		temp.add("1 fuanlo -> ciucraco");
		blockChain.add(new Bloco("0000000000", "000123", 2, temp));
		
		temp.clear();
		temp.add("1 bob -> john");
		temp.add("3 bolsonaro -> lula");
		blockChain.add(new Bloco("000123", "000456", 17456, temp));
		
	}
}
	
