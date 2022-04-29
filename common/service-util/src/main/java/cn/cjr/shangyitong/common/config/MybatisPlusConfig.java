package cn.cjr.shangyitong.common.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author sky
 * @version 1.0
 * @date 2022/4/28 17:19
 * MybatisPlus配置类
 */
@EnableTransactionManagement // 事务处理
@Configuration
@MapperScan("cn.cjr.shangyitong.*.mapper")
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        // paginationInterceptor.setLimit(你的最大单页限制数量，默认500条，小于0 不受限制)
        return new PaginationInterceptor();
    }

    /**
     * 乐观锁配置
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }

}
