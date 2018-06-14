
package com.fuso.enterprise.ipt.srv.server.dao;

import com.fuso.enterprise.ipt.srv.api.model.domain.ShikeishyoDetails;
import com.fuso.enterprise.ipt.srv.server.model.entity.TmpShikeisho;

public interface TmpShikeishyoDao {

    void createOrUpdateShikeishyo(ShikeishyoDetails shikeishyoDetails, boolean isNewShikeisho);

    TmpShikeisho readShikeishyo(String shikeishyoNo);

}
