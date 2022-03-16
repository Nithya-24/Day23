package userReg;

import static org.junit.Assert.*;
import org.junit.Test;

public class MoodAnalyserTest {

	MoodAnalyse emotion = new MoodAnalyse();

	/**
	 * If we created this test case to check if the user is happy.
	 * If happy then it will be true
	 */
    @Test
    public void givenMessage_WhenHappy_ReturnEntrySuccessful() {
        String result = emotion.moodAnalyse("User is Happy");
        assertEquals("Entry Successful", result);
    }

    /**
	 * If we created this test case to check if the user is sad.
	 */
    @Test
    public void givenMessage_WhenNotProper_ReturnEntryFailed() {
        String result = emotion.moodAnalyse("User is Sad");
        assertEquals("Entry Failed", result);
    }

}