import org.junit.Test;
import static org.junit.Assert.*;
public class TestoffByN {
    static CharacterComparator OffByN = new OffByN(5);

    @Test
    public void TestequalChars() {
        assertTrue(OffByN.equalChars('f', 'a'));

        assertTrue(OffByN.equalChars('a', 'f'));

        assertFalse(OffByN.equalChars('h', 'f'));
    }
}
