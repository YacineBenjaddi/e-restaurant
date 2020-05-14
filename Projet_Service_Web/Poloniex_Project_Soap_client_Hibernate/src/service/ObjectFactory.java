
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

    private final static QName _RechercheResponse_QNAME = new QName("http://service/", "rechercheResponse");
    private final static QName _Recherche_QNAME = new QName("http://service/", "recherche");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RechercheResponse }
     * 
     */
    public RechercheResponse createRechercheResponse() {
        return new RechercheResponse();
    }

    /**
     * Create an instance of {@link Recherche }
     * 
     */
    public Recherche createRecherche() {
        return new Recherche();
    }

    /**
     * Create an instance of {@link CryotCurrency }
     * 
     */
    public CryotCurrency createCryotCurrency() {
        return new CryotCurrency();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercheResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "rechercheResponse")
    public JAXBElement<RechercheResponse> createRechercheResponse(RechercheResponse value) {
        return new JAXBElement<RechercheResponse>(_RechercheResponse_QNAME, RechercheResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recherche }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "recherche")
    public JAXBElement<Recherche> createRecherche(Recherche value) {
        return new JAXBElement<Recherche>(_Recherche_QNAME, Recherche.class, null, value);
    }

}
