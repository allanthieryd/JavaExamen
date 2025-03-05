# Chat Inspirant - API & Application Spring Boot

Un projet destiné à apporter une touche de motivation aux employés d'une entreprise, à travers une application Spring Boot. Ce système repose sur une API Spring Boot générant des citations inspirantes, et une application Spring Boot permettant aux utilisateurs de discuter avec cette API, tout en enregistrant et consultant leurs échanges.

## Contexte du projet
Face à une baisse de motivation parmi les employés, ce projet a pour but de leur fournir un espace interactif où ils peuvent recevoir des citations inspirantes, tout en enregistrant et en visualisant leurs conversations passées, afin de maintenir un état d'esprit positif.

## Objectifs du projet
- **Créer une API Spring Boot** : Cette API doit renvoyer des citations inspirantes aléatoires aux utilisateurs.
- **Développer une application Spring Boot** : L'application doit permettre aux employés de discuter avec l'API, d'enregistrer leurs conversations et d'afficher l'historique de celles-ci.

## Technologies utilisées
- **Java 11+** : Le langage de programmation de base.
- **Spring Boot** : Utilisé pour créer l'API et l'application.
- **MySQL** : Base de données relationnelle pour stocker les informations des utilisateurs et les discussions.
- **Maven** : Outil pour la gestion des dépendances et la construction des projets.
- **RestTemplate** : Utilisé pour effectuer des appels HTTP depuis l'application de chat vers l'API.

## Prérequis
Avant de commencer à travailler sur ce projet, assurez-vous que vous disposez des éléments suivants :
- **JDK 11+** : La version 11 de Java ou plus récente.
- **Maven** : Pour la gestion des dépendances et la compilation des projets.
- **MySQL** (ou toute autre base de données relationnelle) : Pour héberger les données des utilisateurs et des conversations.

## Étapes d'installation
1. **Clonez le repository** :
   Ouvrez votre terminal et clonez ce repository en utilisant la commande suivante :
   ```bash
   git clone https://github.com/fatimaamrch/motivational_chat.git
   cd motivational_chat
Configurez votre base de données :

Créez une base de données MySQL avec le nom motivation_chat_db.
Ajoutez les informations de connexion dans le fichier application.properties des deux projets :

spring.datasource.url=jdbc:mysql://localhost:3306/motivation_chat_db

spring.datasource.username=root

spring.datasource.password=your_password_here (optionel)

**Démarrez l'API Spring Boot** : L'API sera accessible à l'adresse suivante :

http://localhost:8081/api/quotes

**Démarrez l'application de chat** : L'application sera disponible à l'adresse suivante :

- **Page du chat** : [http://localhost:8080/chat](http://localhost:8080/chat)  
- **Envoi de message et citation** : [http://localhost:8080/sendMessage](http://localhost:8080/sendMessage)  
- **Historique des discussions** : [http://localhost:8080/discussion](http://localhost:8080/discussion)
