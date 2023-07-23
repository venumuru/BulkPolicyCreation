package policyCreationPojo.request;

import policyCreationPojo.request.PrimaryContactRoles.PolicyContactRoles;
import policyCreationPojo.request.PrimaryNamedInsured.PrimaryNamedInsured;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "assignedRisk",
        "baseState","businessAutoLine","periodAnswers","periodEnd","policy","policyContactRoles","policyLocations","preferredCoverageCurrency","preferredSettlementCurrency","primaryNamedInsured"
        ,"uwCompany","writtenDate"
})
@XmlRootElement(name = "policyPeriodData",namespace = "http://guidewire.com/pc/ws/gw/webservice/pc/pc1000/job/SubmissionAPI")
public class PolicyPeriodData {

    @XmlElement(required = true, name = "AssignedRisk")
    protected boolean assignedRisk;
    @XmlElement(required = true, name = "BaseState")
    protected String baseState;
    @XmlElement(required = true, name = "BusinessAutoLine")
    protected BusinessAutoLine businessAutoLine;
    @XmlElement(required = true, name = "PeriodAnswers")
    protected PeriodAnswers periodAnswers;

    @XmlElement(required = true,name = "PolicyContactRoles")
    protected PolicyContactRoles policyContactRoles;
    @XmlElement(required = true,name = "PrimaryNamedInsured")
    protected PrimaryNamedInsured primaryNamedInsured;
    @XmlElement(required = true,name = "PolicyLocations")
    protected PolicyLocations policyLocations;
    @XmlElement(required = true,name = "PreferredCoverageCurrency")
    protected String preferredCoverageCurrency;
    @XmlElement(required = true,name = "PreferredSettlementCurrency")
    protected String preferredSettlementCurrency;

    @XmlElement(required = true,name = "UWCompany")
    protected UWCompany uwCompany;
    @XmlElement(required = true,name = "WrittenDate")
    protected String writtenDate;

    @XmlElement(required = true,name = "PeriodEnd")
    protected String periodEnd;
    @XmlElement(required = true,name = "Policy")
    protected Policy policy;


    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }
    public String getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }
    public PolicyContactRoles getPolicyContactRoles() {
        return policyContactRoles;
    }

    public void setPolicyContactRoles(PolicyContactRoles policyContactRoles) {
        this.policyContactRoles = policyContactRoles;
    }
    public PolicyLocations getPolicyLocations() {
        return policyLocations;
    }

    public void setPolicyLocations(PolicyLocations policyLocations) {
        this.policyLocations = policyLocations;
    }

    public String getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(String writtenDate) {
        this.writtenDate = writtenDate;
    }
    public UWCompany getUwCompany() {
        return uwCompany;
    }

    public void setUwCompany(UWCompany uwCompany) {
        this.uwCompany = uwCompany;
    }
    public String getPreferredCoverageCurrency() {
        return preferredCoverageCurrency;
    }

    public void setPreferredCoverageCurrency(String preferredCoverageCurrency) {
        this.preferredCoverageCurrency = preferredCoverageCurrency;
    }

    public String getPreferredSettlementCurrency() {
        return preferredSettlementCurrency;
    }

    public void setPreferredSettlementCurrency(String preferredSettlementCurrency) {
        this.preferredSettlementCurrency = preferredSettlementCurrency;
    }
    public PrimaryNamedInsured getPrimaryNamedInsured() {
        return primaryNamedInsured;
    }
    public void setPrimaryNamedInsured(PrimaryNamedInsured primaryNamedInsured) {
        this.primaryNamedInsured = primaryNamedInsured;
    }
    public PeriodAnswers getPeriodAnswers() {
        return periodAnswers;
    }

    public void setPeriodAnswers(PeriodAnswers periodAnswers) {
        this.periodAnswers = periodAnswers;
    }


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


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "UWCompany")
    public static class UWCompany{
        @XmlElement(name = "Code")
        private String code;

        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "Policy")
    public static class Policy{
        @XmlElement(name = "PrimaryLanguage",defaultValue = "en_US")
        private String primaryLanguage;
        @XmlElement(name = "PriorPremiums")
        private String priorPremiums;

        public String getPrimaryLanguage() {
            return primaryLanguage;
        }

        public void setPrimaryLanguage(String primaryLanguage) {
            this.primaryLanguage = primaryLanguage;
        }

        public String getPriorPremiums() {
            return priorPremiums;
        }

        public void setPriorPremiums(String priorPremiums) {
            this.priorPremiums = priorPremiums;
        }
    }
}
