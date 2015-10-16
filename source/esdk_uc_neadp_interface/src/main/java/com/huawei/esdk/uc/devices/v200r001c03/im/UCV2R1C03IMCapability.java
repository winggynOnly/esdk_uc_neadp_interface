/**
 * 
 */
package com.huawei.esdk.uc.devices.v200r001c03.im;
import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.uc.device.obg.IMCapability;
import com.huawei.esdk.uc.domain.model.GroupInstanceMessage;
import com.huawei.esdk.uc.domain.model.UCUserInstanceMessage;

public interface UCV2R1C03IMCapability extends IMCapability
{
	SDKErrorCode appSendMsgToUC(UCUserInstanceMessage userInstanceMessage);

    SDKErrorCode appSendMsgToGroup(GroupInstanceMessage groupInstanceMessage);

}
