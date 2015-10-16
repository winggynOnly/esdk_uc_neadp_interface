/**
 * 
 */
package com.huawei.esdk.uc.devices.v200r001c03.bmp;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.Department;
import com.huawei.esdk.uc.domain.model.bean.UCAccountInfo;

/**
 * <一句话功能简述>
 * <p>
 * <功能详细描述>
 * <p>
 * @author gWX169839
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface UCV2R1C03BMPAccountCapability
{
    SDKResult<String> addDept(Department dept);

    SDKResult<String> modDept(Department dept);

    SDKResult<String> delDept(Department dept);

    SDKResult<String> updateDept(Department dept);

    SDKResult<String> updateAccount(UCAccountInfo ucAccountInfo);

    SDKResult<String> delAccount(UCAccountInfo ucAccountInfo);

    SDKResult<String> addAccount(UCAccountInfo ucAccountInfo);

    SDKResult<String> modAccount(UCAccountInfo ucAccountInfo);
}
