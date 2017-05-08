/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Durability Service Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDurabilityServiceQos#getService_cleanup_delay <em>Service cleanup delay</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDurabilityServiceQos#getHistory_kind <em>History kind</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDurabilityServiceQos#getHistory_depth <em>History depth</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDurabilityServiceQos#getMax_samples <em>Max samples</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDurabilityServiceQos#getMax_instances <em>Max instances</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDurabilityServiceQos#getMax_samples_per_instances <em>Max samples per instances</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDurabilityServiceQos()
 * @model
 * @generated
 */
public interface DdsDurabilityServiceQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Service cleanup delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service cleanup delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service cleanup delay</em>' containment reference.
	 * @see #setService_cleanup_delay(DdsDuration)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDurabilityServiceQos_Service_cleanup_delay()
	 * @model containment="true"
	 * @generated
	 */
	DdsDuration getService_cleanup_delay();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDurabilityServiceQos#getService_cleanup_delay <em>Service cleanup delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service cleanup delay</em>' containment reference.
	 * @see #getService_cleanup_delay()
	 * @generated
	 */
	void setService_cleanup_delay(DdsDuration value);

	/**
	 * Returns the value of the '<em><b>History kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ddsMetamodel.HistoryQosPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History kind</em>' attribute.
	 * @see ddsMetamodel.HistoryQosPolicyKind
	 * @see #setHistory_kind(HistoryQosPolicyKind)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDurabilityServiceQos_History_kind()
	 * @model
	 * @generated
	 */
	HistoryQosPolicyKind getHistory_kind();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDurabilityServiceQos#getHistory_kind <em>History kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History kind</em>' attribute.
	 * @see ddsMetamodel.HistoryQosPolicyKind
	 * @see #getHistory_kind()
	 * @generated
	 */
	void setHistory_kind(HistoryQosPolicyKind value);

	/**
	 * Returns the value of the '<em><b>History depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History depth</em>' attribute.
	 * @see #setHistory_depth(long)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDurabilityServiceQos_History_depth()
	 * @model
	 * @generated
	 */
	long getHistory_depth();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDurabilityServiceQos#getHistory_depth <em>History depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History depth</em>' attribute.
	 * @see #getHistory_depth()
	 * @generated
	 */
	void setHistory_depth(long value);

	/**
	 * Returns the value of the '<em><b>Max samples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max samples</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max samples</em>' attribute.
	 * @see #setMax_samples(long)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDurabilityServiceQos_Max_samples()
	 * @model
	 * @generated
	 */
	long getMax_samples();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDurabilityServiceQos#getMax_samples <em>Max samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max samples</em>' attribute.
	 * @see #getMax_samples()
	 * @generated
	 */
	void setMax_samples(long value);

	/**
	 * Returns the value of the '<em><b>Max instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max instances</em>' attribute.
	 * @see #setMax_instances(long)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDurabilityServiceQos_Max_instances()
	 * @model
	 * @generated
	 */
	long getMax_instances();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDurabilityServiceQos#getMax_instances <em>Max instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max instances</em>' attribute.
	 * @see #getMax_instances()
	 * @generated
	 */
	void setMax_instances(long value);

	/**
	 * Returns the value of the '<em><b>Max samples per instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max samples per instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max samples per instances</em>' attribute.
	 * @see #setMax_samples_per_instances(long)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDurabilityServiceQos_Max_samples_per_instances()
	 * @model
	 * @generated
	 */
	long getMax_samples_per_instances();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDurabilityServiceQos#getMax_samples_per_instances <em>Max samples per instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max samples per instances</em>' attribute.
	 * @see #getMax_samples_per_instances()
	 * @generated
	 */
	void setMax_samples_per_instances(long value);

} // DdsDurabilityServiceQos
