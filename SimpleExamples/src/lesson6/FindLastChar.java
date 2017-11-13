package lesson6;

/**
 *
 * @author padou
 */
public class FindLastChar {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        StringBuilder buffer2 = new StringBuilder("10hel10lo10");
//        System.out.println(findLastChar(buffer2, '0')); 
//    }
    
    private static int findLastChar(StringBuilder buffer, char c){
        int next  = 0;
        int current=0;
        do{
            current = next;
            next = buffer.toString().indexOf(c, next+1);
        }while(next != -1);
        return current;
    }
}
