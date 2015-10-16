package com.huawei.esdk.uc.device.u19;

import java.util.List;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.Conference;

public interface ICTCU19Capability
{
    SDKResult<String> createConf(Conference confParam);

    SDKResult<String> modifyConf(Conference confInfo);

    SDKResult<Conference> endConf(String userId, String gwIp, List<Integer> confRooms);

    SDKResult<List<Conference>> queryConf(String userId, String gwIp, String subPbxNo, String confRoom);
}
