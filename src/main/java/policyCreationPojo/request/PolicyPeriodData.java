package policyCreationPojo.request;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "policyPeriodData",namespace = "http://guidewire.com/pc/ws/gw/webservice/pc/pc1000/job/SubmissionAPI")
public class    PolicyPeriodData {

    @XmlElement(required = true, name = "AssignedRisk")
    protected boolean assignedRisk;
    @XmlElement(required = true, name = "BaseState")
    protected String baseState;

    @XmlElement(required = true, name = "BusinessAutoLine")
    protected BusinessAutoLine businessAutoLine;
    public boolean isAssignedRisk() {
        return assignedRisk;
    }

    public void setAssignedRisk(boolean value) {
        this.assignedRisk = value;
    }

    public String getBaseState() {
        return baseState;
    }

    public void setBaseState(String value) {
        this.baseState = value;
    }

    public BusinessAutoLine getBusinessAutoLine() {
        return businessAutoLine;
    }

    public void setBusinessAutoLine(BusinessAutoLine businessAutoLine) {
        this.businessAutoLine = businessAutoLine;
    }

}
