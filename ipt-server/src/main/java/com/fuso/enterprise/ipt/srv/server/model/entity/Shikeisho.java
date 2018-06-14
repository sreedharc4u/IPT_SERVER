
package com.fuso.enterprise.ipt.srv.server.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "shikeisho")
public class Shikeisho implements Serializable {

    private static final long serialVersionUID = 7360672237739183568L;

    @Id
    @Column(name = "shikeisho_no")
    private String shikeishoNo;

    @Column(name = "designer")
    private String designer;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "subject_en")
    private String subjectEn;

    @Column(name = "subject_ja")
    private String subjectJa;

    @Column(name = "machine_type")
    private String machineType;

    @Column(name = "management_no")
    private String managementNo;

    @Column(name = "network_no")
    private String networkNo;

    @Column(name = "desired_date")
    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate desiredDate;

    @Column(name = "production_volume_units")
    private Integer productionVolumeUnits;

    @Column(name = "material_cost")
    private Integer materialCost;

    @Column(name = "requestor_code")
    private String requestorCode;

    @Column(name = "approval_dept_code")
    private String approvalDeptCode;

    @Column(name = "request_destination_code")
    private String requestDestinationCode;

    @Column(name = "payout_destination1")
    private String payoutDestination1;

    @Column(name = "payout_destination2")
    private String payoutDestination2;

    @Column(name = "payout_destination3")
    private String payoutDestination3;

    @Column(name = "creation_date")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime creationDate;

    @Column(name = "delivery_location")
    private String deliveryLocation;

    @Column(name = "created_on")
    private String createdOn;

    @Column(name = "date_of_issue")
    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate dateOfIssue;

    @Column(name = "request_no")
    private String requestNo;

    @Column(name = "department")
    private String department;

    @Column(name = "group_code")
    private String groupCode;

    @Column(name = "responsible_person_l4")
    private String responsiblePerson14;

    @Column(name = "person_in_charge")
    private String personInCharge;

    @Column(name = "extension_l4")
    private String extensionl4;

    @Column(name = "extension_in_charge")
    private String extensionInCharge;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "new_or_updated")
    private String newOrUpdated;

    @Column(name = "user_name_login")
    private String userNameLogin;

    @Column(name = "updated_on")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime updatedOn;

    @Column(name = "requestorname")
    private String requestorname;

    @Column(name = "model")
    private String model;

    @Column(name = "approval_dept_name")
    private String approvalDeptName;

    @Column(name = "request_destination_name")
    private String requestDestinationName;

    @Column(name = "payout_destination1_name")
    private String payoutDestination1Name;

    @Column(name = "payout_destination2_name")
    private String payoutDestination2Name;

    @Column(name = "payout_destination3_name")
    private String payoutDestination3Name;

    @Column(name = "shikeisho_status")
    private String shikeishoStatus;

    @Fetch(FetchMode.SELECT)
    @OneToMany(mappedBy = "shikeishoPartEmbedded.shikeisho", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ShikeishoPart> shikeishoParts;

    public String getShikeishoNo() {
        return shikeishoNo;
    }

    public void setShikeishoNo(String shikeishoNo) {
        this.shikeishoNo = shikeishoNo;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getSubjectEn() {
        return subjectEn;
    }

    public void setSubjectEn(String subjectEn) {
        this.subjectEn = subjectEn;
    }

    public String getSubjectJa() {
        return subjectJa;
    }

    public void setSubjectJa(String subjectJa) {
        this.subjectJa = subjectJa;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getManagementNo() {
        return managementNo;
    }

    public void setManagementNo(String managementNo) {
        this.managementNo = managementNo;
    }

    public String getNetworkNo() {
        return networkNo;
    }

    public void setNetworkNo(String networkNo) {
        this.networkNo = networkNo;
    }

    public LocalDate getDesiredDate() {
        return desiredDate;
    }

    public void setDesiredDate(LocalDate desiredDate) {
        this.desiredDate = desiredDate;
    }

    public Integer getProductionVolumeUnits() {
        return productionVolumeUnits;
    }

    public void setProductionVolumeUnits(Integer productionVolumeUnits) {
        this.productionVolumeUnits = productionVolumeUnits;
    }

    public Integer getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(Integer materialCost) {
        this.materialCost = materialCost;
    }

    public String getRequestorCode() {
        return requestorCode;
    }

    public void setRequestorCode(String requestorCode) {
        this.requestorCode = requestorCode;
    }

    public String getApprovalDeptCode() {
        return approvalDeptCode;
    }

    public void setApprovalDeptCode(String approvalDeptCode) {
        this.approvalDeptCode = approvalDeptCode;
    }

    public String getRequestDestinationCode() {
        return requestDestinationCode;
    }

    public void setRequestDestinationCode(String requestDestinationCode) {
        this.requestDestinationCode = requestDestinationCode;
    }

    public String getPayoutDestination1() {
        return payoutDestination1;
    }

    public void setPayoutDestination1(String payoutDestination1) {
        this.payoutDestination1 = payoutDestination1;
    }

    public String getPayoutDestination2() {
        return payoutDestination2;
    }

    public void setPayoutDestination2(String payoutDestination2) {
        this.payoutDestination2 = payoutDestination2;
    }

    public String getPayoutDestination3() {
        return payoutDestination3;
    }

    public void setPayoutDestination3(String payoutDestination3) {
        this.payoutDestination3 = payoutDestination3;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getResponsiblePerson14() {
        return responsiblePerson14;
    }

    public void setResponsiblePerson14(String responsiblePerson14) {
        this.responsiblePerson14 = responsiblePerson14;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public String getExtensionl4() {
        return extensionl4;
    }

    public void setExtensionl4(String extensionl4) {
        this.extensionl4 = extensionl4;
    }

    public String getExtensionInCharge() {
        return extensionInCharge;
    }

    public void setExtensionInCharge(String extensionInCharge) {
        this.extensionInCharge = extensionInCharge;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getNewOrUpdated() {
        return newOrUpdated;
    }

    public void setNewOrUpdated(String newOrUpdated) {
        this.newOrUpdated = newOrUpdated;
    }

    public String getUserNameLogin() {
        return userNameLogin;
    }

    public void setUserNameLogin(String userNameLogin) {
        this.userNameLogin = userNameLogin;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getRequestorname() {
        return requestorname;
    }

    public void setRequestorname(String requestorname) {
        this.requestorname = requestorname;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getApprovalDeptName() {
        return approvalDeptName;
    }

    public void setApprovalDeptName(String approvalDeptName) {
        this.approvalDeptName = approvalDeptName;
    }

    public String getRequestDestinationName() {
        return requestDestinationName;
    }

    public void setRequestDestinationName(String requestDestinationName) {
        this.requestDestinationName = requestDestinationName;
    }

    public String getPayoutDestination1Name() {
        return payoutDestination1Name;
    }

    public void setPayoutDestination1Name(String payoutDestination1Name) {
        this.payoutDestination1Name = payoutDestination1Name;
    }

    public String getPayoutDestination2Name() {
        return payoutDestination2Name;
    }

    public void setPayoutDestination2Name(String payoutDestination2Name) {
        this.payoutDestination2Name = payoutDestination2Name;
    }

    public String getPayoutDestination3Name() {
        return payoutDestination3Name;
    }

    public void setPayoutDestination3Name(String payoutDestination3Name) {
        this.payoutDestination3Name = payoutDestination3Name;
    }

    public String getShikeishoStatus() {
        return shikeishoStatus;
    }

    public void setShikeishoStatus(String shikeishoStatus) {
        this.shikeishoStatus = shikeishoStatus;
    }

    public List<ShikeishoPart> getShikeishoParts() {
        return shikeishoParts;
    }

    public void setShikeishoParts(List<ShikeishoPart> shikeishoParts) {
        this.shikeishoParts = shikeishoParts;
    }

}
