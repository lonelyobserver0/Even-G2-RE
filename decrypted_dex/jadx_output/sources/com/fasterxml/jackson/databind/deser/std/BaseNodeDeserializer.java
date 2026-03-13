package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.cfg.JsonNodeFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.RawValue;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
abstract class BaseNodeDeserializer<T extends JsonNode> extends StdDeserializer<T> implements ContextualDeserializer {
    protected final boolean _mergeArrays;
    protected final boolean _mergeObjects;
    protected final Boolean _supportsUpdates;

    public static final class ContainerStack {
        private int _end;
        private ContainerNode[] _stack;
        private int _top;

        public ContainerNode popOrNull() {
            int i3 = this._top;
            if (i3 == 0) {
                return null;
            }
            ContainerNode[] containerNodeArr = this._stack;
            int i10 = i3 - 1;
            this._top = i10;
            return containerNodeArr[i10];
        }

        public void push(ContainerNode containerNode) {
            int i3 = this._top;
            int i10 = this._end;
            if (i3 < i10) {
                ContainerNode[] containerNodeArr = this._stack;
                this._top = i3 + 1;
                containerNodeArr[i3] = containerNode;
                return;
            }
            if (this._stack == null) {
                this._end = 10;
                this._stack = new ContainerNode[10];
            } else {
                int min = Math.min(4000, Math.max(20, i10 >> 1)) + i10;
                this._end = min;
                this._stack = (ContainerNode[]) Arrays.copyOf(this._stack, min);
            }
            ContainerNode[] containerNodeArr2 = this._stack;
            int i11 = this._top;
            this._top = i11 + 1;
            containerNodeArr2[i11] = containerNode;
        }
    }

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
        this._mergeArrays = true;
        this._mergeObjects = true;
    }

    private static boolean _shouldMerge(Boolean bool, Boolean bool2) {
        if (bool != null) {
            return bool.booleanValue();
        }
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return true;
    }

    public abstract JsonDeserializer<?> _createWithMerge(boolean z2, boolean z10);

    public final JsonNode _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        int currentTokenId = jsonParser.currentTokenId();
        if (currentTokenId == 2) {
            return nodeFactory.objectNode();
        }
        switch (currentTokenId) {
            case 6:
                return nodeFactory.textNode(jsonParser.getText());
            case 7:
                return _fromInt(jsonParser, deserializationContext, nodeFactory);
            case 8:
                return _fromFloat(jsonParser, deserializationContext, nodeFactory);
            case 9:
                return nodeFactory.booleanNode(true);
            case 10:
                return nodeFactory.booleanNode(false);
            case 11:
                return nodeFactory.nullNode();
            case 12:
                return _fromEmbedded(jsonParser, deserializationContext);
            default:
                return (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.node.ContainerNode<?> _deserializeContainerNoRecursion(com.fasterxml.jackson.core.JsonParser r14, com.fasterxml.jackson.databind.DeserializationContext r15, com.fasterxml.jackson.databind.node.JsonNodeFactory r16, com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.ContainerStack r17, com.fasterxml.jackson.databind.node.ContainerNode<?> r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer._deserializeContainerNoRecursion(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.node.JsonNodeFactory, com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer$ContainerStack, com.fasterxml.jackson.databind.node.ContainerNode):com.fasterxml.jackson.databind.node.ContainerNode");
    }

    public final ObjectNode _deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, ContainerStack containerStack) throws IOException {
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        String currentName = jsonParser.currentName();
        while (currentName != null) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            int id = nextToken.id();
            JsonNode _deserializeAnyScalar = id != 1 ? id != 3 ? _deserializeAnyScalar(jsonParser, deserializationContext) : _deserializeContainerNoRecursion(jsonParser, deserializationContext, jsonNodeFactory, containerStack, jsonNodeFactory.arrayNode()) : _deserializeContainerNoRecursion(jsonParser, deserializationContext, jsonNodeFactory, containerStack, jsonNodeFactory.objectNode());
            JsonNode replace = objectNode.replace(currentName, _deserializeAnyScalar);
            if (replace != null) {
                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, currentName, objectNode, replace, _deserializeAnyScalar);
            }
            currentName = jsonParser.nextFieldName();
        }
        return objectNode;
    }

    public final JsonNode _deserializeRareScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int currentTokenId = jsonParser.currentTokenId();
        return currentTokenId != 2 ? currentTokenId != 8 ? currentTokenId != 12 ? (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser) : _fromEmbedded(jsonParser, deserializationContext) : _fromFloat(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : deserializationContext.getNodeFactory().objectNode();
    }

    public final JsonNode _fromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        Object embeddedObject = jsonParser.getEmbeddedObject();
        return embeddedObject == null ? nodeFactory.nullNode() : embeddedObject.getClass() == byte[].class ? nodeFactory.binaryNode((byte[]) embeddedObject) : embeddedObject instanceof RawValue ? nodeFactory.rawValueNode((RawValue) embeddedObject) : embeddedObject instanceof JsonNode ? (JsonNode) embeddedObject : nodeFactory.pojoNode(embeddedObject);
    }

    public final JsonNode _fromFloat(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        return numberType == JsonParser.NumberType.BIG_DECIMAL ? jsonNodeFactory.numberNode(jsonParser.getDecimalValue()) : deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.isNaN() ? jsonNodeFactory.numberNode(jsonParser.getDoubleValue()) : jsonNodeFactory.numberNode(jsonParser.getDecimalValue()) : numberType == JsonParser.NumberType.FLOAT ? jsonNodeFactory.numberNode(jsonParser.getFloatValue()) : jsonNodeFactory.numberNode(jsonParser.getDoubleValue());
    }

    public final JsonNode _fromInt(JsonParser jsonParser, int i3, JsonNodeFactory jsonNodeFactory) throws IOException {
        if (i3 != 0) {
            return DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i3) ? jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue()) : jsonNodeFactory.numberNode(jsonParser.getLongValue());
        }
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        return numberType == JsonParser.NumberType.INT ? jsonNodeFactory.numberNode(jsonParser.getIntValue()) : numberType == JsonParser.NumberType.LONG ? jsonNodeFactory.numberNode(jsonParser.getLongValue()) : jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue());
    }

    public void _handleDuplicateField(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, JsonNode jsonNode, JsonNode jsonNode2) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch(JsonNode.class, StubApp.getString2(10706), str);
        }
        if (deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            if (jsonNode.isArray()) {
                ((ArrayNode) jsonNode).add(jsonNode2);
                objectNode.replace(str, jsonNode);
            } else {
                ArrayNode arrayNode = jsonNodeFactory.arrayNode();
                arrayNode.add(jsonNode);
                arrayNode.add(jsonNode2);
                objectNode.replace(str, arrayNode);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Boolean defaultMergeable = config.getDefaultMergeable(ArrayNode.class);
        Boolean defaultMergeable2 = config.getDefaultMergeable(ObjectNode.class);
        Boolean defaultMergeable3 = config.getDefaultMergeable(JsonNode.class);
        boolean _shouldMerge = _shouldMerge(defaultMergeable, defaultMergeable3);
        boolean _shouldMerge2 = _shouldMerge(defaultMergeable2, defaultMergeable3);
        return (_shouldMerge == this._mergeArrays && _shouldMerge2 == this._mergeObjects) ? this : _createWithMerge(_shouldMerge, _shouldMerge2);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonNode updateObject(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode, ContainerStack containerStack) throws IOException {
        String currentName;
        JsonParser jsonParser2;
        DeserializationContext deserializationContext2;
        ContainerStack containerStack2;
        JsonNode _deserializeContainerNoRecursion;
        if (jsonParser.isExpectedStartObjectToken()) {
            currentName = jsonParser.nextFieldName();
        } else {
            if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
                return (JsonNode) deserialize(jsonParser, deserializationContext);
            }
            currentName = jsonParser.currentName();
        }
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        while (currentName != null) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonNode jsonNode = objectNode.get(currentName);
            if (jsonNode != null) {
                if (jsonNode instanceof ObjectNode) {
                    if (nextToken == JsonToken.START_OBJECT && this._mergeObjects) {
                        JsonNode updateObject = updateObject(jsonParser, deserializationContext, (ObjectNode) jsonNode, containerStack);
                        if (updateObject != jsonNode) {
                            objectNode.set(currentName, updateObject);
                        }
                        jsonParser2 = jsonParser;
                        deserializationContext2 = deserializationContext;
                        containerStack2 = containerStack;
                    }
                } else if ((jsonNode instanceof ArrayNode) && nextToken == JsonToken.START_ARRAY && this._mergeArrays) {
                    ArrayNode arrayNode = (ArrayNode) jsonNode;
                    jsonParser2 = jsonParser;
                    deserializationContext2 = deserializationContext;
                    containerStack2 = containerStack;
                    _deserializeContainerNoRecursion(jsonParser2, deserializationContext2, nodeFactory, containerStack2, arrayNode);
                }
                currentName = jsonParser2.nextFieldName();
                jsonParser = jsonParser2;
                deserializationContext = deserializationContext2;
                containerStack = containerStack2;
            }
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
            containerStack2 = containerStack;
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            int id = nextToken.id();
            if (id == 1) {
                _deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser2, deserializationContext2, nodeFactory, containerStack2, nodeFactory.objectNode());
            } else if (id == 3) {
                _deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser2, deserializationContext2, nodeFactory, containerStack2, nodeFactory.arrayNode());
            } else if (id == 6) {
                _deserializeContainerNoRecursion = nodeFactory.textNode(jsonParser2.getText());
            } else if (id != 7) {
                switch (id) {
                    case 9:
                        _deserializeContainerNoRecursion = nodeFactory.booleanNode(true);
                        break;
                    case 10:
                        _deserializeContainerNoRecursion = nodeFactory.booleanNode(false);
                        break;
                    case 11:
                        if (!deserializationContext2.isEnabled(JsonNodeFeature.READ_NULL_PROPERTIES)) {
                            break;
                        } else {
                            _deserializeContainerNoRecursion = nodeFactory.nullNode();
                            break;
                        }
                    default:
                        _deserializeContainerNoRecursion = _deserializeRareScalar(jsonParser2, deserializationContext2);
                        break;
                }
                currentName = jsonParser2.nextFieldName();
                jsonParser = jsonParser2;
                deserializationContext = deserializationContext2;
                containerStack = containerStack2;
            } else {
                _deserializeContainerNoRecursion = _fromInt(jsonParser2, deserializationContext2, nodeFactory);
            }
            objectNode.set(currentName, _deserializeContainerNoRecursion);
            currentName = jsonParser2.nextFieldName();
            jsonParser = jsonParser2;
            deserializationContext = deserializationContext2;
            containerStack = containerStack2;
        }
        return objectNode;
    }

    public BaseNodeDeserializer(BaseNodeDeserializer<?> baseNodeDeserializer, boolean z2, boolean z10) {
        super(baseNodeDeserializer);
        this._supportsUpdates = baseNodeDeserializer._supportsUpdates;
        this._mergeArrays = z2;
        this._mergeObjects = z10;
    }

    public final JsonNode _fromInt(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberType;
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        if ((StdDeserializer.F_MASK_INT_COERCIONS & deserializationFeatures) != 0) {
            if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures)) {
                numberType = JsonParser.NumberType.BIG_INTEGER;
            } else if (DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures)) {
                numberType = JsonParser.NumberType.LONG;
            } else {
                numberType = jsonParser.getNumberType();
            }
        } else {
            numberType = jsonParser.getNumberType();
        }
        if (numberType == JsonParser.NumberType.INT) {
            return jsonNodeFactory.numberNode(jsonParser.getIntValue());
        }
        if (numberType == JsonParser.NumberType.LONG) {
            return jsonNodeFactory.numberNode(jsonParser.getLongValue());
        }
        return jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue());
    }
}
