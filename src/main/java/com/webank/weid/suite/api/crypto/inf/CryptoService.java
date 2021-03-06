/*
 *       Copyright© (2018-2019) WeBank Co., Ltd.
 *
 *       This file is part of weid-java-sdk.
 *
 *       weid-java-sdk is free software: you can redistribute it and/or modify
 *       it under the terms of the GNU Lesser General Public License as published by
 *       the Free Software Foundation, either version 3 of the License, or
 *       (at your option) any later version.
 *
 *       weid-java-sdk is distributed in the hope that it will be useful,
 *       but WITHOUT ANY WARRANTY; without even the implied warranty of
 *       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *       GNU Lesser General Public License for more details.
 *
 *       You should have received a copy of the GNU Lesser General Public License
 *       along with weid-java-sdk.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.webank.weid.suite.api.crypto.inf;

import com.webank.weid.exception.EncodeSuiteException;

/**
 * 秘钥加解密接口.
 * @author v_wbgyang
 *
 */
public interface CryptoService {

    /**
     * 加密方法.
     * @param content 待加密字符串
     * @param key 秘钥
     * @return 返回加密后的字符串数据
     */
    public String encrypt(String content, String key) throws EncodeSuiteException;
    
    /**
     * 解密方法.
     * @param content 待解密字符串
     * @param key 秘钥
     * @return 返回解密后的字符串数据
     */
    public String decrypt(String content, String key) throws EncodeSuiteException;
}
