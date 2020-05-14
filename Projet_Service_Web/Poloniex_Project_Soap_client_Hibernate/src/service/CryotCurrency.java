
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour cryotCurrency complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cryotCurrency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="designation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EURO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="USD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cryotCurrency", propOrder = {
    "designation",
    "euro",
    "num",
    "usd"
})
public class CryotCurrency {

    protected String designation;
    @XmlElement(name = "EURO")
    protected Double euro;
    protected int num;
    @XmlElement(name = "USD")
    protected Double usd;

    /**
     * Obtient la valeur de la propriété designation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Définit la valeur de la propriété designation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

    /**
     * Obtient la valeur de la propriété euro.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEURO() {
        return euro;
    }

    /**
     * Définit la valeur de la propriété euro.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEURO(Double value) {
        this.euro = value;
    }

    /**
     * Obtient la valeur de la propriété num.
     * 
     */
    public int getNum() {
        return num;
    }

    /**
     * Définit la valeur de la propriété num.
     * 
     */
    public void setNum(int value) {
        this.num = value;
    }

    /**
     * Obtient la valeur de la propriété usd.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUSD() {
        return usd;
    }

    /**
     * Définit la valeur de la propriété usd.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUSD(Double value) {
        this.usd = value;
    }

}
