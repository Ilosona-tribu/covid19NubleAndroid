package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.annotations.BelongsTo;

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

/** This is an auto generated class representing the Responses type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Responses")
public final class Responses implements Model {
  public static final QueryField ID = field("id");
  public static final QueryField ID_RESPONSES = field("id_responses");
  public static final QueryField QUESTION = field("responsesQuestionId");
  public static final QueryField RESPONSE = field("response");
  public static final QueryField GROUP = field("responsesGroupId");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String id_responses;
  private final @ModelField(targetType="Question", isRequired = true) @BelongsTo(targetName = "responsesQuestionId", type = Question.class) Question question;
  private final @ModelField(targetType="String", isRequired = true) String response;
  private final @ModelField(targetType="TestEntries") @BelongsTo(targetName = "responsesGroupId", type = TestEntries.class) TestEntries group;
  public String getId() {
      return id;
  }
  
  public String getIdResponses() {
      return id_responses;
  }
  
  public Question getQuestion() {
      return question;
  }
  
  public String getResponse() {
      return response;
  }
  
  public TestEntries getGroup() {
      return group;
  }
  
  private Responses(String id, String id_responses, Question question, String response, TestEntries group) {
    this.id = id;
    this.id_responses = id_responses;
    this.question = question;
    this.response = response;
    this.group = group;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Responses responses = (Responses) obj;
      return ObjectsCompat.equals(getId(), responses.getId()) &&
              ObjectsCompat.equals(getIdResponses(), responses.getIdResponses()) &&
              ObjectsCompat.equals(getQuestion(), responses.getQuestion()) &&
              ObjectsCompat.equals(getResponse(), responses.getResponse()) &&
              ObjectsCompat.equals(getGroup(), responses.getGroup());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getIdResponses())
      .append(getQuestion())
      .append(getResponse())
      .append(getGroup())
      .toString()
      .hashCode();
  }
  
  public static IdResponsesStep builder() {
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
  public static Responses justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new Responses(
      id,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      id_responses,
      question,
      response,
      group);
  }
  public interface IdResponsesStep {
    QuestionStep idResponses(String idResponses);
  }
  

  public interface QuestionStep {
    ResponseStep question(Question question);
  }
  

  public interface ResponseStep {
    BuildStep response(String response);
  }
  

  public interface BuildStep {
    Responses build();
    BuildStep id(String id) throws IllegalArgumentException;
    BuildStep group(TestEntries group);
  }
  

  public static class Builder implements IdResponsesStep, QuestionStep, ResponseStep, BuildStep {
    private String id;
    private String id_responses;
    private Question question;
    private String response;
    private TestEntries group;
    @Override
     public Responses build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Responses(
          id,
          id_responses,
          question,
          response,
          group);
    }
    
    @Override
     public QuestionStep idResponses(String idResponses) {
        Objects.requireNonNull(idResponses);
        this.id_responses = idResponses;
        return this;
    }
    
    @Override
     public ResponseStep question(Question question) {
        Objects.requireNonNull(question);
        this.question = question;
        return this;
    }
    
    @Override
     public BuildStep response(String response) {
        Objects.requireNonNull(response);
        this.response = response;
        return this;
    }
    
    @Override
     public BuildStep group(TestEntries group) {
        this.group = group;
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
    private CopyOfBuilder(String id, String idResponses, Question question, String response, TestEntries group) {
      super.id(id);
      super.idResponses(idResponses)
        .question(question)
        .response(response)
        .group(group);
    }
    
    @Override
     public CopyOfBuilder idResponses(String idResponses) {
      return (CopyOfBuilder) super.idResponses(idResponses);
    }
    
    @Override
     public CopyOfBuilder question(Question question) {
      return (CopyOfBuilder) super.question(question);
    }
    
    @Override
     public CopyOfBuilder response(String response) {
      return (CopyOfBuilder) super.response(response);
    }
    
    @Override
     public CopyOfBuilder group(TestEntries group) {
      return (CopyOfBuilder) super.group(group);
    }
  }
  
}
