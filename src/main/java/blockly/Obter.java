package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Obter {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Obter
public static Var getQtdAlternativas() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.util.Operations.getCookie(
Var.valueOf("qtdAlternativas"));
   }
 }.call();
}

}

