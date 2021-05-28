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
import com.tencent.ads.api.XijingPageByComponentsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.XijingPageByComponentsAddRequest;
import com.tencent.ads.model.XijingPageByComponentsAddResponse;

public class XijingPageByComponentsApiContainer extends ApiContainer {

  @Inject XijingPageByComponentsApi api;

  /**
   * 蹊径-基于组件创建落地页
   *
   * @param data (required)
   * @return XijingPageByComponentsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public XijingPageByComponentsAddResponse xijingPageByComponentsAdd(
      XijingPageByComponentsAddRequest data) throws ApiException, TencentAdsResponseException {
    XijingPageByComponentsAddResponse resp = api.xijingPageByComponentsAdd(data);
    handleResponse(gson.toJson(resp));

    return resp;
  }
}
