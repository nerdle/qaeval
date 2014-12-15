/**
 * Copyright 2014 DIMA Research Group, TU Berlin (http://www.dima.tu-berlin.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.tu_berlin.dima;

import java.util.Set;

public class MultipleChoiceQuestion extends Question {

    private Set<String> answerChoices;

    public MultipleChoiceQuestion(Topic topic, String question) {
        super(topic, question);
    }

    public MultipleChoiceQuestion(Topic topic, String question, Set<String> answerChoices) {
        super(topic, question);
        this.answerChoices = answerChoices;
    }

    public MultipleChoiceQuestion(Topic topic, EvaluationEntry evaluationEntry) {
        super(topic, evaluationEntry.getQuestion());
        this.answerChoices = evaluationEntry.getAnswerChoices();
    }

    public Set<String> getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(Set<String> answerChoices) {
        this.answerChoices = answerChoices;
    }

}
