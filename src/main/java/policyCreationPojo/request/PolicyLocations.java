package policyCreationPojo.request;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PolicyLocations")
public class PolicyLocations {
    @XmlElement(name = "Entry")
    private PolicyLocationsEntry policyLocationsEntrys;

    public PolicyLocationsEntry getPolicyLocationsEntry() {
        return policyLocationsEntrys;
    }
    public void setPolicyLocationsEntry(PolicyLocationsEntry policyLocationsEntry) {
        this.policyLocationsEntrys = policyLocationsEntry;
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "Entry")
    public static class PolicyLocationsEntry{
        @XmlElement(name = "AccountLocation", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.policylocationmodel")
        private List<AccountLocation> accountLocationsList;
        @XmlElement(name = "LocationNum", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.policylocationmodel")
        private String LocationNum;
        @XmlElement(name = "TerritoryCodes", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.policylocationmodel")
        private TerritoryCodes territoryCodes;
        public List<AccountLocation> getAccountLocations() {
            return accountLocationsList;
        }
        public void setAccountLocations(List<AccountLocation> accountLocations) {
            this.accountLocationsList = accountLocations;
        }

        public String getLocationNum() {
            return LocationNum;
        }

        public void setLocationNum(String locationNum) {
            LocationNum = locationNum;
        }

        public TerritoryCodes getTerritoryCodesl() {
            return territoryCodes;
        }

        public void setTerritoryCodesl(TerritoryCodes territoryCodesl) {
            this.territoryCodes = territoryCodesl;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlRootElement(name = "AccountLocation")
        public static class AccountLocation {
            @XmlElement(name = "AddressLine1", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String addressLine1;

            @XmlElement(name = "AddressLine2", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String addressLine2;

            @XmlElement(name = "AddressLine3", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String addressLine3;

            @XmlElement(name = "AddressType", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String addressType;

            @XmlElement(name = "CEDEX", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String cedex;

            @XmlElement(name = "CEDEXBureau", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String cedexBureau;

            @XmlElement(name = "City", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String city;

            @XmlElement(name = "Country", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String country;

            @XmlElement(name = "County", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String county;

            @XmlElement(name = "Description", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String description;

            @XmlElement(name = "GeocodeStatus", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String geocodeStatus;

            @XmlElement(name = "LocationCode", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String locationCode;

            @XmlElement(name = "LocationNum", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String locationNum;

            @XmlElement(name = "NonSpecific", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String nonSpecific;

            @XmlElement(name = "Phone", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String phone;

            @XmlElement(name = "PostalCode", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
            private String postalCode;

            @XmlElement(name = "State", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.accountlocationmodel")
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

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getGeocodeStatus() {
                return geocodeStatus;
            }

            public void setGeocodeStatus(String geocodeStatus) {
                this.geocodeStatus = geocodeStatus;
            }

            public String getLocationCode() {
                return locationCode;
            }

            public void setLocationCode(String locationCode) {
                this.locationCode = locationCode;
            }

            public String getLocationNum() {
                return locationNum;
            }

            public void setLocationNum(String locationNum) {
                this.locationNum = locationNum;
            }

            public String getNonSpecific() {
                return nonSpecific;
            }

            public void setNonSpecific(String nonSpecific) {
                this.nonSpecific = nonSpecific;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
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


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlRootElement(name = "TerritoryCodes",namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.policylocationmodel")
        public static class TerritoryCodes {
            @XmlElement(name = "Entry", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.policylocationmodel")
            private TerritoryEntry territoryEntry;
            public TerritoryEntry getTerritoryEntry() {
                return territoryEntry;
            }
            public void setTerritoryEntry(TerritoryEntry territoryEntry) {
                this.territoryEntry = territoryEntry;
            }
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlRootElement(name = "Entry",namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.policylocationmodel")
            public static class TerritoryEntry{
                @XmlElement(name = "Code", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.policylocationmodel")
                private String code;

                public String getCode() {
                    return code;
                }
                public void setCode(String code) {
                    this.code = code;
                }
            }
        }
    }

}
