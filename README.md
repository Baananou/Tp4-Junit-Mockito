Objectif :
 Exploiter le Framework Mockito pour tester la validité d’un programme écrit en
Java.
Exercice :
Soit une classe Employe ayant comme attributs :
 Private int matricule ;
 private String nom, prenom;
 private double salaire;
 private double tauxCommision ; //définie en pourcentage.
 private int nbAnneeTravail;
 Employe ChefDepartement;
Elle admet la méthode la méthode double getPrime( ) qui renvoie la prime sur la
commision par mois de l’employé selon ce scénario:
 Si le nombre d’années de travail est supérieur à 15 ans, il aura une prime égale à (
tauxCommision * salaire.
 Si son âge est inférieur ou égale à 15, il aura une prime égale à une valeur fixe
renvoyée par la méthode double getPrimeFixe( ) de l’objet représentant son chef.
1. Implémenter la classe Employe.
2. Test la méthode getPrime( ) une fois avec un objet concret qui référence le
chef de département et une fois avec un objet Mock (en utilisant le framework
Mockito).
