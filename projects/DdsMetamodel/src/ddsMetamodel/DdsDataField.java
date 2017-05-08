/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Data Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDataField#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataField#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataField#isIsKey <em>Is Key</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataField#getMaxMultiplicity <em>Max Multiplicity</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataField()
 * @model
 * @generated
 */
public interface DdsDataField extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Type</em>' attribute.
	 * @see #setFieldType(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataField_FieldType()
	 * @model
	 * @generated
	 */
	String getFieldType();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataField#getFieldType <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Type</em>' attribute.
	 * @see #getFieldType()
	 * @generated
	 */
	void setFieldType(String value);

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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataField_FieldName()
	 * @model
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataField#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataField_IsKey()
	 * @model
	 * @generated
	 */
	boolean isIsKey();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataField#isIsKey <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Key</em>' attribute.
	 * @see #isIsKey()
	 * @generated
	 */
	void setIsKey(boolean value);

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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataField_MaxMultiplicity()
	 * @model required="true"
	 * @generated
	 */
	int getMaxMultiplicity();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataField#getMaxMultiplicity <em>Max Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Multiplicity</em>' attribute.
	 * @see #getMaxMultiplicity()
	 * @generated
	 */
	void setMaxMultiplicity(int value);

} // DdsDataField
