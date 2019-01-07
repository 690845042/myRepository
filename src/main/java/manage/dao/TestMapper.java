package manage.dao;

import org.springframework.stereotype.Repository;

import pojo.TbBrand;

import java.util.List;

@Repository
public interface TestMapper {

    public List<TbBrand> findAll();
}
