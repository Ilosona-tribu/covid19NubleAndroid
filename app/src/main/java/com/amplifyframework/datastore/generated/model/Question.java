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

/** This is an auto generated class representing the Question type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Questions")
public final class Question implements Model {
  public static final QueryField ID = field("id");
  public static final QueryField ID_QUESTION = field("id_question");
  public static final QueryField TEXT_QUESTION = field("text_question");
  public static final QueryField QUESTION_TYPE = field("question_type");
  public static final QueryField LIST_OPTIONS = field("list_options");
  public static final QueryField QUESTIONNAIRE = field("questionQuestionnaireId");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String id_question;
  private final @ModelField(targetType="String", isRequired = true) String text_question;
  private final @ModelField(targetType="QuestionType", isRequired = true) QuestionType question_type;
  private final @ModelField(targetType="String") List<String> list_options;
  private final @ModelField(targetType="Questionnaire") @BelongsTo(targetName = "questionQuestionnaireId", type = Questionnaire.class) Questionnaire questionnaire;
  public String getId() {
      return id;
  }
  
  public String getIdQuestion() {
      return id_question;
  }
  
  public String getTextQuestion() {
      return text_question;
  }
  
  public QuestionType getQuestionType() {
      return question_type;
  }
  
  public List<String> getListOptions() {
      return list_options;
  }
  
  public Questionnaire getQuestionnaire() {
      return questionnaire;
  }
  
  private Question(String id, String id_question, String text_question, QuestionType question_type, List<String> list_options, Questionnaire questionnaire) {
    this.id = id;
    this.id_question = id_question;
    this.text_question = text_question;
    this.question_type = question_type;
    this.list_options = list_options;
    this.questionnaire = questionnaire;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Question question = (Question) obj;
      return ObjectsCompat.equals(getId(), question.getId()) &&
              ObjectsCompat.equals(getIdQuestion(), question.getIdQuestion()) &&
              ObjectsCompat.equals(getTextQuestion(), question.getTextQuestion()) &&
              ObjectsCompat.equals(getQuestionType(), question.getQuestionType()) &&
              ObjectsCompat.equals(getListOptions(), question.getListOptions()) &&
              ObjectsCompat.equals(getQuestionnaire(), question.getQuestionnaire());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getIdQuestion())
      .append(getTextQuestion())
      .append(getQuestionType())
      .append(getListOptions())
      .append(getQuestionnaire())
      .toString()
      .hashCode();
  }
  
  public static IdQuestionStep builder() {
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
  public static Question justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new Question(
      id,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      id_question,
      text_question,
      question_type,
      list_options,
      questionnaire);
  }
  public interface IdQuestionStep {
    TextQuestionStep idQuestion(String idQuestion);
  }
  

  public interface TextQuestionStep {
    QuestionTypeStep textQuestion(String textQuestion);
  }
  

  public interface QuestionTypeStep {
    BuildStep questionType(QuestionType questionType);
  }
  

  public interface BuildStep {
    Question build();
    BuildStep id(String id) throws IllegalArgumentException;
    BuildStep list_options(List<String> list_options);
    BuildStep questionnaire(Questionnaire questionnaire);
  }
  

  public static class Builder implements IdQuestionStep, TextQuestionStep, QuestionTypeStep, BuildStep {
    private String id;
    private String id_question;
    private String text_question;
    private QuestionType question_type;
    private List<String> list_options;
    private Questionnaire questionnaire;
    @Override
     public Question build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Question(
          id,
          id_question,
          text_question,
          question_type,
          list_options,
          questionnaire);
    }
    
    @Override
     public TextQuestionStep idQuestion(String idQuestion) {
        Objects.requireNonNull(idQuestion);
        this.id_question = idQuestion;
        return this;
    }
    
    @Override
     public QuestionTypeStep textQuestion(String textQuestion) {
        Objects.requireNonNull(textQuestion);
        this.text_question = textQuestion;
        return this;
    }
    
    @Override
     public BuildStep questionType(QuestionType questionType) {
        Objects.requireNonNull(questionType);
        this.question_type = questionType;
        return this;
    }
    
    @Override
     public BuildStep listOptions(List<String> listOptions) {
        this.list_options = listOptions;
        return this;
    }
    
    @Override
     public BuildStep questionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
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
    private CopyOfBuilder(String id, String idQuestion, String textQuestion, QuestionType questionType, List<String> listOptions, Questionnaire questionnaire) {
      super.id(id);
      super.idQuestion(idQuestion)
        .textQuestion(textQuestion)
        .questionType(questionType)
        .listOptions(listOptions)
        .questionnaire(questionnaire);
    }
    
    @Override
     public CopyOfBuilder idQuestion(String idQuestion) {
      return (CopyOfBuilder) super.idQuestion(idQuestion);
    }
    
    @Override
     public CopyOfBuilder textQuestion(String textQuestion) {
      return (CopyOfBuilder) super.textQuestion(textQuestion);
    }
    
    @Override
     public CopyOfBuilder questionType(QuestionType questionType) {
      return (CopyOfBuilder) super.questionType(questionType);
    }
    
    @Override
     public CopyOfBuilder listOptions(List<String> listOptions) {
      return (CopyOfBuilder) super.listOptions(listOptions);
    }
    
    @Override
     public CopyOfBuilder questionnaire(Questionnaire questionnaire) {
      return (CopyOfBuilder) super.questionnaire(questionnaire);
    }
  }
  
}
