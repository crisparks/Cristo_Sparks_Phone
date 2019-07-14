public class PhoneTester {

	public static void main(String[] args) {
		Galaxy meltDown = new Galaxy("Meltdown Special", 100, "Weyland-Yutani", "Bzz. Na! Na! Bzz.");
		IPhone ITrash2 = new IPhone("Shiny Trashbox", 100, "ComStar", "Ring-A-Ding-Ding.");
		
		meltDown.displayInfo();
		System.out.println(meltDown.ring());
		System.out.println(meltDown.unlock());
		
		ITrash2.displayInfo();
		System.out.println(ITrash2.ring());
		System.out.println(ITrash2.unlock());
	}

}