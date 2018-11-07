package postcodes.io;

import org.json.simple.JSONObject;

public class FixedPostcodeParser {
    private JSONObject postcodeJSON;
    private JSONObject postcodeResults = new JSONObject();

    FixedPostcodeParser(){
        FixerHTTPManager fixerHTTPManager = new FixerHTTPManager ();
        fixerHTTPManager.setPostcodes ();
        JSONFactory jsonFactory = new JSONFactory ();
        jsonFactory.setPostcodeJSON(fixerHTTPManager.getPostcodes());
        postcodeJSON = jsonFactory.getPostcodeJSON ();
        postcodeResults = getResultJSONObject ();
    }
    public JSONObject getResultJSONObject(){  return (JSONObject) postcodeJSON.get("result");}
    public String getNuts(){return(String) postcodeResults.get("nuts");}




}





