class Logger{
    private static Logger instance;
    
    private Logger(){
        System.out.println("Logger Initializer");
    }
    
    public static Logger getInstance(){
        if(instance==null)
            instance=new Logger();
        return instance;
    }
    
    public void log(String message){
        System.out.println("Log: "+message);
    }
    
}


class Singleton_Pattern {
    public static void main(String[] args) {
        Logger L1=Logger.getInstance();
        Logger L2=Logger.getInstance();
        L1.log("This is the Message from Logger 1");
        L2.log("This is the Message from Logger 2");
        if(L1==L2)
            System.out.println("Both the Logger 1 and Logger 2 are of Same instance");
        else
            System.out.println("Bother the Logger 1 and Logger 2 are of Different instance");
    }
}