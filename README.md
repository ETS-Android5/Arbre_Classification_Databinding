# Arbre_Classification

Projet test de compétences OnePoint.

Réalisé et Testé avec Android 12 (API level 32)

Une clean architecture, le pattern MVVM et du databinding ont été utilisé pour structurer le projet.

Pour l'installation, simplement cloner ou télécharger le projet.

### Fonctionnement général

Au lancement, une requête API est lancée afin de récupérer la liste des arbres à afficher. 
Le ViewModel crée, en fonction du résultat de la requête, un objet de type TreesListState contenant la liste des arbres en cas de succès, ou bien un message d'erreur qui ser affiché en cas d'échec.
Dans le cas du succès, le numéro de l'arbre est affiché, ainsi que son espèce et un bouton pour avoir les autres informations.

Lorsqu'on clique sur le bouton, l'application convertit l'arbre en JSON string, puis le repasse en objet pour la navigation.
On récupère alors les informations de l'arbre sur le viewModel, et on créé, de manière analogue à TreeListstate, un objet de type TreeState, contenant les informations de l'arbre, ou un message d'erreur.

La MainActivity contient deux fragments, l'un contenant la liste des arbres (recyclerView) et l'autre les détails de l'arbre choisi
Lors du click sur un arbre, on switch vers l'écran de détail de l'arbre.


### API

Les appels API ont été réalisé avec Retrofit.

Une des requêtes récupère 20 arbres, avec le minimum d'informations possible (afin de ne pas ralentir l'application dans le cas où l'on souhaiterait récupérer un plus grand nombre d'arbre).


### Injection de dépendances

Les injections de dépendances sont réalisées grâce à Dagger-Hilt version 2.38.1
