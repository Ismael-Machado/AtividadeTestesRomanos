import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class TestRomano {
    ConverteRomano rom;

    @Before
    public void setUp() {
        rom = new ConverteRomano();
    }

    @Test
    public void testUmAlgarismo() {
        assertEquals(1, rom.romanoEmInteiro("I"));
        assertEquals(5, rom.romanoEmInteiro("V"));
        assertEquals(10, rom.romanoEmInteiro("X"));
        assertEquals(50, rom.romanoEmInteiro("L"));
        assertEquals(100, rom.romanoEmInteiro("C"));
        assertEquals(500, rom.romanoEmInteiro("D"));
        assertEquals(1000, rom.romanoEmInteiro("M"));
    }

    @Test
    public void testAlgarismoIgual() {
        assertEquals(3, rom.romanoEmInteiro("III"));
        assertEquals(20, rom.romanoEmInteiro("XX"));
        assertEquals(300, rom.romanoEmInteiro("CCC"));
    }

    @Test
    public void testAlgarismoDiferente() {
        assertEquals(8, rom.romanoEmInteiro("VIII"));
        assertEquals(27, rom.romanoEmInteiro("XXVII"));
        assertEquals(3999, rom.romanoEmInteiro("MMMCMXCIX"));
    }

    @Test
    public void testNotacaoSubtrativa() {
        assertEquals(4, rom.romanoEmInteiro("IV"));
        assertEquals(9, rom.romanoEmInteiro("IX"));
        assertEquals(14, rom.romanoEmInteiro("XIV"));
        assertEquals(40, rom.romanoEmInteiro("XL"));
        assertEquals(90, rom.romanoEmInteiro("XC"));
        assertEquals(400, rom.romanoEmInteiro("CD"));
        assertEquals(900, rom.romanoEmInteiro("CM"));
    }

    @Test
    public void testAlgarismoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> rom.romanoEmInteiro(null));
        assertThrows(IllegalArgumentException.class, () -> rom.romanoEmInteiro(""));
        
    }
}
