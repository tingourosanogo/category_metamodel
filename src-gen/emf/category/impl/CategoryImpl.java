/**
 */
package emf.category.impl;

import emf.category.Arrow;
import emf.category.Category;
import emf.category.CategoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emf.category.impl.CategoryImpl#getArrow <em>Arrow</em>}</li>
 *   <li>{@link emf.category.impl.CategoryImpl#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends ObjectImpl implements Category {
	/**
	 * The cached value of the '{@link #getArrow() <em>Arrow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> arrow;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<emf.category.Object> object;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CategoryPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arrow> getArrow() {
		if (arrow == null) {
			arrow = new EObjectContainmentEList<Arrow>(Arrow.class, this, CategoryPackage.CATEGORY__ARROW);
		}
		return arrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<emf.category.Object> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<emf.category.Object>(emf.category.Object.class, this,
					CategoryPackage.CATEGORY__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CategoryPackage.CATEGORY__ARROW:
			return ((InternalEList<?>) getArrow()).basicRemove(otherEnd, msgs);
		case CategoryPackage.CATEGORY__OBJECT:
			return ((InternalEList<?>) getObject()).basicRemove(otherEnd, msgs);
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
		case CategoryPackage.CATEGORY__ARROW:
			return getArrow();
		case CategoryPackage.CATEGORY__OBJECT:
			return getObject();
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
		case CategoryPackage.CATEGORY__ARROW:
			getArrow().clear();
			getArrow().addAll((Collection<? extends Arrow>) newValue);
			return;
		case CategoryPackage.CATEGORY__OBJECT:
			getObject().clear();
			getObject().addAll((Collection<? extends emf.category.Object>) newValue);
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
		case CategoryPackage.CATEGORY__ARROW:
			getArrow().clear();
			return;
		case CategoryPackage.CATEGORY__OBJECT:
			getObject().clear();
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
		case CategoryPackage.CATEGORY__ARROW:
			return arrow != null && !arrow.isEmpty();
		case CategoryPackage.CATEGORY__OBJECT:
			return object != null && !object.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoryImpl
