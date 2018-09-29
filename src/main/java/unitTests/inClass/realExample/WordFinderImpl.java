package unitTests.inClass.realExample;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class WordFinderImpl implements WordFinder {
    @Override
    public Set<String> getSentences(URL resource) {
        return new HashSet<>();
    }

    @Override
    public boolean checkIfWordInSentence(String sentence, String word) {
        return false;
    }

    @Override
    public void writeSentenceToResult(String sentence) {

    }
}
