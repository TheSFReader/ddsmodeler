/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDuration#getSec <em>Sec</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDuration#getNanoSec <em>Nano Sec</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDuration()
 * @model
 * @generated
 */
public interface DdsDuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sec</em>' attribute.
	 * @see #setSec(long)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDuration_Sec()
	 * @model
	 * @generated
	 */
	long getSec();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDuration#getSec <em>Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sec</em>' attribute.
	 * @see #getSec()
	 * @generated
	 */
	void setSec(long value);

	/**
	 * Returns the value of the '<em><b>Nano Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nano Sec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nano Sec</em>' attribute.
	 * @see #setNanoSec(long)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDuration_NanoSec()
	 * @model
	 * @generated
	 */
	long getNanoSec();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDuration#getNanoSec <em>Nano Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nano Sec</em>' attribute.
	 * @see #getNanoSec()
	 * @generated
	 */
	void setNanoSec(long value);

} // DdsDuration
