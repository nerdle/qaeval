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

public class EvaluationEntry {

    private String qid;
    private String type;
    private String question;
    private String mc_1;
    private String mc_2;
    private String mc_3;
    private String mc_4;
    private String answer;
    private String source;

    public EvaluationEntry() {
        super();
    }

    public EvaluationEntry(String qid, String type, String question, String mc_1, String mc_2, String mc_3, String mc_4, String answer, String source) {
        super();
        this.qid = qid;
        this.type = type;
        this.question = question;
        this.mc_1 = mc_1;
        this.mc_2 = mc_2;
        this.mc_3 = mc_3;
        this.mc_4 = mc_4;
        this.answer = answer;
        this.source = source;
    }

    public EvaluationEntry(String[] entry) {
        if (entry.length != 9) {
            throw new IllegalArgumentException("Entry must have 9 fields.");
        }
        this.qid = entry[0];
        this.type = entry[1];
        this.question = entry[2];
        this.mc_1 = entry[3];
        this.mc_2 = entry[4];
        this.mc_3 = entry[5];
        this.mc_4 = entry[6];
        this.answer = entry[7];
        this.source = entry[8];
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
