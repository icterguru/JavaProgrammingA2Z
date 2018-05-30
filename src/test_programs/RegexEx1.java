package test_programs;


public class RegexEx1 {

	
	public static void main(String[] args){
		
		
		
		String xmaccounttext = "XFINITY Mobile Account # 1000000678";
		
		System.out.println("xmaccount text : " + xmaccounttext);
		
		
		String xmaccountno = xmaccounttext.substring(25);
		
		System.out.println("xmaccount no : " + xmaccountno);
		
		String paymentAuthCode = "Payment Auth Code 5173414932086005104011";
		
		System.out.println("Payment auth code : " + paymentAuthCode);
		
		String paymentAuthCodeNo = paymentAuthCode.substring(18);
		
	System.out.println("Payment Auth Code No displayed is: " +paymentAuthCodeNo);
					
	}
}
