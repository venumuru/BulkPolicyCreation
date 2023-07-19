package policyCreationPojo.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Drivers")
public class Drivers {
    @XmlElement(name = "Entry", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.businessautolinemodel")
    private DriversEntry entry;

    public DriversEntry getEntry() {
        return entry;
    }
    public void setEntry(DriversEntry entry) {
        this.entry = entry;
    }

}
