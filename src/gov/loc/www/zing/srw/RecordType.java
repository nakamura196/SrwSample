/**
 * RecordType.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package gov.loc.www.zing.srw;

public class RecordType  implements java.io.Serializable {
    private java.lang.String recordSchema;

    private java.lang.String recordPacking;

    private java.lang.String recordData;

    private org.apache.axis.types.PositiveInteger recordPosition;

    public RecordType() {
    }

    public RecordType(
           java.lang.String recordSchema,
           java.lang.String recordPacking,
           java.lang.String recordData,
           org.apache.axis.types.PositiveInteger recordPosition) {
           this.recordSchema = recordSchema;
           this.recordPacking = recordPacking;
           this.recordData = recordData;
           this.recordPosition = recordPosition;
    }


    /**
     * Gets the recordSchema value for this RecordType.
     * 
     * @return recordSchema
     */
    public java.lang.String getRecordSchema() {
        return recordSchema;
    }


    /**
     * Sets the recordSchema value for this RecordType.
     * 
     * @param recordSchema
     */
    public void setRecordSchema(java.lang.String recordSchema) {
        this.recordSchema = recordSchema;
    }


    /**
     * Gets the recordPacking value for this RecordType.
     * 
     * @return recordPacking
     */
    public java.lang.String getRecordPacking() {
        return recordPacking;
    }


    /**
     * Sets the recordPacking value for this RecordType.
     * 
     * @param recordPacking
     */
    public void setRecordPacking(java.lang.String recordPacking) {
        this.recordPacking = recordPacking;
    }


    /**
     * Gets the recordData value for this RecordType.
     * 
     * @return recordData
     */
    public java.lang.String getRecordData() {
        return recordData;
    }


    /**
     * Sets the recordData value for this RecordType.
     * 
     * @param recordData
     */
    public void setRecordData(java.lang.String recordData) {
        this.recordData = recordData;
    }


    /**
     * Gets the recordPosition value for this RecordType.
     * 
     * @return recordPosition
     */
    public org.apache.axis.types.PositiveInteger getRecordPosition() {
        return recordPosition;
    }


    /**
     * Sets the recordPosition value for this RecordType.
     * 
     * @param recordPosition
     */
    public void setRecordPosition(org.apache.axis.types.PositiveInteger recordPosition) {
        this.recordPosition = recordPosition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecordType)) return false;
        RecordType other = (RecordType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recordSchema==null && other.getRecordSchema()==null) || 
             (this.recordSchema!=null &&
              this.recordSchema.equals(other.getRecordSchema()))) &&
            ((this.recordPacking==null && other.getRecordPacking()==null) || 
             (this.recordPacking!=null &&
              this.recordPacking.equals(other.getRecordPacking()))) &&
            ((this.recordData==null && other.getRecordData()==null) || 
             (this.recordData!=null &&
              this.recordData.equals(other.getRecordData()))) &&
            ((this.recordPosition==null && other.getRecordPosition()==null) || 
             (this.recordPosition!=null &&
              this.recordPosition.equals(other.getRecordPosition())));
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
        if (getRecordSchema() != null) {
            _hashCode += getRecordSchema().hashCode();
        }
        if (getRecordPacking() != null) {
            _hashCode += getRecordPacking().hashCode();
        }
        if (getRecordData() != null) {
            _hashCode += getRecordData().hashCode();
        }
        if (getRecordPosition() != null) {
            _hashCode += getRecordPosition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // メタデータ型 / [en]-(Type metadata)
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecordType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "recordType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "recordSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordPacking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "recordPacking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "recordData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.loc.gov/zing/srw/", "recordPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
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
