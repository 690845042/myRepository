package manage.service;

import manage.dao.TestMapper;
import pojo.TbBrand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper depository;

    public List<TbBrand> findAll(){

        return  depository.findAll();
    }
}
