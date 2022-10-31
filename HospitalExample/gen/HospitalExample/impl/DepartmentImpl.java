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

public class DepartmentImpl extends SmartObject implements HospitalExample.Department {

    protected LinkedSmartESet<HospitalExample.Room> rooms = new LinkedSmartESet<HospitalExample.Room>(this, HospitalExamplePackage.Literals.DEPARTMENT__ROOMS);
    protected int dID = -1;
    protected LinkedSmartESet<HospitalExample.Staff> staff = new LinkedSmartESet<HospitalExample.Staff>(this, HospitalExamplePackage.Literals.DEPARTMENT__STAFF);
    protected int maxRoomCount = 0;
	
	protected DepartmentImpl() {
		super(HospitalExamplePackage.Literals.DEPARTMENT);
	}
	
    
    @Override
    public LinkedSmartESet<HospitalExample.Room> getRooms() {
    	return this.rooms;
    }
    
    @Override
    public void setRooms(LinkedSmartESet<HospitalExample.Room> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    
    @Override
    public int getDID() {
    	return this.dID;
    }
    
    @Override
    public void setDID(int value) {
    	Object oldValue = this.dID;
    	this.dID = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.DEPARTMENT__DID, oldValue, value, -1));
    }
    
    
    @Override
    public LinkedSmartESet<HospitalExample.Staff> getStaff() {
    	return this.staff;
    }
    
    @Override
    public void setStaff(LinkedSmartESet<HospitalExample.Staff> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    private void addStaffAsInverse(HospitalExample.Staff value) {
    	if(this.staff.addInternal(value, false) == NotifyStatus.SUCCESS_NO_NOTIFICATION) {
    sendNotification(SmartEMFNotification.createAddNotification(this, HospitalExamplePackage.Literals.DEPARTMENT__STAFF, value, -1));
    	} 
    }
    
    private void removeStaffAsInverse(HospitalExample.Staff value) {
    	staff.removeInternal(value, false, true);
    }
    
    @Override
    public int getMaxRoomCount() {
    	return this.maxRoomCount;
    }
    
    @Override
    public void setMaxRoomCount(int value) {
    	Object oldValue = this.maxRoomCount;
    	this.maxRoomCount = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.DEPARTMENT__MAX_ROOM_COUNT, oldValue, value, -1));
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (HospitalExamplePackage.Literals.DEPARTMENT__ROOMS.equals(eFeature)) {
    		setRooms((LinkedSmartESet<HospitalExample.Room>) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.DEPARTMENT__DID.equals(eFeature)) {
    		setDID((int) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.DEPARTMENT__STAFF.equals(eFeature)) {
    		setStaff((LinkedSmartESet<HospitalExample.Staff>) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.DEPARTMENT__MAX_ROOM_COUNT.equals(eFeature)) {
    		setMaxRoomCount((int) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (HospitalExamplePackage.Literals.DEPARTMENT__ROOMS.equals(eFeature)) {
    		getRooms().clear(); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.DEPARTMENT__DID.equals(eFeature)) {
    		setDID((int)-1); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.DEPARTMENT__STAFF.equals(eFeature)) {
    		getStaff().clear(); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.DEPARTMENT__MAX_ROOM_COUNT.equals(eFeature)) {
    		setMaxRoomCount((int)0); 
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
			b.append("dID: ");
			b.append(getDID());
		} else {
			b.append("dID: ");
			b.append(getDID());b.append(", ");
			b.append("maxRoomCount: ");
			b.append(getMaxRoomCount());
		}
		b.append(")");
		return b.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (HospitalExamplePackage.Literals.DEPARTMENT__ROOMS.equals(eFeature))
    		return getRooms();
    	if (HospitalExamplePackage.Literals.DEPARTMENT__DID.equals(eFeature))
    		return getDID();
    	if (HospitalExamplePackage.Literals.DEPARTMENT__STAFF.equals(eFeature))
    		return getStaff();
    	if (HospitalExamplePackage.Literals.DEPARTMENT__MAX_ROOM_COUNT.equals(eFeature))
    		return getMaxRoomCount();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
if (HospitalExamplePackage.Literals.DEPARTMENT__STAFF.equals(feature)) {
	addStaffAsInverse((HospitalExample.Staff) otherEnd);
 	return;
			        }	
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
if (HospitalExamplePackage.Literals.DEPARTMENT__STAFF.equals(feature)) {
	removeStaffAsInverse((HospitalExample.Staff) otherEnd);
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
    	for(Object obj : getRooms()) {
    		setResourceCall.accept(((SmartObject) obj));
	    		}
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
    	for(Object obj : getRooms()) {
    		((SmartObject) obj).setResourceSilently(r);
	    		}
	    	}
}
