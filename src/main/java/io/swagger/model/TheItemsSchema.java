package io.swagger.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * TheItemsSchema
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-06T00:02:54.899+01:00")

public class TheItemsSchema   {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("format_note")
  private String formatNote = null;

  @JsonProperty("extension")
  private String extension = null;

  @JsonProperty("video_codec")
  private String videoCodec = null;

  @JsonProperty("audio_codec")
  private String audioCodec = null;

  @JsonProperty("height")
  private Long height = null;

  @JsonProperty("width")
  private Long width = null;

  @JsonProperty("fmt_id")
  private String fmtId = null;

  @JsonProperty("filesize")
  private Long filesize = null;

  @JsonProperty("filesize_pretty")
  private String filesizePretty = null;

  @JsonProperty("has_audio")
  private Boolean hasAudio = null;

  @JsonProperty("has_video")
  private Boolean hasVideo = null;

  @JsonProperty("is_hd")
  private Boolean isHd = null;

  public TheItemsSchema url(String url) {
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

  public TheItemsSchema format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public TheItemsSchema formatNote(String formatNote) {
    this.formatNote = formatNote;
    return this;
  }

  /**
   * Get formatNote
   * @return formatNote
  **/
  @ApiModelProperty(value = "")


  public String getFormatNote() {
    return formatNote;
  }

  public void setFormatNote(String formatNote) {
    this.formatNote = formatNote;
  }

  public TheItemsSchema extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * Get extension
   * @return extension
  **/
  @ApiModelProperty(value = "")


  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public TheItemsSchema videoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
    return this;
  }

  /**
   * Get videoCodec
   * @return videoCodec
  **/
  @ApiModelProperty(value = "")


  public String getVideoCodec() {
    return videoCodec;
  }

  public void setVideoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
  }

  public TheItemsSchema audioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
    return this;
  }

  /**
   * Get audioCodec
   * @return audioCodec
  **/
  @ApiModelProperty(value = "")


  public String getAudioCodec() {
    return audioCodec;
  }

  public void setAudioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
  }

  public TheItemsSchema height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")


  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public TheItemsSchema width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")


  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }

  public TheItemsSchema fmtId(String fmtId) {
    this.fmtId = fmtId;
    return this;
  }

  /**
   * Get fmtId
   * @return fmtId
  **/
  @ApiModelProperty(value = "")


  public String getFmtId() {
    return fmtId;
  }

  public void setFmtId(String fmtId) {
    this.fmtId = fmtId;
  }

  public TheItemsSchema filesize(Long filesize) {
    this.filesize = filesize;
    return this;
  }

  /**
   * Get filesize
   * @return filesize
  **/
  @ApiModelProperty(value = "")


  public Long getFilesize() {
    return filesize;
  }

  public void setFilesize(Long filesize) {
    this.filesize = filesize;
  }

  public TheItemsSchema filesizePretty(String filesizePretty) {
    this.filesizePretty = filesizePretty;
    return this;
  }

  /**
   * Get filesizePretty
   * @return filesizePretty
  **/
  @ApiModelProperty(value = "")


  public String getFilesizePretty() {
    return filesizePretty;
  }

  public void setFilesizePretty(String filesizePretty) {
    this.filesizePretty = filesizePretty;
  }

  public TheItemsSchema hasAudio(Boolean hasAudio) {
    this.hasAudio = hasAudio;
    return this;
  }

  /**
   * Get hasAudio
   * @return hasAudio
  **/
  @ApiModelProperty(value = "")


  public Boolean isHasAudio() {
    return hasAudio;
  }

  public void setHasAudio(Boolean hasAudio) {
    this.hasAudio = hasAudio;
  }

  public TheItemsSchema hasVideo(Boolean hasVideo) {
    this.hasVideo = hasVideo;
    return this;
  }

  /**
   * Get hasVideo
   * @return hasVideo
  **/
  @ApiModelProperty(value = "")


  public Boolean isHasVideo() {
    return hasVideo;
  }

  public void setHasVideo(Boolean hasVideo) {
    this.hasVideo = hasVideo;
  }

  public TheItemsSchema isHd(Boolean isHd) {
    this.isHd = isHd;
    return this;
  }

  /**
   * Get isHd
   * @return isHd
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsHd() {
    return isHd;
  }

  public void setIsHd(Boolean isHd) {
    this.isHd = isHd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TheItemsSchema theItemsSchema = (TheItemsSchema) o;
    return Objects.equals(this.url, theItemsSchema.url) &&
        Objects.equals(this.format, theItemsSchema.format) &&
        Objects.equals(this.formatNote, theItemsSchema.formatNote) &&
        Objects.equals(this.extension, theItemsSchema.extension) &&
        Objects.equals(this.videoCodec, theItemsSchema.videoCodec) &&
        Objects.equals(this.audioCodec, theItemsSchema.audioCodec) &&
        Objects.equals(this.height, theItemsSchema.height) &&
        Objects.equals(this.width, theItemsSchema.width) &&
        Objects.equals(this.fmtId, theItemsSchema.fmtId) &&
        Objects.equals(this.filesize, theItemsSchema.filesize) &&
        Objects.equals(this.filesizePretty, theItemsSchema.filesizePretty) &&
        Objects.equals(this.hasAudio, theItemsSchema.hasAudio) &&
        Objects.equals(this.hasVideo, theItemsSchema.hasVideo) &&
        Objects.equals(this.isHd, theItemsSchema.isHd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, format, formatNote, extension, videoCodec, audioCodec, height, width, fmtId, filesize, filesizePretty, hasAudio, hasVideo, isHd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheItemsSchema {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    formatNote: ").append(toIndentedString(formatNote)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    fmtId: ").append(toIndentedString(fmtId)).append("\n");
    sb.append("    filesize: ").append(toIndentedString(filesize)).append("\n");
    sb.append("    filesizePretty: ").append(toIndentedString(filesizePretty)).append("\n");
    sb.append("    hasAudio: ").append(toIndentedString(hasAudio)).append("\n");
    sb.append("    hasVideo: ").append(toIndentedString(hasVideo)).append("\n");
    sb.append("    isHd: ").append(toIndentedString(isHd)).append("\n");
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

