/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Read Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsReadCondition#getView_state_mask <em>View state mask</em>}</li>
 *   <li>{@link ddsMetamodel.DdsReadCondition#getInstance_state_mask <em>Instance state mask</em>}</li>
 *   <li>{@link ddsMetamodel.DdsReadCondition#getSample_state_mask <em>Sample state mask</em>}</li>
 *   <li>{@link ddsMetamodel.DdsReadCondition#getDataReader <em>Data Reader</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsReadCondition()
 * @model
 * @generated
 */
public interface DdsReadCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>View state mask</b></em>' attribute list.
	 * The list contents are of type {@link ddsMetamodel.ViewStateKind}.
	 * The literals are from the enumeration {@link ddsMetamodel.ViewStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View state mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View state mask</em>' attribute list.
	 * @see ddsMetamodel.ViewStateKind
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsReadCondition_View_state_mask()
	 * @model
	 * @generated
	 */
	EList<ViewStateKind> getView_state_mask();

	/**
	 * Returns the value of the '<em><b>Instance state mask</b></em>' attribute list.
	 * The list contents are of type {@link ddsMetamodel.InstanceStateKind}.
	 * The literals are from the enumeration {@link ddsMetamodel.InstanceStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance state mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance state mask</em>' attribute list.
	 * @see ddsMetamodel.InstanceStateKind
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsReadCondition_Instance_state_mask()
	 * @model
	 * @generated
	 */
	EList<InstanceStateKind> getInstance_state_mask();

	/**
	 * Returns the value of the '<em><b>Sample state mask</b></em>' attribute list.
	 * The list contents are of type {@link ddsMetamodel.SampleStateKind}.
	 * The literals are from the enumeration {@link ddsMetamodel.SampleStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample state mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample state mask</em>' attribute list.
	 * @see ddsMetamodel.SampleStateKind
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsReadCondition_Sample_state_mask()
	 * @model
	 * @generated
	 */
	EList<SampleStateKind> getSample_state_mask();

	/**
	 * Returns the value of the '<em><b>Data Reader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Reader</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Reader</em>' reference.
	 * @see #setDataReader(DdsDataReader)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsReadCondition_DataReader()
	 * @model
	 * @generated
	 */
	DdsDataReader getDataReader();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsReadCondition#getDataReader <em>Data Reader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Reader</em>' reference.
	 * @see #getDataReader()
	 * @generated
	 */
	void setDataReader(DdsDataReader value);

} // DdsReadCondition
