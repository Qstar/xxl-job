package com.xxl.job.core.util;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * sharding vo
 *
 * @author xuxueli 2017-07-25 21:26:38
 */
public class ShardingUtil {

    private static InheritableThreadLocal<ShardingVO> contextHolder = new InheritableThreadLocal<ShardingVO>();

    @Data
    @AllArgsConstructor
    public static class ShardingVO {

        private int index;  // sharding index
        private int total;  // sharding total
    }

    public static void setShardingVo(ShardingVO shardingVo) {
        contextHolder.set(shardingVo);
    }

    public static ShardingVO getShardingVo() {
        return contextHolder.get();
    }

}
