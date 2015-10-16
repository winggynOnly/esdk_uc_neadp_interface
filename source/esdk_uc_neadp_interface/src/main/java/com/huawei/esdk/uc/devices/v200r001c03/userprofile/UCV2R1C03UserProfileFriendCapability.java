package com.huawei.esdk.uc.devices.v200r001c03.userprofile;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.device.obg.userprofile.UserProfileFriendCapability;
import com.huawei.esdk.uc.domain.model.bean.FriendChangeInfo;
import com.huawei.esdk.uc.domain.model.bean.FriendInfo;

/** * @author w00208247 * * */
public interface UCV2R1C03UserProfileFriendCapability extends
        UserProfileFriendCapability
{
    SDKErrorCode addNewFriend(String ucAccount, FriendInfo friendInfo,
            String friendAccount, String groupId);

    SDKResult<List<FriendInfo>> getFriendList(String ucAccount);

    SDKResult<FriendInfo> getFriendInfo(String ucAccount, int type,
            String friendAccount);

    SDKResult<List<FriendChangeInfo>> getPersonIncFriendList(String ucAccount,
            String timeStamp);
}
