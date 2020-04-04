package exceptions.ex1;

/**
 * @author cvoinea
 * exceptiile pot fi aruncate:
 * 	- de catre programator
 * 	- de codul importat din alte pachete, librarii etc
 * 	- de runtime environment
 *
 * Throwable in java.lang
 *    Error  -> unchecked exceptions
 *       StackOverflowError
 *
 *    Exception -> checked exception (compile-time) - checkedby the compiler, if not treated, code will not compile
 *  		IOException (java.io), SQLException (java.sql)
 *          RuntimeException -> unchecked exception (runtime)
 *           		NPE, IndexOutOfBoundsException, ArithmeticException, IllegalArgumentException (NumberFormatException), ClassCastException *
 *
 *   de regula se definesc in aceleasi pachete cu clasele care le genereaza (in special cele checked)
 */
public class Test1 {
    public static void main(String[] args) {
        try {
//			System.out.println("exiting before catch and finally");
//			System.exit(0);  //
            m1();
            Object obj = new Object();
            // ClassCastException
            String s = (String) obj;
            System.out.println(s);
        }catch (StackOverflowError exc){ // putem folosi acelasi nume de variabila, au scope diferit
            System.out.println(exc);
//			obj = "";  // nu poatefi folosita aici, out of scope
//			System.exit(0); // nu se mai executa finally
            return;
        }catch (ClassCastException exc){
            System.out.println(exc);
        }
        finally {
            // se executa chiar daca avem return in try sau catch
            // nu se executa cand apelam System.exit(0) sau posibil cand avem un OutOfMemoryException
            System.out.println("in finally");
        }
    }
    // throws StackOverflowError
    public static void m1(){
        m1();
    }
}
