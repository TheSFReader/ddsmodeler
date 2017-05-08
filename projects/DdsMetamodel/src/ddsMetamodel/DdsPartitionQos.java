/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Partition Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsPartitionQos#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPartitionQos()
 * @model
 * @generated
 */
public interface DdsPartitionQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPartitionQos_Name()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getName();

} // DdsPartitionQos
