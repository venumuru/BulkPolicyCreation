package policyCreationPojo.request;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BAModifiers")
public class BAModifiers {

    @XmlElement(name="Entry",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.businessautolinemodel")
    protected List<BAModifiers.Entry> bamodifiersEntry;



    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"eligible","patternCode","rateFactors","rateModifier","state","valueFinal"})
    @XmlRootElement(name = "Entry",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.businessautolinemodel")
    public static class Entry{
        @XmlElement(name="Eligible",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.modifiermodel")
        protected boolean eligible;
        @XmlElement(name="RateModifier",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.modifiermodel")
        protected String rateModifier;
        @XmlElement(name="State",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.modifiermodel")
        protected String state;
        @XmlElement(name="ValueFinal",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.modifiermodel")
        protected boolean valueFinal;

        @XmlElement(name="PatternCode",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.modifiermodel")
        protected String patternCode;

        @XmlElement(name="RateFactors",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.modifiermodel")
        protected RateFactors rateFactors;


    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "RateFactors")
    public static class RateFactors{
        @XmlElement(name="Entry",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.modifiermodel")
        protected List<RateFactorsEntry> rateFactorsEntryList;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "Entry")
    @XmlType(name="Entry", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.modifiermodel")
    public static class RateFactorsEntry{
        @XmlElement(name="Assessment",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.ratefactormodel")
        protected String assessment;

        @XmlElement(name="RateFactorType",  namespace ="http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.ratefactormodel")
        protected String rateFactorType;
    }
}
