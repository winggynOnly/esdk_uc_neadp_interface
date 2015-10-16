package com.huawei.esdk.uc.devices.v200r001c03.userprofile;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.device.obg.userprofile.UserProfilePublicGroupCapability;
import com.huawei.esdk.uc.domain.model.Group;
import com.huawei.esdk.uc.domain.model.bean.GroupInfoBase;
import com.huawei.esdk.uc.domain.model.bean.GroupMember;
import com.huawei.esdk.uc.domain.model.bean.GroupModifyInfo;
import com.huawei.esdk.uc.domain.model.bean.JoinGroupInfo;
import com.huawei.esdk.uc.domain.model.bean.PagedList;
import com.huawei.esdk.uc.domain.model.bean.QueryModeInfo;

public interface UCV2R1C03UserProfilePublicGroupCapability extends UserProfilePublicGroupCapability
{
    SDKErrorCode addGroupMember(String ucAccount, Group group);
    
    SDKErrorCode addGroup(Group group);
    
    SDKErrorCode delGroup(Group group);
    
    SDKErrorCode modifyGroup(String groupId, String groupCreater,
        GroupModifyInfo groupModInfo);
    
    SDKResult<List<Group>> queryGroupInfo(String groupId, String groupCreater);
    
    SDKResult<PagedList<GroupInfoBase>> queryGroupList(String groupNo, 
        String groupName, QueryModeInfo modeInfo);
    
    SDKResult<PagedList<JoinGroupInfo>> queryJoinGroupByUC(String ucAccount,QueryModeInfo queryModeInfo);
    
    SDKResult<PagedList<GroupMember>> queryGroupMember(String groupId, String creator,QueryModeInfo queryModeInfo);
    
    SDKErrorCode delGroupMember(String ucAccount,Group group);
    
    SDKErrorCode modGroupOwner(Group groupInfo,GroupMember member);
    
    SDKResult<List<GroupMember>> addGroupMemberBatch(Group groupInfo);
  
    SDKResult<List<GroupMember>> delGroupMemberBatch(Group groupInfo);
    
}
