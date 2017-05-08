/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Subscriber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsSubscriber#getSubscriberName <em>Subscriber Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsSubscriber#getDdsdatareader <em>Ddsdatareader</em>}</li>
 *   <li>{@link ddsMetamodel.DdsSubscriber#getSubscriberListener <em>Subscriber Listener</em>}</li>
 *   <li>{@link ddsMetamodel.DdsSubscriber#getSubscriberQosProfile <em>Subscriber Qos Profile</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSubscriber()
 * @model
 * @generated
 */
public interface DdsSubscriber extends EObject {
	/**
	 * Returns the value of the '<em><b>Subscriber Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Name</em>' attribute.
	 * @see #setSubscriberName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSubscriber_SubscriberName()
	 * @model
	 * @generated
	 */
	String getSubscriberName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsSubscriber#getSubscriberName <em>Subscriber Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Name</em>' attribute.
	 * @see #getSubscriberName()
	 * @generated
	 */
	void setSubscriberName(String value);

	/**
	 * Returns the value of the '<em><b>Ddsdatareader</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsDataReader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ddsdatareader</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ddsdatareader</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSubscriber_Ddsdatareader()
	 * @model containment="true"
	 * @generated
	 */
	EList<DdsDataReader> getDdsdatareader();

	/**
	 * Returns the value of the '<em><b>Subscriber Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Listener</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Listener</em>' containment reference.
	 * @see #setSubscriberListener(DdsSubscriberListener)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSubscriber_SubscriberListener()
	 * @model containment="true"
	 * @generated
	 */
	DdsSubscriberListener getSubscriberListener();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsSubscriber#getSubscriberListener <em>Subscriber Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Listener</em>' containment reference.
	 * @see #getSubscriberListener()
	 * @generated
	 */
	void setSubscriberListener(DdsSubscriberListener value);

	/**
	 * Returns the value of the '<em><b>Subscriber Qos Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Qos Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Qos Profile</em>' reference.
	 * @see #setSubscriberQosProfile(DdsSubscriberQosProfile)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSubscriber_SubscriberQosProfile()
	 * @model
	 * @generated
	 */
	DdsSubscriberQosProfile getSubscriberQosProfile();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsSubscriber#getSubscriberQosProfile <em>Subscriber Qos Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Qos Profile</em>' reference.
	 * @see #getSubscriberQosProfile()
	 * @generated
	 */
	void setSubscriberQosProfile(DdsSubscriberQosProfile value);

} // DdsSubscriber
