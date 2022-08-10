What is jOOQ? | When to use jOOQ : https://www.youtube.com/watch?v=Y8koEetoqIA

Démo Génération du code avec maven : https://www.youtube.com/watch?v=__QxqLGVDbg&t=502s

jOOQ: Get Back In Control of Your SQL : https://www.youtube.com/watch?v=knTwEqv2OXI&t=4475s

## Démarrer le conteneur avec la base postgresql sakilapg:

docker-compose up

## Créer la base et les données:

Lancer la classe SampleApplication :

Ceci aura pour effet de lancer la création de la base de données (create-db.sql),
puis d'insérer les données dans la base postgresql (insert-data.sql) grâce à lquibase.

En cas d'erreur liquibase du type : StandardLockService - Waiting for changelog lock....

Exécuter la requête sql suivante :
```sql
UPDATE DATABASECHANGELOGLOCK SET LOCKED=false, LOCKGRANTED=null, LOCKEDBY=null where ID=1;
```

## Générer les sources java avec jooq:

mvn jooq-codegen:generate

## Exécuter les tests