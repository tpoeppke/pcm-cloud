/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudprofileFactoryImpl extends EFactoryImpl implements CloudprofileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudprofileFactory init() {
		try {
			CloudprofileFactory theCloudprofileFactory = (CloudprofileFactory)EPackage.Registry.INSTANCE.getEFactory(CloudprofilePackage.eNS_URI);
			if (theCloudprofileFactory != null) {
				return theCloudprofileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CloudprofileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudprofileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CloudprofilePackage.CLOUD_PROFILE: return (EObject)createCloudProfile();
			case CloudprofilePackage.CLOUD_PROVIDER: return (EObject)createCloudProvider();
			case CloudprofilePackage.VM_TYPE: return (EObject)createVMType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProfile createCloudProfile() {
		CloudProfileImpl cloudProfile = new CloudProfileImpl();
		return cloudProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProvider createCloudProvider() {
		CloudProviderImpl cloudProvider = new CloudProviderImpl();
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMType createVMType() {
		VMTypeImpl vmType = new VMTypeImpl();
		return vmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudprofilePackage getCloudprofilePackage() {
		return (CloudprofilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CloudprofilePackage getPackage() {
		return CloudprofilePackage.eINSTANCE;
	}

} //CloudprofileFactoryImpl
