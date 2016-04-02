/***********************************************************************
 * Module:  Localiser.java
 * Author:  afpa
 * Purpose: Defines the Class Localiser
 ***********************************************************************/

import java.util.*;

/** un theme est localisé sur aucun ou plusieurs emplacement;
 * le livre est localisé sur un seul emplacement;
 * le livre est localisé par un theme
 * un emplacement peut est localisé par plusieurs livres et par un seul theme;
 * 
 * @pdOid beafbd9a-8d2e-4089-933b-ac45d4a382de */
public class Localiser {
   /** @pdRoleInfo migr=no name=Livre assc=LOCALISER mult=0..1 side=A */
   public Livre livre;
   /** @pdRoleInfo migr=no name=Theme assc=LOCALISER mult=0..1 side=A */
   public Theme theme;
   /** @pdRoleInfo migr=no name=Emplacement assc=LOCALISER mult=0..1 side=A */
   public Emplacement emplacement;

}