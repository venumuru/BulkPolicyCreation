package policyCreationPojo.request;

import interfaces.XmlRequest;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "quoteSubmission", namespace ="http://guidewire.com/pc/ws/gw/webservice/pc/pc1000/job/SubmissionAPI")
public class quoteSubmission implements XmlRequest {

    @XmlElement(name="accountNumber", required = true, namespace ="http://guidewire.com/pc/ws/gw/webservice/pc/pc1000/job/SubmissionAPI")
    protected String accountNumber;
    @XmlElement(name="productCode", required = true, namespace ="http://guidewire.com/pc/ws/gw/webservice/pc/pc1000/job/SubmissionAPI")
    protected String productCode;
    @XmlElement(name="producerCodeId", required = true, namespace ="http://guidewire.com/pc/ws/gw/webservice/pc/pc1000/job/SubmissionAPI")
    protected String producerCodeId;
    @XmlElement(name="policyPeriodData", required = true, namespace ="http://guidewire.com/pc/ws/gw/webservice/pc/pc1000/job/SubmissionAPI")
    protected PolicyPeriodData policyPeriodData;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProducerCodeId() {
        return producerCodeId;
    }

    public void setProducerCodeId(String producerCodeId) {
        this.producerCodeId = producerCodeId;
    }

    public PolicyPeriodData getPolicyPeriodData() {
        return policyPeriodData;
    }

    public void setPolicyPeriodData(PolicyPeriodData policyPeriodData) {
        this.policyPeriodData = policyPeriodData;
    }


    @Override
    public String getSoapEnvelope() {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:soap=\"http://guidewire.com/ws/soapheaders\" xmlns:sub=\"http://guidewire.com/pc/ws/gw/webservice/pc/pc1000/job/SubmissionAPI\">\n" +
                "   <soapenv:Header>\n" +
                "      <soap:authentication>\n" +
                "         <soap:username>su</soap:username>\n" +
                "         <soap:password>gw</soap:password>\n" +
                "      </soap:authentication>\n" +
                "   </soapenv:Header>\n" +
                "   <soapenv:Body>\n";
    }

    @Override
    public String generateAsXml() {
        return XmlRequest.marshallRequest(this, getSoapEnvelope());
    }
    }

