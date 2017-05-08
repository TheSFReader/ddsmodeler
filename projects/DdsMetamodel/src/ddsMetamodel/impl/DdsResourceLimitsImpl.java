/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsResourceLimits;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Resource Limits</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsResourceLimitsImpl#getMax_samples <em>Max samples</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsResourceLimitsImpl#getMax_instances <em>Max instances</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsResourceLimitsImpl#getMax_samples_per_instances <em>Max samples per instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsResourceLimitsImpl extends MinimalEObjectImpl.Container implements DdsResourceLimits {
	/**
	 * The default value of the '{@link #getMax_samples() <em>Max samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_samples()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_SAMPLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMax_samples() <em>Max samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_samples()
	 * @generated
	 * @ordered
	 */
	protected long max_samples = MAX_SAMPLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_instances() <em>Max instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_instances()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_INSTANCES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMax_instances() <em>Max instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_instances()
	 * @generated
	 * @ordered
	 */
	protected long max_instances = MAX_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_samples_per_instances() <em>Max samples per instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_samples_per_instances()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_SAMPLES_PER_INSTANCES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMax_samples_per_instances() <em>Max samples per instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_samples_per_instances()
	 * @generated
	 * @ordered
	 */
	protected long max_samples_per_instances = MAX_SAMPLES_PER_INSTANCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsResourceLimitsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_RESOURCE_LIMITS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMax_samples() {
		return max_samples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_samples(long newMax_samples) {
		long oldMax_samples = max_samples;
		max_samples = newMax_samples;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_SAMPLES, oldMax_samples, max_samples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMax_instances() {
		return max_instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_instances(long newMax_instances) {
		long oldMax_instances = max_instances;
		max_instances = newMax_instances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_INSTANCES, oldMax_instances, max_instances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMax_samples_per_instances() {
		return max_samples_per_instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_samples_per_instances(long newMax_samples_per_instances) {
		long oldMax_samples_per_instances = max_samples_per_instances;
		max_samples_per_instances = newMax_samples_per_instances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_SAMPLES_PER_INSTANCES, oldMax_samples_per_instances, max_samples_per_instances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_SAMPLES:
				return getMax_samples();
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_INSTANCES:
				return getMax_instances();
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_SAMPLES_PER_INSTANCES:
				return getMax_samples_per_instances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_SAMPLES:
				setMax_samples((Long)newValue);
				return;
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_INSTANCES:
				setMax_instances((Long)newValue);
				return;
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_SAMPLES_PER_INSTANCES:
				setMax_samples_per_instances((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_SAMPLES:
				setMax_samples(MAX_SAMPLES_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_INSTANCES:
				setMax_instances(MAX_INSTANCES_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_SAMPLES_PER_INSTANCES:
				setMax_samples_per_instances(MAX_SAMPLES_PER_INSTANCES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_SAMPLES:
				return max_samples != MAX_SAMPLES_EDEFAULT;
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_INSTANCES:
				return max_instances != MAX_INSTANCES_EDEFAULT;
			case DdsMetamodelPackage.DDS_RESOURCE_LIMITS__MAX_SAMPLES_PER_INSTANCES:
				return max_samples_per_instances != MAX_SAMPLES_PER_INSTANCES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (max_samples: ");
		result.append(max_samples);
		result.append(", max_instances: ");
		result.append(max_instances);
		result.append(", max_samples_per_instances: ");
		result.append(max_samples_per_instances);
		result.append(')');
		return result.toString();
	}

} //DdsResourceLimitsImpl
