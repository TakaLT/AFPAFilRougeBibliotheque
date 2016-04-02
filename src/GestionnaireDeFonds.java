/***********************************************************************
 * Module:  GestionnaireDeFonds.java
 * Author:  afpa
 * Purpose: Defines the Class GestionnaireDeFonds
 ***********************************************************************/

import java.util.*;

/** @pdOid 1c556faf-23ec-438c-9099-cdffa355f7cc */
public class GestionnaireDeFonds extends Employe {
   /** @pdOid 4686e06b-5bb6-4a7f-a961-ecea51894c7d */
   private double idGestionnaire;
   
   /** @pdOid cef6dbcc-0590-494c-9522-775c3a663ee9 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 0f0a3564-10da-4ff8-aa67-0e5097fe31b2 */
   public double getIdGestionnaire() {
      return idGestionnaire;
   }
   
   /** @param newIdGestionnaire
    * @pdOid d2f5c076-9577-4c0a-8659-ec22bb5f3e02 */
   public void setIdGestionnaire(double newIdGestionnaire) {
      idGestionnaire = newIdGestionnaire;
   }
   
   /** @pdOid 28bac7d2-9021-4aa8-b8ab-228c07152fba */
   public GestionnaireDeFonds() {
      // TODO: implement
   }

}