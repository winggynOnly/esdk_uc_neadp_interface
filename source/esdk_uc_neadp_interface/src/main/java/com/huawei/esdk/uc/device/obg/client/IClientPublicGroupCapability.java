package com.huawei.esdk.uc.device.obg.client;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.uc.domain.model.bean.GroupInfoBase;

public interface IClientPublicGroupCapability
{
    SDKErrorCode replyGroupApply(GroupInfoBase groupInfo, String ucAccount, Integer result);
    
    SDKErrorCode replyGroupInvite(GroupInfoBase groupInfo, String ucAccount, Integer result);
    
    SDKErrorCode applyJoinGroup(String groupId, String groupName,
        String ucAccount, String creator, String owner);

    SDKErrorCode applyQuitGroup(String groupId, String groupName,
        String ucAccount, String creator, String owner);
}
