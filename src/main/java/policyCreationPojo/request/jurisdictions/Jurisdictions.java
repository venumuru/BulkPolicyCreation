package policyCreationPojo.request.jurisdictions;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Jurisdictions")
public class Jurisdictions {

    @XmlElement(name = "Entry", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.businessautolinemodel")
    private JurisdictionsEntry jurisdictionsEntries;

    public JurisdictionsEntry getJurisdictionsEntries() {
        return jurisdictionsEntries;
    }

    public void setJurisdictionsEntries(JurisdictionsEntry jurisdictionsEntries) {
        this.jurisdictionsEntries = jurisdictionsEntries;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {
            "coverages",
            "state"
    })
    @XmlRootElement(name = "Entry",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.businessautolinemodel")
    public static class JurisdictionsEntry {

        @XmlElement(name="Coverages",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.bajurisdictionmodel")
        private Coverages coverages;

        @XmlElement(name = "State", namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.bajurisdictionmodel")
        private String state;

        public Coverages getCoverages() {
            return coverages;
        }

        public void setCoverages(Coverages coverages) {
            this.coverages = coverages;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
