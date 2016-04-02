/***********************************************************************
 * Module:  Employe.java
 * Author:  afpa
 * Purpose: Defines the Class Employe
 ***********************************************************************/

import java.util.*;

/** @pdOid 5b37227e-7544-42a8-8020-5d7ec60ce7f0 */
public class Employe extends Utilisateur {
   /** @pdOid 96aa9f2d-bd24-4c76-85f5-1c01a9b18e2d */
   private double idEmploye;
   
   /** @pdOid 89c3c59a-8494-4234-934b-e90052dade92 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 0009c458-00d1-4899-b95a-9ed224d2de95 */
   public double getIdEmploye() {
      return idEmploye;
   }
   
   /** @param newIdEmploye
    * @pdOid 7ec988ce-8c82-435d-a28d-3cc18a8c851b */
   public void setIdEmploye(double newIdEmploye) {
      idEmploye = newIdEmploye;
   }
   
   /** @pdOid 2594ba2a-7828-4514-bc64-5d28a900d3ea */
   public Employe() {
      // TODO: implement
   }

}