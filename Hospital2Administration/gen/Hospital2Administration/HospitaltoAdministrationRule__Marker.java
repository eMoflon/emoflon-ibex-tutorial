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

public interface HospitaltoAdministrationRule__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public HospitalExample.Hospital getCREATE__SRC__h();
    
    public void setCREATE__SRC__h(HospitalExample.Hospital value);
    
    public HospitalExample.Reception getCREATE__SRC__r();
    
    public void setCREATE__SRC__r(HospitalExample.Reception value);
    
    public AdministrationExample.Administration getCREATE__TRG__v();
    
    public void setCREATE__TRG__v(AdministrationExample.Administration value);
    
    public Hospital2Administration.HospitalToAdministration getCREATE__CORR__htov();
    
    public void setCREATE__CORR__htov(Hospital2Administration.HospitalToAdministration value);
    

}
