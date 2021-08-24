package interface_1410;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FriendTest {

	private Friend f = new Friend("Jane", 27, "sports");

	@Test
	@SuppressWarnings("unlikely-arg-type")
	void friend_initializesNameAgeAndHobby() {
		Friend f1 = new Friend("Caleb", 20, "dance");
		equals("Caleb");
	}
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void chill_returnsNamePlusMessage() {
		equals("Jane is chilling.?");
	}

	@Test
	@SuppressWarnings("unlikely-arg-type")
	void play_EmptyArray_ReturnsStringWithNoFriends() {
		Friend[] friends = new Friend[0];
		equals("[P|p]laying MUSIC.?");
	}

	@Test
	@SuppressWarnings("unlikely-arg-type")
	void play_1FriendInArray_ReturnsStringWith1Friends() {
		Friend[] friends = new Friend[] {
				new Friend("Billy", 75, "videogames")
				};
		equals("[P|p]laying MUSIC with Billy.?");
	}
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void play_2FriendsInArray_ReturnsStringWith2Friends() {
		Friend[] friends = new Friend[] {
				new Friend("Billy", 75, "dance"),
				new Friend("Riley", 43, "sports")
				};
		equals("[P|p]laying MUSIC with Billy and Riley.?");
	}
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void play_4FriendsInArray_ReturnsStringWith3Friends() {
		Friend[] friends = new Friend[] {
				new Friend("Billy", 75, "hike"),
				new Friend("Riley", 43, "sing"),
				new Friend("Ellie", 34, "instruments")
				};
		equals("[P|p]laying MUSIC with Billy, Riley, and Ellie.?");
	}	
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void play_4FriendsInArray_ReturnsStringWith4Friends() {
		Friend[] friends = new Friend[] {
				new Friend("Billy", 75, "videogames"),
				new Friend("Riley", 43, "dance"),
				new Friend("Ellie", 34, "sports"),
				new Friend("Jessie", 39, "hike")
				};
		equals("[P|p]laying MUSIC with Billy, Riley, Ellie, and Jessie.?");
	}
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void toString_returnsNameAgeInParenthesisAndHobby() {
		equals("Jamerson");
	}


}
