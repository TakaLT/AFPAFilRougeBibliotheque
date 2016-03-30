/***********************************************************************
 * Module:  Bibliotheque.java
 * Author:  afpa
 * Purpose: Defines the Class Bibliotheque
 ***********************************************************************/

import java.util.*;

/** @pdOid becad73b-6e9f-4486-bf22-d4738498b1ac */
public class Bibliotheque {
   /** @pdOid ff5615dd-b30e-4667-9924-5f42f84088d0 */
   private double idBibliotheque;
   /** @pdOid dd13aaf4-c830-4bc7-a26b-de73e64b3f23 */
   private java.lang.String nom;
   /** @pdOid 98ed309b-3537-4388-b7c2-a658688e4fe6 */
   private java.lang.String codeBibliotheque;
   
   /** @pdOid 3f1020fd-4330-40b2-aabc-c357b2c3e55f */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Utilisateur assc=frequenter coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Utilisateur> utilisateur;
   /** @pdRoleInfo migr=no name=Emplacement assc=implanter coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Emplacement> emplacement;
   
   /** @pdOid 9d5fc546-d675-4c34-a200-9c5773a65716 */
   public double getIdBibliotheque() {
      return idBibliotheque;
   }
   
   /** @param newIdBibliotheque
    * @pdOid f93a306e-79bc-48f6-8338-0c1a0c06f311 */
   public void setIdBibliotheque(double newIdBibliotheque) {
      idBibliotheque = newIdBibliotheque;
   }
   
   /** @pdOid ff0b6f8b-1086-4465-838f-5a808f5b3e7b */
   public java.lang.String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 2e04dfce-a408-41f7-80bc-390eadb09174 */
   public void setNom(java.lang.String newNom) {
      nom = newNom;
   }
   
   /** @pdOid 7a7f4199-4841-4685-a688-e72dad8e98fd */
   public java.lang.String getCodeBibliotheque() {
      return codeBibliotheque;
   }
   
   /** @param newCodeBibliotheque
    * @pdOid d47a8bb9-5f3b-4104-a36d-022a21c3acce */
   public void setCodeBibliotheque(java.lang.String newCodeBibliotheque) {
      codeBibliotheque = newCodeBibliotheque;
   }
   
   /** @pdOid 6a45ec17-f57a-4a9a-b6c3-b66d79aa3978 */
   public Bibliotheque() {
      // TODO: implement
   }
   
   /** @pdOid 7f9b400c-bb86-4fe1-943f-cca3df6a3008 */
   public void addBibliotheque() {
      // TODO: implement
   }
   
   /** @pdOid 25979943-5841-49e9-bcc0-f88f96740e15 */
   public void supprimeBibliotheque() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Utilisateur> getUtilisateur() {
      if (utilisateur == null)
         utilisateur = new java.util.HashSet<Utilisateur>();
      return utilisateur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUtilisateur() {
      if (utilisateur == null)
         utilisateur = new java.util.HashSet<Utilisateur>();
      return utilisateur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUtilisateur */
   public void setUtilisateur(java.util.Collection<Utilisateur> newUtilisateur) {
      removeAllUtilisateur();
      for (java.util.Iterator iter = newUtilisateur.iterator(); iter.hasNext();)
         addUtilisateur((Utilisateur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUtilisateur */
   public void addUtilisateur(Utilisateur newUtilisateur) {
      if (newUtilisateur == null)
         return;
      if (this.utilisateur == null)
         this.utilisateur = new java.util.HashSet<Utilisateur>();
      if (!this.utilisateur.contains(newUtilisateur))
      {
         this.utilisateur.add(newUtilisateur);
         newUtilisateur.addBibliotheque(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldUtilisateur */
   public void removeUtilisateur(Utilisateur oldUtilisateur) {
      if (oldUtilisateur == null)
         return;
      if (this.utilisateur != null)
         if (this.utilisateur.contains(oldUtilisateur))
         {
            this.utilisateur.remove(oldUtilisateur);
            oldUtilisateur.removeBibliotheque(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUtilisateur() {
      if (utilisateur != null)
      {
         Utilisateur oldUtilisateur;
         for (java.util.Iterator iter = getIteratorUtilisateur(); iter.hasNext();)
         {
            oldUtilisateur = (Utilisateur)iter.next();
            iter.remove();
            oldUtilisateur.removeBibliotheque(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Emplacement> getEmplacement() {
      if (emplacement == null)
         emplacement = new java.util.HashSet<Emplacement>();
      return emplacement;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEmplacement() {
      if (emplacement == null)
         emplacement = new java.util.HashSet<Emplacement>();
      return emplacement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEmplacement */
   public void setEmplacement(java.util.Collection<Emplacement> newEmplacement) {
      removeAllEmplacement();
      for (java.util.Iterator iter = newEmplacement.iterator(); iter.hasNext();)
         addEmplacement((Emplacement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEmplacement */
   public void addEmplacement(Emplacement newEmplacement) {
      if (newEmplacement == null)
         return;
      if (this.emplacement == null)
         this.emplacement = new java.util.HashSet<Emplacement>();
      if (!this.emplacement.contains(newEmplacement))
         this.emplacement.add(newEmplacement);
   }
   
   /** @pdGenerated default remove
     * @param oldEmplacement */
   public void removeEmplacement(Emplacement oldEmplacement) {
      if (oldEmplacement == null)
         return;
      if (this.emplacement != null)
         if (this.emplacement.contains(oldEmplacement))
            this.emplacement.remove(oldEmplacement);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEmplacement() {
      if (emplacement != null)
         emplacement.clear();
   }

}