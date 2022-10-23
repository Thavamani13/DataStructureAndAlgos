package contestproblems;

import org.junit.Test;

public class P15_DetermineTwoEventsHaveConflicts {
    
	@Test
	public void testcase1() {
		String[] event1 = new String[] { "01:15", "02:00" };
		String[] event2 = new String[] { "02:00", "03:00" };

		haveConflict(event1, event2);
	}
	@Test
	public void testcase2() {
		String[] event1 = new String[] { "01:00", "02:00" };
		String[] event2 = new String[] { "01:20", "03:00" };

		haveConflict(event1, event2);
	}
    
	@Test
	public void testcase3() {
		String[] event1 = new String[] { "10:00", "11:00" };
		String[] event2 = new String[] { "14:00", "15:00" };

		haveConflict(event1, event2);
	}

	private boolean haveConflict(String[] event1, String[] event2) {
		
		int e1 = event2[0].compareTo(event1[1]);
		int e2 = event2[1].compareTo(event1[0]);
		
		return (e1<=0) &&(e2>=0);

	}

}
