package com.huawei.esdk.uc.device.obg.client; 

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;

/** * @author w00208247 * *  */
public interface IClientCommonCapability
{
    SDKResult<Integer> userLogin(String ucAccount, String pw, String registerFunc,String deviceIP,String handleID);
    
    SDKErrorCode userLogOut(String ucAccount);
    
}
