package policyCreationPojo.request;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Entry")
/*@XmlType(name = "Entry",propOrder = {
            "dateOfBirth",
            "effectiveDate",
            "expirationDate",
            "firstName",
            "lastName",
            "licenseNumber",
            "licenseState",
            "seqNumber"
    })*/
public class DriversEntry {

    @XmlElement(name = "DateOfBirth", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.commercialdrivermodel")
    private String dateOfBirth;
    @XmlElement(name = "EffectiveDate", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.commercialdrivermodel")
    private String effectiveDate;
    @XmlElement(name = "ExpirationDate", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.commercialdrivermodel")
    private String expirationDate;
    @XmlElement(name = "FirstName", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.commercialdrivermodel")
    private String firstName;
    @XmlElement(name = "LastName", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.commercialdrivermodel")
    private String lastName;
    @XmlElement(name = "LicenseNumber", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.commercialdrivermodel")
    private String licenseNumber;
    @XmlElement(name = "LicenseState", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.commercialdrivermodel")
    private String licenseState;
    @XmlElement(name = "SeqNumber", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.commercialdrivermodel")
    private int seqNumber;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseState() {
        return licenseState;
    }

    public void setLicenseState(String licenseState) {
        this.licenseState = licenseState;
    }

    public int getSeqNumber() {
        return seqNumber;
    }

    public void setSeqNumber(int seqNumber) {
        this.seqNumber = seqNumber;
    }

}
