package com.example.demo.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.DeptRepository;
import com.example.demo.pojo.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Text {
	@Autowired
    public DeptRepository dept;
	@Test
	public void contextLoads() {
		
		//查所有+
//		final List<User> all=dept.findAll();
//		System.out.println(all.get(0).getLastName());
		
		//添加
/*	User user =new User();
		user.setAge(41);
		user.setBirth(new Date());
		user.setCreatedTime(new Date());
		user.setEmail("ad111");
		user.setName("ddd");
		dept.save(user);*/
		///删除
	//	dept.deleteById(5);
		
		//有错误
		//解决java.lang.IllegalArgumentException: Modifying queries can only use void or i（别用User类型）
	/*	List<User> user=dept.findaaaName("aaa");
		System.out.println(user.toString());*/

		//有错误
		/*final Optional<User> user = dept.findOne(1);
		System.out.println(user.toString());*/
		
		
       ///分页
		/*Sort sort = new Sort(Sort.Direction.ASC, "id");
        @SuppressWarnings("deprecation")
		PageRequest pageable = new PageRequest(2,3,sort);
        final Page<User> all = dept.findAll(pageable);

        System.out.println(all.getSize());
        System.out.println(all.getNumber());
        System.out.println(all.getTotalPages());*/
		
		
		//id查询
	/*	Optional<User> user=dept.findById(2);
	System.out.println(user.get());*/
		
	//	User user=dept.findaaName(1);
		//User user =dept.findone();
		//System.out.println(user.getLastName());
		
		
		
		/*
		 Map searchParameters = new HashMap();
	        Map map = new HashMap();
	        searchParameters.put("size", 1);
	        searchParameters.put("pageSize", 2);

	        Map map1 = new HashMap();
	        Map map2 = new HashMap();
	        map2.put("field", "name");
	        map2.put("value", "");
	        List list = new ArrayList();
	        list.add(map2);
	        map1.put("filters", list);
	        searchParameters.put("filter", map1);
	        int page = 0;
	        int pageSize = 10;
	        if (searchParameters != null && searchParameters.size() > 0 && searchParameters.get("page") != null) {
	            page = Integer.parseInt(searchParameters.get("page").toString()) - 1;
	        }
	        if (searchParameters != null && searchParameters.size() > 0 && searchParameters.get("pageSize") != null) {
	            pageSize = Integer.parseInt(searchParameters.get("pageSize").toString());
	        }

	        if (pageSize < 1)
	            pageSize = 1;
	        if (pageSize > 100)
	            pageSize = 100;

	        Map filter = (Map) searchParameters.get("filter");
	        if (filter != null) {
	            System.err.println("11111111111111111111");
	            final List<Map> filters = (List<Map>) filter.get("filters");
	            Specification<User> spec = new Specification<User>() {
	                public Predicate toPredicate1(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
	                    List<Predicate> pl = new ArrayList<Predicate>();
	                    for (Map f : filters) {
	                        String field = f.get("field").toString().trim();
	                        String value = f.get("value").toString().trim();
	                        if (value != null && value.length() > 0) {
	                            System.err.println("22222222222222222");
	                            if ("name".equalsIgnoreCase(field)) {
	                                System.err.println("3333333333333333333");
	                                pl.add(cb.like(root.<String>get(field), value + "%"));
	                            } else if ("age".equalsIgnoreCase(field)) {
	                                pl.add(cb.like(root.<String>get(field), value + "%"));
	                            } 
	                        }

	                    }

	                    return cb.and(pl.toArray(new Predicate[0]));
	                }

					@Override
					public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query,
							CriteriaBuilder criteriaBuilder) {
						// TODO Auto-generated method stub
						return null;
					}
	            };
	            Sort sort = new Sort(Sort.Direction.ASC, "id");
	            PageRequest pageable = new PageRequest(2, 3, sort);
	            Page<User> all = dept.findAll(spec,pageable);

	            System.out.println(all.getTotalElements());
	            System.out.println(all.getTotalPages());
	        }*/
	}

}
