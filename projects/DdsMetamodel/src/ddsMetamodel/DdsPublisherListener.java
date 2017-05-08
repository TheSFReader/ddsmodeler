/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Publisher Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsPublisherListener#getName <em>Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsPublisherListener#getListenedStatus <em>Listened Status</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisherListener()
 * @model
 * @generated
 */
public interface DdsPublisherListener extends EObject {
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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisherListener_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsPublisherListener#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Listened Status</b></em>' attribute list.
	 * The list contents are of type {@link ddsMetamodel.PublisherStatus}.
	 * The literals are from the enumeration {@link ddsMetamodel.PublisherStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listened Status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listened Status</em>' attribute list.
	 * @see ddsMetamodel.PublisherStatus
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisherListener_ListenedStatus()
	 * @model
	 * @generated
	 */
	EList<PublisherStatus> getListenedStatus();

} // DdsPublisherListener
