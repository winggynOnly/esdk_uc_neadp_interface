package com.huawei.esdk.uc.device.bmu;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.Department;
import com.huawei.esdk.uc.domain.model.bean.QueryDepartmentInfoList;

public interface IDepartmentCapability
{
    /** 
     * 新增部门
     * 
     * @param userId 操作用户
     * @param parentId 父部门ID
     * @param deptName 部门名称
     * @return SDK结果对象
     * @see [类、类#方法、类#成员]
     */
    public SDKResult<Department> addDept(String userId, String parentId, String deptName);
    
    /** 
     * 修改部门
     * 
     * @param userId 操作用户
     * @param departmentId 部门ID
     * @param deptName 部门名称
     * @return SDK结果对象
     * @see [类、类#方法、类#成员]
     */
    public SDKResult<String> modifyDept(String userId, String departmentId, String deptName);
    
    /** 
     * 删除部门
     * 
     * @param userId 操作用户
     * @param departmentId 部门ID
     * @return SDK结果对象
     * @see [类、类#方法、类#成员]
     */
    public SDKResult<String> delDept(String userId, String departmentId);
    
    /** 
     * 查询部门
     * 
     * @param userId 操作用户
     * @param parentId 父部门ID
     * @param pageCount 分页大小
     * @param pageNum 当前分页
     * @return SDK结果对象
     * @see [类、类#方法、类#成员]
     */
    public SDKResult<QueryDepartmentInfoList> queryDept(String userId, String parentId, int pageCount, int pageNum);
}
