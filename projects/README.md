# Organization of the projects

The DdsMetamodel project is a modeling project containing the metamodel used for the modeling and generation tool. If you want to modify the modeling tool, you will have to open the project and then generate the Model code, the edit code and the editor code (I assume you are familiar with ECore).

The ddsmodeler.design project contains the definition of the modeling tool made with Obeo Designer Community Edition.

The DdsGenerator project contains the code generation rules to generate Java code from the models made with the modeling tool. The code generation rules are defined using Acceleo.

The DdsGenerator.ui project enables to add the DdsGenerator tool in the Eclipse environment.

The DdsModeler.feature and DdsModeler.update projects are used to export the previous projects as an Eclipse Update Site.
