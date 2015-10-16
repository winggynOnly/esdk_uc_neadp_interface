package com.huawei.esdk.uc.device.obg.userprofile; import java.util.List;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.QueryUCPresenceInfo;

/** * @author w00208247 * *  */
public interface UserProfilePSSvrCapability
{

    SDKResult<List<QueryUCPresenceInfo>> queryUCPresence(List<String> presentitys);

}
