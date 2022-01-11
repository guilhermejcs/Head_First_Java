package cap11.pag236;

public class TestExceptions_Yes {
    public static void main(String[] args) {
        String test = "yes";
        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } catch (ScaryException se){
            System.out.println("scary exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end o main");
    }
    static void doRisky(String test) throws ScaryException{
    System.out.println("start risky");
    if("yes".equals(test)){
        throw new ScaryException();
    }
        System.out.println("end risky");
    return;
    }
}
/*
SAÍDA:
start try
start risky
scary exception
finally
end o main
 */