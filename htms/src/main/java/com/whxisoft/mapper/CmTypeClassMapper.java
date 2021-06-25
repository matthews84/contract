package com.whxisoft.mapper;

import com.whxisoft.pojo.CmTypeClass;
import org.springframework.stereotype.Repository;

@Repository
public interface CmTypeClassMapper extends BaseMapper<CmTypeClass>  {
    String getId(String id);
}
