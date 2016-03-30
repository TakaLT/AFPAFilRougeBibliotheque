/***********************************************************************
 * Module:  Utilisateur.java
 * Author:  afpa
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/

import java.util.*;

/** @pdOid f79a7da6-c8bf-4245-8f30-0f1230ee1ff7 */
public class Utilisateur {
   /** @pdOid 2cc31c79-0abf-4ce1-b084-2d6476b5e353 */
   private double idUtilisateur;
   /** @pdOid c67389a4-b739-4751-ab5f-8487d5cc0a04 */
   private java.lang.String motDePasse;
   /** @pdOid 8fb225fc-6033-4600-acbd-7fa28b1fe351 */
   private java.lang.String nom;
   /** @pdOid f700f853-f0aa-4636-a38e-dc4109f38b1f */
   private java.lang.String prenom;
   /** @pdOid d43ce763-f01b-43be-9ae4-f47144344354 */
   private int tel;
   /** @pdOid 6155af3e-20f4-40e1-b60d-986f3336f14d */
   private String adresse;
   
   /** @pdOid 5ca31b09-a2d6-478b-b8a2-46246da612ec */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Bibliotheque assc=frequenter coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Bibliotheque> bibliotheque;
   /** @pdRoleInfo migr=no name=Emprunt assc=prendre coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Emprunt> emprunt;
   
   /** @pdOid f295d686-c3bb-48b4-9154-5a4a7cedbdb6 */
   public double getIdUtilisateur() {
      return idUtilisateur;
   }
   
   /** @param newIdUtilisateur
    * @pdOid e634dec8-8197-4859-ae90-b10f1fd7eff5 */
   public void setIdUtilisateur(double newIdUtilisateur) {
      idUtilisateur = newIdUtilisateur;
   }
   
   /** @pdOid 90c92a30-d7ba-4d7f-8a4f-b43c232c12b9 */
   public java.lang.String getMotDePasse() {
      return motDePasse;
   }
   
   /** @param newMotDePasse
    * @pdOid 1646dae6-7e8b-4e7f-8b3c-7cc11290ddb9 */
   public void setMotDePasse(java.lang.String newMotDePasse) {
      motDePasse = newMotDePasse;
   }
   
   /** @pdOid af093874-e146-4e10-8c6f-090d99b02604 */
   public java.lang.String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid f9c8a252-c7f3-4031-a513-e856c2ee6e58 */
   public void setNom(java.lang.String newNom) {
      nom = newNom;
   }
   
   /** @pdOid 3fc57836-a340-4899-87fa-53f166deb64a */
   public java.lang.String getPrenom() {
      return prenom;
   }
   
   /** @param newPrenom
    * @pdOid 814804b3-0db9-43f7-8be5-c5703c069a16 */
   public void setPrenom(java.lang.String newPrenom) {
      prenom = newPrenom;
   }
   
   /** @pdOid beca9760-fa73-4386-8103-bebce31ad794 */
   public int getTel() {
      return tel;
   }
   
   /** @param newTel
    * @pdOid d1ba8f15-d016-45fa-8f46-b9ca79eb6e3e */
   public void setTel(int newTel) {
      tel = newTel;
   }
   
   /** @pdOid 97a85334-d1dc-468d-8db6-a3b8cc1a14cc */
   public Utilisateur() {
      // TODO: implement
   }
   
   /** @pdOid 6654eba9-9086-4142-97cc-f9ed61c544ce */
   public void ajoutUtilisateur() {
      // TODO: implement
   }
   
   /** @pdOid db3c4fdb-75d2-4348-a72b-3d71d2dba9d4 */
   public void supprimeUtilisateur() {
      // TODO: implement
   }
   
   /** @pdOid cf6a3bf5-6e24-4be5-969d-4254cc77d684 */
   public int modificationUtilisateur() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Bibliotheque> getBibliotheque() {
      if (bibliotheque == null)
         bibliotheque = new java.util.HashSet<Bibliotheque>();
      return bibliotheque;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBibliotheque() {
      if (bibliotheque == null)
         bibliotheque = new java.util.HashSet<Bibliotheque>();
      return bibliotheque.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBibliotheque */
   public void setBibliotheque(java.util.Collection<Bibliotheque> newBibliotheque) {
      removeAllBibliotheque();
      for (java.util.Iterator iter = newBibliotheque.iterator(); iter.hasNext();)
         addBibliotheque((Bibliotheque)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBibliotheque */
   public void addBibliotheque(Bibliotheque newBibliotheque) {
      if (newBibliotheque == null)
         return;
      if (this.bibliotheque == null)
         this.bibliotheque = new java.util.HashSet<Bibliotheque>();
      if (!this.bibliotheque.contains(newBibliotheque))
      {
         this.bibliotheque.add(newBibliotheque);
         newBibliotheque.addUtilisateur(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBibliotheque */
   public void removeBibliotheque(Bibliotheque oldBibliotheque) {
      if (oldBibliotheque == null)
         return;
      if (this.bibliotheque != null)
         if (this.bibliotheque.contains(oldBibliotheque))
         {
            this.bibliotheque.remove(oldBibliotheque);
            oldBibliotheque.removeUtilisateur(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBibliotheque() {
      if (bibliotheque != null)
      {
         Bibliotheque oldBibliotheque;
         for (java.util.Iterator iter = getIteratorBibliotheque(); iter.hasNext();)
         {
            oldBibliotheque = (Bibliotheque)iter.next();
            iter.remove();
            oldBibliotheque.removeUtilisateur(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Emprunt> getEmprunt() {
      if (emprunt == null)
         emprunt = new java.util.HashSet<Emprunt>();
      return emprunt;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEmprunt() {
      if (emprunt == null)
         emprunt = new java.util.HashSet<Emprunt>();
      return emprunt.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEmprunt */
   public void setEmprunt(java.util.Collection<Emprunt> newEmprunt) {
      removeAllEmprunt();
      for (java.util.Iterator iter = newEmprunt.iterator(); iter.hasNext();)
         addEmprunt((Emprunt)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEmprunt */
   public void addEmprunt(Emprunt newEmprunt) {
      if (newEmprunt == null)
         return;
      if (this.emprunt == null)
         this.emprunt = new java.util.HashSet<Emprunt>();
      if (!this.emprunt.contains(newEmprunt))
         this.emprunt.add(newEmprunt);
   }
   
   /** @pdGenerated default remove
     * @param oldEmprunt */
   public void removeEmprunt(Emprunt oldEmprunt) {
      if (oldEmprunt == null)
         return;
      if (this.emprunt != null)
         if (this.emprunt.contains(oldEmprunt))
            this.emprunt.remove(oldEmprunt);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEmprunt() {
      if (emprunt != null)
         emprunt.clear();
   }

}