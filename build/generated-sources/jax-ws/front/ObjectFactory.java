
package front;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the front package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TimeSheetSubmit_QNAME = new QName("http://ws/", "timeSheetSubmit");
    private final static QName _TimeSheetSubmitResponse_QNAME = new QName("http://ws/", "timeSheetSubmitResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://ws/", "loginResponse");
    private final static QName _AddInvoiceResponse_QNAME = new QName("http://ws/", "addInvoiceResponse");
    private final static QName _FindAllEmployee_QNAME = new QName("http://ws/", "findAllEmployee");
    private final static QName _History_QNAME = new QName("http://ws/", "history");
    private final static QName _Employee_QNAME = new QName("http://ws/", "employee");
    private final static QName _FindAllEmployeeResponse_QNAME = new QName("http://ws/", "findAllEmployeeResponse");
    private final static QName _Login_QNAME = new QName("http://ws/", "login");
    private final static QName _Exception_QNAME = new QName("http://ws/", "Exception");
    private final static QName _FindAllInvoiceResponse_QNAME = new QName("http://ws/", "findAllInvoiceResponse");
    private final static QName _FindHistoryByWorkerIdResponse_QNAME = new QName("http://ws/", "findHistoryByWorkerIdResponse");
    private final static QName _FindHistoryByWorkerId_QNAME = new QName("http://ws/", "findHistoryByWorkerId");
    private final static QName _Invoice_QNAME = new QName("http://ws/", "invoice");
    private final static QName _FindAllInvoice_QNAME = new QName("http://ws/", "findAllInvoice");
    private final static QName _AddInvoice_QNAME = new QName("http://ws/", "addInvoice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: front
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TimeSheetSubmit }
     * 
     */
    public TimeSheetSubmit createTimeSheetSubmit() {
        return new TimeSheetSubmit();
    }

    /**
     * Create an instance of {@link TimeSheetSubmitResponse }
     * 
     */
    public TimeSheetSubmitResponse createTimeSheetSubmitResponse() {
        return new TimeSheetSubmitResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link AddInvoiceResponse }
     * 
     */
    public AddInvoiceResponse createAddInvoiceResponse() {
        return new AddInvoiceResponse();
    }

    /**
     * Create an instance of {@link FindAllEmployee }
     * 
     */
    public FindAllEmployee createFindAllEmployee() {
        return new FindAllEmployee();
    }

    /**
     * Create an instance of {@link History }
     * 
     */
    public History createHistory() {
        return new History();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link FindAllEmployeeResponse }
     * 
     */
    public FindAllEmployeeResponse createFindAllEmployeeResponse() {
        return new FindAllEmployeeResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link FindAllInvoiceResponse }
     * 
     */
    public FindAllInvoiceResponse createFindAllInvoiceResponse() {
        return new FindAllInvoiceResponse();
    }

    /**
     * Create an instance of {@link FindHistoryByWorkerIdResponse }
     * 
     */
    public FindHistoryByWorkerIdResponse createFindHistoryByWorkerIdResponse() {
        return new FindHistoryByWorkerIdResponse();
    }

    /**
     * Create an instance of {@link FindHistoryByWorkerId }
     * 
     */
    public FindHistoryByWorkerId createFindHistoryByWorkerId() {
        return new FindHistoryByWorkerId();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link FindAllInvoice }
     * 
     */
    public FindAllInvoice createFindAllInvoice() {
        return new FindAllInvoice();
    }

    /**
     * Create an instance of {@link AddInvoice }
     * 
     */
    public AddInvoice createAddInvoice() {
        return new AddInvoice();
    }

    /**
     * Create an instance of {@link EmployeeModel }
     * 
     */
    public EmployeeModel createEmployeeModel() {
        return new EmployeeModel();
    }

    /**
     * Create an instance of {@link TimesheetModel }
     * 
     */
    public TimesheetModel createTimesheetModel() {
        return new TimesheetModel();
    }

    /**
     * Create an instance of {@link InvoiceModel }
     * 
     */
    public InvoiceModel createInvoiceModel() {
        return new InvoiceModel();
    }

    /**
     * Create an instance of {@link HistoryModel }
     * 
     */
    public HistoryModel createHistoryModel() {
        return new HistoryModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSheetSubmit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "timeSheetSubmit")
    public JAXBElement<TimeSheetSubmit> createTimeSheetSubmit(TimeSheetSubmit value) {
        return new JAXBElement<TimeSheetSubmit>(_TimeSheetSubmit_QNAME, TimeSheetSubmit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSheetSubmitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "timeSheetSubmitResponse")
    public JAXBElement<TimeSheetSubmitResponse> createTimeSheetSubmitResponse(TimeSheetSubmitResponse value) {
        return new JAXBElement<TimeSheetSubmitResponse>(_TimeSheetSubmitResponse_QNAME, TimeSheetSubmitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddInvoiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addInvoiceResponse")
    public JAXBElement<AddInvoiceResponse> createAddInvoiceResponse(AddInvoiceResponse value) {
        return new JAXBElement<AddInvoiceResponse>(_AddInvoiceResponse_QNAME, AddInvoiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllEmployee")
    public JAXBElement<FindAllEmployee> createFindAllEmployee(FindAllEmployee value) {
        return new JAXBElement<FindAllEmployee>(_FindAllEmployee_QNAME, FindAllEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link History }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "history")
    public JAXBElement<History> createHistory(History value) {
        return new JAXBElement<History>(_History_QNAME, History.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllEmployeeResponse")
    public JAXBElement<FindAllEmployeeResponse> createFindAllEmployeeResponse(FindAllEmployeeResponse value) {
        return new JAXBElement<FindAllEmployeeResponse>(_FindAllEmployeeResponse_QNAME, FindAllEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllInvoiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllInvoiceResponse")
    public JAXBElement<FindAllInvoiceResponse> createFindAllInvoiceResponse(FindAllInvoiceResponse value) {
        return new JAXBElement<FindAllInvoiceResponse>(_FindAllInvoiceResponse_QNAME, FindAllInvoiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHistoryByWorkerIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findHistoryByWorkerIdResponse")
    public JAXBElement<FindHistoryByWorkerIdResponse> createFindHistoryByWorkerIdResponse(FindHistoryByWorkerIdResponse value) {
        return new JAXBElement<FindHistoryByWorkerIdResponse>(_FindHistoryByWorkerIdResponse_QNAME, FindHistoryByWorkerIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHistoryByWorkerId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findHistoryByWorkerId")
    public JAXBElement<FindHistoryByWorkerId> createFindHistoryByWorkerId(FindHistoryByWorkerId value) {
        return new JAXBElement<FindHistoryByWorkerId>(_FindHistoryByWorkerId_QNAME, FindHistoryByWorkerId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Invoice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "invoice")
    public JAXBElement<Invoice> createInvoice(Invoice value) {
        return new JAXBElement<Invoice>(_Invoice_QNAME, Invoice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllInvoice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllInvoice")
    public JAXBElement<FindAllInvoice> createFindAllInvoice(FindAllInvoice value) {
        return new JAXBElement<FindAllInvoice>(_FindAllInvoice_QNAME, FindAllInvoice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddInvoice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addInvoice")
    public JAXBElement<AddInvoice> createAddInvoice(AddInvoice value) {
        return new JAXBElement<AddInvoice>(_AddInvoice_QNAME, AddInvoice.class, null, value);
    }

}
