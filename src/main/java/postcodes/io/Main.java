package postcodes.io;

public class Main
{
    public static void main( String[] args )
    {
        FixerHTTPManager fixerHTTPManager = new FixerHTTPManager ();
        fixerHTTPManager.setPostcodes();
        JSONFactory jsonFactory = new JSONFactory ();

        jsonFactory.setPostcodeJSON(fixerHTTPManager.getPostcodes ());
        System.out.println (jsonFactory.getPostcodeJSON().getClass ());



    }
}
