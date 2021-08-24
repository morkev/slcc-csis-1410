package labInterface;

import org.junit.jupiter.api.Test;

class BirdTest {

	@Test
	void testClassName() {
		equals(Bird.class);
	}
	@Test
	void testLaunch() {
		equals("time to launch, baby");
	}
	@Test
	void testLand() {
		equals("landing, yeah");
	}
	@Test
	void testToString() {
		equals(toString());
	}
}

class HanggliderTest {
	
	@Test
	void testPlane() {
		equals(Bird.class);
	}
	@Test
	void testLaunch() {
		equals("i Am N0t sURe IF We shOulD G0");
	}
	@Test
	void testLand() {
		equals("hope this goes well!");
	}
	@Test
	void testToString() {
		equals(toString());
	}
	@Test
	void testIsRigidWing() {
		equals("landing, yeah");
	}
}

class PlaneTest {

	@Test
	void testPlane() {
		equals(Bird.class);
	}
	@Test
	void testLaunch() {
		equals("moving the wing, chicken wings");
	}
	@Test
	void testLand() {
		equals("landing safefly");
	}
	@Test
	void testToString() {
		equals(toString());
	}
}