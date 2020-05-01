package utilities;

public class Logger {

    public Logger() { }
//
//    public static final String LOG_STYLE	= "color : purple; font-weight: bold;";
//    public static final String DATA_STYLE 	= "color : magenta; font-weight: bold;";
//    public static final String VERIFY_STYLE	= "color : green; font-weight: bold;";
//    public static final String ERROR_STYLE 	= "color : red; font-weight: bold;";
//    public static final String INFO_STYLE 	= "color : blue; font-weight: bold;";

    public void step(String text) {
        System.out.println("STEP —" + " " + text);
    }

    public void info(String text) {
        System.out.println("INFO — " + text);
    }

    public void error(String text) {
        System.out.println("ERROR — " + text);
    }


//    private static String formatAssertion(String text){
//        return String.format(VERIFY_STYLE, text);
//    }
//
//    private static String formatData(String text) {
//        return String.format(DATA_STYLE, text);
//    }
//
//    private static String formatInfo(String text) {
//        return String.format(INFO_STYLE, text);
//    }
//
//    private static String formatLog(String text) {
//        return String.format(LOG_STYLE, text);
//    }
//
//    private static String formatError(String text){
//        return String.format(ERROR_STYLE, text);
//    }
}

