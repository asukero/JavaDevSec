

public class Main {

    public static void main(String[] args) {
        try{
            Exo1.evalScript(args[1]);
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
