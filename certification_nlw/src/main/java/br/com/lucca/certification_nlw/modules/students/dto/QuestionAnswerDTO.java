package br.com.lucca.certification_nlw.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestionAnswerDTO {
    
    private String questionID;
    private String alternativeID;
    private boolean isCorrect;
}
