package com.huawei.esdk.uc.device.obg.userprofile;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.AddressListInfo;
import com.huawei.esdk.uc.domain.model.PersonInfo;
import com.huawei.esdk.uc.domain.model.bean.EmployeeList;
import com.huawei.esdk.uc.domain.model.bean.EnterpriseList;

/**
 * 通讯录接口
 * * * */
public interface UserProfileCapability
{
    /**
     * 
     * 查询个人通讯录
     * @param account
     * @param condition
     * @param pagecount
     * @param pagenum
     * @return
     */
    SDKResult<AddressListInfo> queryAddrList(String account, String condition, int pagecount, int pagenum);

    /**
     * 查询个人详情
     * @param account
     * @param staffAccount
     * @return
     */
    SDKResult<PersonInfo> queryPersonInfo(String account, String staffAccount);

    /**
     * 查询个人信息
     * @param account
     * @param condition
     * @param pagecount
     * @param pagenum
     * @return
     */
    SDKResult<EmployeeList> queryEmployee(String account, String condition, int pagecount, int pagenum);

    /**
     * 查询企业通讯录
     * @param account
     * @param deptId
     * @param pagecount
     * @param pagenum
     * @return
     */
    SDKResult<EnterpriseList> queryEnterprise(String account, String deptId, int pagecount, int pagenum);

}
