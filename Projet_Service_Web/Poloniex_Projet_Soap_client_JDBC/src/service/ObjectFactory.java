
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _EchResponse_QNAME = new QName("http://service/", "echResponse");
    private final static QName _AjouterResponse_QNAME = new QName("http://service/", "AjouterResponse");
    private final static QName _Ajouter_QNAME = new QName("http://service/", "Ajouter");
    private final static QName _Ech_QNAME = new QName("http://service/", "ech");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AjouterResponse }
     * 
     */
    public AjouterResponse createAjouterResponse() {
        return new AjouterResponse();
    }

    /**
     * Create an instance of {@link EchResponse }
     * 
     */
    public EchResponse createEchResponse() {
        return new EchResponse();
    }

    /**
     * Create an instance of {@link Ajouter }
     * 
     */
    public Ajouter createAjouter() {
        return new Ajouter();
    }

    /**
     * Create an instance of {@link Ech }
     * 
     */
    public Ech createEch() {
        return new Ech();
    }

    /**
     * Create an instance of {@link CryotCurrency }
     * 
     */
    public CryotCurrency createCryotCurrency() {
        return new CryotCurrency();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "echResponse")
    public JAXBElement<EchResponse> createEchResponse(EchResponse value) {
        return new JAXBElement<EchResponse>(_EchResponse_QNAME, EchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AjouterResponse")
    public JAXBElement<AjouterResponse> createAjouterResponse(AjouterResponse value) {
        return new JAXBElement<AjouterResponse>(_AjouterResponse_QNAME, AjouterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ajouter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Ajouter")
    public JAXBElement<Ajouter> createAjouter(Ajouter value) {
        return new JAXBElement<Ajouter>(_Ajouter_QNAME, Ajouter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ech }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ech")
    public JAXBElement<Ech> createEch(Ech value) {
        return new JAXBElement<Ech>(_Ech_QNAME, Ech.class, null, value);
    }

}
