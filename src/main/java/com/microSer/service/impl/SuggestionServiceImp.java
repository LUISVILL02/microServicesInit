package com.microSer.service.impl;

import com.microSer.data.entities.Dtos.SuggestionDtoSave;
import com.microSer.data.entities.Dtos.SuggestionDtoSend;
import com.microSer.data.entities.Suggestion;
import com.microSer.data.entities.mapper.SuggestionMapper;
import com.microSer.repository.SuggestionRepository;
import org.springframework.stereotype.Service;

@Service
public class SuggestionServiceImp extends ServiceImp<SuggestionDtoSave, SuggestionDtoSend, Suggestion>{
    protected SuggestionServiceImp(SuggestionRepository repository, SuggestionMapper mapper) {
        super(repository, mapper);
    }
}
