package week1.day1;

public class phone
{
	    String mobileBrandName="poco";
		char mobileLogo='M';
		short noOfMobilePiece=11;
		int modelNumber=505919;
		long mobileImeiNumber=744857408;
		float mobilePrice=16000f;
		boolean isDamaged =false;
	public static void main(String[] args) 
	{
		phone mbl=new phone();
		System.out.println("Mobile Brand Name : "+ mbl.mobileBrandName);
		System.out.println("Mobile Logo : "+mbl.mobileLogo);
		System.out.println("No of Mobile Piece : "+mbl.noOfMobilePiece);
		System.out.println("Model Number : "+mbl.modelNumber);
		System.out.println("Mobile IMEI Number : "+mbl.mobileImeiNumber);
		System.out.println("Mobile Price : "+mbl.mobilePrice);
		System.out.println("Is mobile damaged : "+mbl.isDamaged);
	}

}
