package postcodes.io;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFactory {
    private JSONObject postcodeJSON;

    public JSONObject getPostcodeJSON() {
        return postcodeJSON;
    }
    public void setPostcodeJSON(String postcodeJSONString){
        try {
            JSONParser jsonParser = new JSONParser ();
            this.postcodeJSON = (JSONObject) jsonParser.parse(postcodeJSONString);
        } catch (ParseException e) {
            e.printStackTrace ();
        }
    }
}
