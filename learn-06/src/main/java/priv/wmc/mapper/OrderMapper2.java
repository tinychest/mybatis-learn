package priv.wmc.mapper;

import priv.wmc.pojo.result.OrderRelateResult;

/**
 * Order DML 接口定义
 *
 * @author Wang Mincong
 * @date 2020-07-22 19:35:43
 */
public interface OrderMapper2 {

    OrderRelateResult listByUserId(Long userId);

}
