
public class NumberPrcoesser {
	
	int data;
	
	public NumberPrcoesser(){
		data = 7;
	}
	
	public void addAndPrint(){
		System.out.println(data + 7);
	}
	
	public static void main(String[] arr) {
		
		NumberPrcoesser reference1 = new NumberPrcoesser();
		reference1.addAndPrint();

		NumberPrcoesser reference2 = new NumberPrcoesser();
		reference2.data = 9;
		reference2.addAndPrint();
	}
}