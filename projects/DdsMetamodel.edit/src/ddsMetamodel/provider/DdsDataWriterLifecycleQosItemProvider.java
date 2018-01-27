/**
 */
package ddsMetamodel.provider;


import ddsMetamodel.DdsDataWriterLifecycleQos;
import ddsMetamodel.DdsMetamodelFactory;
import ddsMetamodel.DdsMetamodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ddsMetamodel.DdsDataWriterLifecycleQos} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DdsDataWriterLifecycleQosItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDataWriterLifecycleQosItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAutodispose_unregistered_instancesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Autodispose unregistered instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutodispose_unregistered_instancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DdsDataWriterLifecycleQos_autodispose_unregistered_instances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DdsDataWriterLifecycleQos_autodispose_unregistered_instances_feature", "_UI_DdsDataWriterLifecycleQos_type"),
				 DdsMetamodelPackage.Literals.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTODISPOSE_UNREGISTERED_INSTANCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DdsDataWriterLifecycleQos.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DdsDataWriterLifecycleQos"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DdsDataWriterLifecycleQos ddsDataWriterLifecycleQos = (DdsDataWriterLifecycleQos)object;
		return getString("_UI_DdsDataWriterLifecycleQos_type") + " " + ddsDataWriterLifecycleQos.isAutodispose_unregistered_instances();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DdsDataWriterLifecycleQos.class)) {
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTODISPOSE_UNREGISTERED_INSTANCES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY:
			case DdsMetamodelPackage.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY,
				 DdsMetamodelFactory.eINSTANCE.createDdsDuration()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY,
				 DdsMetamodelFactory.eINSTANCE.createDdsDuration()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DdsMetamodelPackage.Literals.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOPURGE_SUSPENDED_SAMPLES_DELAY ||
			childFeature == DdsMetamodelPackage.Literals.DDS_DATA_WRITER_LIFECYCLE_QOS__AUTOUNREGISTER_INSTANCE_DELAY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DdsMetamodelEditPlugin.INSTANCE;
	}

}
