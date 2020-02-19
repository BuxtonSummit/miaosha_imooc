package com.Buxton.service.impl;

import com.Buxton.dao.SequenceMapper;
import com.Buxton.domain.Sequence;
import com.Buxton.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Buxton
 * @Date 2020-02-18 15:22
 * @Description
 */
//@Service
public class SequenceServiceImpl implements SequenceService {

    @Autowired
    private SequenceMapper sequenceMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String getSequence() {
        int sequences = 0;
        Sequence sequence = sequenceMapper.getSequenceByName("order_info");

        sequences = sequence.getCurrentValue();
        sequence.setCurrentValue(sequence.getCurrentValue() + sequence.getStep());
        sequenceMapper.updateByPrimaryKeySelective(sequence);

        String sequenceStr = String.valueOf(sequences);

        return sequenceStr;
    }
}
