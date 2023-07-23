package policyCreationPojo.request.PrimaryContactRoles;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PolicyContactRoles")
@XmlType(propOrder = {
        "policyContactRolesEntry",
})
public class PolicyContactRoles {

    @XmlElement(name = "Entry")
    private PolicyContactRolesEntry policyContactRolesEntry;

    public PolicyContactRolesEntry getPolicyContactRolesEntry() {
        return policyContactRolesEntry;
    }
    public void setPolicyContactRolesEntry(PolicyContactRolesEntry policyContactRolesEntry) {
        this.policyContactRolesEntry = policyContactRolesEntry;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {
            "accountContactRolesDes","policyContactSubType"
    })
    @XmlRootElement(name = "Entry")
    public static class PolicyContactRolesEntry {
        @XmlElement(name = "AccountContactRole", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.policycontactrolemodel")
        private PrimaryContactAccountContactRole accountContactRolesDes;

        @XmlElement(name = "Subtype", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.policycontactrolemodel")
        private String policyContactSubType;

        public PrimaryContactAccountContactRole getAccountContactRoles() {
            return accountContactRolesDes;
        }

        public void setAccountContactRoles(PrimaryContactAccountContactRole accountContactRoles) {
            this.accountContactRolesDes = accountContactRoles;
        }

        public String getPolicyContactSubType() {
            return policyContactSubType;
        }

        public void setPolicyContactSubType(String policyContactSubType) {
            this.policyContactSubType = policyContactSubType;
        }

        }
    }

