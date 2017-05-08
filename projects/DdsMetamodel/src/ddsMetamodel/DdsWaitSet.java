/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Wait Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsWaitSet#getName <em>Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsWaitSet#getReadConditions <em>Read Conditions</em>}</li>
 *   <li>{@link ddsMetamodel.DdsWaitSet#getStatusConditions <em>Status Conditions</em>}</li>
 *   <li>{@link ddsMetamodel.DdsWaitSet#getGuardConditions <em>Guard Conditions</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsWaitSet()
 * @model
 * @generated
 */
public interface DdsWaitSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsWaitSet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsWaitSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Read Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsReadCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Conditions</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsWaitSet_ReadConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DdsReadCondition> getReadConditions();

	/**
	 * Returns the value of the '<em><b>Status Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsStatusCondition}.
	 * It is bidirectional and its opposite is '{@link ddsMetamodel.DdsStatusCondition#getContainingWaitset <em>Containing Waitset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Conditions</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsWaitSet_StatusConditions()
	 * @see ddsMetamodel.DdsStatusCondition#getContainingWaitset
	 * @model opposite="containingWaitset" containment="true"
	 * @generated
	 */
	EList<DdsStatusCondition> getStatusConditions();

	/**
	 * Returns the value of the '<em><b>Guard Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.GuardCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Conditions</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsWaitSet_GuardConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<GuardCondition> getGuardConditions();

} // DdsWaitSet
