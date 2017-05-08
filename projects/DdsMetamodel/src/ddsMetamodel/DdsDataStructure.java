/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Data Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDataStructure#getStructureName <em>Structure Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataStructure#getFields <em>Fields</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataStructure#getStructuredFields <em>Structured Fields</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataStructure#getContainerDataModule <em>Container Data Module</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataStructure()
 * @model
 * @generated
 */
public interface DdsDataStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Structure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Name</em>' attribute.
	 * @see #setStructureName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataStructure_StructureName()
	 * @model
	 * @generated
	 */
	String getStructureName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataStructure#getStructureName <em>Structure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Name</em>' attribute.
	 * @see #getStructureName()
	 * @generated
	 */
	void setStructureName(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsDataField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataStructure_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<DdsDataField> getFields();

	/**
	 * Returns the value of the '<em><b>Structured Fields</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsStructuredField}.
	 * It is bidirectional and its opposite is '{@link ddsMetamodel.DdsStructuredField#getDataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Fields</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataStructure_StructuredFields()
	 * @see ddsMetamodel.DdsStructuredField#getDataStructure
	 * @model opposite="dataStructure" containment="true"
	 * @generated
	 */
	EList<DdsStructuredField> getStructuredFields();

	/**
	 * Returns the value of the '<em><b>Container Data Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ddsMetamodel.DdsDataModule#getDataStructures <em>Data Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Data Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Data Module</em>' container reference.
	 * @see #setContainerDataModule(DdsDataModule)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataStructure_ContainerDataModule()
	 * @see ddsMetamodel.DdsDataModule#getDataStructures
	 * @model opposite="dataStructures" transient="false"
	 * @generated
	 */
	DdsDataModule getContainerDataModule();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataStructure#getContainerDataModule <em>Container Data Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Data Module</em>' container reference.
	 * @see #getContainerDataModule()
	 * @generated
	 */
	void setContainerDataModule(DdsDataModule value);

} // DdsDataStructure
