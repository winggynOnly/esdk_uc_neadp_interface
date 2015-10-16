package com.huawei.esdk.uc.device.bmu;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.UserLevel;

public interface IUserLevelCapability
{

    SDKResult<UserLevel> queryUserLevel(String userId, String pageCount, String pageNum);
    
}
