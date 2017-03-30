package C05;
import org.junit.*;
import static org.junit.Assert.*;

import java.awt.Color;

public class AutoTest {
	private Auto a;
	private Auto a2;
	@Before
	public void AutoTest(){
		a = new Auto();
	}	
	
	@Test
	public void testAuto(){
		Assert.assertEquals("Ford", a.getType());
	}
	@Test
	public void testAuto1(){
		Assert.assertEquals(Color.red, a.getFarbe());
	}
	@Test
	public void testAuto11(){
		Assert.assertEquals(160, a.getLeistung());
	}
	@Test( expected = IllegalArgumentException.class)
	public void testAuto2(){
		a2 = new Auto(" ", Color.BLUE, 4);
		
	}
	@Test( expected = IllegalArgumentException.class)
	public void testAuto3(){
		a.setFarbe(null);
		
		
	}
	@Test( expected = IllegalArgumentException.class)
	public void testAuto31(){
		a.setLeistung(0);
	}
	@Test
	public void testAuto311(){
		a.setLeistung(100);
		Assert.assertEquals(100, a.getLeistung());
	}
	@Test( expected = IllegalArgumentException.class)
	public void testAuto32(){
		a.setType(null);
	}
	@Test
	public void testAuto4(){
		
		Assert.assertEquals("Ford, rot, 160PS",a.toString());
	}
	@Test
	public void testAuto5(){
		a2 = new Auto("Ford", Color.black, 160);
		Assert.assertEquals("Ford, schwarz, 160PS",a2.toString());
	}
	@Test
	public void testAuto6(){
		a2 = new Auto("Ford", Color.white, 160);
		Assert.assertEquals("Ford, weiﬂ, 160PS",a2.toString());
	}
	
}


