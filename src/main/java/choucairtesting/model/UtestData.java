package choucairtesting.model;

public class UtestData {

    private String strFirstName ;
    private String strLastName;
    private String strEmail ;
    private String strDateOfBirth ;
    private String strLanguage;
    private String strCity;
    private String strPostalCode;
    private String strCountry;
    private String strComputer;
    private String strComputerVersion;
    private String strPcLanguage ;
    private String strMobileDevice ;
    private String strModelMobile ;
    private String strSoMobile;
    private String strPassword ;
    private String strVerificationText;

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrDateOfBirth(int i) {

        switch (i){
            case 1: return "15";
            case 2: return "June";
            case 3: return  "1994";

            default: return "";
        }

    }

    public void setStrDateOfBirth(String strDateOfBirth) {
        this.strDateOfBirth = strDateOfBirth;
    }

    public String getStrLanguage() {
        return strLanguage;
    }

    public void setStrLanguage(String strLanguage) {
        this.strLanguage = strLanguage;
    }

    public String getStrCity() {
        return strCity;
    }

    public void setStrCity(String strCity) {
        this.strCity = strCity;
    }

    public String getStrPostalCode() {
        return strPostalCode;
    }

    public void setStrPostalCode(String strPostalCode) {
        this.strPostalCode = strPostalCode;
    }

    public String getStrCountry() {
        return strCountry;
    }

    public void setStrCountry(String strCountry) {
        this.strCountry = strCountry;
    }

    public String getStrComputer() {
        return strComputer;
    }

    public void setStrComputer(String strComputer) {
        this.strComputer = strComputer;
    }

    public String getStrComputerVersion() {
        return strComputerVersion;
    }

    public void setStrComputerVersion(String strComputerVersion) {
        this.strComputerVersion = strComputerVersion;
    }

    public String getStrPcLanguage() {
        return strPcLanguage;
    }

    public void setStrPcLanguage(String strPcLanguage) {
        this.strPcLanguage = strPcLanguage;
    }

    public String getStrMobileDevice() {
        return strMobileDevice;
    }

    public void setStrMobileDevice(String strMobileDevice) {
        this.strMobileDevice = strMobileDevice;
    }

    public String getStrModelMobile() {
        return strModelMobile;
    }

    public void setStrModelMobile(String strModelMobile) {
        this.strModelMobile = strModelMobile;
    }

    public String getStrSoMobile() {
        return strSoMobile;
    }

    public void setStrSoMobile(String strSoMobile) {
        this.strSoMobile = strSoMobile;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrVerificationText() {
        return strVerificationText;
    }

    public void setStrVerificationText(String strVerificationText) {
        this.strVerificationText = strVerificationText;
    }



    public String getStrFirstName() {
        return strFirstName;
    }

    public void setStrFirstName(String strFirstName) {
        this.strFirstName = strFirstName;
    }

    public String getStrLastName() {
        return strLastName;
    }

    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }







}
