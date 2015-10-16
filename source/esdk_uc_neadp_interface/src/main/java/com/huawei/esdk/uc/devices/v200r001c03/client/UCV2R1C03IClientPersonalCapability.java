package com.huawei.esdk.uc.devices.v200r001c03.client;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.uc.device.obg.client.IClientPersonalCapability;
import com.huawei.esdk.uc.domain.model.bean.PresPublishInfo;
import com.huawei.esdk.uc.domain.model.bean.PublishPresStatus;
import com.huawei.esdk.uc.domain.model.bean.UserMobile;

public interface UCV2R1C03IClientPersonalCapability extends IClientPersonalCapability
{
    SDKResult<PublishPresStatus> pubPresInfo(String ucAccount,PresPublishInfo presPublish, long expires);
    SDKResult<PublishPresStatus> refreshPresInfo(String ucAccount, PresPublishInfo presPublish,
        PublishPresStatus pubPresStatus);
    
    SDKResult<Long> subPGM(String ucAccount, String subFlag, String groupUrl, String creator, long expires);
    
    SDKErrorCode uploadheadid (String ucAccount, String headId);
    
    SDKResult<List<UserMobile>> uploadMobileAddress(String ucAccount,List<String> mobileList) throws SDKException;
      
    SDKErrorCode setSignature(String ucAccount, String usrInfo);
    
    SDKResult<Long> refreshSubPGM(String ucAccount, String subFlag, String groupUrl, String creator, long expires);
}
