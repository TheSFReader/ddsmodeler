/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDomainParticipant;
import ddsMetamodel.DdsDomainParticipantListener;
import ddsMetamodel.DdsDomainParticipantQosProfile;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsPublisher;
import ddsMetamodel.DdsSubscriber;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Domain Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsDomainParticipantImpl#getDomainParticipantName <em>Domain Participant Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDomainParticipantImpl#getDdssubscriber <em>Ddssubscriber</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDomainParticipantImpl#getDdspublisher <em>Ddspublisher</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDomainParticipantImpl#getDdsdomainparticipantqosprofile <em>Ddsdomainparticipantqosprofile</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDomainParticipantImpl#getDomainParticipantListener <em>Domain Participant Listener</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsDomainParticipantImpl#getDomainId <em>Domain Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsDomainParticipantImpl extends MinimalEObjectImpl.Container implements DdsDomainParticipant {
	/**
	 * The default value of the '{@link #getDomainParticipantName() <em>Domain Participant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainParticipantName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_PARTICIPANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainParticipantName() <em>Domain Participant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainParticipantName()
	 * @generated
	 * @ordered
	 */
	protected String domainParticipantName = DOMAIN_PARTICIPANT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDdssubscriber() <em>Ddssubscriber</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdssubscriber()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsSubscriber> ddssubscriber;

	/**
	 * The cached value of the '{@link #getDdspublisher() <em>Ddspublisher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdspublisher()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsPublisher> ddspublisher;

	/**
	 * The cached value of the '{@link #getDdsdomainparticipantqosprofile() <em>Ddsdomainparticipantqosprofile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdsdomainparticipantqosprofile()
	 * @generated
	 * @ordered
	 */
	protected DdsDomainParticipantQosProfile ddsdomainparticipantqosprofile;

	/**
	 * The cached value of the '{@link #getDomainParticipantListener() <em>Domain Participant Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainParticipantListener()
	 * @generated
	 * @ordered
	 */
	protected DdsDomainParticipantListener domainParticipantListener;

	/**
	 * The default value of the '{@link #getDomainId() <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainId()
	 * @generated
	 * @ordered
	 */
	protected static final int DOMAIN_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDomainId() <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainId()
	 * @generated
	 * @ordered
	 */
	protected int domainId = DOMAIN_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsDomainParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainParticipantName() {
		return domainParticipantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainParticipantName(String newDomainParticipantName) {
		String oldDomainParticipantName = domainParticipantName;
		domainParticipantName = newDomainParticipantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_NAME, oldDomainParticipantName, domainParticipantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsSubscriber> getDdssubscriber() {
		if (ddssubscriber == null) {
			ddssubscriber = new EObjectContainmentEList<DdsSubscriber>(DdsSubscriber.class, this, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSSUBSCRIBER);
		}
		return ddssubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsPublisher> getDdspublisher() {
		if (ddspublisher == null) {
			ddspublisher = new EObjectContainmentEList<DdsPublisher>(DdsPublisher.class, this, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSPUBLISHER);
		}
		return ddspublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDomainParticipantQosProfile getDdsdomainparticipantqosprofile() {
		if (ddsdomainparticipantqosprofile != null && ddsdomainparticipantqosprofile.eIsProxy()) {
			InternalEObject oldDdsdomainparticipantqosprofile = (InternalEObject)ddsdomainparticipantqosprofile;
			ddsdomainparticipantqosprofile = (DdsDomainParticipantQosProfile)eResolveProxy(oldDdsdomainparticipantqosprofile);
			if (ddsdomainparticipantqosprofile != oldDdsdomainparticipantqosprofile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSDOMAINPARTICIPANTQOSPROFILE, oldDdsdomainparticipantqosprofile, ddsdomainparticipantqosprofile));
			}
		}
		return ddsdomainparticipantqosprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDomainParticipantQosProfile basicGetDdsdomainparticipantqosprofile() {
		return ddsdomainparticipantqosprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdsdomainparticipantqosprofile(DdsDomainParticipantQosProfile newDdsdomainparticipantqosprofile) {
		DdsDomainParticipantQosProfile oldDdsdomainparticipantqosprofile = ddsdomainparticipantqosprofile;
		ddsdomainparticipantqosprofile = newDdsdomainparticipantqosprofile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSDOMAINPARTICIPANTQOSPROFILE, oldDdsdomainparticipantqosprofile, ddsdomainparticipantqosprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDomainParticipantListener getDomainParticipantListener() {
		return domainParticipantListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainParticipantListener(DdsDomainParticipantListener newDomainParticipantListener, NotificationChain msgs) {
		DdsDomainParticipantListener oldDomainParticipantListener = domainParticipantListener;
		domainParticipantListener = newDomainParticipantListener;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER, oldDomainParticipantListener, newDomainParticipantListener);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainParticipantListener(DdsDomainParticipantListener newDomainParticipantListener) {
		if (newDomainParticipantListener != domainParticipantListener) {
			NotificationChain msgs = null;
			if (domainParticipantListener != null)
				msgs = ((InternalEObject)domainParticipantListener).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER, null, msgs);
			if (newDomainParticipantListener != null)
				msgs = ((InternalEObject)newDomainParticipantListener).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER, null, msgs);
			msgs = basicSetDomainParticipantListener(newDomainParticipantListener, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER, newDomainParticipantListener, newDomainParticipantListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDomainId() {
		return domainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainId(int newDomainId) {
		int oldDomainId = domainId;
		domainId = newDomainId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_ID, oldDomainId, domainId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSSUBSCRIBER:
				return ((InternalEList<?>)getDdssubscriber()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSPUBLISHER:
				return ((InternalEList<?>)getDdspublisher()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER:
				return basicSetDomainParticipantListener(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_NAME:
				return getDomainParticipantName();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSSUBSCRIBER:
				return getDdssubscriber();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSPUBLISHER:
				return getDdspublisher();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSDOMAINPARTICIPANTQOSPROFILE:
				if (resolve) return getDdsdomainparticipantqosprofile();
				return basicGetDdsdomainparticipantqosprofile();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER:
				return getDomainParticipantListener();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_ID:
				return getDomainId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_NAME:
				setDomainParticipantName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSSUBSCRIBER:
				getDdssubscriber().clear();
				getDdssubscriber().addAll((Collection<? extends DdsSubscriber>)newValue);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSPUBLISHER:
				getDdspublisher().clear();
				getDdspublisher().addAll((Collection<? extends DdsPublisher>)newValue);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSDOMAINPARTICIPANTQOSPROFILE:
				setDdsdomainparticipantqosprofile((DdsDomainParticipantQosProfile)newValue);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER:
				setDomainParticipantListener((DdsDomainParticipantListener)newValue);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_ID:
				setDomainId((Integer)newValue);
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
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_NAME:
				setDomainParticipantName(DOMAIN_PARTICIPANT_NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSSUBSCRIBER:
				getDdssubscriber().clear();
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSPUBLISHER:
				getDdspublisher().clear();
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSDOMAINPARTICIPANTQOSPROFILE:
				setDdsdomainparticipantqosprofile((DdsDomainParticipantQosProfile)null);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER:
				setDomainParticipantListener((DdsDomainParticipantListener)null);
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_ID:
				setDomainId(DOMAIN_ID_EDEFAULT);
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
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_NAME:
				return DOMAIN_PARTICIPANT_NAME_EDEFAULT == null ? domainParticipantName != null : !DOMAIN_PARTICIPANT_NAME_EDEFAULT.equals(domainParticipantName);
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSSUBSCRIBER:
				return ddssubscriber != null && !ddssubscriber.isEmpty();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSPUBLISHER:
				return ddspublisher != null && !ddspublisher.isEmpty();
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSDOMAINPARTICIPANTQOSPROFILE:
				return ddsdomainparticipantqosprofile != null;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER:
				return domainParticipantListener != null;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_ID:
				return domainId != DOMAIN_ID_EDEFAULT;
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
		result.append(" (domainParticipantName: ");
		result.append(domainParticipantName);
		result.append(", domainId: ");
		result.append(domainId);
		result.append(')');
		return result.toString();
	}

} //DdsDomainParticipantImpl
