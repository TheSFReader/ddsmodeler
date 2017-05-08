/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Data Writer Lifecycle Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDataWriterLifecycleQos#isAutodispose_unregistered_instances <em>Autodispose unregistered instances</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterLifecycleQos#getAutopurge_suspended_samples_delay <em>Autopurge suspended samples delay</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterLifecycleQos#getAutounregister_instance_delay <em>Autounregister instance delay</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterLifecycleQos()
 * @model
 * @generated
 */
public interface DdsDataWriterLifecycleQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Autodispose unregistered instances</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autodispose unregistered instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autodispose unregistered instances</em>' attribute.
	 * @see #setAutodispose_unregistered_instances(boolean)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterLifecycleQos_Autodispose_unregistered_instances()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutodispose_unregistered_instances();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterLifecycleQos#isAutodispose_unregistered_instances <em>Autodispose unregistered instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autodispose unregistered instances</em>' attribute.
	 * @see #isAutodispose_unregistered_instances()
	 * @generated
	 */
	void setAutodispose_unregistered_instances(boolean value);

	/**
	 * Returns the value of the '<em><b>Autopurge suspended samples delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autopurge suspended samples delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autopurge suspended samples delay</em>' containment reference.
	 * @see #setAutopurge_suspended_samples_delay(DdsDuration)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterLifecycleQos_Autopurge_suspended_samples_delay()
	 * @model containment="true"
	 * @generated
	 */
	DdsDuration getAutopurge_suspended_samples_delay();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterLifecycleQos#getAutopurge_suspended_samples_delay <em>Autopurge suspended samples delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autopurge suspended samples delay</em>' containment reference.
	 * @see #getAutopurge_suspended_samples_delay()
	 * @generated
	 */
	void setAutopurge_suspended_samples_delay(DdsDuration value);

	/**
	 * Returns the value of the '<em><b>Autounregister instance delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autounregister instance delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autounregister instance delay</em>' containment reference.
	 * @see #setAutounregister_instance_delay(DdsDuration)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterLifecycleQos_Autounregister_instance_delay()
	 * @model containment="true"
	 * @generated
	 */
	DdsDuration getAutounregister_instance_delay();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterLifecycleQos#getAutounregister_instance_delay <em>Autounregister instance delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autounregister instance delay</em>' containment reference.
	 * @see #getAutounregister_instance_delay()
	 * @generated
	 */
	void setAutounregister_instance_delay(DdsDuration value);

} // DdsDataWriterLifecycleQos
