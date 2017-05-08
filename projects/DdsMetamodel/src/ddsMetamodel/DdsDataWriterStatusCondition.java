/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Data Writer Status Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDataWriterStatusCondition#getEnabled_status <em>Enabled status</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterStatusCondition#getDataWriter <em>Data Writer</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterStatusCondition()
 * @model
 * @generated
 */
public interface DdsDataWriterStatusCondition extends DdsStatusCondition {
	/**
	 * Returns the value of the '<em><b>Enabled status</b></em>' attribute list.
	 * The list contents are of type {@link ddsMetamodel.DataWriterStatus}.
	 * The literals are from the enumeration {@link ddsMetamodel.DataWriterStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled status</em>' attribute list.
	 * @see ddsMetamodel.DataWriterStatus
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterStatusCondition_Enabled_status()
	 * @model
	 * @generated
	 */
	EList<DataWriterStatus> getEnabled_status();

	/**
	 * Returns the value of the '<em><b>Data Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Writer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Writer</em>' reference.
	 * @see #setDataWriter(DdsDataWriter)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterStatusCondition_DataWriter()
	 * @model required="true"
	 * @generated
	 */
	DdsDataWriter getDataWriter();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterStatusCondition#getDataWriter <em>Data Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Writer</em>' reference.
	 * @see #getDataWriter()
	 * @generated
	 */
	void setDataWriter(DdsDataWriter value);

} // DdsDataWriterStatusCondition
