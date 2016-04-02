/***********************************************************************
 * Module:  Adherent.java
 * Author:  afpa
 * Purpose: Defines the Class Adherent
 ***********************************************************************/

import java.util.*;

/** @pdOid 976bc72c-6550-4f32-acf3-6b05caa32dbf */
public class Adherent extends Utilisateur {
   /** @pdOid 0f7d672d-7791-45c0-8533-9938fa36fa6a */
   private double idAdherent;
   /** @pdOid 40362f46-b7a1-4ebb-ac11-413a26c7ece1 */
   private java.util.Date dateCotisation;
   /** @pdOid c5ec5af1-0f35-46c0-9b66-4a8b5ef2e1d9 */
   private java.util.Date dateFinCotisation;
   /** @pdOid ecbae828-0011-4caf-98e4-de8f8407c2d2 */
   private boolean bloque;
   
   /** @pdOid 2646f8de-500a-4109-81a8-bbb21ff4f08c */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid f0ab2ace-4dd3-4861-b467-7c77acf78b8a */
   public double getIdAdherent() {
      return idAdherent;
   }
   
   /** @param newIdAdherent
    * @pdOid 3c17a649-eee8-41ad-8b3c-c4b75a82c101 */
   public void setIdAdherent(double newIdAdherent) {
      idAdherent = newIdAdherent;
   }
   
   /** @pdOid b1f11cc4-f448-47a6-b7d9-a6071292c1b7 */
   public java.util.Date getDateCotisation() {
      return dateCotisation;
   }
   
   /** @param newDateCotisation
    * @pdOid cf101e02-f028-4068-8ac2-ddbb545463a7 */
   public void setDateCotisation(java.util.Date newDateCotisation) {
      dateCotisation = newDateCotisation;
   }
   
   /** @pdOid c91c04e6-badc-4a56-b1bd-cbbf103213b6 */
   public boolean getBloque() {
      return bloque;
   }
   
   /** @param newBloque
    * @pdOid 5c3060dc-7336-4f64-b3b9-2c877a835578 */
   public void setBloque(boolean newBloque) {
      bloque = newBloque;
   }
   
   /** @pdOid fad6fa78-b920-4efa-bd19-5becf6be0125 */
   public Adherent() {
      // TODO: implement
   }
   
   /** @pdOid c565b8a4-1752-4f5d-9279-13fb73ce66ce */
   public void addAdherent() {
      // TODO: implement
   }
   
   /** @pdOid 3ee24298-6de9-4986-a7a1-29422b1cfb84 */
   public void supprimeAdherent() {
      // TODO: implement
   }
   
   /** @pdOid 38ba4a63-abab-4216-bfff-9123e262c68a */
   public void modifierAdherent() {
      // TODO: implement
   }

}