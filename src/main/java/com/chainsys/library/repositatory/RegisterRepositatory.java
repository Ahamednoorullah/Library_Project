package com.chainsys.library.repositatory;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.library.entity.RegisterForm;

public interface RegisterRepositatory extends CrudRepository<RegisterForm, String> {

}
