package policyCreationPojo.request;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PeriodAnswers")
public class PeriodAnswers {

    @XmlElement(name = "Entry")
    protected List<PeriodAnswers.Entry> periodAnswersEntryList;

    public List<Entry> getPeriodAnswersEntryList() {
        return periodAnswersEntryList;
    }

    public void setPeriodAnswersEntryList(List<Entry> periodAnswersEntryList) {
        this.periodAnswersEntryList = periodAnswersEntryList;
    }



    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "Entry")
    @XmlType(name="Entry")
    public static class Entry{



        @XmlElement(name = "BooleanAnswer", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.periodanswermodel")
        protected boolean booleanAnswer;

        @XmlElement(name = "QuestionCode", namespace = "http://guidewire.com/pc/gx/gw.webservice.pc.pc1000.gxmodel.periodanswermodel")
        protected String questionCode;



        public String getQuestionCode() {
            return questionCode;
        }

        public void setQuestionCode(String questionCode) {
            this.questionCode = questionCode;
        }

        public boolean isBooleanAnswer() {
            return booleanAnswer;
        }

        public void setBooleanAnswer(boolean booleanAnswer) {
            this.booleanAnswer = booleanAnswer;
        }



    }
}


