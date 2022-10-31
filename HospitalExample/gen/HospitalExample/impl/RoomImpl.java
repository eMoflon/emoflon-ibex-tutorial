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

public class RoomImpl extends SmartObject implements HospitalExample.Room {

    protected int capacity = 0;
    protected HospitalExample.Carelevel level = HospitalExample.Carelevel.WEAK;
    protected LinkedSmartESet<HospitalExample.Patient> lies = new LinkedSmartESet<HospitalExample.Patient>(this, HospitalExamplePackage.Literals.ROOM__LIES);
    protected LinkedSmartESet<HospitalExample.Nurse> nurses = new LinkedSmartESet<HospitalExample.Nurse>(this, HospitalExamplePackage.Literals.ROOM__NURSES);
	
	protected RoomImpl() {
		super(HospitalExamplePackage.Literals.ROOM);
	}
	
    
    @Override
    public int getCapacity() {
    	return this.capacity;
    }
    
    @Override
    public void setCapacity(int value) {
    	Object oldValue = this.capacity;
    	this.capacity = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.ROOM__CAPACITY, oldValue, value, -1));
    }
    
    
    @Override
    public HospitalExample.Carelevel getLevel() {
    	return this.level;
    }
    
    @Override
    public void setLevel(HospitalExample.Carelevel value) {
    	Object oldValue = this.level;
    	this.level = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.ROOM__LEVEL, oldValue, value, -1));
    }
    
    
    @Override
    public LinkedSmartESet<HospitalExample.Patient> getLies() {
    	return this.lies;
    }
    
    @Override
    public void setLies(LinkedSmartESet<HospitalExample.Patient> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    
    @Override
    public LinkedSmartESet<HospitalExample.Nurse> getNurses() {
    	return this.nurses;
    }
    
    @Override
    public void setNurses(LinkedSmartESet<HospitalExample.Nurse> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    private void addNursesAsInverse(HospitalExample.Nurse value) {
    	if(this.nurses.addInternal(value, false) == NotifyStatus.SUCCESS_NO_NOTIFICATION) {
    sendNotification(SmartEMFNotification.createAddNotification(this, HospitalExamplePackage.Literals.ROOM__NURSES, value, -1));
    	} 
    }
    
    private void removeNursesAsInverse(HospitalExample.Nurse value) {
    	nurses.removeInternal(value, false, true);
    }

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (HospitalExamplePackage.Literals.ROOM__CAPACITY.equals(eFeature)) {
    		setCapacity((int) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.ROOM__LEVEL.equals(eFeature)) {
    		setLevel((HospitalExample.Carelevel) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.ROOM__LIES.equals(eFeature)) {
    		setLies((LinkedSmartESet<HospitalExample.Patient>) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.ROOM__NURSES.equals(eFeature)) {
    		setNurses((LinkedSmartESet<HospitalExample.Nurse>) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (HospitalExamplePackage.Literals.ROOM__CAPACITY.equals(eFeature)) {
    		setCapacity((int)0); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.ROOM__LEVEL.equals(eFeature)) {
    		setLevel((HospitalExample.Carelevel)HospitalExample.Carelevel.WEAK); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.ROOM__LIES.equals(eFeature)) {
    		getLies().clear(); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.ROOM__NURSES.equals(eFeature)) {
    		getNurses().clear(); 
    		return;
    	}
    	eDynamicUnset(eFeature);
    }

    @Override
    public String toString(){
		StringBuilder b = new StringBuilder();
		b.append(super.toString());
		b.append(" (");
		if (SmartEMFConfig.simpleStringRepresentations()) {
			b.append("capacity: ");
			b.append(getCapacity());
		} else {
			b.append("capacity: ");
			b.append(getCapacity());b.append(", ");
			b.append("level: ");
			b.append(getLevel());
		}
		b.append(")");
		return b.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (HospitalExamplePackage.Literals.ROOM__CAPACITY.equals(eFeature))
    		return getCapacity();
    	if (HospitalExamplePackage.Literals.ROOM__LEVEL.equals(eFeature))
    		return getLevel();
    	if (HospitalExamplePackage.Literals.ROOM__LIES.equals(eFeature))
    		return getLies();
    	if (HospitalExamplePackage.Literals.ROOM__NURSES.equals(eFeature))
    		return getNurses();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
if (HospitalExamplePackage.Literals.ROOM__NURSES.equals(feature)) {
	addNursesAsInverse((HospitalExample.Nurse) otherEnd);
 	return;
			        }	
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
if (HospitalExamplePackage.Literals.ROOM__NURSES.equals(feature)) {
	removeNursesAsInverse((HospitalExample.Nurse) otherEnd);
 	return;
			        }
	    if(feature == null)
	    	return;
	    		    		
    	eDynamicInverseRemove(otherEnd, feature);
	    	}
    
    @Override
    /**
    * This method sets the resource and generates REMOVING_ADAPTER and ADD notifications
    */
    protected void setResourceOfContainments(Consumer<SmartObject> setResourceCall) {
    	for(Object obj : getLies()) {
    		setResourceCall.accept(((SmartObject) obj));
	    		}
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
    	for(Object obj : getLies()) {
    		((SmartObject) obj).setResourceSilently(r);
	    		}
	    	}
}
