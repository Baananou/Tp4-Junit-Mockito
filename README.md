Testing Employe Class with Mockito Framework
Objectif

L'objectif de ce projet est d'exploiter le framework Mockito pour tester la validité d'un programme écrit en Java. Nous allons mettre en place des tests pour la classe Employe, qui comporte les attributs suivants :

    matricule (private int)
    nom (private String)
    prenom (private String)
    salaire (private double)
    tauxCommision (private double) - défini en pourcentage
    nbAnneeTravail (private int)
    ChefDepartement (Employe)

La classe Employe contient une méthode double getPrime() qui calcule la prime mensuelle de l'employé selon les critères suivants :

    Si le nombre d'années de travail est supérieur à 15 ans, la prime est égale à (tauxCommision * salaire).
    Si le nombre d'années de travail est inférieur ou égal à 15 ans, la prime est égale à une valeur fixe renvoyée par la méthode double getPrimeFixe() de l'objet représentant son chef.

Implémentation de la Classe Employe

Pour commencer, implémentez la classe Employe en respectant les spécifications fournies.
Tests avec Mockito Framework

Nous allons tester la méthode getPrime() de la classe Employe en utilisant le framework Mockito. Pour ce faire, effectuez les étapes suivantes :

    Test avec un objet concret référençant le chef de département :
        Créez un objet Employe concret avec des valeurs de test.
        Appelez la méthode getPrime() sur cet objet et vérifiez le résultat.

    Test avec un objet Mock (utilisation du framework Mockito) :
        Utilisez Mockito pour créer un objet Employe mock.
        Configurez le comportement du mock pour simuler différentes situations, par exemple en définissant le nombre d'années de travail et en simulant le renvoi de la valeur fixe par la méthode getPrimeFixe() du chef.
        Appelez la méthode getPrime() sur l'objet mock et assurez-vous que le résultat correspond aux attentes.

N'oubliez pas de fournir des commentaires détaillés dans le code pour expliquer chaque étape du processus de test.

Note : Assurez-vous d'inclure toutes les dépendances nécessaires pour Mockito dans votre projet Java. Vous pouvez les ajouter à l'aide de Maven ou Gradle, selon votre configuration de projet.
