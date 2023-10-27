package java_calsses.bank;

import java.util.Scanner;

public class TranctionController {
	Scanner sc = new Scanner(System.in);
	private float avl_anount = 2000f;

	public void startTranction() throws InvalidAnountException, InsufficientFundException {
		System.out.println("Enter Amount");
		float req_anount = sc.nextFloat();
		if (req_anount <= 0) {
			throw new InvalidAnountException("Please Enter minimum 1 rupee ");
		} else {
			if (req_anount <= avl_anount) {
				System.out.println("you withroll " + req_anount + " successfully");
				avl_anount = avl_anount - req_anount;
				System.out.println("your avalavile balance is :" + avl_anount);
			}else throw new InsufficientFundException("insufficient anount in your account \n you have only :"+
				avl_anount+" rupee");
		}
	}
}
