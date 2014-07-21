package com.lgvalle.photosnearby.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lgvalle on 21/07/14.
 */
public class Photo500Px {

	@Expose
	private Integer id;
	@SerializedName("user_id")
	@Expose
	private Integer userId;
	@Expose
	private String name;
	@Expose
	private String description;
	@SerializedName("times_viewed")
	@Expose
	private Integer timesViewed;
	@Expose
	private Double rating;
	@Expose
	private Double latitude;
	@Expose
	private Double longitude;
	@Expose
	private Integer width;
	@Expose
	private Integer height;
	@SerializedName("votes_count")
	@Expose
	private Integer votesCount;
	@SerializedName("favorites_count")
	@Expose
	private Integer favoritesCount;
	@SerializedName("comments_count")
	@Expose
	private Integer commentsCount;
	@SerializedName("image_url")
	@Expose
	private String imageUrl;
	@Expose
	private List<Photo500pxImage> images = new ArrayList<Photo500pxImage>();
	@Expose
	private String url;
	@Expose
	private Photo500pxUser user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTimesViewed() {
		return timesViewed;
	}

	public void setTimesViewed(Integer timesViewed) {
		this.timesViewed = timesViewed;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getVotesCount() {
		return votesCount;
	}

	public void setVotesCount(Integer votesCount) {
		this.votesCount = votesCount;
	}

	public Integer getFavoritesCount() {
		return favoritesCount;
	}

	public void setFavoritesCount(Integer favoritesCount) {
		this.favoritesCount = favoritesCount;
	}

	public Integer getCommentsCount() {
		return commentsCount;
	}

	public void setCommentsCount(Integer commentsCount) {
		this.commentsCount = commentsCount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<Photo500pxImage> getImages() {
		return images;
	}

	public void setImages(List<Photo500pxImage> images) {
		this.images = images;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Photo500pxUser getUser() {
		return user;
	}

	public void setUser(Photo500pxUser user) {
		this.user = user;
	}
}
