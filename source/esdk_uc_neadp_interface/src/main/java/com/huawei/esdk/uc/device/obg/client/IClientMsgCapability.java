package com.huawei.esdk.uc.device.obg.client; 

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.InstanceMessage;
import com.huawei.esdk.uc.domain.model.bean.GroupInfoBase;
import com.huawei.esdk.uc.domain.model.bean.PagedList;

/** * @author w00208247 * *  */
public interface IClientMsgCapability
{
    
    SDKErrorCode sendMessage(String ucAccount,InstanceMessage instanceMessage);
    
    SDKErrorCode withdrawMessage(InstanceMessage im);
    
    //C03接口新增方法
    SDKResult<PagedList<GroupInfoBase>> getMessage();
    
}
