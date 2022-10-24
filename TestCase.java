import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {
	
	write wt=new write(null);
	
	Main main=new Main();
	@Test
	void test() {
		wt.run();
		wt.getClass();
		Main.main(null);
		
		main.main(null);
	}

}
