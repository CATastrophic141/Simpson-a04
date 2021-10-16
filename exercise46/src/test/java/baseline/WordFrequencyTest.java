package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {
    @Test
    void testIntValOfA(){
        WordFrequency freqTest = new WordFrequency();
        File fileIn = new File("./data/testIn.txt");
        freqTest.countWords(fileIn);
        int actualOfA = freqTest.wordCount.get("A");
        assertEquals(5, actualOfA);
    }

    @Test
    void testIntValOfB(){
        WordFrequency freqTest = new WordFrequency();
        File fileIn = new File("./data/testIn.txt");
        freqTest.countWords(fileIn);
        int actualOfB = freqTest.wordCount.get("B");
        assertEquals(6, actualOfB);
    }

    @Test
    void testIntValOfC(){
        WordFrequency freqTest = new WordFrequency();
        File fileIn = new File("./data/testIn.txt");
        freqTest.countWords(fileIn);
        int actualOfC = freqTest.wordCount.get("C");
        assertEquals(4, actualOfC);
    }
}