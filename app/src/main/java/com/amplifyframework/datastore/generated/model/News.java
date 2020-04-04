package com.amplifyframework.datastore.generated.model;


import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the News type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "News")
public final class News implements Model {
  public static final QueryField ID = field("id");
  public static final QueryField ID_NEWS = field("id_news");
  public static final QueryField TITLE = field("title");
  public static final QueryField DESCRIPTION = field("description");
  public static final QueryField DETAIL = field("detail");
  public static final QueryField URL_BACKGROUND_IMAGE = field("url_background_image");
  public static final QueryField URL_THUMBNAIL_IMAGE = field("url_thumbnail_image");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String id_news;
  private final @ModelField(targetType="String", isRequired = true) String title;
  private final @ModelField(targetType="String", isRequired = true) String description;
  private final @ModelField(targetType="String", isRequired = true) String detail;
  private final @ModelField(targetType="AWSURL") String url_background_image;
  private final @ModelField(targetType="AWSURL") String url_thumbnail_image;
  public String getId() {
      return id;
  }
  
  public String getIdNews() {
      return id_news;
  }
  
  public String getTitle() {
      return title;
  }
  
  public String getDescription() {
      return description;
  }
  
  public String getDetail() {
      return detail;
  }
  
  public String getUrlBackgroundImage() {
      return url_background_image;
  }
  
  public String getUrlThumbnailImage() {
      return url_thumbnail_image;
  }
  
  private News(String id, String id_news, String title, String description, String detail, String url_background_image, String url_thumbnail_image) {
    this.id = id;
    this.id_news = id_news;
    this.title = title;
    this.description = description;
    this.detail = detail;
    this.url_background_image = url_background_image;
    this.url_thumbnail_image = url_thumbnail_image;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      News news = (News) obj;
      return ObjectsCompat.equals(getId(), news.getId()) &&
              ObjectsCompat.equals(getIdNews(), news.getIdNews()) &&
              ObjectsCompat.equals(getTitle(), news.getTitle()) &&
              ObjectsCompat.equals(getDescription(), news.getDescription()) &&
              ObjectsCompat.equals(getDetail(), news.getDetail()) &&
              ObjectsCompat.equals(getUrlBackgroundImage(), news.getUrlBackgroundImage()) &&
              ObjectsCompat.equals(getUrlThumbnailImage(), news.getUrlThumbnailImage());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getIdNews())
      .append(getTitle())
      .append(getDescription())
      .append(getDetail())
      .append(getUrlBackgroundImage())
      .append(getUrlThumbnailImage())
      .toString()
      .hashCode();
  }
  
  public static IdNewsStep builder() {
      return new Builder();
  }
  
  /** 
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   * @throws IllegalArgumentException Checks that ID is in the proper format
   */
  public static News justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new News(
      id,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      id_news,
      title,
      description,
      detail,
      url_background_image,
      url_thumbnail_image);
  }
  public interface IdNewsStep {
    TitleStep idNews(String idNews);
  }
  

  public interface TitleStep {
    DescriptionStep title(String title);
  }
  

  public interface DescriptionStep {
    DetailStep description(String description);
  }
  

  public interface DetailStep {
    BuildStep detail(String detail);
  }
  

  public interface BuildStep {
    News build();
    BuildStep id(String id) throws IllegalArgumentException;
    BuildStep url_background_image(String url_background_image);
    BuildStep url_thumbnail_image(String url_thumbnail_image);
  }
  

  public static class Builder implements IdNewsStep, TitleStep, DescriptionStep, DetailStep, BuildStep {
    private String id;
    private String id_news;
    private String title;
    private String description;
    private String detail;
    private String url_background_image;
    private String url_thumbnail_image;
    @Override
     public News build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new News(
          id,
          id_news,
          title,
          description,
          detail,
          url_background_image,
          url_thumbnail_image);
    }
    
    @Override
     public TitleStep idNews(String idNews) {
        Objects.requireNonNull(idNews);
        this.id_news = idNews;
        return this;
    }
    
    @Override
     public DescriptionStep title(String title) {
        Objects.requireNonNull(title);
        this.title = title;
        return this;
    }
    
    @Override
     public DetailStep description(String description) {
        Objects.requireNonNull(description);
        this.description = description;
        return this;
    }
    
    @Override
     public BuildStep detail(String detail) {
        Objects.requireNonNull(detail);
        this.detail = detail;
        return this;
    }
    
    @Override
     public BuildStep urlBackgroundImage(String urlBackgroundImage) {
        this.url_background_image = urlBackgroundImage;
        return this;
    }
    
    @Override
     public BuildStep urlThumbnailImage(String urlThumbnailImage) {
        this.url_thumbnail_image = urlThumbnailImage;
        return this;
    }
    
    /** 
     * WARNING: Do not set ID when creating a new object. Leave this blank and one will be auto generated for you.
     * This should only be set when referring to an already existing object.
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     * @throws IllegalArgumentException Checks that ID is in the proper format
     */
    public BuildStep id(String id) throws IllegalArgumentException {
        this.id = id;
        
        try {
            UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
        } catch (Exception exception) {
          throw new IllegalArgumentException("Model IDs must be unique in the format of UUID.",
                    exception);
        }
        
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String idNews, String title, String description, String detail, String urlBackgroundImage, String urlThumbnailImage) {
      super.id(id);
      super.idNews(idNews)
        .title(title)
        .description(description)
        .detail(detail)
        .urlBackgroundImage(urlBackgroundImage)
        .urlThumbnailImage(urlThumbnailImage);
    }
    
    @Override
     public CopyOfBuilder idNews(String idNews) {
      return (CopyOfBuilder) super.idNews(idNews);
    }
    
    @Override
     public CopyOfBuilder title(String title) {
      return (CopyOfBuilder) super.title(title);
    }
    
    @Override
     public CopyOfBuilder description(String description) {
      return (CopyOfBuilder) super.description(description);
    }
    
    @Override
     public CopyOfBuilder detail(String detail) {
      return (CopyOfBuilder) super.detail(detail);
    }
    
    @Override
     public CopyOfBuilder urlBackgroundImage(String urlBackgroundImage) {
      return (CopyOfBuilder) super.urlBackgroundImage(urlBackgroundImage);
    }
    
    @Override
     public CopyOfBuilder urlThumbnailImage(String urlThumbnailImage) {
      return (CopyOfBuilder) super.urlThumbnailImage(urlThumbnailImage);
    }
  }
  
}
