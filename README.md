# ExamenBlancDesignPattern
�tape 1 : Diagramme De classe�:
J�ai d�ploy� plusieurs Design Pattern�:
-Composite�: j�ai d�ploy� ce design pattern entre la classe abstraite Dessin et les classes (rectangle, cercle, groupe figures) qui <<EXTEND>> de Dessin . J�ai opt� pour ce choix de design Pattern car un dessin peut contenir un ou plusieurs cercles ou rectangles donc il appara�t l�gitime d�utiliser Le Design Composite 
-Observer�: Il est l�gitime d�utiliser ce Pattern car � chaque fois l�ObjetParam�trage change toutes les figures doivent �tre notifi� et mis � jour 
-Strategy�: Car la m�thode <<traiter>> va avoir plusieurs impl�mentations interchangeables.

�tape 2 : Impl�mentation�:
Classe Point�:


