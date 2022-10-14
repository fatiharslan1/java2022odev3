public class CutomerManager {
    private BaseLogger logger;

    public CutomerManager(BaseLogger logger){
        this.logger = logger;

    }
    public void Add(){
        System.out.println("müşteri eklendi");
        this.logger.Log("log mesajı");
    }
}
