package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.annotations.HasMany;

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

/** This is an auto generated class representing the Questionnaire type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Questionnaires")
public final class Questionnaire implements Model {
  public static final QueryField ID = field("id");
  public static final QueryField ID_QUESTIONNAIRE = field("id_questionnaire");
  public static final QueryField IMAGE_QUESTIONNAIRE = field("image_questionnaire");
  public static final QueryField TITLE_QUESTIONNAIRE = field("title_questionnaire");
  public static final QueryField DESCRIPTION_QUESTIONNAIRE = field("description_questionnaire");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String id_questionnaire;
  private final @ModelField(targetType="AWSURL") String image_questionnaire;
  private final @ModelField(targetType="String", isRequired = true) String title_questionnaire;
  private final @ModelField(targetType="String", isRequired = true) String description_questionnaire;
  private final @ModelField(targetType="Question") @HasMany(associatedWith = "questionnaire", type = Question.class) List<Question> question = null;
  public String getId() {
      return id;
  }
  
  public String getIdQuestionnaire() {
      return id_questionnaire;
  }
  
  public String getImageQuestionnaire() {
      return image_questionnaire;
  }
  
  public String getTitleQuestionnaire() {
      return title_questionnaire;
  }
  
  public String getDescriptionQuestionnaire() {
      return description_questionnaire;
  }
  
  public List<Question> getQuestion() {
      return question;
  }
  
  private Questionnaire(String id, String id_questionnaire, String image_questionnaire, String title_questionnaire, String description_questionnaire) {
    this.id = id;
    this.id_questionnaire = id_questionnaire;
    this.image_questionnaire = image_questionnaire;
    this.title_questionnaire = title_questionnaire;
    this.description_questionnaire = description_questionnaire;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Questionnaire questionnaire = (Questionnaire) obj;
      return ObjectsCompat.equals(getId(), questionnaire.getId()) &&
              ObjectsCompat.equals(getIdQuestionnaire(), questionnaire.getIdQuestionnaire()) &&
              ObjectsCompat.equals(getImageQuestionnaire(), questionnaire.getImageQuestionnaire()) &&
              ObjectsCompat.equals(getTitleQuestionnaire(), questionnaire.getTitleQuestionnaire()) &&
              ObjectsCompat.equals(getDescriptionQuestionnaire(), questionnaire.getDescriptionQuestionnaire());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getIdQuestionnaire())
      .append(getImageQuestionnaire())
      .append(getTitleQuestionnaire())
      .append(getDescriptionQuestionnaire())
      .toString()
      .hashCode();
  }
  
  public static IdQuestionnaireStep builder() {
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
  public static Questionnaire justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new Questionnaire(
      id,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      id_questionnaire,
      image_questionnaire,
      title_questionnaire,
      description_questionnaire);
  }
  public interface IdQuestionnaireStep {
    TitleQuestionnaireStep idQuestionnaire(String idQuestionnaire);
  }
  

  public interface TitleQuestionnaireStep {
    DescriptionQuestionnaireStep titleQuestionnaire(String titleQuestionnaire);
  }
  

  public interface DescriptionQuestionnaireStep {
    BuildStep descriptionQuestionnaire(String descriptionQuestionnaire);
  }
  

  public interface BuildStep {
    Questionnaire build();
    BuildStep id(String id) throws IllegalArgumentException;
    BuildStep image_questionnaire(String image_questionnaire);
  }
  

  public static class Builder implements IdQuestionnaireStep, TitleQuestionnaireStep, DescriptionQuestionnaireStep, BuildStep {
    private String id;
    private String id_questionnaire;
    private String title_questionnaire;
    private String description_questionnaire;
    private String image_questionnaire;
    @Override
     public Questionnaire build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Questionnaire(
          id,
          id_questionnaire,
          image_questionnaire,
          title_questionnaire,
          description_questionnaire);
    }
    
    @Override
     public TitleQuestionnaireStep idQuestionnaire(String idQuestionnaire) {
        Objects.requireNonNull(idQuestionnaire);
        this.id_questionnaire = idQuestionnaire;
        return this;
    }
    
    @Override
     public DescriptionQuestionnaireStep titleQuestionnaire(String titleQuestionnaire) {
        Objects.requireNonNull(titleQuestionnaire);
        this.title_questionnaire = titleQuestionnaire;
        return this;
    }
    
    @Override
     public BuildStep descriptionQuestionnaire(String descriptionQuestionnaire) {
        Objects.requireNonNull(descriptionQuestionnaire);
        this.description_questionnaire = descriptionQuestionnaire;
        return this;
    }
    
    @Override
     public BuildStep imageQuestionnaire(String imageQuestionnaire) {
        this.image_questionnaire = imageQuestionnaire;
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
    private CopyOfBuilder(String id, String idQuestionnaire, String imageQuestionnaire, String titleQuestionnaire, String descriptionQuestionnaire) {
      super.id(id);
      super.idQuestionnaire(idQuestionnaire)
        .titleQuestionnaire(titleQuestionnaire)
        .descriptionQuestionnaire(descriptionQuestionnaire)
        .imageQuestionnaire(imageQuestionnaire);
    }
    
    @Override
     public CopyOfBuilder idQuestionnaire(String idQuestionnaire) {
      return (CopyOfBuilder) super.idQuestionnaire(idQuestionnaire);
    }
    
    @Override
     public CopyOfBuilder titleQuestionnaire(String titleQuestionnaire) {
      return (CopyOfBuilder) super.titleQuestionnaire(titleQuestionnaire);
    }
    
    @Override
     public CopyOfBuilder descriptionQuestionnaire(String descriptionQuestionnaire) {
      return (CopyOfBuilder) super.descriptionQuestionnaire(descriptionQuestionnaire);
    }
    
    @Override
     public CopyOfBuilder imageQuestionnaire(String imageQuestionnaire) {
      return (CopyOfBuilder) super.imageQuestionnaire(imageQuestionnaire);
    }
  }
  
}
