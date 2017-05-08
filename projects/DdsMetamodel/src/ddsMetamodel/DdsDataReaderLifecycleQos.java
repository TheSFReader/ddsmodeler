/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Data Reader Lifecycle Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDataReaderLifecycleQos#getAutopurge_nowriters_samples_delay <em>Autopurge nowriters samples delay</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderLifecycleQos#getAutopurge_disposed_samples_delay <em>Autopurge disposed samples delay</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderLifecycleQos#isAutopurge_dispose_all <em>Autopurge dispose all</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderLifecycleQos#isEnable_invalid_samples <em>Enable invalid samples</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderLifecycleQos()
 * @model
 * @generated
 */
public interface DdsDataReaderLifecycleQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Autopurge nowriters samples delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autopurge nowriters samples delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autopurge nowriters samples delay</em>' containment reference.
	 * @see #setAutopurge_nowriters_samples_delay(DdsDuration)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderLifecycleQos_Autopurge_nowriters_samples_delay()
	 * @model containment="true"
	 * @generated
	 */
	DdsDuration getAutopurge_nowriters_samples_delay();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderLifecycleQos#getAutopurge_nowriters_samples_delay <em>Autopurge nowriters samples delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autopurge nowriters samples delay</em>' containment reference.
	 * @see #getAutopurge_nowriters_samples_delay()
	 * @generated
	 */
	void setAutopurge_nowriters_samples_delay(DdsDuration value);

	/**
	 * Returns the value of the '<em><b>Autopurge disposed samples delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autopurge disposed samples delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autopurge disposed samples delay</em>' containment reference.
	 * @see #setAutopurge_disposed_samples_delay(DdsDuration)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderLifecycleQos_Autopurge_disposed_samples_delay()
	 * @model containment="true"
	 * @generated
	 */
	DdsDuration getAutopurge_disposed_samples_delay();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderLifecycleQos#getAutopurge_disposed_samples_delay <em>Autopurge disposed samples delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autopurge disposed samples delay</em>' containment reference.
	 * @see #getAutopurge_disposed_samples_delay()
	 * @generated
	 */
	void setAutopurge_disposed_samples_delay(DdsDuration value);

	/**
	 * Returns the value of the '<em><b>Autopurge dispose all</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autopurge dispose all</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autopurge dispose all</em>' attribute.
	 * @see #setAutopurge_dispose_all(boolean)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderLifecycleQos_Autopurge_dispose_all()
	 * @model
	 * @generated
	 */
	boolean isAutopurge_dispose_all();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderLifecycleQos#isAutopurge_dispose_all <em>Autopurge dispose all</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autopurge dispose all</em>' attribute.
	 * @see #isAutopurge_dispose_all()
	 * @generated
	 */
	void setAutopurge_dispose_all(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable invalid samples</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable invalid samples</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable invalid samples</em>' attribute.
	 * @see #setEnable_invalid_samples(boolean)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderLifecycleQos_Enable_invalid_samples()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnable_invalid_samples();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderLifecycleQos#isEnable_invalid_samples <em>Enable invalid samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable invalid samples</em>' attribute.
	 * @see #isEnable_invalid_samples()
	 * @generated
	 */
	void setEnable_invalid_samples(boolean value);

} // DdsDataReaderLifecycleQos
