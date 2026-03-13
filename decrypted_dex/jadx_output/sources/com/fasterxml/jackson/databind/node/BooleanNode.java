package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BooleanNode extends ValueNode {
    private final boolean _value;
    public static final BooleanNode TRUE = new BooleanNode(true);
    public static final BooleanNode FALSE = new BooleanNode(false);

    public BooleanNode(boolean z2) {
        this._value = z2;
    }

    public static BooleanNode getFalse() {
        return FALSE;
    }

    public static BooleanNode getTrue() {
        return TRUE;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode
    public JsonToken asToken() {
        return this._value ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof BooleanNode) && this._value == ((BooleanNode) obj)._value;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.BOOLEAN;
    }

    public int hashCode() {
        return this._value ? 3 : 1;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeBoolean(this._value);
    }
}
