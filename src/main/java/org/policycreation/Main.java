package org.policycreation;

import policyCreationPojo.request.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*static{
        FrameworkConf config = ConfigFactory.create(FrameworkConf.class);
        System.out.println(config.endPoint());
        System.out.println(config.dataSheetPath());
    }*/
    public static void main(String[] args)
    {

        quoteSubmission quote = new quoteSubmission();

        quote.setAccountNumber("10000000025");
        quote.setProducerCodeId("PC:6");
        quote.setProductCode("BusinessAuto");

        PolicyPeriodData policy = new PolicyPeriodData();
        policy.setAssignedRisk(false);
        policy.setBaseState("CA");


        BusinessAutoLine.BALineCoverages.Entry.CovTerms.EntryCoverTerm entryCoverTerm = new BusinessAutoLine.BALineCoverages.Entry.CovTerms.EntryCoverTerm();
        entryCoverTerm.setDisplayValue("1M CSL");
        entryCoverTerm.setPatternCode("BAOwnedLiabilityLimit");
        entryCoverTerm.setValueTypeName("Package");

        BusinessAutoLine.BALineCoverages.Entry.CovTerms covTerms = new BusinessAutoLine.BALineCoverages.Entry.CovTerms();
        covTerms.setCoverageTermEntry(entryCoverTerm);

        BusinessAutoLine.BALineCoverages.Entry entry = new BusinessAutoLine.BALineCoverages.Entry();
        entry.setCoverageTerm(covTerms);

        BusinessAutoLine.BALineCoverages baLineCoverages = new BusinessAutoLine.BALineCoverages();
        baLineCoverages.setEntry(entry);

        BusinessAutoLine businessAutoLine = new BusinessAutoLine();
        businessAutoLine.setBaLineCoverages(baLineCoverages);





        ///////////////////////////////////////////////////////////////////////////////////////////////////
        BAModifiers.RateFactorsEntry rateFactorsEntry = new BAModifiers.RateFactorsEntry();
        rateFactorsEntry.setAssessment("0.0000");
        rateFactorsEntry.setRateFactorType("SafetyEquipment");

        BAModifiers.RateFactorsEntry rateFactorsEntry1 = new BAModifiers.RateFactorsEntry();
        rateFactorsEntry1.setAssessment("0.0000");
        rateFactorsEntry1.setRateFactorType("SafetyOrganization");

        BAModifiers.RateFactorsEntry rateFactorsEntry2 = new BAModifiers.RateFactorsEntry();
        rateFactorsEntry2.setAssessment("0.0000");
        rateFactorsEntry2.setRateFactorType("Management");

        BAModifiers.RateFactorsEntry rateFactorsEntry3 = new BAModifiers.RateFactorsEntry();
        rateFactorsEntry3.setAssessment("0.0000");
        rateFactorsEntry3.setRateFactorType("Employees");

        List<BAModifiers.RateFactorsEntry> inputList = new ArrayList<>();
        inputList.add(rateFactorsEntry);
        inputList.add(rateFactorsEntry1);
        inputList.add(rateFactorsEntry2);
        inputList.add(rateFactorsEntry3);


        BAModifiers.RateFactors rateFactors = new BAModifiers.RateFactors();
        rateFactors.setRateFactorsEntryList(inputList);

        BAModifiers.Entry bamodifiewrsEntry = new BAModifiers.Entry();
        bamodifiewrsEntry.setEligible(true);
        bamodifiewrsEntry.setPatternCode("LiabScheduleCredits");
        bamodifiewrsEntry.setRateFactors(rateFactors);
        bamodifiewrsEntry.setState("CA");
        bamodifiewrsEntry.setValueFinal(true);
        bamodifiewrsEntry.setRateModifier("0.0000");
//////////////////////// 2 nd entry ///////////////////////////////////////////////////////////////

        BAModifiers.RateFactorsEntry rateFactorsEntry5 = new BAModifiers.RateFactorsEntry();
        rateFactorsEntry5.setAssessment("0.0000");
        rateFactorsEntry5.setRateFactorType("ValuesInsured");

        BAModifiers.RateFactorsEntry rateFactorsEntry6 = new BAModifiers.RateFactorsEntry();
        rateFactorsEntry6.setAssessment("0.0000");
        rateFactorsEntry6.setRateFactorType("Management");

        BAModifiers.RateFactorsEntry rateFactorsEntry7 = new BAModifiers.RateFactorsEntry();
        rateFactorsEntry7.setAssessment("0.0000");
        rateFactorsEntry7.setRateFactorType("Employees");

        BAModifiers.RateFactorsEntry rateFactorsEntry8 = new BAModifiers.RateFactorsEntry();
        rateFactorsEntry8.setAssessment("0.0000");
        rateFactorsEntry8.setRateFactorType("SafetyEquipment");

        BAModifiers.RateFactorsEntry rateFactorsEntry9 = new BAModifiers.RateFactorsEntry();
        rateFactorsEntry9.setAssessment("0.0000");
        rateFactorsEntry9.setRateFactorType("SafetyOrganization");

        List<BAModifiers.RateFactorsEntry> inputList2 = new ArrayList<>();
        inputList2.add(rateFactorsEntry5);
        inputList2.add(rateFactorsEntry6);
        inputList2.add(rateFactorsEntry7);
        inputList2.add(rateFactorsEntry8);
        inputList2.add(rateFactorsEntry9);


        BAModifiers.RateFactors rateFactors2 = new BAModifiers.RateFactors();
        rateFactors2.setRateFactorsEntryList(inputList2);

        BAModifiers.Entry bamodifiewrsEntry2 = new BAModifiers.Entry();
        bamodifiewrsEntry2.setEligible(true);
        bamodifiewrsEntry2.setPatternCode("PropScheduleCredits");
        bamodifiewrsEntry2.setRateFactors(rateFactors2);
        bamodifiewrsEntry2.setState("CA");
        bamodifiewrsEntry2.setValueFinal(true);
        bamodifiewrsEntry2.setRateModifier("0.0000");

        BAModifiers baModifiers = new BAModifiers();

        List<BAModifiers.Entry> bamodifiewrsEntryList = new ArrayList<>();
        bamodifiewrsEntryList.add(bamodifiewrsEntry);
        bamodifiewrsEntryList.add(bamodifiewrsEntry2);
        baModifiers.setBamodifiersEntry(bamodifiewrsEntryList);


        businessAutoLine.setBaModifiers(baModifiers);
        policy.setBusinessAutoLine(businessAutoLine);

        PeriodAnswers.Entry periodAnswerEntry = new PeriodAnswers.Entry();
        periodAnswerEntry.setBooleanAnswer(true);
        periodAnswerEntry.setQuestionCode("SprayPrune");
        PeriodAnswers.Entry periodAnswerEntry1 = new PeriodAnswers.Entry();
        periodAnswerEntry1.setBooleanAnswer(true);
        periodAnswerEntry1.setQuestionCode("VehicleMaintProgram");

        List<PeriodAnswers.Entry> listOfPeriodAnswer = new ArrayList<>();
        listOfPeriodAnswer.add(periodAnswerEntry);
        listOfPeriodAnswer.add(periodAnswerEntry1);

        PeriodAnswers periodAnswers = new PeriodAnswers();
        periodAnswers.setPeriodAnswersEntryList(listOfPeriodAnswer);

        policy.setPeriodAnswers(periodAnswers);
        quote.setPolicyPeriodData(policy);
        quote.generateAsXml();
    }
}