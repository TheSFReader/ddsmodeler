/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Structured Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsStructuredField#isIsKey <em>Is Key</em>}</li>
 *   <li>{@link ddsMetamodel.DdsStructuredField#getReferencedType <em>Referenced Type</em>}</li>
 *   <li>{@link ddsMetamodel.DdsStructuredField#getDataStructure <em>Data Structure</em>}</li>
 *   <li>{@link ddsMetamodel.DdsStructuredField#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsStructuredField#getMaxMultiplicity <em>Max Multiplicity</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsStructuredField()
 * @model
 * @generated
 */
public interface DdsStructuredField extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Key</em>' attribute.
	 * @see #setIsKey(boolean)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsStructuredField_IsKey()
	 * @model
	 * @generated
	 */
	boolean isIsKey();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsStructuredField#isIsKey <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Key</em>' attribute.
	 * @see #isIsKey()
	 * @generated
	 */
	void setIsKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Referenced Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Type</em>' reference.
	 * @see #setReferencedType(DdsDataStructure)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsStructuredField_ReferencedType()
	 * @model
	 * @generated
	 */
	DdsDataStructure getReferencedType();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsStructuredField#getReferencedType <em>Referenced Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Type</em>' reference.
	 * @see #getReferencedType()
	 * @generated
	 */
	void setReferencedType(DdsDataStructure value);

	/**
	 * Returns the value of the '<em><b>Data Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ddsMetamodel.DdsDataStructure#getStructuredFields <em>Structured Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Structure</em>' container reference.
	 * @see #setDataStructure(DdsDataStructure)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsStructuredField_DataStructure()
	 * @see ddsMetamodel.DdsDataStructure#getStructuredFields
	 * @model opposite="structuredFields" transient="false"
	 * @generated
	 */
	DdsDataStructure getDataStructure();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsStructuredField#getDataStructure <em>Data Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Structure</em>' container reference.
	 * @see #getDataStructure()
	 * @generated
	 */
	void setDataStructure(DdsDataStructure value);

	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsStructuredField_FieldName()
	 * @model required="true"
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsStructuredField#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Max Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Multiplicity</em>' attribute.
	 * @see #setMaxMultiplicity(int)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsStructuredField_MaxMultiplicity()
	 * @model required="true"
	 * @generated
	 */
	int getMaxMultiplicity();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsStructuredField#getMaxMultiplicity <em>Max Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Multiplicity</em>' attribute.
	 * @see #getMaxMultiplicity()
	 * @generated
	 */
	void setMaxMultiplicity(int value);

} // DdsStructuredField
