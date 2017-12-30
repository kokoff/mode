/**
 */
package Y1403115.impl;

import Y1403115.Describable;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import Y1403115.Requirement;
import Y1403115.Y1403115Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y1403115.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Y1403115.impl.RequirementImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link Y1403115.impl.RequirementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link Y1403115.impl.RequirementImpl#getParents <em>Parents</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends IdentifiableImpl implements Requirement {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "default_description";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROGRESS_EDEFAULT = new Integer(0);
	
	/**
	 * @generated
	 */
	protected Integer progress = PROGRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> children;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> parents;
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RequirementImpl() {
		super();
		
		eAdapters().add(new AdapterImpl(){
			
			@Override
			public void notifyChanged(Notification msg){
				
				int feature = msg.getFeatureID(msg.getNotifier().getClass());
				if (feature == Y1403115Package.CUSTOMER_REQUIREMENT__PROGRESS){
					for (Requirement parent : ((Requirement) msg.getNotifier()).getParents()){
						parent.updateProgress();
					}
				}
				else if (feature == Y1403115Package.CUSTOMER_REQUIREMENT__CHILDREN){
					((Requirement) msg.getNotifier()).updateProgress();
				}
				
				
				super.notifyChanged(msg);
			}
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Y1403115Package.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y1403115Package.REQUIREMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getProgress() {
		return progress;
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setProgress(Integer newProgress) {
		if (this.getChildren().size() > 0){
			return;
		}
		
		Integer oldProgress = progress;
		progress = newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y1403115Package.REQUIREMENT__PROGRESS, oldProgress, progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList.ManyInverse<Requirement>(Requirement.class, this, Y1403115Package.REQUIREMENT__CHILDREN, Y1403115Package.REQUIREMENT__PARENTS);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getParents() {
		if (parents == null) {
			parents = new EObjectWithInverseResolvingEList.ManyInverse<Requirement>(Requirement.class, this, Y1403115Package.REQUIREMENT__PARENTS, Y1403115Package.REQUIREMENT__CHILDREN);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateProgress() {
		if (getChildren().size() <= 0){
			return;
		}
		
		Integer oldProgress = progress;
		Integer newProgress = 0;
		
		for(Requirement child : getChildren()){
			newProgress += child.getProgress();
		}
		newProgress /= getChildren().size();
		
		if (oldProgress != newProgress){
			progress = newProgress;
			
			eNotify(new ENotificationImpl(this, Notification.SET, Y1403115Package.REQUIREMENT__PROGRESS, oldProgress, newProgress));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Y1403115Package.REQUIREMENT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case Y1403115Package.REQUIREMENT__PARENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Y1403115Package.REQUIREMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case Y1403115Package.REQUIREMENT__PARENTS:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
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
			case Y1403115Package.REQUIREMENT__DESCRIPTION:
				return getDescription();
			case Y1403115Package.REQUIREMENT__PROGRESS:
				return getProgress();
			case Y1403115Package.REQUIREMENT__CHILDREN:
				return getChildren();
			case Y1403115Package.REQUIREMENT__PARENTS:
				return getParents();
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
			case Y1403115Package.REQUIREMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Y1403115Package.REQUIREMENT__PROGRESS:
				setProgress((Integer)newValue);
				return;
			case Y1403115Package.REQUIREMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Requirement>)newValue);
				return;
			case Y1403115Package.REQUIREMENT__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends Requirement>)newValue);
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
			case Y1403115Package.REQUIREMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Y1403115Package.REQUIREMENT__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
				return;
			case Y1403115Package.REQUIREMENT__CHILDREN:
				getChildren().clear();
				return;
			case Y1403115Package.REQUIREMENT__PARENTS:
				getParents().clear();
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
			case Y1403115Package.REQUIREMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Y1403115Package.REQUIREMENT__PROGRESS:
				return PROGRESS_EDEFAULT == null ? progress != null : !PROGRESS_EDEFAULT.equals(progress);
			case Y1403115Package.REQUIREMENT__CHILDREN:
				return children != null && !children.isEmpty();
			case Y1403115Package.REQUIREMENT__PARENTS:
				return parents != null && !parents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Describable.class) {
			switch (derivedFeatureID) {
				case Y1403115Package.REQUIREMENT__DESCRIPTION: return Y1403115Package.DESCRIBABLE__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Describable.class) {
			switch (baseFeatureID) {
				case Y1403115Package.DESCRIBABLE__DESCRIPTION: return Y1403115Package.REQUIREMENT__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", progress: ");
		result.append(progress);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
