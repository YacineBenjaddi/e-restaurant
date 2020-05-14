/**
 * CryotCurrency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class CryotCurrency  implements java.io.Serializable {
    private java.lang.String designation;

    private java.lang.Double EURO;

    private int num;

    private java.lang.Double USD;

    public CryotCurrency() {
    }

    public CryotCurrency(
           java.lang.String designation,
           java.lang.Double EURO,
           int num,
           java.lang.Double USD) {
           this.designation = designation;
           this.EURO = EURO;
           this.num = num;
           this.USD = USD;
    }


    /**
     * Gets the designation value for this CryotCurrency.
     * 
     * @return designation
     */
    public java.lang.String getDesignation() {
        return designation;
    }


    /**
     * Sets the designation value for this CryotCurrency.
     * 
     * @param designation
     */
    public void setDesignation(java.lang.String designation) {
        this.designation = designation;
    }


    /**
     * Gets the EURO value for this CryotCurrency.
     * 
     * @return EURO
     */
    public java.lang.Double getEURO() {
        return EURO;
    }


    /**
     * Sets the EURO value for this CryotCurrency.
     * 
     * @param EURO
     */
    public void setEURO(java.lang.Double EURO) {
        this.EURO = EURO;
    }


    /**
     * Gets the num value for this CryotCurrency.
     * 
     * @return num
     */
    public int getNum() {
        return num;
    }


    /**
     * Sets the num value for this CryotCurrency.
     * 
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }


    /**
     * Gets the USD value for this CryotCurrency.
     * 
     * @return USD
     */
    public java.lang.Double getUSD() {
        return USD;
    }


    /**
     * Sets the USD value for this CryotCurrency.
     * 
     * @param USD
     */
    public void setUSD(java.lang.Double USD) {
        this.USD = USD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CryotCurrency)) return false;
        CryotCurrency other = (CryotCurrency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designation==null && other.getDesignation()==null) || 
             (this.designation!=null &&
              this.designation.equals(other.getDesignation()))) &&
            ((this.EURO==null && other.getEURO()==null) || 
             (this.EURO!=null &&
              this.EURO.equals(other.getEURO()))) &&
            this.num == other.getNum() &&
            ((this.USD==null && other.getUSD()==null) || 
             (this.USD!=null &&
              this.USD.equals(other.getUSD())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDesignation() != null) {
            _hashCode += getDesignation().hashCode();
        }
        if (getEURO() != null) {
            _hashCode += getEURO().hashCode();
        }
        _hashCode += getNum();
        if (getUSD() != null) {
            _hashCode += getUSD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CryotCurrency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "cryotCurrency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EURO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EURO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "USD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
