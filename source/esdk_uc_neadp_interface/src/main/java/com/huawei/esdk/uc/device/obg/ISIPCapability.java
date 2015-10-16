package com.huawei.esdk.uc.device.obg;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.SIP;
import com.huawei.esdk.uc.domain.model.bean.GatewayList;
import com.huawei.esdk.uc.domain.model.bean.SIPCondition;
import com.huawei.esdk.uc.domain.model.bean.SIPList;

public interface ISIPCapability
{
    /**
     * 添加SIP号码
     * @param userid
     * @param sip
     * @return
     */
    SDKErrorCode addSipNum(String userId, SIP sip);
    
    /**
     * 修改SIP号码
     * @param userId
     * @param sip
     * @return
     */
    SDKErrorCode modifySipNum(String userId, SIP sip);

    /**修改SIP号码密码
     * @param userId
     * @param sip
     * @return
     */
    SDKErrorCode modifySipPassword(String userId, SIP sip);

    /**
     * 删除SIP号码
     * @param userId
     * @param sip
     * @return
     */
    SDKErrorCode deleteSip(String userId, SIP sip);

    /**
     * 批量删除SIP号码
     * @param userId
     * @param sips
     * @return
     */
    SDKResult<SIPList> batchDeleteSip(String userId, List<SIP> sips);

    /**
     * 查询SIP号码
     * @param userId
     * @param sipCon
     * @return
     */
    SDKResult<SIPList> querySip(String userId, SIPCondition sipCon);

    /**
     * 查询网关列表
     * @param userId
     * @return
     */
    SDKResult<GatewayList> queryGateway(String userId);

    /**
     * 批量添加SIP号码
     * @param userId
     * @param sips
     * @return
     */
    SDKErrorCode addSipNums(String userId, String numStep, String uestep, String amount, SIP sip);
}
