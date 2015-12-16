package com.xc.wt.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xc.wt.model.domain.Task;

/** database view of model {@link Task} */
@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {

}
