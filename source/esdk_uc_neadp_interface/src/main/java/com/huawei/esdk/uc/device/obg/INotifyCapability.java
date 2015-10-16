package com.huawei.esdk.uc.device.obg;

import com.huawei.esdk.platform.common.SDKErrorCode;

public interface INotifyCapability
{

    /**
     * register=true注册回调，register=false取消注册回调
     * @param register
     * @return
     */
    SDKErrorCode registerNotification(boolean register);
}
