package com.huawei.esdk.uc.device.obg;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.Account;
import com.huawei.esdk.uc.domain.model.bean.BatchAccount;

public interface IAccountCapability
{
    /**
     * 添加账号
     * @param userId
     * @param account
     * @return
     */
    SDKResult<String> addAccount(String userId, Account account);

    /**
     * 批量添加账号
     * @param userId
     * @param accounts
     * @return
     */
    SDKResult<BatchAccount> batchAddAccount(String userId, List<Account> accounts);

    /**
     * 修改账号
     * @param userId
     * @param account
     * @return
     */
    SDKErrorCode modifyAccount(String userId, Account account);

    /**
     * 删除账号
     * @param userId
     * @param accountId
     * @return
     */
    SDKErrorCode deleteAccount(String userId, String accountId);

    /**
     * 批量删除账号
     * @param userId
     * @param accountIds
     * @return
     */
    SDKResult<BatchAccount> batchDelAccount(String userId, List<String> accountIds);

    /**
     * 查询账号
     * @param userId
     * @param exactSearch
     * @param condition
     * @param pageCount
     * @param pageNum
     * @return
     */
    SDKResult<BatchAccount> getAccount(String userId, String exactSearch, String condition, int pageCount, int pageNum);

    /**
     * 修改密码
     * @param userId
     * @param account
     * @return
     */
    SDKErrorCode modifyAcountPassword(String userId, Account account);

    /**
     * 绑定号码
     * @param userId
     * @param account
     * @return
     */
    SDKErrorCode bindNum(String userId, Account account);
    
}
