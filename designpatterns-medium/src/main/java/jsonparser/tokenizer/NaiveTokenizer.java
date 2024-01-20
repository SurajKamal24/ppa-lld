package jsonparser.tokenizer;

import jsonparser.data.KeyValuePair;
import jsonparser.data.StringConstants;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class NaiveTokenizer implements Tokenizer {
    @Override
    public List<KeyValuePair> tokenize(String text) {
        text = preProcess(text);
        int startIdex = 0, endIndx;
        List<String> keyValPairs = new ArrayList<>();
        while (text.length() > 0) {
            endIndx = getEndIndex(text);
            keyValPairs.add(text.substring(startIdex, endIndx));
            if (endIndx >= text.length()) break;
            text = text.substring(endIndx+1);
        }
        List<KeyValuePair> keyValueTokens = new ArrayList<>();
        for (String keyValuePair : keyValPairs) {
            int idx = keyValuePair.indexOf(StringConstants.COLON);
            String key = keyValuePair.substring(0, idx).trim().replaceAll(StringConstants.DOUBLE_QUOTES_STRING, StringConstants.EMPTY_STRING);
            String val = keyValuePair.substring(idx+1);
            keyValueTokens.add(new KeyValuePair(key, val));

        }
        return keyValueTokens;
    }

    private String preProcess(String text) {
        try {
            text = text.trim();
            text = text.substring(1, text.length() - 1);
            text = text.trim();
        } catch (Exception e) {
            throw new RuntimeException("Invalid text");
        }
        return text;
    }

    private int getEndIndex(String text) {
        int idx = text.indexOf(StringConstants.COLON);
        int endIdx = idx + 1;
        while (text.charAt(endIdx) == StringConstants.WHITE_SPACE)
            endIdx++;
        if (text.charAt(endIdx) == StringConstants.DOUBLE_QUOTES) {
            endIdx++;
            while (text.length() > endIdx && text.charAt(endIdx) != StringConstants.DOUBLE_QUOTES)
                endIdx++;
            endIdx++;
        } else if (text.charAt(endIdx) == StringConstants.STARTING_PARAN ) {
            int cnt = 1;
            endIdx++;
            while (cnt != 0 && text.length() > endIdx) {
                if (text.charAt(endIdx) == StringConstants.CLOSING_PARAN)
                    cnt--;
                else if (text.charAt(endIdx) == StringConstants.STARTING_PARAN)
                    cnt++;
                endIdx++;
            }
        } else {
            throw new RuntimeException("Illegal json");
        }
        while (endIdx < text.length() && text.charAt(endIdx) != StringConstants.COMMA)
            endIdx++;
        return endIdx;

    }
}
