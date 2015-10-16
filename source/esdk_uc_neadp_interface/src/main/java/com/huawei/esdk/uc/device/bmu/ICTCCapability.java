package com.huawei.esdk.uc.device.bmu;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.Conference;
import com.huawei.esdk.uc.domain.model.bean.DeleteMeetingParam;
import com.huawei.esdk.uc.domain.model.bean.PagedList;
import com.huawei.esdk.uc.domain.model.bean.QueryMeetingParam;

public interface ICTCCapability
{
   SDKResult<String> scheduleMeeting(Conference confParam);
   SDKErrorCode modifyMeeting(Conference confParam);
   SDKResult<List<DeleteMeetingParam>> deleteMeeting(String userId, List<DeleteMeetingParam> params);
   SDKResult<PagedList<Conference>> queryMeeting(QueryMeetingParam param);
}
