package policyCreationPojo.request.jurisdictions;

import policyCreationPojo.request.DriversEntry;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CovTerms")
public class JudCovTerms {

    @XmlElement(name = "Entry", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.clausemodel")
    private CoverageTermEntry coverageTermEntry;

    public CoverageTermEntry getCoverageTermEntry() {
        return coverageTermEntry;
    }

    public void setCoverageTermEntry(CoverageTermEntry coverageTermEntry) {
        this.coverageTermEntry = coverageTermEntry;
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {
            "displayValue",
            "patternCode",
            "valueTypeName"
    })
    @XmlRootElement(name = "Entry",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.clausemodel")
    public static class CoverageTermEntry {

        @XmlElement(name = "DisplayValue", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.covtermmodel")
        private String displayValue;
        @XmlElement(name = "PatternCode", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.covtermmodel")
        private String patternCode;
        @XmlElement(name = "ValueTypeName", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.covtermmodel")
        private String valueTypeName;

        public String getDisplayValue() {
            return displayValue;
        }

        public void setDisplayValue(String displayValue) {
            this.displayValue = displayValue;
        }

        public String getPatternCode() {
            return patternCode;
        }

        public void setPatternCode(String patternCode) {
            this.patternCode = patternCode;
        }

        public String getValueTypeName() {
            return valueTypeName;
        }

        public void setValueTypeName(String valueTypeName) {
            this.valueTypeName = valueTypeName;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "Pattern", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.clausemodel")
    public static class Pattern {

        @XmlElement(name = "PublicID", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.clausemodel")
        private String publicID;

        public String getPublicID() {
            return publicID;
        }

        public void setPublicID(String publicID) {
            this.publicID = publicID;
        }
    }
}
