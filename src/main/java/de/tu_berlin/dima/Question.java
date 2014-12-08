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

public class Question {

    private Topic topic;
    private String question;
    private String mc_1;
    private String mc_2;
    private String mc_3;
    private String mc_4;

    public Question() {
        super();
    }

    public Question(Topic topic, String question, String mc_1, String mc_2, String mc_3, String mc_4) {
        this.topic = topic;
        this.question = question;
        this.mc_1 = mc_1;
        this.mc_2 = mc_2;
        this.mc_3 = mc_3;
        this.mc_4 = mc_4;
    }

    public Question(Topic topic, EvaluationEntry evaluationEntry) {
        this.topic = topic;
        this.question = evaluationEntry.getQuestion();
        this.mc_1 = evaluationEntry.getMc_1();
        this.mc_2 = evaluationEntry.getMc_2();
        this.mc_3 = evaluationEntry.getMc_3();
        this.mc_4 = evaluationEntry.getMc_4();
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getMc_1() {
        return mc_1;
    }

    public void setMc_1(String mc_1) {
        this.mc_1 = mc_1;
    }

    public String getMc_2() {
        return mc_2;
    }

    public void setMc_2(String mc_2) {
        this.mc_2 = mc_2;
    }

    public String getMc_3() {
        return mc_3;
    }

    public void setMc_3(String mc_3) {
        this.mc_3 = mc_3;
    }

    public String getMc_4() {
        return mc_4;
    }

    public void setMc_4(String mc_4) {
        this.mc_4 = mc_4;
    }

}
