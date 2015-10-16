package com.huawei.esdk.uc.devices.v200r001c03.ctc;

import java.util.Date;
import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.device.obg.ICTCCapability;
import com.huawei.esdk.uc.domain.model.Conference;
import com.huawei.esdk.uc.domain.model.bean.PagedList;

public interface UCV2R1C03CTCCapability extends ICTCCapability
{
    SDKResult<String> createConf(Conference confParam);
    
    SDKErrorCode joinConf(String confId,String ucAccount, String siteNo,String siteName,String role);
    
    SDKErrorCode viewTerminalSite(String confId, String ucAccount, 
        String videoSourceUri, String isLock);
    
    SDKErrorCode subConfStatus(String appID, String confID);
    
    SDKResult<List<Conference>> getConfList(String initiator, String qryType, Date beginTime, Date endTime,
        PagedList<Object> pageList, String confType2);
}
