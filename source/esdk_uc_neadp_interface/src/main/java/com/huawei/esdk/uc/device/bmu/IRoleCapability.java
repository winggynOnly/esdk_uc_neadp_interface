package com.huawei.esdk.uc.device.bmu;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.Role;

public interface IRoleCapability
{

    SDKResult<Role> queryRole(String userId, String pageCount, String pageNum, String lang);
    
}
