/**
 */
package emf.category.util;

import emf.category.Arrow;
import emf.category.Category;
import emf.category.CategoryPackage;
import emf.category.Coequalizer;
import emf.category.Colimit;
import emf.category.Commutearrow;
import emf.category.Composition;
import emf.category.Coproduct;
import emf.category.Endofunctor;
import emf.category.Endomorphism;
import emf.category.Epimorphism;
import emf.category.Equalizer;
import emf.category.Functor;
import emf.category.Generalcolimit;
import emf.category.Generallimit;
import emf.category.ID;
import emf.category.Initial;
import emf.category.Isomorphism;
import emf.category.Limit;
import emf.category.Monomorphism;
import emf.category.Morphism;
import emf.category.Naturaltranformation;

import emf.category.Product;
import emf.category.Pullback;
import emf.category.Pushout;
import emf.category.Set;
import emf.category.Simple;
import emf.category.Terminal;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see emf.category.CategoryPackage
 * @generated
 */
public class CategorySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CategoryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorySwitch() {
		if (modelPackage == null) {
			modelPackage = CategoryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CategoryPackage.CATEGORY: {
			Category category = (Category) theEObject;
			T result = caseCategory(category);
			if (result == null)
				result = caseObject(category);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.ARROW: {
			Arrow arrow = (Arrow) theEObject;
			T result = caseArrow(arrow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.OBJECT: {
			emf.category.Object object = (emf.category.Object) theEObject;
			T result = caseObject(object);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.MORPHISM: {
			Morphism morphism = (Morphism) theEObject;
			T result = caseMorphism(morphism);
			if (result == null)
				result = caseArrow(morphism);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.ID: {
			ID id = (ID) theEObject;
			T result = caseID(id);
			if (result == null)
				result = caseArrow(id);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.FUNCTOR: {
			Functor functor = (Functor) theEObject;
			T result = caseFunctor(functor);
			if (result == null)
				result = caseArrow(functor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.COMPOSITION: {
			Composition composition = (Composition) theEObject;
			T result = caseComposition(composition);
			if (result == null)
				result = caseArrow(composition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.NATURALTRANFORMATION: {
			Naturaltranformation naturaltranformation = (Naturaltranformation) theEObject;
			T result = caseNaturaltranformation(naturaltranformation);
			if (result == null)
				result = caseArrow(naturaltranformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.COMMUTEARROW: {
			Commutearrow commutearrow = (Commutearrow) theEObject;
			T result = caseCommutearrow(commutearrow);
			if (result == null)
				result = caseArrow(commutearrow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.MONOMORPHISM: {
			Monomorphism monomorphism = (Monomorphism) theEObject;
			T result = caseMonomorphism(monomorphism);
			if (result == null)
				result = caseMorphism(monomorphism);
			if (result == null)
				result = caseArrow(monomorphism);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.EPIMORPHISM: {
			Epimorphism epimorphism = (Epimorphism) theEObject;
			T result = caseEpimorphism(epimorphism);
			if (result == null)
				result = caseMorphism(epimorphism);
			if (result == null)
				result = caseArrow(epimorphism);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.ISOMORPHISM: {
			Isomorphism isomorphism = (Isomorphism) theEObject;
			T result = caseIsomorphism(isomorphism);
			if (result == null)
				result = caseMorphism(isomorphism);
			if (result == null)
				result = caseArrow(isomorphism);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.ENDOMORPHISM: {
			Endomorphism endomorphism = (Endomorphism) theEObject;
			T result = caseEndomorphism(endomorphism);
			if (result == null)
				result = caseMorphism(endomorphism);
			if (result == null)
				result = caseArrow(endomorphism);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.ENDOFUNCTOR: {
			Endofunctor endofunctor = (Endofunctor) theEObject;
			T result = caseEndofunctor(endofunctor);
			if (result == null)
				result = caseFunctor(endofunctor);
			if (result == null)
				result = caseArrow(endofunctor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.SIMPLE: {
			Simple simple = (Simple) theEObject;
			T result = caseSimple(simple);
			if (result == null)
				result = caseObject(simple);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.SET: {
			Set set = (Set) theEObject;
			T result = caseSet(set);
			if (result == null)
				result = caseObject(set);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.LIMIT: {
			Limit limit = (Limit) theEObject;
			T result = caseLimit(limit);
			if (result == null)
				result = caseObject(limit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.COLIMIT: {
			Colimit colimit = (Colimit) theEObject;
			T result = caseColimit(colimit);
			if (result == null)
				result = caseObject(colimit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.PRODUCT: {
			Product product = (Product) theEObject;
			T result = caseProduct(product);
			if (result == null)
				result = caseLimit(product);
			if (result == null)
				result = caseObject(product);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.COPRODUCT: {
			Coproduct coproduct = (Coproduct) theEObject;
			T result = caseCoproduct(coproduct);
			if (result == null)
				result = caseColimit(coproduct);
			if (result == null)
				result = caseObject(coproduct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.TERMINAL: {
			Terminal terminal = (Terminal) theEObject;
			T result = caseTerminal(terminal);
			if (result == null)
				result = caseLimit(terminal);
			if (result == null)
				result = caseObject(terminal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.INITIAL: {
			Initial initial = (Initial) theEObject;
			T result = caseInitial(initial);
			if (result == null)
				result = caseColimit(initial);
			if (result == null)
				result = caseObject(initial);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.EQUALIZER: {
			Equalizer equalizer = (Equalizer) theEObject;
			T result = caseEqualizer(equalizer);
			if (result == null)
				result = caseLimit(equalizer);
			if (result == null)
				result = caseObject(equalizer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.COEQUALIZER: {
			Coequalizer coequalizer = (Coequalizer) theEObject;
			T result = caseCoequalizer(coequalizer);
			if (result == null)
				result = caseColimit(coequalizer);
			if (result == null)
				result = caseObject(coequalizer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.PULLBACK: {
			Pullback pullback = (Pullback) theEObject;
			T result = casePullback(pullback);
			if (result == null)
				result = caseLimit(pullback);
			if (result == null)
				result = caseObject(pullback);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.PUSHOUT: {
			Pushout pushout = (Pushout) theEObject;
			T result = casePushout(pushout);
			if (result == null)
				result = caseColimit(pushout);
			if (result == null)
				result = caseObject(pushout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.GENERALLIMIT: {
			Generallimit generallimit = (Generallimit) theEObject;
			T result = caseGenerallimit(generallimit);
			if (result == null)
				result = caseLimit(generallimit);
			if (result == null)
				result = caseObject(generallimit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CategoryPackage.GENERALCOLIMIT: {
			Generalcolimit generalcolimit = (Generalcolimit) theEObject;
			T result = caseGeneralcolimit(generalcolimit);
			if (result == null)
				result = caseColimit(generalcolimit);
			if (result == null)
				result = caseObject(generalcolimit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrow(Arrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(emf.category.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Morphism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Morphism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMorphism(Morphism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID(ID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctor(Functor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naturaltranformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naturaltranformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaturaltranformation(Naturaltranformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commutearrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commutearrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommutearrow(Commutearrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monomorphism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monomorphism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonomorphism(Monomorphism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Epimorphism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Epimorphism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpimorphism(Epimorphism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Isomorphism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Isomorphism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsomorphism(Isomorphism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endomorphism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endomorphism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndomorphism(Endomorphism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endofunctor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endofunctor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndofunctor(Endofunctor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimple(Simple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimit(Limit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colimit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colimit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColimit(Colimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coproduct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coproduct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoproduct(Coproduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitial(Initial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equalizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equalizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualizer(Equalizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coequalizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coequalizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoequalizer(Coequalizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pullback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pullback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePullback(Pullback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pushout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pushout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushout(Pushout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generallimit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generallimit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerallimit(Generallimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalcolimit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalcolimit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralcolimit(Generalcolimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CategorySwitch
