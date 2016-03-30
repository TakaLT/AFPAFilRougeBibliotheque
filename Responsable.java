/***********************************************************************
 * Module:  Responsable.java
 * Author:  afpa
 * Purpose: Defines the Class Responsable
 ***********************************************************************/

import java.util.*;

/** @pdOid c344ab46-1a1d-4282-8382-c52e6853ad60 */
public class Responsable extends Employe {
   /** @pdOid ef95c48d-cc9f-4843-b589-28edb5d3b129 */
   private double idRresponsable;
   
   /** @pdOid 4423819c-f0ba-478c-8d19-ea4ead1098d5 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid fffd55af-2bca-46b7-855f-b82a6264ab68 */
   public double getIdRresponsable() {
      return idRresponsable;
   }
   
   /** @param newIdRresponsable
    * @pdOid 39908d49-0d68-4c8f-9d6f-5aa9f7719181 */
   public void setIdRresponsable(double newIdRresponsable) {
      idRresponsable = newIdRresponsable;
   }
   
   /** @pdOid 676aa827-d117-461c-b124-bcc816c74a8d */
   public Responsable() {
      // TODO: implement
   }

}