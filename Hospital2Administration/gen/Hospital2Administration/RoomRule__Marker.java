package Hospital2Administration;

import runtime.RuntimePackage;
import Hospital2Administration.Hospital2AdministrationPackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface RoomRule__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public HospitalExample.Department getCONTEXT__SRC__d();
    
    public void setCONTEXT__SRC__d(HospitalExample.Department value);
    
    public HospitalExample.Room getCREATE__SRC__ro();
    
    public void setCREATE__SRC__ro(HospitalExample.Room value);
    

}
