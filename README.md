JMaghreb Call For Paper Application
===================================
Requirements
------------
To be able to run this application you need to have:

* Scala  (required)

* PlayFramework  (required)

* MongoDB installed and running (required)

Setup
-----
1)clone the project from this github repository
2) log into your mongoDB instance, and create a user called admin :

    db.addUser({user:"admin",pwd:"YOUR PASSWORD")
    
3) add those environnement variables:

    export OPENSHIFT_MONGODB_DB_HOST="YOUR_MONDO_DB_HOST"
    export OPENSHIFT_MONGODB_DB_PORT="YOUR_MONDO_DB_PORT"
    export OPENSHIFT_MONGODB_DB_PASSWORD="PASSWORD USED FOR THE USER admin"
    
if you have a mail grid account, wich you want use in order to send notificatoins, you can  define those variables ( optional):

    export OPENSHIFT_GRID_MAIL_USER="MAIL GRID USER NAME"
    export OPENSHIFT_GRID_MAIL_password="MAIL GRID PASSWORD"
    
4)inside repository run:

       play ~run
