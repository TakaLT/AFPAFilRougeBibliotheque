/***********************************************************************
 * Module:  Contrainte.java
 * Author:  afpa
 * Purpose: Defines the Class Contrainte
 ***********************************************************************/

import java.util.*;

/** @pdOid 99a0eadb-e70d-4392-8466-ef123b094175 */
public class Contrainte {
   /** @pdOid ba146312-cba9-46c2-8fa7-30222f4d6d6e */
   private double idContrainte;
   /** @pdOid 5476e5f9-e968-4ed9-bd6e-7cbc0d8584f6 */
   private int dureePretMax = 0;
   /** @pdOid 8b8db963-6f00-47ab-b504-602fa6d37f7c */
   private int limiteEmprunt = 0;
   /** @pdOid acf7e259-9866-4fb8-9080-39e424b1d8de */
   private int limiteCotisation;
   
   /** @pdOid 1b43f884-6fab-4291-8945-3ab40ef9fcc9 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid fa4bb92e-9ba1-46b1-85eb-16b0a9b5b807 */
   public double getIdContrainte() {
      return idContrainte;
   }
   
   /** @param newIdContrainte
    * @pdOid dce939f5-3e28-4893-a5eb-7a76f15593cf */
   public void setIdContrainte(double newIdContrainte) {
      idContrainte = newIdContrainte;
   }
   
   /** @pdOid 55b26e03-ba36-4801-b407-5eaf5ea3c5b3 */
   public int getDureePretMax() {
      return dureePretMax;
   }
   
   /** @param newDureePretMax
    * @pdOid d68a4beb-101e-49b5-94a9-77678af65176 */
   public void setDureePretMax(int newDureePretMax) {
      dureePretMax = newDureePretMax;
   }
   
   /** @pdOid f6dd1145-cc7b-4454-9b7b-cbb4ce9db3da */
   public int getLimiteEmprunt() {
      return limiteEmprunt;
   }
   
   /** @param newLimiteEmprunt
    * @pdOid ffb8850b-27df-4782-8d47-6e1c2a859aab */
   public void setLimiteEmprunt(int newLimiteEmprunt) {
      limiteEmprunt = newLimiteEmprunt;
   }
   
   /** @pdOid 18819dcd-d7c9-4173-bfb9-c2db20ae02ed */
   public int getLimiteCotisation() {
      return limiteCotisation;
   }
   
   /** @param newLimiteCotisation
    * @pdOid 70b7e2f5-5d04-417d-a8a5-3a8ddbb309b3 */
   public void setLimiteCotisation(int newLimiteCotisation) {
      limiteCotisation = newLimiteCotisation;
   }
   
   /** @pdOid f623d4dc-a207-4c08-a811-93751ee90219 */
   public Contrainte() {
      // TODO: implement
   }

}