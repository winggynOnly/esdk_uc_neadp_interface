/**
 * 
 */
package com.huawei.esdk.uc.devices.v200r001c03l.im;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.uc.device.obg.IMCapability;
import com.huawei.esdk.uc.domain.model.DeptInstanceMessage;
import com.huawei.esdk.uc.domain.model.UCUserInstanceMessage;

public interface UCV2R1C03LIMCapability extends IMCapability
{
    
    SDKErrorCode appSendMsgToUC(UCUserInstanceMessage userInstanceMessage);

    SDKErrorCode appSendMsgToDept(DeptInstanceMessage deptInstanceMessage);

}
