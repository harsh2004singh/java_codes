public class command{
    public static void main(String[] args) {
        if (args.length>0){
            System.out.println("Command line Argument");
            for (int i=0;i<args.length;i++){
                System.out.println("argument"+(i+1)+":"+args[i]) ;
            }
        }
        else{
            System.out.println("no command line arguments provided.");
        }
    }
}
