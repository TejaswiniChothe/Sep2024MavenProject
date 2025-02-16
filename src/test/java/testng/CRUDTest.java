package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUDTest {

	// create - get -- update -- delete
	// AAA --> Arrange -- ACT --- Assertion

	public int createUser() {
		System.out.println("create user");
		return 100;
	}

	public String getUSerInfo(int userId) {
		return "user info";
	}

	public String updateUserInfo(int userId) {
		return "updated user info";
	}

	public String deleteUserInfo(int userId) {
		return "user is not found 404 error";
	}

	@Test
	public void createUserTest() {
		int userId = createUser();
		Assert.assertEquals(userId, 100);
	}

	@Test
	public void getUserTest() {
		// create ---> userId --> getUser(userId)
		int userId = createUser();
		String userInfo = getUSerInfo(userId);
		Assert.assertEquals(userInfo, "user info");
	}

	@Test
	public void updateUserTest() {
		// create ---> userId -->updateUser(userId)-->getUser(userID)
		int userId = createUser();
		String updatedInfo = updateUserInfo(userId);
		String userInfo = getUSerInfo(userId);
		Assert.assertTrue(updatedInfo.contains(userInfo));
	}

	@Test
	public void deleteUserTest() {
		// create ---> userId -->deleteUser(userId)--user not found
		int userId = createUser();
		String mesg = deleteUserInfo(userId);
		Assert.assertTrue(mesg.contains("404"));
	}

}
