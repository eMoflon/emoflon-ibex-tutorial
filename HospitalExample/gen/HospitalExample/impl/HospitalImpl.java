package HospitalExample.impl;

import HospitalExample.HospitalExamplePackage;
import HospitalExample.HospitalExamplePackage;

import org.emoflon.smartemf.runtime.*;
import org.emoflon.smartemf.runtime.collections.*;
import org.emoflon.smartemf.persistence.SmartEMFResource;
import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.notification.NotifyStatus;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class HospitalImpl extends SmartObject implements HospitalExample.Hospital {

    protected HospitalExample.Reception reception = null;
    protected SmartESet<HospitalExample.Staff> staff = new SmartESet<HospitalExample.Staff>(this, HospitalExamplePackage.Literals.HOSPITAL__STAFF);
    protected LinkedSmartESet<HospitalExample.Department> department = new LinkedSmartESet<HospitalExample.Department>(this, HospitalExamplePackage.Literals.HOSPITAL__DEPARTMENT);
	
	protected HospitalImpl() {
		super(HospitalExamplePackage.Literals.HOSPITAL);
	}
	
    
    @Override
    public HospitalExample.Reception getReception() {
    	return this.reception;
    }
    
    @Override
    public void setReception(HospitalExample.Reception value) {
    	
    	Object oldValue = this.reception;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	Resource.Internal resource = (Resource.Internal) eResource();
    		        if(oldValue != null && value != null) {
    		        	setResourceWithoutChecks(null);
    		        }
    		        
    		        NotifyStatus status = NotifyStatus.SUCCESS_NO_NOTIFICATION;
    	if(oldValue != null) {
    	        		status = ((MinimalSObjectContainer) oldValue).resetContainment();
    	}	
    	
    		        this.reception = value;
    	
    	
    	if(value != null)
    		status = ((MinimalSObjectContainer) this.reception).setContainment(this, HospitalExamplePackage.Literals.HOSPITAL__RECEPTION);
    	
    			 	if(oldValue != null && value != null) {
    		        	setResourceWithoutChecks(resource);
    		        }
    	
    	if(status == NotifyStatus.SUCCESS_NO_NOTIFICATION || oldValue != null && value != null)
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.HOSPITAL__RECEPTION, oldValue, value, -1));
    	        	
    	        	if(HospitalExamplePackage.Literals.HOSPITAL__RECEPTION.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, HospitalExamplePackage.Literals.HOSPITAL__RECEPTION.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, HospitalExamplePackage.Literals.HOSPITAL__RECEPTION.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public SmartESet<HospitalExample.Staff> getStaff() {
    	return this.staff;
    }
    
    @Override
    public void setStaff(SmartESet<HospitalExample.Staff> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    
    @Override
    public LinkedSmartESet<HospitalExample.Department> getDepartment() {
    	return this.department;
    }
    
    @Override
    public void setDepartment(LinkedSmartESet<HospitalExample.Department> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (HospitalExamplePackage.Literals.HOSPITAL__RECEPTION.equals(eFeature)) {
    		setReception((HospitalExample.Reception) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.HOSPITAL__STAFF.equals(eFeature)) {
    		setStaff((SmartESet<HospitalExample.Staff>) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.HOSPITAL__DEPARTMENT.equals(eFeature)) {
    		setDepartment((LinkedSmartESet<HospitalExample.Department>) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (HospitalExamplePackage.Literals.HOSPITAL__RECEPTION.equals(eFeature)) {
    		setReception((HospitalExample.Reception)null); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.HOSPITAL__STAFF.equals(eFeature)) {
    		getStaff().clear(); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.HOSPITAL__DEPARTMENT.equals(eFeature)) {
    		getDepartment().clear(); 
    		return;
    	}
    	eDynamicUnset(eFeature);
    }

    @Override
    public String toString(){
		return super.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (HospitalExamplePackage.Literals.HOSPITAL__RECEPTION.equals(eFeature))
    		return getReception();
    	if (HospitalExamplePackage.Literals.HOSPITAL__STAFF.equals(eFeature))
    		return getStaff();
    	if (HospitalExamplePackage.Literals.HOSPITAL__DEPARTMENT.equals(eFeature))
    		return getDepartment();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
	    if(feature == null)
	    	return;
	    		    		
    	eDynamicInverseRemove(otherEnd, feature);
	    	}
    
    @Override
    /**
    * This method sets the resource and generates REMOVING_ADAPTER and ADD notifications
    */
    protected void setResourceOfContainments(Consumer<SmartObject> setResourceCall) {
if(getReception() != null)
	setResourceCall.accept((SmartObject) getReception());
    	for(Object obj : getStaff()) {
    		setResourceCall.accept(((SmartObject) obj));
	    		}
    	for(Object obj : getDepartment()) {
    		setResourceCall.accept(((SmartObject) obj));
	    		}
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
if(getReception() != null)
    ((SmartObject) getReception()).setResourceSilently(r);
    	for(Object obj : getStaff()) {
    		((SmartObject) obj).setResourceSilently(r);
	    		}
    	for(Object obj : getDepartment()) {
    		((SmartObject) obj).setResourceSilently(r);
	    		}
	    	}
}
