package hello.typeconverter.converter;

import org.springframework.core.convert.converter.Converter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IntegerToStringConverter implements Converter<Integer, String> {
    @Override
    public String convert(Integer value) {
        log.info("convert source={}", value);
        return String.valueOf(value);
    }
}
