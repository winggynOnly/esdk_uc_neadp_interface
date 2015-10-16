package com.huawei.esdk.uc.device.obg.userprofile;

import java.util.Date;
import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.PersonalContacts;
import com.huawei.esdk.uc.domain.model.bean.LinkmanInfo;
import com.huawei.esdk.uc.domain.model.bean.PeronalChangeInfo;
import com.huawei.esdk.uc.domain.model.bean.PersonalTeam;

/** * @author w00208247 
 * 个人通讯录接口
 * * * */
public interface UserProfilePersonListCapability
{
    SDKResult<List<PersonalTeam>> getPersonTeamInfo(String ucAccount);

    SDKResult<String> addClientTeam(String ucAccount, String name);

    SDKErrorCode delClientTeam(String ucAccount, String teamId);

    SDKErrorCode addLinkman(String ucAccount, LinkmanInfo linkmanInfo,
            String teamId);

    SDKErrorCode delLinkman(String ucAccount, String teamId, String linkmanId);


    SDKErrorCode addMemberToTeam(String ucAccount, String teamId,
            String linkmanId);
    
    SDKErrorCode modClientTeam(String ucAccount, String name, String teamId);

    SDKErrorCode delMemFromTeam(String ucAccount, String linkManId,
            String teamId);

    SDKResult<LinkmanInfo> getLinkmanInfo(String ucAccount, String linkManId,
            Integer queryType);

    SDKResult<PersonalContacts> getPersonAllAddressBook(String ucAccount);
    
    SDKResult<PeronalChangeInfo> getPersonIncAddressBook(String ucAccount,Date timeStamp);

}
