package Module6_GenericMethods.L1exercise1;

public class NoGenericMethods {
    private String arg1;
    private String arg2;
    private String arg3;

    public NoGenericMethods(String arg1, String arg2, String arg3){
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public String getArg1(){
        return this.arg1;
    }
    public String getArg2(){
        return this.arg2;
    }
    public String getArg3() {
        return this.arg3;
    }

    public void setArg1(String arg1){
        this.arg1 = arg1;
    }
    public void setArg2(String arg2){
        this.arg2 = arg2;
    }
    public void setArg3(String arg3){
        this.arg3 = arg3;
    }

    public String toString(){
        return "arg1: " + this.arg1 + "\n" +
                "arg2: " + this.arg2 + "\n" +
                "arg3: " + this.arg3;
    }
}
