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
import com.tencent.ads.api.QuerywordRptApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.QuerywordRptGetRequest;
import com.tencent.ads.model.QuerywordRptGetResponse;
import com.tencent.ads.model.QuerywordRptGetResponseData;

public class QuerywordRptApiContainer extends ApiContainer {

  @Inject QuerywordRptApi api;

  /**
   * 搜索词报表接口
   *
   * @param data (required)
   * @return QuerywordRptGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public QuerywordRptGetResponseData querywordRptGet(QuerywordRptGetRequest data)
      throws ApiException, TencentAdsResponseException {
    QuerywordRptGetResponse resp = api.querywordRptGet(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
