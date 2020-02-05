package com.keymao.mall.tiny.service;

import com.keymao.mall.tiny.common.api.CommonResult;

/**
 * 会员管理Service
 * Created by xiaojm
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
