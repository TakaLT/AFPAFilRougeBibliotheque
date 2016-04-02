/***********************************************************************
 * Module:  Livre.java
 * Author:  afpa
 * Purpose: Defines the Class Livre
 ***********************************************************************/

import java.util.*;

/** @pdOid e8b38f04-c9db-4a13-b3df-ebfed8f09d4e */
public class Livre {
   /** @pdOid 7cb354f3-b386-46e4-904f-4b6db96fcd1c */
   private double idLivre;
   /** @pdOid 3621f192-b7a6-47bf-80dd-a38e613e356e */
   private java.lang.String titre;
   /** @pdOid a367c34d-3a2b-4fc8-87d7-5e5a77acbcb1 */
   private java.lang.String isbn;
   /** @pdOid 86584498-70a9-4344-a782-fb072e02b8a6 */
   private java.lang.String codeExemplaire;
   /** @pdOid 3bc76b4c-98dd-457a-bf3e-9820f07ff03e */
   private java.lang.String commentaire;
   /** @pdOid 9f440a60-4995-4427-a502-42fcf5b6fedb */
   private <EnumStatut> statut;
   
   /** @pdOid 80f183fd-4e76-44b7-a10b-9e4799b6910f */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Emprunt assc=emprunter coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Emprunt> emprunt;
   /** @pdRoleInfo migr=no name=Consultation assc=rechercher coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Consultation> consultation;
   /** @pdRoleInfo migr=no name=Auteur assc=ecrire coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Auteur> auteur;
   
   /** @pdOid 491e85f1-b6fb-4760-93b3-d0eb68d3e617 */
   public double getIdLivre() {
      return idLivre;
   }
   
   /** @param newIdLivre
    * @pdOid f1628e04-21d1-4fa8-876e-d60a995f85d4 */
   public void setIdLivre(double newIdLivre) {
      idLivre = newIdLivre;
   }
   
   /** @pdOid ef26e3f6-ddca-4877-b2b7-c73fdf8c55b5 */
   public java.lang.String getTitre() {
      return titre;
   }
   
   /** @param newTitre
    * @pdOid e9ef4b2f-9f25-4d8d-b3df-606c0c70f6c8 */
   public void setTitre(java.lang.String newTitre) {
      titre = newTitre;
   }
   
   /** @pdOid 2e6b2c28-2840-44fa-93ac-45c9467e9bcc */
   public java.lang.String getIsbn() {
      return isbn;
   }
   
   /** @param newIsbn
    * @pdOid 9a880bef-a3bf-4eaa-947f-8e8f5a70d959 */
   public void setIsbn(java.lang.String newIsbn) {
      isbn = newIsbn;
   }
   
   /** @pdOid 5b223d77-d4a3-4789-a509-6badd47cce75 */
   public java.lang.String getCodeExemplaire() {
      return codeExemplaire;
   }
   
   /** @param newCodeExemplaire
    * @pdOid fe47e9a4-7952-40ff-aee4-0d73ead79b5e */
   public void setCodeExemplaire(java.lang.String newCodeExemplaire) {
      codeExemplaire = newCodeExemplaire;
   }
   
   /** @pdOid 0f752247-e462-48d7-82a8-c8c2e0d83cb7 */
   public java.lang.String getCommentaire() {
      return commentaire;
   }
   
   /** @param newCommentaire
    * @pdOid 910b84f5-79e8-4b1c-9bc0-03cbd58cca87 */
   public void setCommentaire(java.lang.String newCommentaire) {
      commentaire = newCommentaire;
   }
   
   /** @pdOid 9f83e590-d13e-43f4-b36b-f08b48ca508c */
   public <EnumStatut> getStatut() {
      return statut;
   }
   
   /** @param newStatut
    * @pdOid e671475f-2dc6-4c36-b7a5-ba80ea42aaa4 */
   public void setStatut(<EnumStatut> newStatut) {
      statut = newStatut;
   }
   
   /** @pdOid 5e42555f-93f5-4c99-b78d-bfee5c1d524e */
   public Livre() {
      // TODO: implement
   }
   
