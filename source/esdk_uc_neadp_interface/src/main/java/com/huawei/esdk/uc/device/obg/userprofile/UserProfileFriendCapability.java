package com.huawei.esdk.uc.device.obg.userprofile;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.bean.FriendChangeInfo;
import com.huawei.esdk.uc.domain.model.bean.FriendInfo;

/** * @author w00208247 * * */
public interface UserProfileFriendCapability
{

    SDKResult<List<FriendInfo>> getFriendList(String ucAccount);

    SDKErrorCode delFriend(String ucAccount, String friendAccount);

    SDKErrorCode addFriend(String ucAccount, String friendAccount);


    SDKResult<FriendInfo> getFriendInfo(String ucAccount, int type,
            String friendAccount);

    SDKResult<List<FriendChangeInfo>> getPersonIncFriendList(String ucAccount,
            String timeStamp);

}
