package com.huawei.esdk.uc.device.obg.voice;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.bean.BWList;

public interface VoiceServiceBWNumberCapability
{
    SDKResult<List<BWList>> queryBWService(String userNumber);
    
    SDKResult<String> setBWListState(String userNumber,String bwListFlag);
    
    SDKErrorCode setBWService(String userNumber,String optCode, BWList bwList);
}
