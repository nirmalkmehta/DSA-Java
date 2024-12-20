
public class BuldingFloor {
	
	//Floor 0 : flat num 1 to 12 : 12 flats
	//Floor 1 : flat num 13 to 19 : 7 flats
	//Floor 2 : flat num 20 to 31 : 12 flats
	//Floor 3 : flat num 32 to 38 : 7 flats
	//
	//...continued
	
	public static int getFloor(int flatNum) {
		System.out.print("Your flat number is : "+flatNum +"  AND ");
		int floorNum = 0;
		if(flatNum<=12) {
			floorNum=0;
		}else if (flatNum>12 && flatNum<=19){
			floorNum=1;
		} else {
			int check = flatNum%19;
			if(check==0) {
				floorNum=(flatNum/19)+1;
			}else if(check<=12){
				floorNum=(flatNum/19)+1;
			}else if(check>12 && check <19) {
				floorNum=(flatNum/19)+1;
			}
		}
		
		///wrong result -- correct it
		
		return floorNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("You are on floor number : "+getFloor(3) );
		System.out.println("You are on floor number : "+getFloor(13) );
		System.out.println("You are on floor number : "+getFloor(19) );
		System.out.println("You are on floor number : "+getFloor(26) );
		System.out.println("You are on floor number : "+getFloor(31) );
		System.out.println("You are on floor number : "+getFloor(38) );
		System.out.println("You are on floor number : "+getFloor(39) );
		System.out.println("You are on floor number : "+getFloor(57) );
		

	}

}
