
package com.fuso.enterprise.ipt.srv.server.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.fuso.enterprise.ipt.srv.api.model.domain.Part;
import com.fuso.enterprise.ipt.srv.api.model.domain.ShikeishyoDetails;
import com.fuso.enterprise.ipt.srv.common.utils.DateUtils;
import com.fuso.enterprise.ipt.srv.server.dao.ShikeishyoDao;
import com.fuso.enterprise.ipt.srv.server.model.entity.Shikeisho;
import com.fuso.enterprise.ipt.srv.server.model.entity.ShikeishoPart;
import com.fuso.enterprise.ipt.srv.server.util.AbstractIptDao;

@Repository
public class ShikeishyoDaoImpl extends AbstractIptDao<Shikeisho, String> implements ShikeishyoDao {

    public ShikeishyoDaoImpl() {
        super(Shikeisho.class);
    }

    @Override
    public List<ShikeishyoDetails> getAllShikeishyoForUser(String userId) {
        Map<String, Object> queryParameter = new HashMap<>();
        queryParameter.put("userId", userId);
        List<Shikeisho> shikeishos = super.getResultListByNamedQuery("getShikeishoForUser", queryParameter);
        //@formatter:off
        return shikeishos.stream().map(shikeisho -> convertShikeishyoDetailsFromEntityToDomain(shikeisho)).collect(Collectors.toList());
        //@formatter:on
    }

    private ShikeishyoDetails convertShikeishyoDetailsFromEntityToDomain(Shikeisho shikeisho) {
        ShikeishyoDetails shikeishyoDetails = new ShikeishyoDetails();
        shikeishyoDetails.setDataOfIssue(DateUtils.asLocalDate(shikeisho.getDateOfIssue()));
        shikeishyoDetails.setDepartment(shikeisho.getDepartment());
        shikeishyoDetails.setDesignerName(shikeisho.getDesigner());
        // shikeishyoDetails.setEoNo(shikeisho.get);
        shikeishyoDetails.setGroup(shikeisho.getGroupCode());
        shikeishyoDetails.setMachineType(shikeisho.getMachineType());
        shikeishyoDetails.setManagementNo(shikeisho.getManagementNo());
        shikeishyoDetails.setMaterialCost(shikeisho.getMaterialCost());
        shikeishyoDetails.setNetworkNumber(shikeisho.getNetworkNo());
        shikeishyoDetails.setOrderNo(shikeisho.getOrderNo());
        shikeishyoDetails.setPartsDestination(shikeisho.getRequestDestinationCode());
        shikeishyoDetails.setPayout1(shikeisho.getPayoutDestination1());
        shikeishyoDetails.setPayout2(shikeisho.getPayoutDestination2());
        shikeishyoDetails.setPayout3(shikeisho.getPayoutDestination3());
        shikeishyoDetails.setPersonInchrge(shikeisho.getPersonInCharge());
        shikeishyoDetails.setProductionVolumeUnits(shikeisho.getProductionVolumeUnits());
        shikeishyoDetails.setRdApprovalImageBase64Data(shikeisho.getApprovalDeptCode());
        shikeishyoDetails.setRdDesiredDate(DateUtils.asLocalDate(shikeisho.getDesiredDate()));
        shikeishyoDetails.setRemarks(shikeisho.getRemarks());
        shikeishyoDetails.setRequestCode(shikeisho.getRequestorCode());
        shikeishyoDetails.setRequestNo(shikeisho.getRequestNo());
        shikeishyoDetails.setResponsiblePersonL4(shikeisho.getResponsiblePerson14());
        shikeishyoDetails.setShikeishoDescription(shikeisho.getSubjectEn());
        shikeishyoDetails.setShikeishoState(shikeisho.getShikeishoStatus());
        shikeishyoDetails.setShikeisyoNo(shikeisho.getShikeishoNo());
        //@formatter:off
        shikeishyoDetails.setParts(shikeisho.getShikeishoParts().stream().map(part -> convertPartDetailsFromEntityToDomain(part)).collect(Collectors.toList()));
        //@formatter:on
        return shikeishyoDetails;
    }

    private Part convertPartDetailsFromEntityToDomain(ShikeishoPart shikeishoPart) {
        Part part = new Part();
        // part.setDeliverLocation(shikeishoPart.get);
        part.setDistrict(shikeishoPart.getDistrict());
        // part.setDrawingNo(shikeishoPart.get);
        // part.setDrawingUrl(drawingUrl);
        part.setGeneration(shikeishoPart.getGeneration());
        part.setImplementationInstruction(shikeishoPart.getImplementationInstructions());
        part.setInteriorMakerName(shikeishoPart.getInteriorMake());
        part.setInternalDeliveryDate(DateUtils.asLocalDate(shikeishoPart.getInternalDeliveryTime()));
        part.setPartName(shikeishoPart.getPartName());
        part.setPartNumber(shikeishoPart.getShikeishoPartEmbedded().getPartNo());
        part.setPartRemarks(shikeishoPart.getRemarks());
        // part.setPps(shikeishoPart.get);
        part.setPrototypeCode(shikeishoPart.getPrototypeCode());
        part.setQuantity(shikeishoPart.getRequestedQuantity());
        part.setStatus(shikeishoPart.getPartStatus());
        part.setUpg(shikeishoPart.getUpg());
        return part;
    }
}
