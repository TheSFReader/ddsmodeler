/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Data Reader Status Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDataReaderStatusCondition#getEnabled_status <em>Enabled status</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderStatusCondition#getDataReader <em>Data Reader</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderStatusCondition()
 * @model
 * @generated
 */
public interface DdsDataReaderStatusCondition extends DdsStatusCondition {
	/**
	 * Returns the value of the '<em><b>Enabled status</b></em>' attribute list.
	 * The list contents are of type {@link ddsMetamodel.DataReaderStatus}.
	 * The literals are from the enumeration {@link ddsMetamodel.DataReaderStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled status</em>' attribute list.
	 * @see ddsMetamodel.DataReaderStatus
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderStatusCondition_Enabled_status()
	 * @model
	 * @generated
	 */
	EList<DataReaderStatus> getEnabled_status();

	/**
	 * Returns the value of the '<em><b>Data Reader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Reader</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Reader</em>' reference.
	 * @see #setDataReader(DdsDataReader)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderStatusCondition_DataReader()
	 * @model required="true"
	 * @generated
	 */
	DdsDataReader getDataReader();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderStatusCondition#getDataReader <em>Data Reader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Reader</em>' reference.
	 * @see #getDataReader()
	 * @generated
	 */
	void setDataReader(DdsDataReader value);

} // DdsDataReaderStatusCondition
