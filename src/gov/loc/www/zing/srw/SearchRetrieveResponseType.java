/**
 * SearchRetrieveResponseType.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package gov.loc.www.zing.srw;

public class SearchRetrieveResponseType  extends gov.loc.www.zing.srw.ResponseType  implements java.io.Serializable {
    private java.math.BigInteger numberOfRecords;

    private java.lang.String resultSetId;

    private java.math.BigInteger resultSetIdleTime;

    private gov.loc.www.zing.srw.RecordType[] records;

    public SearchRetrieveResponseType() {
    }

    public SearchRetrieveResponseType(
           java.lang.String version,
           java.math.BigInteger numberOfRecords,
           java.lang.String resultSetId,
           java.math.BigInteger resultSetIdleTime,
           gov.loc.www.zing.srw.RecordType[] records) {
        super(
            version);
        this.numberOfRecords = numberOfRecords;
        this.resultSetId = resultSetId;
        this.resultSetIdleTime = resultSetIdleTime;
        this.records = records;
    }


    /**
     * Gets the numberOfRecords value for this SearchRetrieveResponseType.
     * 
     * @return numberOfRecords
     */
    public java.math.BigInteger getNumberOfRecords() {
        return numberOfRecords;
    }


    /**
     * Sets the numberOfRecords value for this SearchRetrieveResponseType.
     * 
     * @param numberOfRecords
     */
    public void setNumberOfRecords(java.math.BigInteger numberOfRecords) {
        this.numberOfRecords = numberOfRecords;
    }


    /**
     * Gets the resultSetId value for this SearchRetrieveResponseType.
     * 
     * @return resultSetId
     */
    public java.lang.String getResultSetId() {
        return resultSetId;
    }


    /**
     * Sets the resultSetId value for this SearchRetrieveResponseType.
     * 
     * @param resultSetId
     */
    public void setResultSetId(java.lang.String resultSetId) {
        this.resultSetId = resultSetId;
    }


    /**
     * Gets the resultSetIdleTime value for this SearchRetrieveResponseType.
     * 
     * @return resultSetIdleTime
     */
    public java.math.BigInteger getResultSetIdleTime() {
        return resultSetIdleTime;
    }


    /**
     * Sets the resultSetIdleTime value for this SearchRetrieveResponseType.
     * 
     * @param resultSetIdleTime
     */
    public void setResultSetIdleTime(java.math.BigInteger resultSetIdleTime) {
        this.resultSetIdleTime = resultSetIdleTime;
    }


    /**
     * Gets the records value for this SearchRetrieveResponseType.
     * 
     * @return records
     */
    public gov.loc.www.zing.srw.RecordType[] getRecords() {
        return records;
    }


    /**
     * Sets the records value for this SearchRetrieveResponseType.
     * 
     * @param records
     */
    public void setRecords(gov.loc.www.zing.srw.RecordType[] records) {
        this.records = records;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchRetrieveResponseType)) return false;
        SearchRetrieveResponseType other = (SearchRetrieveResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numberOfRecords==null && other.getNumberOfRecords()==null) || 
             (this.numberOfRecords!=null &&
              this.numberOfRecords.equals(other.getNumberOfRecords()))) &&
            ((this.resultSetId==null && other.getResultSetId()==null) || 
             (this.resultSetId!=null &&
              this.resultSetId.equals(other.getResultSetId()))) &&
            ((this.resultSetIdleTime==null && other.getResultSetIdleTime()==null) || 
             (this.resultSetIdleTime!=null &&
              this.resultSetIdleTime.equals(other.getResultSetIdleTime()))) &&
            ((this.records==null && other.getRecords()==null) || 
             (this.records!=null &&
              java.util.Arrays.equals(this.records, other.getRecords())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNumberOfRecords() != null) {
            _hashCode += getNumberOfRecords().hashCode();
        }
        if (getResultSetId() != null) {
            _hashCode += getResultSetId().hashCode();
        }
        if (getResultSetIdleTime() != null) {
            _hashCode += getResultSetIdleTime().hashCode();
        }
        if (getRecords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // メタデータ型 / [en]-(Type metadata)
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchRetrieveResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "searchRetrieveResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "numberOfRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "resultSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultSetIdleTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "resultSetIdleTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("records");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "records"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "recordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "record"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * メタデータオブジェクトの型を返却 / [en]-(Return type metadata object)
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
