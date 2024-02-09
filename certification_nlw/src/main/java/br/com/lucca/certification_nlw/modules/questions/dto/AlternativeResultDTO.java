package br.com.lucca.certification_nlw.modules.questions.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlternativeResultDTO {
    
    private UUID id;
    private String description;
}
