package controllerrs.fabric;

import controllerrs.SendController;
import controllerrs.api.ISendController;

public class SendControllerSingleton {
    private static volatile ISendController instance;

    private SendControllerSingleton() {
    }

    public static ISendController getInstance(){
        if(instance==null){
            synchronized (SendControllerSingleton.class){
                if(instance==null){
                    instance = new SendController();
                }
            }
        }
        return instance;
    }
}
