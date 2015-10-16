package com.huawei.esdk.uc.device.obg.userprofile;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.Group;
import com.huawei.esdk.uc.domain.model.bean.GroupInfoBase;
import com.huawei.esdk.uc.domain.model.bean.GroupMember;
import com.huawei.esdk.uc.domain.model.bean.GroupModifyInfo;
import com.huawei.esdk.uc.domain.model.bean.JoinGroupInfo;
import com.huawei.esdk.uc.domain.model.bean.PagedList;
import com.huawei.esdk.uc.domain.model.bean.QueryModeInfo;

/** * @author w00208247 * * */
public interface UserProfilePublicGroupCapability
{
    SDKErrorCode addGroup(Group group);
    
    
    SDKErrorCode delGroup(Group group);
    
    SDKErrorCode delGroupMember(String ucAccount,Group group);

    SDKResult<List<Group>> queryGroupInfo(String groupId, String groupCreater);
    
    SDKResult<PagedList<GroupInfoBase>> queryGroupList(String groupNo, 
    		String groupName, QueryModeInfo modeInfo);
    
    SDKResult<PagedList<GroupMember>> queryGroupMember(String groupId, String creator,QueryModeInfo queryModeInfo);
    
    SDKResult<PagedList<JoinGroupInfo>> queryJoinGroupByUC(String ucAccount, QueryModeInfo queryModeInfo);

    SDKErrorCode addGroupMember(String ucAccount, Group group);


    SDKErrorCode modifyGroup(String groupId, String groupCreater,
            GroupModifyInfo groupModInfo);

}
