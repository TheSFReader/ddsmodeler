/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Status Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsStatusCondition#getContainingWaitset <em>Containing Waitset</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsStatusCondition()
 * @model
 * @generated
 */
public interface DdsStatusCondition extends EObject {

	/**
	 * Returns the value of the '<em><b>Containing Waitset</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ddsMetamodel.DdsWaitSet#getStatusConditions <em>Status Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Waitset</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Waitset</em>' container reference.
	 * @see #setContainingWaitset(DdsWaitSet)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsStatusCondition_ContainingWaitset()
	 * @see ddsMetamodel.DdsWaitSet#getStatusConditions
	 * @model opposite="statusConditions" transient="false"
	 * @generated
	 */
	DdsWaitSet getContainingWaitset();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsStatusCondition#getContainingWaitset <em>Containing Waitset</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Waitset</em>' container reference.
	 * @see #getContainingWaitset()
	 * @generated
	 */
	void setContainingWaitset(DdsWaitSet value);
} // DdsStatusCondition
