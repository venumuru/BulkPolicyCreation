package policyCreationPojo.request.PrimaryContactRoles;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "entityNamedInsured","accountContact","subtype"
})
@XmlRootElement(name = "AccountContactRole", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.policycontactrolemodel")
public class PrimaryContactAccountContactRole {

    @XmlElement(name = "AccountContact",namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountcontactrolemodel")
    private PrimaryContactRoleAccountContact accountContact;

    @XmlElement(name = "entity-NamedInsured", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountcontactrolemodel")
    private EntityNamedInsured entityNamedInsured;

    @XmlElement(name = "Subtype", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountcontactrolemodel")
    private String subtype;

    public PrimaryContactRoleAccountContact getPrimaryContactRoleAccountContact() {
        return accountContact;
    }

    public void setPrimaryContactRoleAccountContact(PrimaryContactRoleAccountContact accountContact) {
        this.accountContact = accountContact;
    }

    public EntityNamedInsured getEntityNamedInsured() {
        return entityNamedInsured;
    }

    public void setEntityNamedInsured(EntityNamedInsured entityNamedInsured) {
        this.entityNamedInsured = entityNamedInsured;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "entity-NamedInsured", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountcontactrolemodel")
    public static class EntityNamedInsured {

        @XmlElement(name = "IndustryCode", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountcontactrolemodel")
        private IndustryCode industryCode;

        public IndustryCode getIndustryCode() {
            return industryCode;
        }

        public void setIndustryCode(IndustryCode industryCode) {
            this.industryCode = industryCode;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlRootElement(name = "IndustryCode", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountcontactrolemodel")
        public static class IndustryCode {
            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            @XmlElement(name = "Code", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountcontactrolemodel")
            private String code;


        }
    }

}

