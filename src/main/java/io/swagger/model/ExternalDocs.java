package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ExternalDocs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-06T00:02:54.899+01:00")

public class ExternalDocs   {
  @JsonProperty("status")
  private Boolean status = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("uploader")
  private String uploader = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("is_playlist")
  private Boolean isPlaylist = null;

  @JsonProperty("site")
  private String site = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("like_count")
  private Long likeCount = null;

  @JsonProperty("dislike_count")
  private Long dislikeCount = null;

  @JsonProperty("view_count")
  private Long viewCount = null;

  @JsonProperty("duration")
  private Long duration = null;

  @JsonProperty("upload_date")
  private String uploadDate = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  @JsonProperty("uploader_url")
  private String uploaderUrl = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

  @JsonProperty("streams")
  @Valid
  private List<TheItemsSchema> streams = null;

  public ExternalDocs status(Boolean status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public ExternalDocs message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ExternalDocs description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExternalDocs uploader(String uploader) {
    this.uploader = uploader;
    return this;
  }

  /**
   * Get uploader
   * @return uploader
  **/
  @ApiModelProperty(value = "")


  public String getUploader() {
    return uploader;
  }

  public void setUploader(String uploader) {
    this.uploader = uploader;
  }

  public ExternalDocs url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ExternalDocs id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExternalDocs isPlaylist(Boolean isPlaylist) {
    this.isPlaylist = isPlaylist;
    return this;
  }

  /**
   * Get isPlaylist
   * @return isPlaylist
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsPlaylist() {
    return isPlaylist;
  }

  public void setIsPlaylist(Boolean isPlaylist) {
    this.isPlaylist = isPlaylist;
  }

  public ExternalDocs site(String site) {
    this.site = site;
    return this;
  }

  /**
   * Get site
   * @return site
  **/
  @ApiModelProperty(value = "")


  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public ExternalDocs title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ExternalDocs likeCount(Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

  /**
   * Get likeCount
   * @return likeCount
  **/
  @ApiModelProperty(value = "")


  public Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  public ExternalDocs dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

  /**
   * Get dislikeCount
   * @return dislikeCount
  **/
  @ApiModelProperty(value = "")


  public Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public ExternalDocs viewCount(Long viewCount) {
    this.viewCount = viewCount;
    return this;
  }

  /**
   * Get viewCount
   * @return viewCount
  **/
  @ApiModelProperty(value = "")


  public Long getViewCount() {
    return viewCount;
  }

  public void setViewCount(Long viewCount) {
    this.viewCount = viewCount;
  }

  public ExternalDocs duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")


  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public ExternalDocs uploadDate(String uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

  /**
   * Get uploadDate
   * @return uploadDate
  **/
  @ApiModelProperty(value = "")


  public String getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(String uploadDate) {
    this.uploadDate = uploadDate;
  }

  public ExternalDocs tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ExternalDocs addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")


  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ExternalDocs uploaderUrl(String uploaderUrl) {
    this.uploaderUrl = uploaderUrl;
    return this;
  }

  /**
   * Get uploaderUrl
   * @return uploaderUrl
  **/
  @ApiModelProperty(value = "")


  public String getUploaderUrl() {
    return uploaderUrl;
  }

  public void setUploaderUrl(String uploaderUrl) {
    this.uploaderUrl = uploaderUrl;
  }

  public ExternalDocs thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Get thumbnail
   * @return thumbnail
  **/
  @ApiModelProperty(value = "")


  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public ExternalDocs streams(List<TheItemsSchema> streams) {
    this.streams = streams;
    return this;
  }

  public ExternalDocs addStreamsItem(TheItemsSchema streamsItem) {
    if (this.streams == null) {
      this.streams = new ArrayList<TheItemsSchema>();
    }
    this.streams.add(streamsItem);
    return this;
  }

  /**
   * Get streams
   * @return streams
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TheItemsSchema> getStreams() {
    return streams;
  }

  public void setStreams(List<TheItemsSchema> streams) {
    this.streams = streams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDocs externalDocs = (ExternalDocs) o;
    return Objects.equals(this.status, externalDocs.status) &&
        Objects.equals(this.message, externalDocs.message) &&
        Objects.equals(this.description, externalDocs.description) &&
        Objects.equals(this.uploader, externalDocs.uploader) &&
        Objects.equals(this.url, externalDocs.url) &&
        Objects.equals(this.id, externalDocs.id) &&
        Objects.equals(this.isPlaylist, externalDocs.isPlaylist) &&
        Objects.equals(this.site, externalDocs.site) &&
        Objects.equals(this.title, externalDocs.title) &&
        Objects.equals(this.likeCount, externalDocs.likeCount) &&
        Objects.equals(this.dislikeCount, externalDocs.dislikeCount) &&
        Objects.equals(this.viewCount, externalDocs.viewCount) &&
        Objects.equals(this.duration, externalDocs.duration) &&
        Objects.equals(this.uploadDate, externalDocs.uploadDate) &&
        Objects.equals(this.tags, externalDocs.tags) &&
        Objects.equals(this.uploaderUrl, externalDocs.uploaderUrl) &&
        Objects.equals(this.thumbnail, externalDocs.thumbnail) &&
        Objects.equals(this.streams, externalDocs.streams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, description, uploader, url, id, isPlaylist, site, title, likeCount, dislikeCount, viewCount, duration, uploadDate, tags, uploaderUrl, thumbnail, streams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDocs {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uploader: ").append(toIndentedString(uploader)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPlaylist: ").append(toIndentedString(isPlaylist)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    uploaderUrl: ").append(toIndentedString(uploaderUrl)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

