package com.huawei.esdk.uc.device.obg;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.bean.ConfPrefixList;
import com.huawei.esdk.uc.domain.model.bean.GlobalSRTPList;


public interface IConfCapability
{

    SDKResult<GlobalSRTPList> queryGlobalSRTP(String userId, String gwip, String pageNum, String pageCount);

    SDKResult<ConfPrefixList> queryConfPrefix(String userId, String gwip);
}
