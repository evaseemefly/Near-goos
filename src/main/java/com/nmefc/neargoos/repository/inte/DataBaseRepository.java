package com.nmefc.neargoos.repository.inte;

import com.nmefc.neargoos.entity.data.DataBaseEntity;
import com.nmefc.neargoos.entity.data.DataOverviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *@Description: data介绍的数据库交互操作接口
 *@Param:
 *@Return:
 *@Author: quyua
 *@Date: 2019/10/10 9:49
 */
public interface DataBaseRepository<T extends DataBaseEntity, PK> extends JpaRepository<T,PK> {

}
