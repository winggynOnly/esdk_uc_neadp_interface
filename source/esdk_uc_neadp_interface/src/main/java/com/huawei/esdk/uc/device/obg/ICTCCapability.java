package com.huawei.esdk.uc.device.obg;

import java.util.Date;
import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.uc.domain.model.Conference;
import com.huawei.esdk.uc.domain.model.HoldingConference;
import com.huawei.esdk.uc.domain.model.Terminal;
import com.huawei.esdk.uc.domain.model.bean.PagedList;
import com.huawei.esdk.uc.domain.model.bean.TerminalInConfInfo;

public interface ICTCCapability
{
    SDKResult<HoldingConference> getConfInfo(String ucAccount, String confId) throws SDKException;
    
    SDKErrorCode audioToVideoConf(String ucAccount, String confId);
    
    SDKErrorCode joinConf(String confId,String ucAccount, String siteNo,String siteName,String role);

    SDKErrorCode addIntoConf(String ucAccount, List<Terminal> sitelist, String confId);

    SDKErrorCode delFromConf(String ucAccount, List<Terminal> sitelist, String confId);
    
    SDKResult<TerminalInConfInfo> informTerminalType(String confId, String ucAccount,
            String terminalType, String terminalIP,
            String location);
    
     SDKErrorCode modifyTalkMode(String ucAccount, String confId, String ceeNum, int aut);
    
    SDKErrorCode subConfStatus(String appID, String confID);

    SDKResult<String> createConf(Conference confParam);
    
//    SDKResult<List<Conference>> getConfList(String initiator, String qryType,
//            Date beginTime, Date endTime);
    
    SDKErrorCode releaseConf(String ucAccount, String confId);

    SDKResult<List<Terminal>> queryAttendees(String confId);
    
     /** 
     * <一句话功能简述>
     * <功能详细描述>
     * @param initiator
     * @param qryType
     * @param beginTime
     * @param endTime
     * @param pageList
     * @param confType2
     * @return
     * @see [类、类#方法、类#成员]
     */
    SDKResult<List<Conference>> getConfList(String initiator, String qryType, Date beginTime, Date endTime,
        PagedList<Object> pageList, String confType2);

    SDKErrorCode upgradeAudio2DataConf(String ucAccount, String confId);
}
