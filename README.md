# Board_Perso_Back

Ceci est l'API d'un projet perso, une application présentant mes projets réalisés. 

Dépot git : `https://github.com/wsanon19/boardpersoback.git`

Lien de déploiement mogenius : `https://boardpersoback-prod-wilfried-bf-8a0qur.mo2.mogenius.io/`

## Endpoints fonctionnels de l'api  : 

- Afficher la liste des projets : 
    - Type de la requete : GET 
    - Chemin : `.../api/projet/list`

- Ajouter un projet dans la db :
    - Type de la requete : POST
    - chemin : `.../api/projet/save`
    - Body attendu (un projet) : 
        {
            "id": 2,
            "nom": "Dev Full Stack ",
            "description": "Ceci est le projet sur le cloud"
        }

## Informations perso 
### Nom : SANON Wilfried
### Numéro étudiant : 31828632

