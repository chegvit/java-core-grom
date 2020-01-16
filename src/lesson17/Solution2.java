package lesson17;

public class Solution2 {
    public static void main(String[] args) {
   String adress = "http://privat24.com";
   String adress1 = "https://google.com";
   String adress3 = " http:// adaadad.net";

        System.out.println(validate(adress));
        System.out.println(validate(adress1));
        System.out.println(validate(adress3));
    }

    public static boolean validate(String adress){
        if( adress != null && getProtocol(adress) != null && checkAdressName(adress) && checkDomaineZone(adress)){
            return true;
        }
      return false;
    }
    private static String getProtocol(String adress) {
        String protocol1 = "http://";
        String protocol2 = "https://";
        if (adress.startsWith(protocol1)) {
            return protocol1;
        }
        if (adress.startsWith(protocol2)) {
            return protocol2;
        }
        return null;
    }
    private static boolean checkDomaineZone(String adress){
        String zone1 = ".com";
        String zone2 = ".net";
        String zone3 = ".org";
        String domaineZone = adress.substring(adress.length() - 4 );
        if(domaineZone.equals(zone1) || domaineZone.equals(zone2) || domaineZone.equals(zone3)) {
            return true;
        }
        return false;

        }
      private static boolean checkAdressName(String adress){
       String protocol = getProtocol(adress);
       if(protocol != null){
           adress = adress.replace(protocol , "");
           if(adress.startsWith("www.")){
               adress = adress.replace("www.", "");
           }
           adress = adress.substring(0, adress.length() - 4);
           return checkWord(adress);
       }
       return false;
      }
    private static boolean checkWord(String word) {
        char[] symbols = word.toLowerCase().toCharArray();
        for (char c : symbols) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }
    }

