package com.wipro.client.eurekaclient.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Article {

	private Long id;

	private String title;

	private String category;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate lastModified;

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(Long id, String title, String category, LocalDate lastModified) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.lastModified = lastModified;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getLastModified() {
		return lastModified;
	}

	public void setLastModified(LocalDate lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", category=" + category + ", lastModified=" + lastModified
				+ "]";
	}

}
