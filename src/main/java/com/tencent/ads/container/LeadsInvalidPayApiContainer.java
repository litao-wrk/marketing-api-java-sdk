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
import com.tencent.ads.api.LeadsInvalidPayApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.LeadsInvalidPayGetRequest;
import com.tencent.ads.model.LeadsInvalidPayGetResponse;
import com.tencent.ads.model.LeadsInvalidPayGetResponseData;

public class LeadsInvalidPayApiContainer extends ApiContainer {

  @Inject LeadsInvalidPayApi api;

  /**
   * 获取无效赔付明细
   *
   * @param data (required)
   * @return LeadsInvalidPayGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LeadsInvalidPayGetResponseData leadsInvalidPayGet(LeadsInvalidPayGetRequest data)
      throws ApiException, TencentAdsResponseException {
    LeadsInvalidPayGetResponse resp = api.leadsInvalidPayGet(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}