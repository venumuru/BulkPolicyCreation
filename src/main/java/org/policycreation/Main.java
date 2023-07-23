package org.policycreation;

import policyCreationPojo.request.*;
import policyCreationPojo.request.PrimaryContactRoles.PolicyContactRoles;
import policyCreationPojo.request.PrimaryContactRoles.PrimaryContactAccountContactRole;
import policyCreationPojo.request.PrimaryContactRoles.PrimaryContactRoleAccountContact;
import policyCreationPojo.request.PrimaryNamedInsured.PrimaryNamedInsured;
import policyCreationPojo.request.jurisdictions.Coverages;
import policyCreationPojo.request.jurisdictions.JudCovTerms;
import policyCreationPojo.request.jurisdictions.Jurisdictions;

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

///////////////////// drivers ///////////////////////////////////////////////////////////
        DriversEntry driverEntry = new DriversEntry();
        driverEntry.setDateOfBirth("1986-06-06");
        driverEntry.setEffectiveDate("2023-04-24");
        driverEntry.setExpirationDate("2024-04-24");
        driverEntry.setFirstName("TEst");
        driverEntry.setLastName("Last");
        driverEntry.setLicenseNumber("4325435");
        driverEntry.setLicenseState("CA");
        driverEntry.setSeqNumber(1);

        Drivers drivers = new Drivers();
        drivers.setEntry(driverEntry);

        businessAutoLine.setDrivers(drivers);
///////////////////// Jurisdictions ///////////////////////////////////////////////////////////

        Jurisdictions jurisdictions = new Jurisdictions();
        Jurisdictions.JurisdictionsEntry jurisdictionsEntry = new Jurisdictions.JurisdictionsEntry();
        Coverages coverage = new Coverages();
        Coverages.CoveragesEntry coveragesEntry1 = new Coverages.CoveragesEntry();
        JudCovTerms coverageTerms1 = new JudCovTerms();
        List<JudCovTerms> coverTermsList = new ArrayList<>();
        List<Coverages.CoveragesEntry> coveragesEntriesList = new ArrayList<>();
        List<JudCovTerms.CoverageTermEntry> covTermsEntriesList = new ArrayList<>();

        JudCovTerms.CoverageTermEntry coverageTermEntry1 = new JudCovTerms.CoverageTermEntry();

        JudCovTerms.Pattern pattern1 = new JudCovTerms.Pattern();

        coverageTermEntry1.setDisplayValue("25/50");
        coverageTermEntry1.setValueTypeName("Package");
        coverageTermEntry1.setPatternCode("BAOwnedUMBI");
        pattern1.setPublicID("BAOwnedUMBICov");
        covTermsEntriesList.add(coverageTermEntry1);
        coverageTerms1.setCoverageTermEntry(coverageTermEntry1);
        coverTermsList.add(coverageTerms1);
        coveragesEntry1.setCoverageTerms(coverageTerms1);
        coveragesEntry1.setPattern(pattern1);
        coveragesEntriesList.add(coveragesEntry1);


        coverage.setCoveragesEntry(coveragesEntriesList);
        jurisdictionsEntry.setCoverages(coverage);
        jurisdictionsEntry.setState("CA");
        jurisdictions.setJurisdictionsEntries(jurisdictionsEntry);

        businessAutoLine.setJurisdictions(jurisdictions);

/////////////////////////////////////////////////////////////////////////////////////////
        policy.setBusinessAutoLine(businessAutoLine);

