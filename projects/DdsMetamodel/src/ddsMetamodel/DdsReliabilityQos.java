/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Reliability Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsReliabilityQos#getKind <em>Kind</em>}</li>
 *   <li>{@link ddsMetamodel.DdsReliabilityQos#getMax_blocking_time <em>Max blocking time</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsReliabilityQos()
 * @model
 * @generated
 */
public interface DdsReliabilityQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"BEST_EFFORT"</code>.
	 * The literals are from the enumeration {@link ddsMetamodel.ReliabilityQosPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ddsMetamodel.ReliabilityQosPolicyKind
	 * @see #setKind(ReliabilityQosPolicyKind)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsReliabilityQos_Kind()
	 * @model default="BEST_EFFORT"
	 * @generated
	 */
	ReliabilityQosPolicyKind getKind();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsReliabilityQos#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ddsMetamodel.ReliabilityQosPolicyKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ReliabilityQosPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Max blocking time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max blocking time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max blocking time</em>' containment reference.
	 * @see #setMax_blocking_time(DdsDuration)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsReliabilityQos_Max_blocking_time()
	 * @model containment="true"
	 * @generated
	 */
	DdsDuration getMax_blocking_time();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsReliabilityQos#getMax_blocking_time <em>Max blocking time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max blocking time</em>' containment reference.
	 * @see #getMax_blocking_time()
	 * @generated
	 */
	void setMax_blocking_time(DdsDuration value);

} // DdsReliabilityQos
