package policyCreationPojo.request.PrimaryNamedInsured;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PrimaryNamedInsured")
public class PrimaryNamedInsured {

    @XmlElement(name = "AccountContactRole")
    private AccountContactRole accountContactRole;

    public AccountContactRole getAccountContactRole() {
        return accountContactRole;
    }

    public void setAccountContactRole(AccountContactRole accountContactRole) {
        this.accountContactRole = accountContactRole;
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "AccountContactRole")
    public static class AccountContactRole{

        @XmlElement(name = "AccountContact")
        private AccountContact accountContact;

        public AccountContact getAccountContact() {
            return accountContact;
        }

        public void setAccountContact(AccountContact accountContact) {
            this.accountContact = accountContact;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlRootElement(name = "AccountContact")
        public static class AccountContact{
            @XmlElement(name = "Contact")
            private Contact contact;

            public Contact getContact() {
                return contact;
            }

            public void setContact(Contact contact) {
                this.contact = contact;
            }
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlRootElement(name = "Contact")
            public static class Contact {
                @XmlElement(name = "EmailAddress1", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.contactmodel")
                private String emailAddress1;

                @XmlElement(name = "EmailAddress2", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.contactmodel")
                private String emailAddress2;

                @XmlElement(name = "Name", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.contactmodel")
                private String name;

                @XmlElement(name = "PrimaryAddress", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.contactmodel")
                private PrimaryAddress primaryAddress;

                @XmlElement(name = "PrimaryPhone", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.contactmodel")
                private String primaryPhone;

                @XmlElement(name = "PublicID", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.contactmodel")
                private String publicID;

                @XmlElement(name = "Subtype", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.contactmodel")
                private String subtype;

                @XmlElement(name = "WorkPhone", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.contactmodel")
                private String workPhone;

                public String getEmailAddress1() {
                    return emailAddress1;
                }

                public void setEmailAddress1(String emailAddress1) {
                    this.emailAddress1 = emailAddress1;
                }

                public String getEmailAddress2() {
                    return emailAddress2;
                }

                public void setEmailAddress2(String emailAddress2) {
                    this.emailAddress2 = emailAddress2;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public PrimaryAddress getPrimaryAddress() {
                    return primaryAddress;
                }

                public void setPrimaryAddress(PrimaryAddress primaryAddress) {
                    this.primaryAddress = primaryAddress;
                }

                public String getPrimaryPhone() {
                    return primaryPhone;
                }

                public void setPrimaryPhone(String primaryPhone) {
                    this.primaryPhone = primaryPhone;
                }

                public String getPublicID() {
                    return publicID;
                }

                public void setPublicID(String publicID) {
                    this.publicID = publicID;
                }

                public String getSubtype() {
                    return subtype;
                }

                public void setSubtype(String subtype) {
                    this.subtype = subtype;
                }

                public String getWorkPhone() {
                    return workPhone;
                }

                public void setWorkPhone(String workPhone) {
                    this.workPhone = workPhone;
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlRootElement(name = "PrimaryAddress")
                public static class PrimaryAddress {

                    @XmlElement(name = "AddressLine1", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.addressmodel")
                    private String addressLine1;

                    @XmlElement(name = "AddressLine2", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.addressmodel")
                    private String addressLine2;

                    @XmlElement(name = "AddressLine3", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.addressmodel")
                    private String addressLine3;

                    @XmlElement(name = "AddressType", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.addressmodel")
                    private String addressType;

                    @XmlElement(name = "CEDEX", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.addressmodel")
                    private String cedex;

                    @XmlElement(name = "CEDEXBureau", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.addressmodel")
                    private String cedexBureau;

                    @XmlElement(name = "City", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.addressmodel")
                    private String city;

                    @XmlElement(name = "Country", namespace = "hhttp://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.addressmodel")
                    private String country;

                    @XmlElement(name = "County", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.addressmodel")
                    private String county;

                    @XmlElement(name = "PostalCode", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.addressmodel")
                    private String postalCode;

                    @XmlElement(name = "State", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.addressmodel")
                    private String state;
                    public String getAddressLine1() {
                        return addressLine1;
                    }

                    public void setAddressLine1(String addressLine1) {
                        this.addressLine1 = addressLine1;
                    }

                    public String getAddressLine2() {
                        return addressLine2;
                    }

                    public void setAddressLine2(String addressLine2) {
                        this.addressLine2 = addressLine2;
                    }

                    public String getAddressLine3() {
                        return addressLine3;
                    }

                    public void setAddressLine3(String addressLine3) {
                        this.addressLine3 = addressLine3;
                    }

                    public String getAddressType() {
                        return addressType;
                    }

                    public void setAddressType(String addressType) {
                        this.addressType = addressType;
                    }

                    public String getCedex() {
                        return cedex;
                    }

                    public void setCedex(String cedex) {
                        this.cedex = cedex;
                    }

                    public String getCedexBureau() {
                        return cedexBureau;
                    }

                    public void setCedexBureau(String cedexBureau) {
                        this.cedexBureau = cedexBureau;
                    }

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public String getCountry() {
                        return country;
                    }

                    public void setCountry(String country) {
                        this.country = country;
                    }

                    public String getCounty() {
                        return county;
                    }

                    public void setCounty(String county) {
                        this.county = county;
                    }

                    public String getPostalCode() {
                        return postalCode;
                    }

                    public void setPostalCode(String postalCode) {
                        this.postalCode = postalCode;
                    }

                    public String getState() {
                        return state;
                    }

                    public void setState(String state) {
                        this.state = state;
                    }
                }
            }
        }
    }
}
