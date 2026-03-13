package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MissingNode extends ValueNode {
    private static final MissingNode instance = new MissingNode();

    public static MissingNode getInstance() {
        return instance;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode
    public JsonToken asToken() {
        return JsonToken.NOT_AVAILABLE;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.MISSING;
    }

    public int hashCode() {
        return JsonNodeType.MISSING.ordinal();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNull();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.writeNull();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonNode
    public String toString() {
        return "";
    }
}
