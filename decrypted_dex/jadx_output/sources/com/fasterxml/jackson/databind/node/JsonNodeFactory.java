package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JsonNodeFactory implements Serializable {
    private static final JsonNodeFactory decimalsAsIs;
    private static final JsonNodeFactory decimalsNormalized;
    public static final JsonNodeFactory instance;
    private final boolean _cfgBigDecimalExact;

    static {
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        decimalsNormalized = jsonNodeFactory;
        decimalsAsIs = new JsonNodeFactory(true);
        instance = jsonNodeFactory;
    }

    public JsonNodeFactory(boolean z2) {
        this._cfgBigDecimalExact = z2;
    }

    public ArrayNode arrayNode() {
        return new ArrayNode(this);
    }

    public BinaryNode binaryNode(byte[] bArr) {
        return BinaryNode.valueOf(bArr);
    }

    public BooleanNode booleanNode(boolean z2) {
        return z2 ? BooleanNode.getTrue() : BooleanNode.getFalse();
    }

    public JsonNode missingNode() {
        return MissingNode.getInstance();
    }

    public NullNode nullNode() {
        return NullNode.getInstance();
    }

    public NumericNode numberNode(int i3) {
        return IntNode.valueOf(i3);
    }

    public ObjectNode objectNode() {
        return new ObjectNode(this);
    }

    public ValueNode pojoNode(Object obj) {
        return new POJONode(obj);
    }

    public ValueNode rawValueNode(RawValue rawValue) {
        return new POJONode(rawValue);
    }

    public TextNode textNode(String str) {
        return TextNode.valueOf(str);
    }

    public NumericNode numberNode(long j) {
        return LongNode.valueOf(j);
    }

    public ValueNode numberNode(BigInteger bigInteger) {
        if (bigInteger == null) {
            return nullNode();
        }
        return BigIntegerNode.valueOf(bigInteger);
    }

    public NumericNode numberNode(float f10) {
        return FloatNode.valueOf(f10);
    }

    public NumericNode numberNode(double d8) {
        return DoubleNode.valueOf(d8);
    }

    public ValueNode numberNode(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return nullNode();
        }
        if (this._cfgBigDecimalExact) {
            return DecimalNode.valueOf(bigDecimal);
        }
        if (bigDecimal.signum() == 0) {
            return DecimalNode.ZERO;
        }
        try {
            bigDecimal = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
        } catch (ArithmeticException unused) {
        }
        return DecimalNode.valueOf(bigDecimal);
    }
}
