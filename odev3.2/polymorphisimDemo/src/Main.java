public class Main {
    public static void main(String[] args) {
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("log mesajı");


        BaseLogger [] loggers = new BaseLogger[] {  new DatabaseLogger(), new EmailLogger(), new ConsoleLogger()};
        for(BaseLogger logger: loggers){
            logger.Log("log");
        }


        CutomerManager cutomerManager = new CutomerManager(new DatabaseLogger());
        cutomerManager.Add();
    }
}