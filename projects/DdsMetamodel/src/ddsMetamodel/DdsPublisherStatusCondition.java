/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Publisher Status Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsPublisherStatusCondition#getEnabled_status <em>Enabled status</em>}</li>
 *   <li>{@link ddsMetamodel.DdsPublisherStatusCondition#getPublisher <em>Publisher</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisherStatusCondition()
 * @model
 * @generated
 */
public interface DdsPublisherStatusCondition extends DdsStatusCondition {
	/**
	 * Returns the value of the '<em><b>Enabled status</b></em>' attribute list.
	 * The list contents are of type {@link ddsMetamodel.PublisherStatus}.
	 * The literals are from the enumeration {@link ddsMetamodel.PublisherStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled status</em>' attribute list.
	 * @see ddsMetamodel.PublisherStatus
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisherStatusCondition_Enabled_status()
	 * @model
	 * @generated
	 */
	EList<PublisherStatus> getEnabled_status();

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' reference.
	 * @see #setPublisher(DdsPublisher)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisherStatusCondition_Publisher()
	 * @model required="true"
	 * @generated
	 */
	DdsPublisher getPublisher();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsPublisherStatusCondition#getPublisher <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(DdsPublisher value);

} // DdsPublisherStatusCondition
