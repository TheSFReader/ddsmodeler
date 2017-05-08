/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds History Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsHistoryQos#getKind <em>Kind</em>}</li>
 *   <li>{@link ddsMetamodel.DdsHistoryQos#getDepth <em>Depth</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsHistoryQos()
 * @model
 * @generated
 */
public interface DdsHistoryQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ddsMetamodel.HistoryQosPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ddsMetamodel.HistoryQosPolicyKind
	 * @see #setKind(HistoryQosPolicyKind)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsHistoryQos_Kind()
	 * @model required="true"
	 * @generated
	 */
	HistoryQosPolicyKind getKind();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsHistoryQos#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ddsMetamodel.HistoryQosPolicyKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(HistoryQosPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(long)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsHistoryQos_Depth()
	 * @model default="1"
	 * @generated
	 */
	long getDepth();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsHistoryQos#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(long value);

} // DdsHistoryQos
