
package com.fuso.enterprise.ipt.srv.server.model.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TmpShikeishoParts")
public class ShikeishoPart implements Serializable {

    private static final long serialVersionUID = 8576436602690776920L;

    @EmbeddedId
    private ShikeishoPartEmbedded shikeishoPartEmbedded;

    @Column(name = "prototype_code")
    private String prototypeCode;

    @Column(name = "district")
    private String district;

    @Column(name = "generation")
    private String generation;

    @Column(name = "part_name")
    private String partName;

    @Column(name = "requested_quantity")
    private Integer requestedQuantity;

    @Column(name = "internal_delivery_time")
    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate internalDeliveryTime;

    @Column(name = "implementation_instructions")
    private String implementationInstructions;

    @Column(name = "upg")
    private String upg;

    @Column(name = "interior_make")
    private String interiorMake;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "first_time")
    private String firstTime;

    @Column(name = "child_part_exists")
    private String childPartExists;

    @Column(name = "part_status")
    private String partStatus;

    public ShikeishoPartEmbedded getShikeishoPartEmbedded() {
        return shikeishoPartEmbedded;
    }

    public void setShikeishoPartEmbedded(ShikeishoPartEmbedded shikeishoPartEmbedded) {
        this.shikeishoPartEmbedded = shikeishoPartEmbedded;
    }

    public String getPrototypeCode() {
        return prototypeCode;
    }

    public void setPrototypeCode(String prototypeCode) {
        this.prototypeCode = prototypeCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Integer getRequestedQuantity() {
        return requestedQuantity;
    }

    public void setRequestedQuantity(Integer requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public LocalDate getInternalDeliveryTime() {
        return internalDeliveryTime;
    }

    public void setInternalDeliveryTime(LocalDate internalDeliveryTime) {
        this.internalDeliveryTime = internalDeliveryTime;
    }

    public String getImplementationInstructions() {
        return implementationInstructions;
    }

    public void setImplementationInstructions(String implementationInstructions) {
        this.implementationInstructions = implementationInstructions;
    }

    public String getUpg() {
        return upg;
    }

    public void setUpg(String upg) {
        this.upg = upg;
    }

    public String getInteriorMake() {
        return interiorMake;
    }

    public void setInteriorMake(String interiorMake) {
        this.interiorMake = interiorMake;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(String firstTime) {
        this.firstTime = firstTime;
    }

    public String getChildPartExists() {
        return childPartExists;
    }

    public void setChildPartExists(String childPartExists) {
        this.childPartExists = childPartExists;
    }

    public String getPartStatus() {
        return partStatus;
    }

    public void setPartStatus(String partStatus) {
        this.partStatus = partStatus;
    }

}
