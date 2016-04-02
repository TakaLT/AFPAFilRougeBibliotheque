/***********************************************************************
 * Module:  Emprunt.java
 * Author:  afpa
 * Purpose: Defines the Class Emprunt
 ***********************************************************************/

import java.util.*;

/** @pdOid 5e47f1d1-96f5-48fe-ae72-f88a6eccae09 */
public class Emprunt {
   /** @pdOid 9380a471-93b0-48f6-9f30-dc5b84df52fd */
   private double idEmprunt;
   /** @pdOid 437da123-9752-45ee-9ab9-7ccaee269419 */
   private double idEmprunteur;
   /** @pdOid e702db55-401d-4f59-8966-b5bfd82745dc */
   private java.util.Date date;
   /** @pdOid 107463fa-8c4d-4a6e-83ee-6b36c03f48fa */
   private java.util.Date dateRetour;
   
   /** @pdOid e2cabdd6-d4d0-488b-bc15-0da0ba45ad0e */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Livre assc=emprunter coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Livre> livre;
   
   /** @pdOid c023a5c8-f114-47a4-b1f6-69a69ed1ad7b */
   public double getIdEmprunt() {
      return idEmprunt;
   }
   
   /** @param newIdEmprunt
    * @pdOid 4e66928f-63c8-45a8-841b-6939909f0181 */
   public void setIdEmprunt(double newIdEmprunt) {
      idEmprunt = newIdEmprunt;
   }
   
   /** @pdOid 863ca468-ce42-402e-963d-55c323c7940a */
   public double getIdEmprunteur() {
      return idEmprunteur;
   }
   
   /** @param newIdEmprunteur
    * @pdOid d0a7e671-af28-4aaf-bcdb-4c1cbd7c3a49 */
   public void setIdEmprunteur(double newIdEmprunteur) {
      idEmprunteur = newIdEmprunteur;
   }
   
   /** @pdOid 6b5daf93-3474-4893-8e16-9036c32ddb61 */
   public java.util.Date getDate() {
      return date;
   }
   
   /** @param newDate
    * @pdOid 4a37ab76-cedb-4e23-abb6-be7c347110b7 */
   public void setDate(java.util.Date newDate) {
      date = newDate;
   }
   
   /** @pdOid ec477980-029d-4071-b1ab-d2c8b614392a */
   public java.util.Date getDateRetour() {
      return dateRetour;
   }
   
   /** @param newDateRetour
    * @pdOid 588a8570-26b7-43f4-ba36-6b031bb467fc */
   public void setDateRetour(java.util.Date newDateRetour) {
      dateRetour = newDateRetour;
   }
   
   /** @pdOid b7b26604-f5eb-4766-9899-98ed15948ede */
   public Emprunt() {
      // TODO: implement
   }
   
   /** @pdOid 08a71e59-fa4a-421a-b3ad-fe522455405f */
   public void EmprunterLivre() {
      // TODO: implement
   }
   
   /** @pdOid 00643df2-7933-4dfd-b197-cf47e7b1e1a8 */
   public boolean verificationCotisation() {
      // TODO: implement
      return false;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Livre> getLivre() {
      if (livre == null)
         livre = new java.util.HashSet<Livre>();
      return livre;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLivre() {
      if (livre == null)
         livre = new java.util.HashSet<Livre>();
      return livre.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLivre */
   public void setLivre(java.util.Collection<Livre> newLivre) {
      removeAllLivre();
      for (java.util.Iterator iter = newLivre.iterator(); iter.hasNext();)
         addLivre((Livre)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLivre */
   public void addLivre(Livre newLivre) {
      if (newLivre == null)
         return;
      if (this.livre == null)
         this.livre = new java.util.HashSet<Livre>();
      if (!this.livre.contains(newLivre))
      {
         this.livre.add(newLivre);
         newLivre.addEmprunt(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldLivre */
   public void removeLivre(Livre oldLivre) {
      if (oldLivre == null)
         return;
      if (this.livre != null)
         if (this.livre.contains(oldLivre))
         {
            this.livre.remove(oldLivre);
            oldLivre.removeEmprunt(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLivre() {
      if (livre != null)
      {
         Livre oldLivre;
         for (java.util.Iterator iter = getIteratorLivre(); iter.hasNext();)
         {
            oldLivre = (Livre)iter.next();
            iter.remove();
            oldLivre.removeEmprunt(this);
         }
      }
   }

}