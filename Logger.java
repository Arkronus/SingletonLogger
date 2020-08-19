import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger;

    private Logger() {}

    public void log(String msg){
        String sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        System.out.printf("[%s %d] %s%n", sdf, num++, msg);
    }

    public static Logger getLogger(){
        if (logger == null) logger = new Logger();
        return logger;
    }

}
