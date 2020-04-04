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

/** This is an auto generated class representing the Map type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Maps")
public final class Map implements Model {
  public static final QueryField ID = field("id");
  public static final QueryField ID_MAP = field("id_map");
  public static final QueryField TITLE = field("title");
  public static final QueryField DESCRIPTION = field("description");
  public static final QueryField URL_MAP = field("url_map");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String id_map;
  private final @ModelField(targetType="String", isRequired = true) String title;
  private final @ModelField(targetType="String", isRequired = true) String description;
  private final @ModelField(targetType="AWSURL") String url_map;
  public String getId() {
      return id;
  }
  
  public String getIdMap() {
      return id_map;
  }
  
  public String getTitle() {
      return title;
  }
  
  public String getDescription() {
      return description;
  }
  
  public String getUrlMap() {
      return url_map;
  }
  
  private Map(String id, String id_map, String title, String description, String url_map) {
    this.id = id;
    this.id_map = id_map;
    this.title = title;
    this.description = description;
    this.url_map = url_map;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Map map = (Map) obj;
      return ObjectsCompat.equals(getId(), map.getId()) &&
              ObjectsCompat.equals(getIdMap(), map.getIdMap()) &&
              ObjectsCompat.equals(getTitle(), map.getTitle()) &&
              ObjectsCompat.equals(getDescription(), map.getDescription()) &&
              ObjectsCompat.equals(getUrlMap(), map.getUrlMap());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getIdMap())
      .append(getTitle())
      .append(getDescription())
      .append(getUrlMap())
      .toString()
      .hashCode();
  }
  
  public static IdMapStep builder() {
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
  public static Map justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new Map(
      id,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      id_map,
      title,
      description,
      url_map);
  }
  public interface IdMapStep {
    TitleStep idMap(String idMap);
  }
  

  public interface TitleStep {
    DescriptionStep title(String title);
  }
  

  public interface DescriptionStep {
    BuildStep description(String description);
  }
  

  public interface BuildStep {
    Map build();
    BuildStep id(String id) throws IllegalArgumentException;
    BuildStep url_map(String url_map);
  }
  

  public static class Builder implements IdMapStep, TitleStep, DescriptionStep, BuildStep {
    private String id;
    private String id_map;
    private String title;
    private String description;
    private String url_map;
    @Override
     public Map build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Map(
          id,
          id_map,
          title,
          description,
          url_map);
    }
    
    @Override
     public TitleStep idMap(String idMap) {
        Objects.requireNonNull(idMap);
        this.id_map = idMap;
        return this;
    }
    
    @Override
     public DescriptionStep title(String title) {
        Objects.requireNonNull(title);
        this.title = title;
        return this;
    }
    
    @Override
     public BuildStep description(String description) {
        Objects.requireNonNull(description);
        this.description = description;
        return this;
    }
    
    @Override
     public BuildStep urlMap(String urlMap) {
        this.url_map = urlMap;
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
    private CopyOfBuilder(String id, String idMap, String title, String description, String urlMap) {
      super.id(id);
      super.idMap(idMap)
        .title(title)
        .description(description)
        .urlMap(urlMap);
    }
    
    @Override
     public CopyOfBuilder idMap(String idMap) {
      return (CopyOfBuilder) super.idMap(idMap);
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
     public CopyOfBuilder urlMap(String urlMap) {
      return (CopyOfBuilder) super.urlMap(urlMap);
    }
  }
  
}
