package com.huawei.esdk.uc.device.bmu;

import java.util.List;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.bean.PhoneInfo;
import com.huawei.esdk.uc.domain.model.bean.PhoneStateList;

public interface IPhoneCapability
{
    public SDKResult<PhoneStateList> queryPhoneState(String userId, List<PhoneInfo> phoneInfoList);
}
