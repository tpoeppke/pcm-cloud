/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProvider;
import org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudResourceType;
import org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl.CloudProviderImpl#getCloudResources <em>Cloud Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl.CloudProviderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl.CloudProviderImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl.CloudProviderImpl#getCredential <em>Credential</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudProviderImpl extends CDOObjectImpl implements CloudProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudprofilePackage.Literals.CLOUD_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CloudResourceType> getCloudResources() {
		return (EList<CloudResourceType>)eGet(CloudprofilePackage.Literals.CLOUD_PROVIDER__CLOUD_RESOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(CloudprofilePackage.Literals.CLOUD_PROVIDER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CloudprofilePackage.Literals.CLOUD_PROVIDER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentity() {
		return (String)eGet(CloudprofilePackage.Literals.CLOUD_PROVIDER__IDENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(String newIdentity) {
		eSet(CloudprofilePackage.Literals.CLOUD_PROVIDER__IDENTITY, newIdentity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCredential() {
		return (String)eGet(CloudprofilePackage.Literals.CLOUD_PROVIDER__CREDENTIAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredential(String newCredential) {
		eSet(CloudprofilePackage.Literals.CLOUD_PROVIDER__CREDENTIAL, newCredential);
	}

} //CloudProviderImpl
