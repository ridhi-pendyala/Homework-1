import static org.junit.jupiter.api.Assertions.*;

class PritheeTest {

    @org.junit.jupiter.api.Test
    void getWord() {

        String[] testwords = {"Two", "households", "both", "alike"};
        int stop = 2;

        Prithee p = new Prithee(testwords, stop);
        String result = p.getWord();
        assertEquals("both", result);
    }
}