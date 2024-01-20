package jsonparser;

import jsonparser.data.JSON;
import jsonparser.parser.JsonParser;
import jsonparser.parser.NaiveJsonParser;
import jsonparser.tokenizer.NaiveTokenizer;

public class Main {

    public static void main(String[] args) {
        JsonParser parser = new NaiveJsonParser(new NaiveTokenizer());
        String jsonText = "{" +
                "\"name\" : \"Shreyash\"," +
                "\"age\" : \"26\"," +
                "\"report-cards\" : {" +
                "\"sem-1\" : {" +
                "\"cgpa\" : \"9.7\"," +
                "\"Theory\" : {" +
                "\"DSA\" : \"A\"," +
                "\"Discrete Maths\" : \"A-\"," +
                "\"Computer Graphics\" : \"B\"," +
                "}," +
                "\"Lab\" : {" +
                "\"DSA\" : \"A+\"," +
                "\"Microprocessors\" : \"B-\"," +
                "\"Computer Graphics\" : \"B\"," +
                "}" +
                "}," +
                "\"sem-2\" : {" +
                "\"cgpa\" : \"9.9\"," +
                "\"Theory\" : {" +
                "\"Computer Arch\" : \"A+\"," +
                "\"Numerical Methods\" : \"A+\"," +
                "}," +
                "\"Lab\" : {" +
                "\"DSA\" : \"A+\"," +
                "\"Computer Arch\" : \"A+\"," +
                "\"Parallel Computing\" : \"A+\"," +
                "}" +
                "}" +
                "}" +
                "}";
        JSON json = parser.parse(jsonText);
        System.out.println(parser.toString(json.get("report-cards").get("sem-1").get("cgpa")));

    }

}
