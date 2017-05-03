/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceenvironmentcloudFactoryImpl extends EFactoryImpl implements ResourceenvironmentcloudFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceenvironmentcloudFactory init() {
		try {
			ResourceenvironmentcloudFactory theResourceenvironmentcloudFactory = (ResourceenvironmentcloudFactory)EPackage.Registry.INSTANCE.getEFactory(ResourceenvironmentcloudPackage.eNS_URI);
			if (theResourceenvironmentcloudFactory != null) {
				return theResourceenvironmentcloudFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourceenvironmentcloudFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceenvironmentcloudFactoryImpl() {
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
			case ResourceenvironmentcloudPackage.RESOURCE_CONTAINER_CLOUD: return createResourceContainerCloud();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainerCloud createResourceContainerCloud() {
		ResourceContainerCloudImpl resourceContainerCloud = new ResourceContainerCloudImpl();
		return resourceContainerCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceenvironmentcloudPackage getResourceenvironmentcloudPackage() {
		return (ResourceenvironmentcloudPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourceenvironmentcloudPackage getPackage() {
		return ResourceenvironmentcloudPackage.eINSTANCE;
	}

} //ResourceenvironmentcloudFactoryImpl
