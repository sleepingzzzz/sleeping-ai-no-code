package com.sleeping.sleepingainocode.service;


import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.sleeping.sleepingainocode.model.dto.app.AppQueryRequest;
import com.sleeping.sleepingainocode.model.entity.App;
import com.sleeping.sleepingainocode.model.vo.AppVO;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author sleeping
 */
public interface AppService extends IService<App> {

    /**
     * 获取应用封装类
     * @param app
     * @return
     */
    AppVO getAppVO(App app);

    /**
     * 获取应用封装列表
     *
     * @param appList
     * @return
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 构造应用查询条件
     *
      * @param appQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);


}
