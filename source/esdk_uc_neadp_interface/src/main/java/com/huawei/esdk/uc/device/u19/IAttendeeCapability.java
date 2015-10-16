package com.huawei.esdk.uc.device.u19;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.uc.domain.model.bean.AttendeeInfo;
import com.huawei.esdk.uc.domain.model.u19.Attendee;

public interface IAttendeeCapability
{
    /** 
     * 操作与会人
     * 
     * @param attendee 与会人信息
     * @return SDKErrorCode 操作结果
     * @see [类、类#方法、类#成员]
     */
    public SDKErrorCode operateAttendee(Attendee attendee);
    
    /** 
     * 主席权限移交
     * <功能详细描述>
     * @param attendee 与会者信息
     * @return SDKErrorCode 操作结果
     * @see [类、类#方法、类#成员]
     */
    public SDKErrorCode transferChairman(Attendee attendee);
    
    /**
     * 添加与会者
     * <功能详细描述>
     * @param attendee
     * @return
     * @see [类、类#方法、类#成员]
     */
    public SDKResult<AttendeeInfo> addAttendee(Attendee attendee);
    
    /**
     * 删除与会者
     * <功能详细描述>
     * @param attendee
     * @return
     * @see [类、类#方法、类#成员]
     */
    public SDKResult<AttendeeInfo> delAttendee(Attendee attendee);
    
    /** 
     * 修改与会者权限
     * 
     * @param attendee 与会人信息
     * @return SDKErrorCode 操作结果
     * @see [类、类#方法、类#成员]
     */
    public SDKErrorCode modifyAttendeeAuthority(Attendee attendee);
}
