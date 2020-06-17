package com.jiniz.blog.board.model;

public class PostVO {
	
	public int pid;
	public String category;
	public String title;
	public String contents;
	public String tag;
	public int view_cnt;
	public String author;
	public String created;
	public String modified;
	
	@Override
	public String toString() {
		return "PostVO [pid=" + pid + ", category=" + category + ", title=" + title + ", contents=" + contents
				+ ", tag=" + tag + ", view_cnt=" + view_cnt + ", author=" + author + ", created=" + created
				+ ", modified=" + modified + "]";
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getView_cnt() {
		return view_cnt;
	}
	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	
}
