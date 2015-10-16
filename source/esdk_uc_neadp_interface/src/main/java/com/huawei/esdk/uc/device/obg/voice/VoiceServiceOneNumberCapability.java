package com.huawei.esdk.uc.device.obg.voice;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.bean.BindingNumber;
import com.huawei.esdk.uc.domain.model.bean.OneNumberMode;

public interface VoiceServiceOneNumberCapability
{

    SDKErrorCode setOneNumber(String userAccount, String optCode,
            String oneNumber);

	
    SDKErrorCode setOneNumberService(String strOneNumber, OneNumberMode oneNumberMode);




    SDKErrorCode setBindingNumber(String userAccount, String optCode,
            String oneNumber, BindingNumber bindingNumberInfo);

    SDKResult<OneNumberMode> queryOneNumberService(String userAccount,
            String oneNumber);

    SDKResult<List<BindingNumber>> queryBindingNumber(String oneNumber);

}
