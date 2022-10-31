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

public interface PatientInReception__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public HospitalExample.Hospital getCONTEXT__SRC__h();
    
    public void setCONTEXT__SRC__h(HospitalExample.Hospital value);
    
    public HospitalExample.Patient getCREATE__SRC__p1();
    
    public void setCREATE__SRC__p1(HospitalExample.Patient value);
    
    public HospitalExample.Reception getCONTEXT__SRC__r();
    
    public void setCONTEXT__SRC__r(HospitalExample.Reception value);
    
    public AdministrationExample.Patient getCREATE__TRG__p2();
    
    public void setCREATE__TRG__p2(AdministrationExample.Patient value);
    
    public AdministrationExample.Administration getCONTEXT__TRG__v();
    
    public void setCONTEXT__TRG__v(AdministrationExample.Administration value);
    
    public Hospital2Administration.HospitalToAdministration getCONTEXT__CORR__htov();
    
    public void setCONTEXT__CORR__htov(Hospital2Administration.HospitalToAdministration value);
    
    public Hospital2Administration.PatientToPatient getCREATE__CORR__pTop();
    
    public void setCREATE__CORR__pTop(Hospital2Administration.PatientToPatient value);
    

}
