package com.huawei.esdk.uc.devices.v200r001c03.bmp;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.UCNumber;
import com.huawei.esdk.uc.domain.model.bean.BindInfo;

public interface UCV2R1C03BMPNumberCapability
{
    SDKResult<String> addNumber(UCNumber ucNumber);
    
    SDKResult<String> delNumber(UCNumber ucNumber);
    
    SDKResult<String> numberBind(BindInfo bindInfo);
    
    SDKResult<String> modifyNumber(UCNumber ucNumber);

    SDKResult<UCNumber> queryNumber(UCNumber ucNumber);
}
