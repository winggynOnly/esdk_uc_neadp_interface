package com.huawei.esdk.uc.device.obg.userprofile; import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.bean.CorpInfo;
import com.huawei.esdk.uc.domain.model.bean.DeptInfo;
import com.huawei.esdk.uc.domain.model.bean.DeptInfoBase;
import com.huawei.esdk.uc.domain.model.bean.OffsetQryStaffCond;
import com.huawei.esdk.uc.domain.model.bean.PageQryStaffCond;
import com.huawei.esdk.uc.domain.model.bean.PagedList;
import com.huawei.esdk.uc.domain.model.bean.QueryDeptCond;
import com.huawei.esdk.uc.domain.model.bean.QueryModeInfo;
import com.huawei.esdk.uc.domain.model.bean.StaffInfo;
import com.huawei.esdk.uc.domain.model.bean.StaffInfoBase;

/** * @author w00208247 * *  */
public interface UserProfileEnterpriseListCapability
{
    SDKResult<DeptInfo> queryDeptInfo(String deptId);
    
    SDKResult<PagedList<StaffInfoBase>> queryStaffList(String ucAccount,
            QueryModeInfo tListInfo, OffsetQryStaffCond tOffsetQryStaffCond,
            PageQryStaffCond tPageQryStaffCond);
    
    SDKResult<StaffInfo> queryStaffInfo(String ucNum);
    
    SDKResult<CorpInfo> queryEnterpriseInfo();
    
    SDKResult<PagedList<DeptInfoBase>> queryDeptListInfo(QueryModeInfo modeInfo,
            QueryDeptCond deptCond);
}
