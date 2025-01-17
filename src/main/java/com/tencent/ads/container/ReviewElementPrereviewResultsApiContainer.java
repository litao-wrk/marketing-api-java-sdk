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
import com.tencent.ads.api.ReviewElementPrereviewResultsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.ReviewElementPrereviewResultsGetRequest;
import com.tencent.ads.model.ReviewElementPrereviewResultsGetResponse;
import com.tencent.ads.model.ReviewElementPrereviewResultsGetResponseData;

public class ReviewElementPrereviewResultsApiContainer extends ApiContainer {

  @Inject ReviewElementPrereviewResultsApi api;

  /**
   * 获取元素的预审结果
   *
   * @param data (required)
   * @return ReviewElementPrereviewResultsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ReviewElementPrereviewResultsGetResponseData reviewElementPrereviewResultsGet(
      ReviewElementPrereviewResultsGetRequest data)
      throws ApiException, TencentAdsResponseException {
    ReviewElementPrereviewResultsGetResponse resp = api.reviewElementPrereviewResultsGet(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
