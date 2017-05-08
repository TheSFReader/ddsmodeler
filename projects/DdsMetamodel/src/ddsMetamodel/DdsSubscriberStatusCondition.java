/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Subscriber Status Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsSubscriberStatusCondition#getEnabled_status <em>Enabled status</em>}</li>
 *   <li>{@link ddsMetamodel.DdsSubscriberStatusCondition#getSubscriber <em>Subscriber</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSubscriberStatusCondition()
 * @model
 * @generated
 */
public interface DdsSubscriberStatusCondition extends DdsStatusCondition {
	/**
	 * Returns the value of the '<em><b>Enabled status</b></em>' attribute list.
	 * The list contents are of type {@link ddsMetamodel.SubscriberStatus}.
	 * The literals are from the enumeration {@link ddsMetamodel.SubscriberStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled status</em>' attribute list.
	 * @see ddsMetamodel.SubscriberStatus
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSubscriberStatusCondition_Enabled_status()
	 * @model
	 * @generated
	 */
	EList<SubscriberStatus> getEnabled_status();

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber</em>' reference.
	 * @see #setSubscriber(DdsSubscriber)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSubscriberStatusCondition_Subscriber()
	 * @model required="true"
	 * @generated
	 */
	DdsSubscriber getSubscriber();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsSubscriberStatusCondition#getSubscriber <em>Subscriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber</em>' reference.
	 * @see #getSubscriber()
	 * @generated
	 */
	void setSubscriber(DdsSubscriber value);

} // DdsSubscriberStatusCondition
