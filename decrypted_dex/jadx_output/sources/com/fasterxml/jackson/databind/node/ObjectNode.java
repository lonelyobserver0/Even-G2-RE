package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.JsonNodeFeature;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ObjectNode extends ContainerNode<ObjectNode> implements Serializable {
    protected final Map<String, JsonNode> _children;

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new LinkedHashMap();
    }

    public boolean _childrenEqual(ObjectNode objectNode) {
        return this._children.equals(objectNode._children);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this._children.values().iterator();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return _childrenEqual((ObjectNode) obj);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return this._children.entrySet().iterator();
    }

    public JsonNode get(String str) {
        return this._children.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.OBJECT;
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    public JsonNode replace(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        return this._children.put(str, jsonNode);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (serializerProvider != null) {
            boolean isEnabled = serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
            boolean z2 = !isEnabled;
            boolean isEnabled2 = serializerProvider.isEnabled(JsonNodeFeature.WRITE_NULL_PROPERTIES);
            boolean z10 = !isEnabled2;
            if (!isEnabled || !isEnabled2) {
                jsonGenerator.writeStartObject(this);
                serializeFilteredContents(jsonGenerator, serializerProvider, z2, z10);
                jsonGenerator.writeEndObject();
                return;
            }
        }
        jsonGenerator.writeStartObject(this);
        for (Map.Entry<String, JsonNode> entry : this._children.entrySet()) {
            JsonNode value = entry.getValue();
            jsonGenerator.writeFieldName(entry.getKey());
            value.serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndObject();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r2.isNull() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serializeFilteredContents(com.fasterxml.jackson.core.JsonGenerator r5, com.fasterxml.jackson.databind.SerializerProvider r6, boolean r7, boolean r8) throws java.io.IOException {
        /*
            r4 = this;
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> r0 = r4._children
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.fasterxml.jackson.databind.node.BaseJsonNode r2 = (com.fasterxml.jackson.databind.node.BaseJsonNode) r2
            if (r7 == 0) goto L2b
            boolean r3 = r2.isArray()
            if (r3 == 0) goto L2b
            boolean r3 = r2.isEmpty(r6)
            if (r3 == 0) goto L2b
            goto La
        L2b:
            if (r8 == 0) goto L34
            boolean r3 = r2.isNull()
            if (r3 == 0) goto L34
            goto La
        L34:
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r5.writeFieldName(r1)
            r2.serialize(r5, r6)
            goto La
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.ObjectNode.serializeFilteredContents(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, boolean, boolean):void");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        boolean z2;
        boolean z10;
        if (serializerProvider != null) {
            z2 = !serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
            z10 = !serializerProvider.isEnabled(JsonNodeFeature.WRITE_NULL_PROPERTIES);
        } else {
            z2 = false;
            z10 = false;
        }
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_OBJECT));
        if (z2 || z10) {
            serializeFilteredContents(jsonGenerator, serializerProvider, z2, z10);
        } else {
            for (Map.Entry<String, JsonNode> entry : this._children.entrySet()) {
                JsonNode value = entry.getValue();
                jsonGenerator.writeFieldName(entry.getKey());
                value.serialize(jsonGenerator, serializerProvider);
            }
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public <T extends JsonNode> T set(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        this._children.put(str, jsonNode);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int size() {
        return this._children.size();
    }
}
