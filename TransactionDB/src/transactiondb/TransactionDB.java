 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transactiondb;

import java.sql.Connection;

/**
 *
 * @author wuser
 */
public abstract class TransactionDB<T>{
       private T pojo;
       public TransactionDB(T t){
           t = pojo;
       }
       public abstract boolean execute(Connection db);
}
