package com.hathoute.modbus.parser.implementation;

import com.hathoute.modbus.parser.AbstractParser;
import com.hathoute.modbus.parser.ByteBufferSupplier;
import com.hathoute.modbus.parser.Parser;

import java.nio.ByteBuffer;

@Parser(formats = {"float", "float32"}, size = 4)
public class FloatParser extends AbstractParser<Float> {

    public FloatParser(ByteBufferSupplier supplier) {
        super(supplier);
    }

    @Override
    public Float parse(byte[] value) {
        ByteBuffer byteBuffer = byteBufferSupplier.get(value);
        return byteBuffer.getFloat();
    }
}
