/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Time Based Filter Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsTimeBasedFilterQos#getMinimum_separation <em>Minimum separation</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsTimeBasedFilterQos()
 * @model
 * @generated
 */
public interface DdsTimeBasedFilterQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Minimum separation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum separation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum separation</em>' containment reference.
	 * @see #setMinimum_separation(DdsDuration)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsTimeBasedFilterQos_Minimum_separation()
	 * @model containment="true"
	 * @generated
	 */
	DdsDuration getMinimum_separation();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsTimeBasedFilterQos#getMinimum_separation <em>Minimum separation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum separation</em>' containment reference.
	 * @see #getMinimum_separation()
	 * @generated
	 */
	void setMinimum_separation(DdsDuration value);

} // DdsTimeBasedFilterQos