   /** @pdOid f33accb6-d63f-476a-bd0a-e66b03491da4 */
   public void addLivre() {
      // TODO: implement
   }
   
   /** @pdOid c3546cac-9da6-49d1-baa8-61e9cbe8e7db */
   public void supprimeLivre() {
      // TODO: implement
   }
   
   /** @pdOid 6875ceed-138a-43a2-8544-d4064fb4d6b5 */
   public void ajoutCommentaire() {
      // TODO: implement
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
      {
         this.emprunt.add(newEmprunt);
         newEmprunt.addLivre(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEmprunt */
   public void removeEmprunt(Emprunt oldEmprunt) {
      if (oldEmprunt == null)
         return;
      if (this.emprunt != null)
         if (this.emprunt.contains(oldEmprunt))
         {
            this.emprunt.remove(oldEmprunt);
            oldEmprunt.removeLivre(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEmprunt() {
      if (emprunt != null)
      {
         Emprunt oldEmprunt;
         for (java.util.Iterator iter = getIteratorEmprunt(); iter.hasNext();)
         {
            oldEmprunt = (Emprunt)iter.next();
            iter.remove();
            oldEmprunt.removeLivre(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Consultation> getConsultation() {
      if (consultation == null)
         consultation = new java.util.HashSet<Consultation>();
      return consultation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorConsultation() {
      if (consultation == null)
         consultation = new java.util.HashSet<Consultation>();
      return consultation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newConsultation */
   public void setConsultation(java.util.Collection<Consultation> newConsultation) {
      removeAllConsultation();
      for (java.util.Iterator iter = newConsultation.iterator(); iter.hasNext();)
         addConsultation((Consultation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newConsultation */
   public void addConsultation(Consultation newConsultation) {
      if (newConsultation == null)
         return;
      if (this.consultation == null)
         this.consultation = new java.util.HashSet<Consultation>();
      if (!this.consultation.contains(newConsultation))
      {
         this.consultation.add(newConsultation);
         newConsultation.addLivre(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldConsultation */
   public void removeConsultation(Consultation oldConsultation) {
      if (oldConsultation == null)
         return;
      if (this.consultation != null)
         if (this.consultation.contains(oldConsultation))
         {
            this.consultation.remove(oldConsultation);
            oldConsultation.removeLivre(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllConsultation() {
      if (consultation != null)
      {
         Consultation oldConsultation;
         for (java.util.Iterator iter = getIteratorConsultation(); iter.hasNext();)
         {
            oldConsultation = (Consultation)iter.next();
            iter.remove();
            oldConsultation.removeLivre(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Auteur> getAuteur() {
      if (auteur == null)
         auteur = new java.util.HashSet<Auteur>();
      return auteur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAuteur() {
      if (auteur == null)
         auteur = new java.util.HashSet<Auteur>();
      return auteur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAuteur */
   public void setAuteur(java.util.Collection<Auteur> newAuteur) {
      removeAllAuteur();
      for (java.util.Iterator iter = newAuteur.iterator(); iter.hasNext();)
         addAuteur((Auteur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAuteur */
   public void addAuteur(Auteur newAuteur) {
      if (newAuteur == null)
         return;
      if (this.auteur == null)
         this.auteur = new java.util.HashSet<Auteur>();
      if (!this.auteur.contains(newAuteur))
      {
         this.auteur.add(newAuteur);
         newAuteur.addLivre(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldAuteur */
   public void removeAuteur(Auteur oldAuteur) {
      if (oldAuteur == null)
         return;
      if (this.auteur != null)
         if (this.auteur.contains(oldAuteur))
         {
            this.auteur.remove(oldAuteur);
            oldAuteur.removeLivre(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAuteur() {
      if (auteur != null)
      {
         Auteur oldAuteur;
         for (java.util.Iterator iter = getIteratorAuteur(); iter.hasNext();)
         {
            oldAuteur = (Auteur)iter.next();
            iter.remove();
            oldAuteur.removeLivre(this);
         }
      }
   }

}