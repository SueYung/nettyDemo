package com.mt.DBTransfer.entityConverter;

public interface Converter <T,U> {
    
    U convert(T from , U to);
}
