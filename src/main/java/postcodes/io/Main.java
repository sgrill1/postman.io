package postcodes.io;

public class Main
{
    public static void main( String[] args )
    {
        FixerHTTPManager fixerHTTPManager = new FixerHTTPManager ();
        fixerHTTPManager.setPostcodes();
        System.out.println (fixerHTTPManager.getPostcodes ());
    }
}
