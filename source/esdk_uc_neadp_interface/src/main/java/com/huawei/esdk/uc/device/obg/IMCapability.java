/**
 * 
 */
package com.huawei.esdk.uc.device.obg;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.uc.domain.model.Affiche;
import com.huawei.esdk.uc.domain.model.DeptInstanceMessage;
import com.huawei.esdk.uc.domain.model.GroupInstanceMessage;
import com.huawei.esdk.uc.domain.model.UCUserInstanceMessage;

public interface IMCapability
{
    
    SDKErrorCode appSendMsgToUC(UCUserInstanceMessage userInstanceMessage);

    SDKErrorCode appSendMsgToDept(DeptInstanceMessage deptInstanceMessage);

    SDKErrorCode appSendMsgToGroup(GroupInstanceMessage groupInstanceMessage);

    SDKErrorCode sendAffiche(Affiche affiche);

}
