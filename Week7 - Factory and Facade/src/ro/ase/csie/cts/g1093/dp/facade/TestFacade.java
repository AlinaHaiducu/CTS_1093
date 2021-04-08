package ro.ase.csie.cts.g1093.dp.facade;

public class TestFacade {
	
	public static void main(String[] args) {
	//1. Create a game server instance and connect
	GameServer server = new GameServer();
	server.connect();
	
	//2. Create a login
	Login login = new Login ("player1", "1234");
	login.login();
	
	UserProfile userProfile = login.getUserProfile();
	
	String profile = userProfile.getProfile();
	
	String profile2 = UserAPIFacade.getUserProfile("player2", "123456");

}
}

