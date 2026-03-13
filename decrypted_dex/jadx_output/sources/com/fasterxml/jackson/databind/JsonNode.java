package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class JsonNode extends JsonSerializable.Base implements Iterable<JsonNode> {
    public Iterator<JsonNode> elements() {
        return ClassUtil.emptyIterator();
    }

    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return ClassUtil.emptyIterator();
    }

    public abstract JsonNodeType getNodeType();

    public boolean isArray() {
        return false;
    }

    public final boolean isNull() {
        return getNodeType() == JsonNodeType.NULL;
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonNode> iterator() {
        return elements();
    }

    public int size() {
        return 0;
    }

    public abstract String toString();
}
