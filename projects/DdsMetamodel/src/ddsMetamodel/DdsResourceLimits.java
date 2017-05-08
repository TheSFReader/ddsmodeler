/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Resource Limits</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsResourceLimits#getMax_samples <em>Max samples</em>}</li>
 *   <li>{@link ddsMetamodel.DdsResourceLimits#getMax_instances <em>Max instances</em>}</li>
 *   <li>{@link ddsMetamodel.DdsResourceLimits#getMax_samples_per_instances <em>Max samples per instances</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsResourceLimits()
 * @model
 * @generated
 */
public interface DdsResourceLimits extends EObject {
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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsResourceLimits_Max_samples()
	 * @model
	 * @generated
	 */
	long getMax_samples();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsResourceLimits#getMax_samples <em>Max samples</em>}' attribute.
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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsResourceLimits_Max_instances()
	 * @model
	 * @generated
	 */
	long getMax_instances();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsResourceLimits#getMax_instances <em>Max instances</em>}' attribute.
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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsResourceLimits_Max_samples_per_instances()
	 * @model
	 * @generated
	 */
	long getMax_samples_per_instances();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsResourceLimits#getMax_samples_per_instances <em>Max samples per instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max samples per instances</em>' attribute.
	 * @see #getMax_samples_per_instances()
	 * @generated
	 */
	void setMax_samples_per_instances(long value);

} // DdsResourceLimits
