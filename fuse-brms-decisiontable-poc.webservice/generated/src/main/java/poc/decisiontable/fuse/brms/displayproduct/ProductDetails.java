
package poc.decisiontable.fuse.brms.displayproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="displayProduct" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productDetails", propOrder = {
    "productCode",
    "productType",
    "displayProduct"
})
public class ProductDetails {

    @XmlElement(required = true)
    protected String productCode;
    @XmlElement(required = true)
    protected String productType;
    protected boolean displayProduct;

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the displayProduct property.
     * 
     */
    public boolean isDisplayProduct() {
        return displayProduct;
    }

    /**
     * Sets the value of the displayProduct property.
     * 
     */
    public void setDisplayProduct(boolean value) {
        this.displayProduct = value;
    }

}
