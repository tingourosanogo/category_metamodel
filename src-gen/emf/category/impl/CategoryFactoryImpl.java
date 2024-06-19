/**
 */
package emf.category.impl;

import emf.category.Category;
import emf.category.CategoryFactory;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CategoryFactoryImpl extends EFactoryImpl implements CategoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CategoryFactory init() {
		try {
			CategoryFactory theCategoryFactory = (CategoryFactory) EPackage.Registry.INSTANCE
					.getEFactory(CategoryPackage.eNS_URI);
			if (theCategoryFactory != null) {
				return theCategoryFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CategoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryFactoryImpl() {
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
		case CategoryPackage.CATEGORY:
			return createCategory();
		case CategoryPackage.MORPHISM:
			return createMorphism();
		case CategoryPackage.ID:
			return createID();
		case CategoryPackage.FUNCTOR:
			return createFunctor();
		case CategoryPackage.COMPOSITION:
			return createComposition();
		case CategoryPackage.NATURALTRANFORMATION:
			return createNaturaltranformation();
		case CategoryPackage.COMMUTEARROW:
			return createCommutearrow();
		case CategoryPackage.MONOMORPHISM:
			return createMonomorphism();
		case CategoryPackage.EPIMORPHISM:
			return createEpimorphism();
		case CategoryPackage.ISOMORPHISM:
			return createIsomorphism();
		case CategoryPackage.ENDOMORPHISM:
			return createEndomorphism();
		case CategoryPackage.ENDOFUNCTOR:
			return createEndofunctor();
		case CategoryPackage.SIMPLE:
			return createSimple();
		case CategoryPackage.SET:
			return createSet();
		case CategoryPackage.LIMIT:
			return createLimit();
		case CategoryPackage.COLIMIT:
			return createColimit();
		case CategoryPackage.PRODUCT:
			return createProduct();
		case CategoryPackage.COPRODUCT:
			return createCoproduct();
		case CategoryPackage.TERMINAL:
			return createTerminal();
		case CategoryPackage.INITIAL:
			return createInitial();
		case CategoryPackage.EQUALIZER:
			return createEqualizer();
		case CategoryPackage.COEQUALIZER:
			return createCoequalizer();
		case CategoryPackage.PULLBACK:
			return createPullback();
		case CategoryPackage.PUSHOUT:
			return createPushout();
		case CategoryPackage.GENERALLIMIT:
			return createGenerallimit();
		case CategoryPackage.GENERALCOLIMIT:
			return createGeneralcolimit();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Morphism createMorphism() {
		MorphismImpl morphism = new MorphismImpl();
		return morphism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ID createID() {
		IDImpl id = new IDImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functor createFunctor() {
		FunctorImpl functor = new FunctorImpl();
		return functor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Naturaltranformation createNaturaltranformation() {
		NaturaltranformationImpl naturaltranformation = new NaturaltranformationImpl();
		return naturaltranformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commutearrow createCommutearrow() {
		CommutearrowImpl commutearrow = new CommutearrowImpl();
		return commutearrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monomorphism createMonomorphism() {
		MonomorphismImpl monomorphism = new MonomorphismImpl();
		return monomorphism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Epimorphism createEpimorphism() {
		EpimorphismImpl epimorphism = new EpimorphismImpl();
		return epimorphism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isomorphism createIsomorphism() {
		IsomorphismImpl isomorphism = new IsomorphismImpl();
		return isomorphism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endomorphism createEndomorphism() {
		EndomorphismImpl endomorphism = new EndomorphismImpl();
		return endomorphism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endofunctor createEndofunctor() {
		EndofunctorImpl endofunctor = new EndofunctorImpl();
		return endofunctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple createSimple() {
		SimpleImpl simple = new SimpleImpl();
		return simple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Limit createLimit() {
		LimitImpl limit = new LimitImpl();
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colimit createColimit() {
		ColimitImpl colimit = new ColimitImpl();
		return colimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coproduct createCoproduct() {
		CoproductImpl coproduct = new CoproductImpl();
		return coproduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initial createInitial() {
		InitialImpl initial = new InitialImpl();
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equalizer createEqualizer() {
		EqualizerImpl equalizer = new EqualizerImpl();
		return equalizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coequalizer createCoequalizer() {
		CoequalizerImpl coequalizer = new CoequalizerImpl();
		return coequalizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pullback createPullback() {
		PullbackImpl pullback = new PullbackImpl();
		return pullback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pushout createPushout() {
		PushoutImpl pushout = new PushoutImpl();
		return pushout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generallimit createGenerallimit() {
		GenerallimitImpl generallimit = new GenerallimitImpl();
		return generallimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalcolimit createGeneralcolimit() {
		GeneralcolimitImpl generalcolimit = new GeneralcolimitImpl();
		return generalcolimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryPackage getCategoryPackage() {
		return (CategoryPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CategoryPackage getPackage() {
		return CategoryPackage.eINSTANCE;
	}

} //CategoryFactoryImpl
