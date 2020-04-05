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

/** This is an auto generated class representing the Test type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Tests")
public final class Test implements Model {
  public static final QueryField ID = field("id");
  public static final QueryField IMAGE_TEST = field("image_test");
  public static final QueryField TEST_DESCRIPTION = field("test_description");
  public static final QueryField TEST_RESULT = field("test_result");
  public static final QueryField QUESTIONNAIRE = field("testQuestionnaireId");
  public static final QueryField USER = field("testUserId");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="AWSURL") String image_test;
  private final @ModelField(targetType="String", isRequired = true) String test_description;
  private final @ModelField(targetType="String", isRequired = true) String test_result;
  private final @ModelField(targetType="Questionnaire") @BelongsTo(targetName = "testQuestionnaireId", type = Questionnaire.class) Questionnaire questionnaire;
  private final @ModelField(targetType="User") @BelongsTo(targetName = "testUserId", type = User.class) User user;
  public String getId() {
      return id;
  }
  
  public String getImageTest() {
      return image_test;
  }
  
  public String getTestDescription() {
      return test_description;
  }
  
  public String getTestResult() {
      return test_result;
  }
  
  public Questionnaire getQuestionnaire() {
      return questionnaire;
  }
  
  public User getUser() {
      return user;
  }
  
  private Test(String id, String image_test, String test_description, String test_result, Questionnaire questionnaire, User user) {
    this.id = id;
    this.image_test = image_test;
    this.test_description = test_description;
    this.test_result = test_result;
    this.questionnaire = questionnaire;
    this.user = user;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Test test = (Test) obj;
      return ObjectsCompat.equals(getId(), test.getId()) &&
              ObjectsCompat.equals(getImageTest(), test.getImageTest()) &&
              ObjectsCompat.equals(getTestDescription(), test.getTestDescription()) &&
              ObjectsCompat.equals(getTestResult(), test.getTestResult()) &&
              ObjectsCompat.equals(getQuestionnaire(), test.getQuestionnaire()) &&
              ObjectsCompat.equals(getUser(), test.getUser());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getImageTest())
      .append(getTestDescription())
      .append(getTestResult())
      .append(getQuestionnaire())
      .append(getUser())
      .toString()
      .hashCode();
  }
  
  public static TestDescriptionStep builder() {
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
  public static Test justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new Test(
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
      image_test,
      test_description,
      test_result,
      questionnaire,
      user);
  }
  public interface TestDescriptionStep {
    TestResultStep testDescription(String testDescription);
  }
  

  public interface TestResultStep {
    BuildStep testResult(String testResult);
  }
  

  public interface BuildStep {
    Test build();
    BuildStep id(String id) throws IllegalArgumentException;
    BuildStep image_test(String image_test);
    BuildStep questionnaire(Questionnaire questionnaire);
    BuildStep user(User user);
  }
  

  public static class Builder implements TestDescriptionStep, TestResultStep, BuildStep {
    private String id;
    private String test_description;
    private String test_result;
    private String image_test;
    private Questionnaire questionnaire;
    private User user;
    @Override
     public Test build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Test(
          id,
          image_test,
          test_description,
          test_result,
          questionnaire,
          user);
    }
    
    @Override
     public TestResultStep testDescription(String testDescription) {
        Objects.requireNonNull(testDescription);
        this.test_description = testDescription;
        return this;
    }
    
    @Override
     public BuildStep testResult(String testResult) {
        Objects.requireNonNull(testResult);
        this.test_result = testResult;
        return this;
    }
    
    @Override
     public BuildStep imageTest(String imageTest) {
        this.image_test = imageTest;
        return this;
    }
    
    @Override
     public BuildStep questionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
        return this;
    }
    
    @Override
     public BuildStep user(User user) {
        this.user = user;
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
    private CopyOfBuilder(String id, String imageTest, String testDescription, String testResult, Questionnaire questionnaire, User user) {
      super.id(id);
      super.testDescription(testDescription)
        .testResult(testResult)
        .imageTest(imageTest)
        .questionnaire(questionnaire)
        .user(user);
    }
    
    @Override
     public CopyOfBuilder testDescription(String testDescription) {
      return (CopyOfBuilder) super.testDescription(testDescription);
    }
    
    @Override
     public CopyOfBuilder testResult(String testResult) {
      return (CopyOfBuilder) super.testResult(testResult);
    }
    
    @Override
     public CopyOfBuilder imageTest(String imageTest) {
      return (CopyOfBuilder) super.imageTest(imageTest);
    }
    
    @Override
     public CopyOfBuilder questionnaire(Questionnaire questionnaire) {
      return (CopyOfBuilder) super.questionnaire(questionnaire);
    }
    
    @Override
     public CopyOfBuilder user(User user) {
      return (CopyOfBuilder) super.user(user);
    }
  }
  
}
