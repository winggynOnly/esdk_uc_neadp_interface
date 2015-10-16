package com.huawei.esdk.uc.devices.v200r001c03.client;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.device.obg.client.IClientMsgCapability;
import com.huawei.esdk.uc.domain.model.InstanceMessage;
import com.huawei.esdk.uc.domain.model.bean.MessageInfo;
import com.huawei.esdk.uc.domain.model.bean.PagedList;
import com.huawei.esdk.uc.domain.model.bean.QueryMsgCondition;

public interface UCV2R1C03IClientMsgCapability extends IClientMsgCapability
{
    SDKErrorCode markMsgReadFlag(String ucAccount, QueryMsgCondition msgCondition, String msgID);
    
    SDKResult<PagedList<MessageInfo>> getMessage(String sender, String messageType, String timeStamp,
        PagedList<Integer> pageList);
    
    SDKResult<PagedList<MessageInfo>> getMsgLog(String sender, QueryMsgCondition msgCondition,
        PagedList<Integer> pageList);
    
    SDKErrorCode withdrawMessage(InstanceMessage im);
    
    SDKErrorCode sendMessage(String ucAccount, InstanceMessage instanceMessage);
}
