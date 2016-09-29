package _13_Friends;

public class Friends {

	int height;
	int weight;
	String colorHair;
	String colorEyes;
	int age;
	boolean maritalStatus;
	String firstName;
	String lastName;
	String profession;
	String hobbies;
	String relationShip;
	
	String name;
	String firstname;
	String lastname;
	String occupation;
	int highSchoolGradYear;
//	int age;
	int numYearsFriends;
	boolean isOnline;
	String response;
	String wallPost;
	String currCity;
	String hometown;
	boolean isMarried;
	String politicalParty;
	boolean isFriend;
	String school;
	
	
	//Methods

	public String getColorHair(){
		System.out.println(colorHair);
		return colorHair;
	}
	
	public boolean getMaritalStatus(){
		System.out.println(maritalStatus);
		return maritalStatus;
	}
	
	//Method  If  Else
		public void getIsFriend(){
			if(isFriend){
				System.out.println(name + " is your friend.");
			} else {
				System.out.println(name + " is not your friend. Would you like to add them?");
			}
		}
		
	//Method  If  Else
		public void onlineCheck(){
			if(isOnline){
				System.out.println(name + " is online.");
			} else {
				System.out.println(name + " is not online.");
			}
		}
		
		public void getSchool(){
			System.out.println(name + " goes to " + school);
		}
		
		
		
	// Method Switch	
		public void printYearsFriends(){
			switch(numYearsFriends){
				case 5:
					response = "You have been friends with " + name + "for " + numYearsFriends + " years";
					break;
				case 10:
					response = "You have been friends with " + name + "for " + numYearsFriends + " years";
					break;
				case 20:
					response = "You have been friends with " + name + "for " + numYearsFriends + " years";
					break;
				default:
					response = "White Castle is the best!";
					break;
			}
			System.out.println(response);
		}
		
		
		
		
	//Method  IF ELSE	
		
		public void cityCheck(){
			if(currCity != hometown){
				System.out.println(name + " has moved away from home.");
			}else{
				//TODO - female as a boolean
				//Nest an if else inside this else
				System.out.println(name + " is living in their hometown.");
			}
		}
		
		
		
		
		
	
		
		
	
}
