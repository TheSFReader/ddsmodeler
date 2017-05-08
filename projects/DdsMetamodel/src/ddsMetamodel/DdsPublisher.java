/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsPublisher#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsPublisher#getDdsdatawriter <em>Ddsdatawriter</em>}</li>
 *   <li>{@link ddsMetamodel.DdsPublisher#getPublisherListener <em>Publisher Listener</em>}</li>
 *   <li>{@link ddsMetamodel.DdsPublisher#getPublisherQosProfile <em>Publisher Qos Profile</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisher()
 * @model
 * @generated
 */
public interface DdsPublisher extends EObject {
	/**
	 * Returns the value of the '<em><b>Publisher Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Name</em>' attribute.
	 * @see #setPublisherName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisher_PublisherName()
	 * @model
	 * @generated
	 */
	String getPublisherName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsPublisher#getPublisherName <em>Publisher Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Name</em>' attribute.
	 * @see #getPublisherName()
	 * @generated
	 */
	void setPublisherName(String value);

	/**
	 * Returns the value of the '<em><b>Ddsdatawriter</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsDataWriter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ddsdatawriter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ddsdatawriter</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisher_Ddsdatawriter()
	 * @model containment="true"
	 * @generated
	 */
	EList<DdsDataWriter> getDdsdatawriter();

	/**
	 * Returns the value of the '<em><b>Publisher Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Listener</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Listener</em>' containment reference.
	 * @see #setPublisherListener(DdsPublisherListener)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisher_PublisherListener()
	 * @model containment="true"
	 * @generated
	 */
	DdsPublisherListener getPublisherListener();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsPublisher#getPublisherListener <em>Publisher Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Listener</em>' containment reference.
	 * @see #getPublisherListener()
	 * @generated
	 */
	void setPublisherListener(DdsPublisherListener value);

	/**
	 * Returns the value of the '<em><b>Publisher Qos Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Qos Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Qos Profile</em>' reference.
	 * @see #setPublisherQosProfile(DdsPublisherQosProfile)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisher_PublisherQosProfile()
	 * @model
	 * @generated
	 */
	DdsPublisherQosProfile getPublisherQosProfile();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsPublisher#getPublisherQosProfile <em>Publisher Qos Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Qos Profile</em>' reference.
	 * @see #getPublisherQosProfile()
	 * @generated
	 */
	void setPublisherQosProfile(DdsPublisherQosProfile value);

} // DdsPublisher
