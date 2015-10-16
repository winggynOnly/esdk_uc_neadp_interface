package com.huawei.esdk.uc.device.obg.voice;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.bean.ForwardInfo;

public interface VoiceServiceFWDNumberCapability
{
    SDKResult<List<ForwardInfo>> queryFWDService(String userNumber);

    SDKErrorCode setFWDService(String userNumber, String fwdType,
            String fwdNumber);

    SDKErrorCode unsetFWDService(String userNumber, String fwdType);
}
