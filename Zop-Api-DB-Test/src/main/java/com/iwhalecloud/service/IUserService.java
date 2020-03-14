package com.iwhalecloud.service;

import com.iwhalecloud.common.ResponseData;
import com.iwhalecloud.entity.ApiPerformanceTesting;
import org.apache.ibatis.annotations.Param;

public interface IUserService {
    public ResponseData simple();

    public ApiPerformanceTesting fetchApiPerformanceTestingByCode(String testCode);

    public ApiPerformanceTesting getApiPerformanceTestingById(@Param("id") String id);

    public int modifyApiPerformanceTesting(ApiPerformanceTesting apiPerformanceTesting);
}
