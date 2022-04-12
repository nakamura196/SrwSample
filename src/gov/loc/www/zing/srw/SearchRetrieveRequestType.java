/**
 * SearchRetrieveRequestType.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package gov.loc.www.zing.srw;

public class SearchRetrieveRequestType  extends gov.loc.www.zing.srw.RequestType  implements java.io.Serializable {
    private java.lang.String query;

    private java.lang.Object startRecord;

    private java.lang.Object maximumRecords;

    private java.lang.Object recordPacking;

    private java.lang.Object resultSetTTL;

    public SearchRetrieveRequestType() {
    }

    public SearchRetrieveRequestType(
           java.lang.Object version,
           java.lang.String query,
           java.lang.Object startRecord,
           java.lang.Object maximumRecords,
           java.lang.Object recordPacking,
           java.lang.Object resultSetTTL) {
        super(
            version);
        this.query = query;
        this.startRecord = startRecord;
        this.maximumRecords = maximumRecords;
        this.recordPacking = recordPacking;
        this.resultSetTTL = resultSetTTL;
    }


    /**
     * Gets the query value for this SearchRetrieveRequestType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this SearchRetrieveRequestType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the startRecord value for this SearchRetrieveRequestType.
     * 
     * @return startRecord
     */
    public java.lang.Object getStartRecord() {
        return startRecord;
    }


    /**
     * Sets the startRecord value for this SearchRetrieveRequestType.
     * 
     * @param startRecord
     */
    public void setStartRecord(java.lang.Object startRecord) {
        this.startRecord = startRecord;
    }


    /**
     * Gets the maximumRecords value for this SearchRetrieveRequestType.
     * 
     * @return maximumRecords
     */
    public java.lang.Object getMaximumRecords() {
        return maximumRecords;
    }


    /**
     * Sets the maximumRecords value for this SearchRetrieveRequestType.
     * 
     * @param maximumRecords
     */
    public void setMaximumRecords(java.lang.Object maximumRecords) {
        this.maximumRecords = maximumRecords;
    }


    /**
     * Gets the recordPacking value for this SearchRetrieveRequestType.
     * 
     * @return recordPacking
     */
    public java.lang.Object getRecordPacking() {
        return recordPacking;
    }


    /**
     * Sets the recordPacking value for this SearchRetrieveRequestType.
     * 
     * @param recordPacking
     */
    public void setRecordPacking(java.lang.Object recordPacking) {
        this.recordPacking = recordPacking;
    }


    /**
     * Gets the resultSetTTL value for this SearchRetrieveRequestType.
     * 
     * @return resultSetTTL
     */
    public java.lang.Object getResultSetTTL() {
        return resultSetTTL;
    }


    /**
     * Sets the resultSetTTL value for this SearchRetrieveRequestType.
     * 
     * @param resultSetTTL
     */
    public void setResultSetTTL(java.lang.Object resultSetTTL) {
        this.resultSetTTL = resultSetTTL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchRetrieveRequestType)) return false;
        SearchRetrieveRequestType other = (SearchRetrieveRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.startRecord==null && other.getStartRecord()==null) || 
             (this.startRecord!=null &&
              this.startRecord.equals(other.getStartRecord()))) &&
            ((this.maximumRecords==null && other.getMaximumRecords()==null) || 
             (this.maximumRecords!=null &&
              this.maximumRecords.equals(other.getMaximumRecords()))) &&
            ((this.recordPacking==null && other.getRecordPacking()==null) || 
             (this.recordPacking!=null &&
              this.recordPacking.equals(other.getRecordPacking()))) &&
            ((this.resultSetTTL==null && other.getResultSetTTL()==null) || 
             (this.resultSetTTL!=null &&
              this.resultSetTTL.equals(other.getResultSetTTL())));
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
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getStartRecord() != null) {
            _hashCode += getStartRecord().hashCode();
        }
        if (getMaximumRecords() != null) {
            _hashCode += getMaximumRecords().hashCode();
        }
        if (getRecordPacking() != null) {
            _hashCode += getRecordPacking().hashCode();
        }
        if (getResultSetTTL() != null) {
            _hashCode += getResultSetTTL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // メタデータ型 / [en]-(Type metadata)
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchRetrieveRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "searchRetrieveRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "startRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "maximumRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordPacking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "recordPacking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultSetTTL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "resultSetTTL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
