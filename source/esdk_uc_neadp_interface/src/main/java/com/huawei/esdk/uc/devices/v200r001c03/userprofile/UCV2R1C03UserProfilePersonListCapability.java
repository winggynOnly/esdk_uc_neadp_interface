package com.huawei.esdk.uc.devices.v200r001c03.userprofile;

import java.util.Date;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.device.obg.userprofile.UserProfilePersonListCapability;
import com.huawei.esdk.uc.domain.model.PersonalContacts;
import com.huawei.esdk.uc.domain.model.bean.LinkmanInfo;
import com.huawei.esdk.uc.domain.model.bean.PeronalChangeInfo;
import com.huawei.esdk.uc.domain.model.bean.PersonalTeam;

/** * @author k00207574 * *  */
public interface UCV2R1C03UserProfilePersonListCapability extends UserProfilePersonListCapability
{
    SDKErrorCode modifyTeamIndex(String ucAccount,PersonalTeam personalTeam);
    
    SDKErrorCode addLinkman(String ucAccount, LinkmanInfo linkmanInfo, String teamId);
    
    SDKResult<PersonalContacts> getPersonAllAddressBook(String ucAccount);
    
    SDKResult<PeronalChangeInfo> getPersonIncAddressBook(String ucAccount, Date timeStamp);
    
    SDKResult<LinkmanInfo> getLinkmanInfo(String ucAccount, String linkManId, Integer queryType);
    
    
}
