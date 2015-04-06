[![Build Status](https://travis-ci.org/nerdle/qaeval.svg?branch=master)](https://travis-ci.org/nerdle/qaeval)

QAEval
=======================

An Evaluation Framework for Question Answering Systems.

## Summary

The goal of the _QAEval_ is to promote research on systems that retrieve answers rather than documents in response to a natural language question. The focus is on systems that can function for a given topic.

The framework will consist of a question set for each topics with. Each question set will consist of questions with different factoid question types.

## Get Started

### Prerequisites
* Apache Maven 3
* Java >= 1.7

### Build from source

```
git clone https://github.com/nerdle/qaeval.git
cd qaeval
mvn clean package
```

_QA Evaluation Framework_ is now installed in `qaeval/target`

## Sample Usage

Evaluate your question answering system! Lets take a simple example for how to use the framwork.

You need to create a question answerer class that extends `QuestionAnswerer`. This class retrieves a question and returns a answer.

```java
public class MyQuestionAnswerer implements QuestionAnswerer {

    @Override
    public Answer answer(Question question) {
        Answer answer = new Answer();
        List<String> answers = new ArrayList<>();
        
        // add here possible answers to the question
        answers.add("worng answer");
        answers.add("current answer");
        
        answer.setAnswers(answers);
        
        return answer;
    }
}
```

As can be seen in the above code, there is one main method that should be overridden. The method `answer` actually is called from the framework to retrieve the answers to the questions.

You should also implement a controller class which specifies the setup of the evaluation.

```java
public class Controller {

    public static void main(String[] args) throws Exception {
        EvaluationConfig evaluationConfig = new EvaluationConfig();
        Evaluator evaluator = new Evaluator(evaluationConfig);
        QuestionAnswerer questionAnswerer = new MyQuestionAnswerer();
        evaluator.start(questionAnswerer);
    }
    
}
```

## License

_QAEval_ is licensed under the Apache Software License Version 2.0. For more
information please consult the LICENSE file.
