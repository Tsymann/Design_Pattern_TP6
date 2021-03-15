package com.tactfactory.designpatternniveau1.observer.tp1;

import com.tactfactory.designpatternniveau1.observer.tp1.model.Subject;
import com.tactfactory.designpatternniveau1.observer.tp1.observers.*;

/**
*
* @author tactfactory
*
* - Le programme doit utiliser un design pattern "Observer" afin d'avoir les éléments suivant :
*   - 1 : Un Subject sera observé par 3 observer
*   - 2 : Le Subject possédera un state de type int
*   - 3 : Lors de la modification du state du Subject les observers attachés seront appelé avec :
*       - 1 : Un observer affichera l'entier en hexadécimal
*       - 2 : Un observer affichera l'entier en octal
*       - 3 : Un observer affichera l'entier en binaire
*   - 3 : Le lancement de l'application doit afficher les éléments suivant :
*
*       First state change: 15
*       Hex String: F
*       Octal String: 17
*       Binary String: 1111
*       Second state change: 10
*       Hex String: A
*       Octal String: 12
*       Binary String: 1010
*/
public class ObserverTp1 {
  public static void main(String[] args) {

	Subject s1 = new Subject();
	Subject s2 = new Subject();

	Observer o1 = new ObsHexa();
	Observer o2 = new ObsOctal();
	Observer o3 = new ObsBin();

	s1.attach(o1);
	s1.attach(o2);
	s1.attach(o3);

	s2.attach(o1);
	s2.attach(o2);
	s2.attach(o3);

	s1.setData(15);
	s2.setData(10);
	  
  }
}
