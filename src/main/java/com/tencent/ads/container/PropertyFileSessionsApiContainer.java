/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.PropertyFileSessionsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.PropertyFileSessionsAddRequest;
import com.tencent.ads.model.PropertyFileSessionsAddResponse;
import com.tencent.ads.model.PropertyFileSessionsAddResponseData;
import com.tencent.ads.model.PropertyFileSessionsUpdateRequest;
import com.tencent.ads.model.PropertyFileSessionsUpdateResponse;
import com.tencent.ads.model.PropertyFileSessionsUpdateResponseData;

public class PropertyFileSessionsApiContainer extends ApiContainer {

  @Inject PropertyFileSessionsApi api;

  /**
   * 创建属性数据文件上传会话
   *
   * @param data (required)
   * @return PropertyFileSessionsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public PropertyFileSessionsAddResponseData propertyFileSessionsAdd(
      PropertyFileSessionsAddRequest data) throws ApiException, TencentAdsResponseException {
    PropertyFileSessionsAddResponse resp = api.propertyFileSessionsAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 提交属性数据文件上传会话
   *
   * @param data (required)
   * @return PropertyFileSessionsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public PropertyFileSessionsUpdateResponseData propertyFileSessionsUpdate(
      PropertyFileSessionsUpdateRequest data) throws ApiException, TencentAdsResponseException {
    PropertyFileSessionsUpdateResponse resp = api.propertyFileSessionsUpdate(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
