/**
 * 
 */
package context;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

public class FileContext {
  public static void main(String[] args) throws Exception {
    Hashtable env = new Hashtable();
    env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
    env.put(Context.PROVIDER_URL, "file:/workspace/PEPUI_Dummy/");

    Object item = null;

    Context initCtx = new InitialContext(env);
/*    NamingEnumeration nl = initCtx.list("ReadText.txt");

    if (nl == null)
      System.out.println("\nNo items in name list");
    else
      while (nl.hasMore()) {
        item = nl.next();
        System.out.println("item's class is " + item.getClass().getName());
        System.out.println(item);
        System.out.println("");
      }
*/    
    File f = (File) initCtx.lookup("ReadText.txt");
    if (f != null) {
      BufferedReader br = new BufferedReader(new FileReader(f));
      String l = null;
      while ((l = br.readLine()) != null)
        System.out.println(l);
    }
    
  }
}