/////////////////////////////// Primary named insured //////////////////////////////////////////////////////////

        PrimaryNamedInsured primaryNamedInsured = new PrimaryNamedInsured();
        PrimaryNamedInsured.AccountContactRole.AccountContact.Contact.PrimaryAddress primaryAddress = new PrimaryNamedInsured.AccountContactRole.AccountContact.Contact.PrimaryAddress();
        primaryAddress.setAddressLine1("942 Miller Ave");
        primaryAddress.setAddressLine2("Floor 0000");
        primaryAddress.setAddressLine3("Developer Unit Habitation Cube #0000");
        primaryAddress.setAddressType("business");
        primaryAddress.setCedex("true");
        primaryAddress.setCedexBureau("11");
        primaryAddress.setCity("South San Francisco");
        primaryAddress.setCountry("US");
        primaryAddress.setCounty("San Mateo");
        primaryAddress.setPostalCode("94080");
        primaryAddress.setState("CA");


        PrimaryNamedInsured.AccountContactRole.AccountContact.Contact contact = new PrimaryNamedInsured.AccountContactRole.AccountContact.Contact();
        contact.setName("Bi-Metal Thermometers");
        contact.setEmailAddress1("9088@guidewire.com");
        contact.setEmailAddress2("8088@guidewire.com");
        contact.setPrimaryAddress(primaryAddress);
        contact.setSubtype("Company");
        contact.setPrimaryPhone("work");
        contact.setWorkPhone("6502692777");
        contact.setPublicID("test_pc:9");

        PrimaryNamedInsured.AccountContactRole.AccountContact accountContact = new PrimaryNamedInsured.AccountContactRole.AccountContact();
        accountContact.setContact(contact);

        PrimaryNamedInsured.AccountContactRole  accountContactRole= new PrimaryNamedInsured.AccountContactRole();
        accountContactRole.setAccountContact(accountContact);

        primaryNamedInsured.setAccountContactRole(accountContactRole);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        policy.setPrimaryNamedInsured(primaryNamedInsured);
        policy.setPreferredCoverageCurrency("usd");
        policy.setPreferredSettlementCurrency("usd");

        PolicyPeriodData.UWCompany uwCompany = new PolicyPeriodData.UWCompany();
        uwCompany.setCode("1111_11111");

        policy.setUwCompany(uwCompany);
        policy.setWrittenDate("2023-04-14");


/////////////////////////////// Policy locations //////////////////////////////////////////////////////////

PolicyLocations.PolicyLocationsEntry policyLocationsEntry = new PolicyLocations.PolicyLocationsEntry();
PolicyLocations.PolicyLocationsEntry.TerritoryCodes.TerritoryEntry territoryCodesEntry = new PolicyLocations.PolicyLocationsEntry.TerritoryCodes.TerritoryEntry();
        territoryCodesEntry.setCode("AAA");
PolicyLocations.PolicyLocationsEntry.TerritoryCodes   territoryCodes = new PolicyLocations.PolicyLocationsEntry.TerritoryCodes();
        territoryCodes.setTerritoryEntry(territoryCodesEntry);
PolicyLocations.PolicyLocationsEntry.AccountLocation accountLocation = new PolicyLocations.PolicyLocationsEntry.AccountLocation();
        accountLocation.setAddressLine1("942 Miller Ave");
        accountLocation.setAddressLine2("Floor 0000");
        accountLocation.setAddressLine3("Developer Unit Habitation Cube #0000");
        accountLocation.setAddressType("business");
        accountLocation.setDescription("Created by the Address Builder with code 0");
        accountLocation.setCedex("true");
        accountLocation.setCedexBureau("true");
        accountLocation.setCity("South San Francisco");
        accountLocation.setGeocodeStatus("none");
        accountLocation.setCountry("US");
        accountLocation.setLocationCode("0000");
        accountLocation.setLocationNum("26");
        accountLocation.setCounty("San Mateo");
        accountLocation.setPhone("6502692777");
        accountLocation.setPostalCode("94080");
        accountLocation.setState("CA");
        accountLocation.setNonSpecific("false");

        List<PolicyLocations.PolicyLocationsEntry.AccountLocation> accountLocationList = new ArrayList<>();
        accountLocationList.add(accountLocation);

        policyLocationsEntry.setAccountLocations(accountLocationList);
        policyLocationsEntry.setLocationNum("1");
        policyLocationsEntry.setTerritoryCodesl(territoryCodes);

        PolicyLocations policyLocations = new PolicyLocations();
        policyLocations.setPolicyLocationsEntry(policyLocationsEntry);
        policy.setPolicyLocations(policyLocations);
