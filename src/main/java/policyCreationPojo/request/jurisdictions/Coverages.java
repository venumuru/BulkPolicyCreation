package policyCreationPojo.request.jurisdictions;

import policyCreationPojo.request.BAModifiers;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Coverages")
public class Coverages {

    @XmlElement(name="Entry",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.bajurisdictionmodel")
    private List<CoveragesEntry> coveragesEntry;

    public List<CoveragesEntry> getCoveragesEntry() {
        return coveragesEntry;
    }

    public void setCoveragesEntry(List<CoveragesEntry> coveragesEntry) {
        this.coveragesEntry = coveragesEntry;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {
            "coverageTerms",
            "pattern"
    })
    @XmlRootElement(name = "Entry",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.bajurisdictionmodel")
    public static class CoveragesEntry {

        @XmlElement(name="CovTerms",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.clausemodel")
        private JudCovTerms coverageTerms;

        @XmlElement(name="Pattern",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.clausemodel")
        private JudCovTerms.Pattern pattern ;

        public JudCovTerms getCoverageTerms() {
            return coverageTerms;
        }

        public void setCoverageTerms(JudCovTerms coverageTerms) {
            this.coverageTerms = coverageTerms;
        }

        public JudCovTerms.Pattern getPattern() {
            return pattern;
        }

        public void setPattern(JudCovTerms.Pattern pattern) {
            this.pattern = pattern;
        }

    }
}
