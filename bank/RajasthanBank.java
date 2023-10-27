package java_calsses.bank;

public class RajasthanBank {

	public static void main(String[] args) throws InsufficientFundException {
		TranctionController tc = new TranctionController();
		while (true) {
			try {
				tc.startTranction();
			} catch (InvalidAnountException e) {
				e.printStackTrace();
			} catch (InsufficientFundException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
