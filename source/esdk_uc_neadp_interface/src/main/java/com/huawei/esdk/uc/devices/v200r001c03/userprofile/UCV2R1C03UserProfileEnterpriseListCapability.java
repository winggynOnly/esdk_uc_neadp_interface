package com.huawei.esdk.uc.devices.v200r001c03.userprofile;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.device.obg.userprofile.UserProfileEnterpriseListCapability;
import com.huawei.esdk.uc.domain.model.bean.OffsetQryStaffCond;
import com.huawei.esdk.uc.domain.model.bean.PageQryStaffCond;
import com.huawei.esdk.uc.domain.model.bean.PagedList;
import com.huawei.esdk.uc.domain.model.bean.QueryModeInfo;
import com.huawei.esdk.uc.domain.model.bean.StaffInfo;
import com.huawei.esdk.uc.domain.model.bean.StaffInfoBase;

/** * @author w00208247 * *  */
public interface UCV2R1C03UserProfileEnterpriseListCapability extends UserProfileEnterpriseListCapability
{
    SDKResult<PagedList<StaffInfoBase>> queryStaffList(String ucAccount,
            QueryModeInfo tListInfo, OffsetQryStaffCond tOffsetQryStaffCond,
            PageQryStaffCond tPageQryStaffCond);
    
    SDKResult<StaffInfo> queryStaffInfo(String ucNum);
    
}
