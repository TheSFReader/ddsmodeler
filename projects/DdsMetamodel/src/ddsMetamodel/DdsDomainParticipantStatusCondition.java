/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Domain Participant Status Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDomainParticipantStatusCondition#getEnabled_status <em>Enabled status</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDomainParticipantStatusCondition#getDomainParticipant <em>Domain Participant</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipantStatusCondition()
 * @model
 * @generated
 */
public interface DdsDomainParticipantStatusCondition extends DdsStatusCondition {
	/**
	 * Returns the value of the '<em><b>Enabled status</b></em>' attribute list.
	 * The list contents are of type {@link ddsMetamodel.DomainParticipantStatus}.
	 * The literals are from the enumeration {@link ddsMetamodel.DomainParticipantStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled status</em>' attribute list.
	 * @see ddsMetamodel.DomainParticipantStatus
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipantStatusCondition_Enabled_status()
	 * @model
	 * @generated
	 */
	EList<DomainParticipantStatus> getEnabled_status();

	/**
	 * Returns the value of the '<em><b>Domain Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Participant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Participant</em>' reference.
	 * @see #setDomainParticipant(DdsDomainParticipant)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipantStatusCondition_DomainParticipant()
	 * @model required="true"
	 * @generated
	 */
	DdsDomainParticipant getDomainParticipant();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDomainParticipantStatusCondition#getDomainParticipant <em>Domain Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Participant</em>' reference.
	 * @see #getDomainParticipant()
	 * @generated
	 */
	void setDomainParticipant(DdsDomainParticipant value);

} // DdsDomainParticipantStatusCondition