/////////////////////////////// Policy contact roles //////////////////////////////////////////////////////////
PolicyContactRoles policyContactRoles = new PolicyContactRoles();
PolicyContactRoles.PolicyContactRolesEntry policyContactRolesEntry = new PolicyContactRoles.PolicyContactRolesEntry();
PrimaryContactAccountContactRole policyContactRolesaccountContactRole = new PrimaryContactAccountContactRole();
PrimaryContactRoleAccountContact.PrimaryContactRoleContact policyContactRolecontact = new PrimaryContactRoleAccountContact.PrimaryContactRoleContact();
PrimaryContactRoleAccountContact.PrimaryContactRoleContact.PrimaryContactRolePrimaryAddress policyContactAddress = new PrimaryContactRoleAccountContact.PrimaryContactRoleContact.PrimaryContactRolePrimaryAddress();
PrimaryContactRoleAccountContact policyContactRolesaccountContact = new PrimaryContactRoleAccountContact();
PrimaryContactAccountContactRole.EntityNamedInsured entityNamedInsured = new PrimaryContactAccountContactRole.EntityNamedInsured();
PrimaryContactAccountContactRole.EntityNamedInsured.IndustryCode industryCode = new PrimaryContactAccountContactRole.EntityNamedInsured.IndustryCode();
        industryCode.setCode("3829");
        entityNamedInsured.setIndustryCode(industryCode);
        policyContactAddress.setAddressLine1("942 Miller Ave");
        policyContactAddress.setAddressLine2("Floor 0000");
        policyContactAddress.setAddressLine3("Developer Unit Habitation Cube #0000");
        policyContactAddress.setAddressType("business");
        policyContactAddress.setCedex("true");
        policyContactAddress.setCedexBureau("11");
        policyContactAddress.setCity("South San Francisco");
        policyContactAddress.setCountry("US");
        policyContactAddress.setCounty("San Mateo");
        policyContactAddress.setPostalCode("94080");
        policyContactAddress.setState("CA");
        policyContactRolecontact.setName("Bi-Metal Thermometers");
        policyContactRolecontact.setEmailAddress1("9088@guidewire.com");
        policyContactRolecontact.setEmailAddress2("8088@guidewire.com");
        policyContactRolecontact.setPrimaryAddress(policyContactAddress);
        policyContactRolecontact.setSubtype("Company");
        policyContactRolecontact.setPrimaryPhone("work");
        policyContactRolecontact.setWorkPhone("6502692777");
        policyContactRolecontact.setPublicID("test_pc:9");

        policyContactRolesaccountContact.setContact(policyContactRolecontact);
        policyContactRolesaccountContactRole.setPrimaryContactRoleAccountContact(policyContactRolesaccountContact);
        policyContactRolesaccountContactRole.setEntityNamedInsured(entityNamedInsured);
        policyContactRolesaccountContactRole.setSubtype("NamedInsured");
        policyContactRolesEntry.setAccountContactRoles(policyContactRolesaccountContactRole);
        policyContactRolesEntry.setPolicyContactSubType("PolicyPriNamedInsured");
        policyContactRoles.setPolicyContactRolesEntry(policyContactRolesEntry);
        policy.setPolicyContactRoles(policyContactRoles);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        policy.setPeriodEnd("2024-03-24");

        PolicyPeriodData.Policy policyPeriodDatePolicy = new PolicyPeriodData.Policy();
        policyPeriodDatePolicy.setPriorPremiums("0.00 usd");

        policy.setPolicy(policyPeriodDatePolicy);
        quote.setPolicyPeriodData(policy);
        quote.generateAsXml();
    }
}