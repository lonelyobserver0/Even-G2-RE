package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BaseJsonNode extends JsonNode implements Serializable {
    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public abstract void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException;

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String toString() {
        return InternalNodeMapper.nodeToString(this);
    }
}
