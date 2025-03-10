package br.edu.fateccotia.tasklist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "task")
public class TaskModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String description;
	private TaskStatusEnum status = TaskStatusEnum.PENDING;
	
	public TaskModel() {
		// TODO Auto-generated constructor stub
	}
	public TaskModel(Integer id, String description, TaskStatusEnum status) {
		
		this.id = id;
		this.description = description;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public TaskStatusEnum getStatus() {
		return status;
	}
	
	public void setStatus(TaskStatusEnum status) {
		this.status = status;
	}
	
	
}
