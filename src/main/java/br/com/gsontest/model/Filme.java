package br.com.gsontest.model;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

public class Filme {

	private String id;

	private Integer rank;

	private String title;

	@SerializedName(value = "full_title")
	private String fullTitle;

	private Integer year;

	private String image;

	private String crew;

	@SerializedName(value = "imdb_rating")
	private Double imdbRating;

	@SerializedName(value = "imdb_rating_count")
	private BigDecimal imdbRatingCount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFullTitle() {
		return fullTitle;
	}

	public void setFullTitle(String fullTitle) {
		this.fullTitle = fullTitle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public Double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(Double imdbRating) {
		this.imdbRating = imdbRating;
	}

	public BigDecimal getImdbRatingCount() {
		return imdbRatingCount;
	}

	public void setImdbRatingCount(BigDecimal imdbRatingCount) {
		this.imdbRatingCount = imdbRatingCount;
	}

}
