# ExamenBlancDesignPattern
Étape 1 : Diagramme De classe :
J’ai déployé plusieurs Design Pattern :

-Composite : j’ai déployé ce design pattern entre la classe abstraite Dessin et les classes (rectangle, cercle, groupe figures) qui <<EXTEND>> de Dessin . J’ai opté pour ce choix de design Pattern car un dessin peut contenir un ou plusieurs cercles ou rectangles donc il apparaît légitime d’utiliser Le Design Composite 

-Observer : Il est légitime d’utiliser ce Pattern car à chaque fois l’ObjetParamétrage change toutes les figures doivent être notifié et mis à jour 

-Strategy : Car la méthode <<traiter>> va avoir plusieurs implémentations interchangeables.

![Diagramme De classe](https://user-images.githubusercontent.com/85801662/198716007-c1e2a39d-c01c-4ef3-b22a-c4c707f9bc79.jpg)


