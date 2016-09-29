package _13_Friends;

public class _friends_object {

	public static void main(String[] args) {
	
	
	// i would like to see an Array setup in the Class
	// i would like to see the Array called in the inatancianion
	
	
	Friends emilyHathway = new Friends();
	
	emilyHathway.height=54;
	emilyHathway.colorEyes = "Brown";
	emilyHathway.colorHair = "Brown";
	emilyHathway.firstName = "Emily";
	emilyHathway.lastName = "Hathway";
	emilyHathway.relationShip = "Daugher";
	emilyHathway.profession = "Teacher";
	
	
	Friends james = new Friends();
	//TODO: Comment this out.
	james.name = "James";
	james.isOnline = true;
	james.numYearsFriends = 1;
	james.currCity = "Fishers";
	james.hometown = "Orland";
	james.cityCheck();
	james.school = "Anderson University";
	james.getSchool();
	
	Friends danielle = new Friends();
	danielle.isOnline = true;
	danielle.name = "Danielle";
	
	danielle.onlineCheck();
	james.onlineCheck();
	
	
	
	james.printYearsFriends();
	
	Friends karl = new Friends();
	karl.name = "Karl";
	karl.numYearsFriends = 20;
	karl.printYearsFriends();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
	
	
}
