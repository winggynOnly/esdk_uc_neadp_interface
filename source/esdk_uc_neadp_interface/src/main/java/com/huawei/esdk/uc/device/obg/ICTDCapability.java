package com.huawei.esdk.uc.device.obg;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.Call;

public interface ICTDCapability
{
     SDKResult<String> dialCall(Call call);
    
     SDKErrorCode releaseCall(String ctdID);
    
     SDKResult<Call> getStatus(String callID); 

}
