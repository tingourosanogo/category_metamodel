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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see emf.category.CategoryPackage
 * @generated
 */
public class CategoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CategoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CategoryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorySwitch<Adapter> modelSwitch = new CategorySwitch<Adapter>() {
		@Override
		public Adapter caseCategory(Category object) {
			return createCategoryAdapter();
		}

		@Override
		public Adapter caseArrow(Arrow object) {
			return createArrowAdapter();
		}

		@Override
		public Adapter caseObject(emf.category.Object object) {
			return createObjectAdapter();
		}

		@Override
		public Adapter caseMorphism(Morphism object) {
			return createMorphismAdapter();
		}

		@Override
		public Adapter caseID(ID object) {
			return createIDAdapter();
		}

		@Override
		public Adapter caseFunctor(Functor object) {
			return createFunctorAdapter();
		}

		@Override
		public Adapter caseComposition(Composition object) {
			return createCompositionAdapter();
		}

		@Override
		public Adapter caseNaturaltranformation(Naturaltranformation object) {
			return createNaturaltranformationAdapter();
		}

		@Override
		public Adapter caseCommutearrow(Commutearrow object) {
			return createCommutearrowAdapter();
		}

		@Override
		public Adapter caseMonomorphism(Monomorphism object) {
			return createMonomorphismAdapter();
		}

		@Override
		public Adapter caseEpimorphism(Epimorphism object) {
			return createEpimorphismAdapter();
		}

		@Override
		public Adapter caseIsomorphism(Isomorphism object) {
			return createIsomorphismAdapter();
		}

		@Override
		public Adapter caseEndomorphism(Endomorphism object) {
			return createEndomorphismAdapter();
		}

		@Override
		public Adapter caseEndofunctor(Endofunctor object) {
			return createEndofunctorAdapter();
		}

		@Override
		public Adapter caseSimple(Simple object) {
			return createSimpleAdapter();
		}

		@Override
		public Adapter caseSet(Set object) {
			return createSetAdapter();
		}

		@Override
		public Adapter caseLimit(Limit object) {
			return createLimitAdapter();
		}

		@Override
		public Adapter caseColimit(Colimit object) {
			return createColimitAdapter();
		}

		@Override
		public Adapter caseProduct(Product object) {
			return createProductAdapter();
		}

		@Override
		public Adapter caseCoproduct(Coproduct object) {
			return createCoproductAdapter();
		}

		@Override
		public Adapter caseTerminal(Terminal object) {
			return createTerminalAdapter();
		}

		@Override
		public Adapter caseInitial(Initial object) {
			return createInitialAdapter();
		}

		@Override
		public Adapter caseEqualizer(Equalizer object) {
			return createEqualizerAdapter();
		}

		@Override
		public Adapter caseCoequalizer(Coequalizer object) {
			return createCoequalizerAdapter();
		}

		@Override
		public Adapter casePullback(Pullback object) {
			return createPullbackAdapter();
		}

		@Override
		public Adapter casePushout(Pushout object) {
			return createPushoutAdapter();
		}

		@Override
		public Adapter caseGenerallimit(Generallimit object) {
			return createGenerallimitAdapter();
		}

		@Override
		public Adapter caseGeneralcolimit(Generalcolimit object) {
			return createGeneralcolimitAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Arrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Arrow
	 * @generated
	 */
	public Adapter createArrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Morphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Morphism
	 * @generated
	 */
	public Adapter createMorphismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.ID
	 * @generated
	 */
	public Adapter createIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Functor <em>Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Functor
	 * @generated
	 */
	public Adapter createFunctorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Naturaltranformation <em>Naturaltranformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Naturaltranformation
	 * @generated
	 */
	public Adapter createNaturaltranformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Commutearrow <em>Commutearrow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Commutearrow
	 * @generated
	 */
	public Adapter createCommutearrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Monomorphism <em>Monomorphism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Monomorphism
	 * @generated
	 */
	public Adapter createMonomorphismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Epimorphism <em>Epimorphism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Epimorphism
	 * @generated
	 */
	public Adapter createEpimorphismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Isomorphism <em>Isomorphism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Isomorphism
	 * @generated
	 */
	public Adapter createIsomorphismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Endomorphism <em>Endomorphism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Endomorphism
	 * @generated
	 */
	public Adapter createEndomorphismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Endofunctor <em>Endofunctor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Endofunctor
	 * @generated
	 */
	public Adapter createEndofunctorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Simple
	 * @generated
	 */
	public Adapter createSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Set
	 * @generated
	 */
	public Adapter createSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Limit
	 * @generated
	 */
	public Adapter createLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Colimit <em>Colimit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Colimit
	 * @generated
	 */
	public Adapter createColimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Coproduct <em>Coproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Coproduct
	 * @generated
	 */
	public Adapter createCoproductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Terminal
	 * @generated
	 */
	public Adapter createTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Initial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Initial
	 * @generated
	 */
	public Adapter createInitialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Equalizer <em>Equalizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Equalizer
	 * @generated
	 */
	public Adapter createEqualizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Coequalizer <em>Coequalizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Coequalizer
	 * @generated
	 */
	public Adapter createCoequalizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Pullback <em>Pullback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Pullback
	 * @generated
	 */
	public Adapter createPullbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Pushout <em>Pushout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Pushout
	 * @generated
	 */
	public Adapter createPushoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Generallimit <em>Generallimit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Generallimit
	 * @generated
	 */
	public Adapter createGenerallimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.category.Generalcolimit <em>Generalcolimit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.category.Generalcolimit
	 * @generated
	 */
	public Adapter createGeneralcolimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CategoryAdapterFactory
