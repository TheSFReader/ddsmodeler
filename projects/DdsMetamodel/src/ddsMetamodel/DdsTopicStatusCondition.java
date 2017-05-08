/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Topic Status Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsTopicStatusCondition#getEnabled_status <em>Enabled status</em>}</li>
 *   <li>{@link ddsMetamodel.DdsTopicStatusCondition#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsTopicStatusCondition()
 * @model
 * @generated
 */
public interface DdsTopicStatusCondition extends DdsStatusCondition {
	/**
	 * Returns the value of the '<em><b>Enabled status</b></em>' attribute list.
	 * The list contents are of type {@link ddsMetamodel.TopicStatus}.
	 * The literals are from the enumeration {@link ddsMetamodel.TopicStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled status</em>' attribute list.
	 * @see ddsMetamodel.TopicStatus
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsTopicStatusCondition_Enabled_status()
	 * @model
	 * @generated
	 */
	EList<TopicStatus> getEnabled_status();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' reference.
	 * @see #setTopic(DdsTopic)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsTopicStatusCondition_Topic()
	 * @model required="true"
	 * @generated
	 */
	DdsTopic getTopic();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsTopicStatusCondition#getTopic <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(DdsTopic value);

} // DdsTopicStatusCondition
