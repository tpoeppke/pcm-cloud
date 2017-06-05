/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofilePackage;
import org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.VMType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl.VMTypeImpl#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl.VMTypeImpl#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl.VMTypeImpl#getMinRAM <em>Min RAM</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl.VMTypeImpl#getMaxRAM <em>Max RAM</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl.VMTypeImpl#getMinProcessingRate <em>Min Processing Rate</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.impl.VMTypeImpl#getMaxProcessingRate <em>Max Processing Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VMTypeImpl extends CloudResourceTypeImpl implements VMType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudprofilePackage.Literals.VM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxCores() {
		return (Integer)eGet(CloudprofilePackage.Literals.VM_TYPE__MAX_CORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCores(int newMaxCores) {
		eSet(CloudprofilePackage.Literals.VM_TYPE__MAX_CORES, newMaxCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinCores() {
		return (Integer)eGet(CloudprofilePackage.Literals.VM_TYPE__MIN_CORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCores(int newMinCores) {
		eSet(CloudprofilePackage.Literals.VM_TYPE__MIN_CORES, newMinCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinRAM() {
		return (Float)eGet(CloudprofilePackage.Literals.VM_TYPE__MIN_RAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRAM(float newMinRAM) {
		eSet(CloudprofilePackage.Literals.VM_TYPE__MIN_RAM, newMinRAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxRAM() {
		return (Float)eGet(CloudprofilePackage.Literals.VM_TYPE__MAX_RAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRAM(float newMaxRAM) {
		eSet(CloudprofilePackage.Literals.VM_TYPE__MAX_RAM, newMaxRAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinProcessingRate() {
		return (Float)eGet(CloudprofilePackage.Literals.VM_TYPE__MIN_PROCESSING_RATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinProcessingRate(float newMinProcessingRate) {
		eSet(CloudprofilePackage.Literals.VM_TYPE__MIN_PROCESSING_RATE, newMinProcessingRate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxProcessingRate() {
		return (Float)eGet(CloudprofilePackage.Literals.VM_TYPE__MAX_PROCESSING_RATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxProcessingRate(float newMaxProcessingRate) {
		eSet(CloudprofilePackage.Literals.VM_TYPE__MAX_PROCESSING_RATE, newMaxProcessingRate);
	}

} //VMTypeImpl
