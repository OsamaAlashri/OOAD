package com.example.taskmanager.repositories;

import com.example.taskmanager.models.Task;
import com.example.taskmanager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByAssignedTo(User user);
}
