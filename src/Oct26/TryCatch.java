package Oct26;

import java.util.Locale;

public class TryCatch {

public static void main (String[] args)
{
    String s1 = "Toronto";
    s1 = null;

    try {
        String lowercase = s1.toLowerCase();
        System.out.println("Hello");
        System.out.println(lowercase);
    }

    catch (NullPointerException ne)
    {
        ne.printStackTrace();
    }
    catch (Exception ex)
    {
        ex.printStackTrace();
    }

}


}
