package policyCreationPojo.request;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BusinessAutoLine")
public class BusinessAutoLine {

    @XmlElement(name = "BALineCoverages", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.businessautolinemodel")
    protected BALineCoverages baLineCoverages;

    @XmlElement(name = "BAModifiers", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.businessautolinemodel")
    protected BAModifiers baModifiers;

    public BAModifiers getBaModifiers() {
        return baModifiers;
    }

    public void setBaModifiers(BAModifiers baModifiers) {
        this.baModifiers = baModifiers;
    }

    public BALineCoverages getBaLineCoverages() {
        return baLineCoverages;
    }

    public void setBaLineCoverages(BALineCoverages baLineCoverages) {
        this.baLineCoverages = baLineCoverages;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "BALineCoverages")
    public static class BALineCoverages {

        @XmlElement(name = "Entry", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.businessautolinemodel")
        protected Entry entry;

        public Entry getEntry() {
            return entry;
        }

        public void setEntry(Entry entry) {
            this.entry = entry;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlRootElement(name = "Entry", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.businessautolinemodel")
        @XmlType(name="Entry", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.businessautolinemodel")
        public static class Entry {
            @XmlElement(name = "CovTerms", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.clausemodel")
            protected CovTerms coverageTerm;

            public CovTerms getCoverageTerm() {
                return coverageTerm;
            }

            public void setCoverageTerm(CovTerms coverageTerm) {
                this.coverageTerm = coverageTerm;
            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlRootElement(name = "CovTerms")
            public static class CovTerms {
                @XmlElement(name = "Entry", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.clausemodel")
                protected EntryCoverTerm coverageTermEntry;

                public EntryCoverTerm getCoverageTermEntry() {
                    return coverageTermEntry;
                }

                public void setCoverageTermEntry(EntryCoverTerm coverageTermEntry) {
                    this.coverageTermEntry = coverageTermEntry;
                }


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlRootElement(name = "Entry")
                public static class EntryCoverTerm {

                    @XmlElement(name = "DisplayValue", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.covtermmodel")
                    protected String displayValue;
                    @XmlElement(name = "PatternCode", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.covtermmodel")
                    protected String patternCode;
                    @XmlElement(name = "ValueTypeName", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.covtermmodel")
                    protected String valueTypeName;

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
            }

        }
    }

}
