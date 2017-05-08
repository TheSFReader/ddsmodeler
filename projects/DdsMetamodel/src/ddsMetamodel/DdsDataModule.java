/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Data Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDataModule#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataModule#getDataStructures <em>Data Structures</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataModule#getInnerModules <em>Inner Modules</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataModule#getContainingSystem <em>Containing System</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataModule#getContainingModule <em>Containing Module</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataModule()
 * @model
 * @generated
 */
public interface DdsDataModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataModule_ModuleName()
	 * @model
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataModule#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

	/**
	 * Returns the value of the '<em><b>Data Structures</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsDataStructure}.
	 * It is bidirectional and its opposite is '{@link ddsMetamodel.DdsDataStructure#getContainerDataModule <em>Container Data Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Structures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Structures</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataModule_DataStructures()
	 * @see ddsMetamodel.DdsDataStructure#getContainerDataModule
	 * @model opposite="containerDataModule" containment="true"
	 * @generated
	 */
	EList<DdsDataStructure> getDataStructures();

	/**
	 * Returns the value of the '<em><b>Inner Modules</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsDataModule}.
	 * It is bidirectional and its opposite is '{@link ddsMetamodel.DdsDataModule#getContainingModule <em>Containing Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Modules</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataModule_InnerModules()
	 * @see ddsMetamodel.DdsDataModule#getContainingModule
	 * @model opposite="containingModule" containment="true"
	 * @generated
	 */
	EList<DdsDataModule> getInnerModules();

	/**
	 * Returns the value of the '<em><b>Containing System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ddsMetamodel.DdsSystem#getDataModules <em>Data Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing System</em>' container reference.
	 * @see #setContainingSystem(DdsSystem)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataModule_ContainingSystem()
	 * @see ddsMetamodel.DdsSystem#getDataModules
	 * @model opposite="dataModules" transient="false"
	 * @generated
	 */
	DdsSystem getContainingSystem();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataModule#getContainingSystem <em>Containing System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing System</em>' container reference.
	 * @see #getContainingSystem()
	 * @generated
	 */
	void setContainingSystem(DdsSystem value);

	/**
	 * Returns the value of the '<em><b>Containing Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ddsMetamodel.DdsDataModule#getInnerModules <em>Inner Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Module</em>' container reference.
	 * @see #setContainingModule(DdsDataModule)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataModule_ContainingModule()
	 * @see ddsMetamodel.DdsDataModule#getInnerModules
	 * @model opposite="innerModules" transient="false"
	 * @generated
	 */
	DdsDataModule getContainingModule();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataModule#getContainingModule <em>Containing Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Module</em>' container reference.
	 * @see #getContainingModule()
	 * @generated
	 */
	void setContainingModule(DdsDataModule value);

} // DdsDataModule
