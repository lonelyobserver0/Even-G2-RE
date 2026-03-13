package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JsonNodeDeserializer extends BaseNodeDeserializer<JsonNode> {
    private static final JsonNodeDeserializer instance = new JsonNodeDeserializer();

    public static final class ArrayDeserializer extends BaseNodeDeserializer<ArrayNode> {
        protected static final ArrayDeserializer _instance = new ArrayDeserializer();

        public ArrayDeserializer() {
            super(ArrayNode.class, Boolean.TRUE);
        }

        public static ArrayDeserializer getInstance() {
            return _instance;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer
        public JsonDeserializer<?> _createWithMerge(boolean z2, boolean z10) {
            return new ArrayDeserializer(this, z2, z10);
        }

        public ArrayDeserializer(ArrayDeserializer arrayDeserializer, boolean z2, boolean z10) {
            super(arrayDeserializer, z2, z10);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedStartArrayToken()) {
                JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
                ArrayNode arrayNode = nodeFactory.arrayNode();
                _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.ContainerStack(), arrayNode);
                return arrayNode;
            }
            return (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) throws IOException {
            if (jsonParser.isExpectedStartArrayToken()) {
                _deserializeContainerNoRecursion(jsonParser, deserializationContext, deserializationContext.getNodeFactory(), new BaseNodeDeserializer.ContainerStack(), arrayNode);
                return arrayNode;
            }
            return (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
        }
    }

    public static final class ObjectDeserializer extends BaseNodeDeserializer<ObjectNode> {
        protected static final ObjectDeserializer _instance = new ObjectDeserializer();

        public ObjectDeserializer() {
            super(ObjectNode.class, Boolean.TRUE);
        }

        public static ObjectDeserializer getInstance() {
            return _instance;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer
        public JsonDeserializer<?> _createWithMerge(boolean z2, boolean z10) {
            return new ObjectDeserializer(this, z2, z10);
        }

        public ObjectDeserializer(ObjectDeserializer objectDeserializer, boolean z2, boolean z10) {
            super(objectDeserializer, z2, z10);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
            if (jsonParser.isExpectedStartObjectToken()) {
                ObjectNode objectNode = nodeFactory.objectNode();
                _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.ContainerStack(), objectNode);
                return objectNode;
            }
            if (jsonParser.hasToken(JsonToken.FIELD_NAME)) {
                return _deserializeObjectAtName(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.ContainerStack());
            }
            if (jsonParser.hasToken(JsonToken.END_OBJECT)) {
                return nodeFactory.objectNode();
            }
            return (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) throws IOException {
            if (!jsonParser.isExpectedStartObjectToken() && !jsonParser.hasToken(JsonToken.FIELD_NAME)) {
                return (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
            }
            return (ObjectNode) updateObject(jsonParser, deserializationContext, objectNode, new BaseNodeDeserializer.ContainerStack());
        }
    }

    public JsonNodeDeserializer() {
        super(JsonNode.class, null);
    }

    public static JsonDeserializer<? extends JsonNode> getDeserializer(Class<?> cls) {
        return cls == ObjectNode.class ? ObjectDeserializer.getInstance() : cls == ArrayNode.class ? ArrayDeserializer.getInstance() : instance;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer
    public JsonDeserializer<?> _createWithMerge(boolean z2, boolean z10) {
        return new JsonNodeDeserializer(this, z2, z10);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public /* bridge */ /* synthetic */ JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        return super.createContextual(deserializationContext, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public Object getAbsentValue(DeserializationContext deserializationContext) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ boolean isCachable() {
        return super.isCachable();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ LogicalType logicalType() {
        return super.logicalType();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    public JsonNodeDeserializer(JsonNodeDeserializer jsonNodeDeserializer, boolean z2, boolean z10) {
        super(jsonNodeDeserializer, z2, z10);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public JsonNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        BaseNodeDeserializer.ContainerStack containerStack = new BaseNodeDeserializer.ContainerStack();
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        int currentTokenId = jsonParser.currentTokenId();
        return currentTokenId != 1 ? currentTokenId != 2 ? currentTokenId != 3 ? currentTokenId != 5 ? _deserializeAnyScalar(jsonParser, deserializationContext) : _deserializeObjectAtName(jsonParser, deserializationContext, nodeFactory, containerStack) : _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, containerStack, nodeFactory.arrayNode()) : nodeFactory.objectNode() : _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, containerStack, nodeFactory.objectNode());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public JsonNode getNullValue(DeserializationContext deserializationContext) {
        return deserializationContext.getNodeFactory().nullNode();
    }
}
