package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class UntypedObjectDeserializerNR extends StdDeserializer<Object> {
    protected static final Object[] NO_OBJECTS = new Object[0];
    public static final UntypedObjectDeserializerNR std = new UntypedObjectDeserializerNR();
    protected final boolean _nonMerging;

    public UntypedObjectDeserializerNR() {
        this(false);
    }

    private Object _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext, int i3) throws IOException {
        switch (i3) {
            case 6:
                return jsonParser.getText();
            case 7:
                return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.getBigIntegerValue() : jsonParser.getNumberValue();
            case 8:
                return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.getDecimalValue() : jsonParser.getNumberValue();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
    }

    private Object _deserializeNR(JsonParser jsonParser, DeserializationContext deserializationContext, Scope scope) throws IOException {
        Object text;
        Object text2;
        boolean hasSomeOfFeatures = deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS);
        boolean isEnabled = deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        Scope scope2 = scope;
        while (true) {
            if (scope2.isObject()) {
                String nextFieldName = jsonParser.nextFieldName();
                while (true) {
                    if (nextFieldName != null) {
                        JsonToken nextToken = jsonParser.nextToken();
                        if (nextToken == null) {
                            nextToken = JsonToken.NOT_AVAILABLE;
                        }
                        int id = nextToken.id();
                        if (id == 1) {
                            scope2 = scope2.childObject(nextFieldName);
                        } else if (id != 3) {
                            switch (id) {
                                case 6:
                                    text = jsonParser.getText();
                                    break;
                                case 7:
                                    if (!hasSomeOfFeatures) {
                                        text = jsonParser.getNumberValue();
                                        break;
                                    } else {
                                        text = _coerceIntegral(jsonParser, deserializationContext);
                                        break;
                                    }
                                case 8:
                                    if (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                                        text = jsonParser.getNumberValue();
                                        break;
                                    } else {
                                        text = jsonParser.getDecimalValue();
                                        break;
                                    }
                                case 9:
                                    text = Boolean.TRUE;
                                    break;
                                case 10:
                                    text = Boolean.FALSE;
                                    break;
                                case 11:
                                    text = null;
                                    break;
                                case 12:
                                    text = jsonParser.getEmbeddedObject();
                                    break;
                                default:
                                    return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                            }
                            scope2.putValue(nextFieldName, text);
                        } else {
                            scope2 = scope2.childArray(nextFieldName);
                        }
                        nextFieldName = jsonParser.nextFieldName();
                    } else {
                        if (scope2 == scope) {
                            return scope2.finishRootObject();
                        }
                        scope2 = scope2.finishBranchObject();
                    }
                }
            } else {
                while (true) {
                    JsonToken nextToken2 = jsonParser.nextToken();
                    if (nextToken2 == null) {
                        nextToken2 = JsonToken.NOT_AVAILABLE;
                    }
                    switch (nextToken2.id()) {
                        case 1:
                            scope2 = scope2.childObject();
                            continue;
                        case 2:
                        case 5:
                        default:
                            return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                        case 3:
                            scope2 = scope2.childArray();
                            continue;
                        case 4:
                            if (scope2 == scope) {
                                return scope2.finishRootArray(isEnabled);
                            }
                            scope2 = scope2.finishBranchArray(isEnabled);
                            continue;
                        case 6:
                            text2 = jsonParser.getText();
                            break;
                        case 7:
                            if (!hasSomeOfFeatures) {
                                text2 = jsonParser.getNumberValue();
                                break;
                            } else {
                                text2 = _coerceIntegral(jsonParser, deserializationContext);
                                break;
                            }
                        case 8:
                            if (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                                text2 = jsonParser.getNumberValue();
                                break;
                            } else {
                                text2 = jsonParser.getDecimalValue();
                                break;
                            }
                        case 9:
                            text2 = Boolean.TRUE;
                            break;
                        case 10:
                            text2 = Boolean.FALSE;
                            break;
                        case 11:
                            text2 = null;
                            break;
                        case 12:
                            text2 = jsonParser.getEmbeddedObject();
                            break;
                    }
                    scope2.addValue(text2);
                }
            }
        }
    }

    private Object _deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object _deserializeNR;
        Scope rootObjectScope = Scope.rootObjectScope(deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES));
        String currentName = jsonParser.currentName();
        while (currentName != null) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            int id = nextToken.id();
            if (id == 1) {
                _deserializeNR = _deserializeNR(jsonParser, deserializationContext, rootObjectScope.childObject());
            } else {
                if (id == 2) {
                    return rootObjectScope.finishRootObject();
                }
                _deserializeNR = id != 3 ? _deserializeAnyScalar(jsonParser, deserializationContext, nextToken.id()) : _deserializeNR(jsonParser, deserializationContext, rootObjectScope.childArray());
            }
            rootObjectScope.putValue(currentName, _deserializeNR);
            currentName = jsonParser.nextFieldName();
        }
        return rootObjectScope.finishRootObject();
    }

    public static UntypedObjectDeserializerNR instance(boolean z2) {
        return z2 ? new UntypedObjectDeserializerNR(true) : std;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.currentTokenId()) {
            case 1:
                return _deserializeNR(jsonParser, deserializationContext, Scope.rootObjectScope(deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)));
            case 2:
                return Scope.emptyMap();
            case 3:
                return _deserializeNR(jsonParser, deserializationContext, Scope.rootArrayScope());
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            case 5:
                return _deserializeObjectAtName(jsonParser, deserializationContext);
            case 6:
                return jsonParser.getText();
            case 7:
                return deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.getNumberValue();
            case 8:
                return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.getDecimalValue() : jsonParser.getNumberValue();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        int currentTokenId = jsonParser.currentTokenId();
        return (currentTokenId == 1 || currentTokenId == 3 || currentTokenId == 5) ? typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext) : _deserializeAnyScalar(jsonParser, deserializationContext, jsonParser.currentTokenId());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        if (this._nonMerging) {
            return Boolean.FALSE;
        }
        return null;
    }

    public UntypedObjectDeserializerNR(boolean z2) {
        super((Class<?>) Object.class);
        this._nonMerging = z2;
    }

    public static final class Scope {
        private Scope _child;
        private String _deferredKey;
        private boolean _isObject;
        private List<Object> _list;
        private Map<String, Object> _map;
        private final Scope _parent;
        private boolean _squashDups;

        private Scope(Scope scope) {
            this._parent = scope;
            this._isObject = false;
            this._squashDups = false;
        }

        private void _putValueHandleDups(String str, Object obj) {
            Map<String, Object> map = this._map;
            if (map == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this._map = linkedHashMap;
                linkedHashMap.put(str, obj);
                return;
            }
            Object put = map.put(str, obj);
            if (put != null) {
                if (put instanceof List) {
                    ((List) put).add(obj);
                    this._map.put(str, put);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(put);
                    arrayList.add(obj);
                    this._map.put(str, arrayList);
                }
            }
        }

        public static List<Object> emptyList() {
            return new ArrayList(2);
        }

        public static Map<String, Object> emptyMap() {
            return new LinkedHashMap(2);
        }

        private Scope resetAsArray() {
            this._isObject = false;
            return this;
        }

        private Scope resetAsObject(boolean z2) {
            this._isObject = true;
            this._squashDups = z2;
            return this;
        }

        public static Scope rootArrayScope() {
            return new Scope(null);
        }

        public static Scope rootObjectScope(boolean z2) {
            return new Scope(null, true, z2);
        }

        public void addValue(Object obj) {
            if (this._list == null) {
                this._list = new ArrayList();
            }
            this._list.add(obj);
        }

        public Scope childArray() {
            Scope scope = this._child;
            return scope == null ? new Scope(this) : scope.resetAsArray();
        }

        public Scope childObject() {
            Scope scope = this._child;
            return scope == null ? new Scope(this, true, this._squashDups) : scope.resetAsObject(this._squashDups);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Scope finishBranchArray(boolean z2) {
            Object obj;
            List<Object> list = this._list;
            List<Object> list2 = list;
            if (list == null) {
                obj = z2 ? UntypedObjectDeserializerNR.NO_OBJECTS : emptyList();
            } else {
                if (z2) {
                    list2 = list.toArray(UntypedObjectDeserializerNR.NO_OBJECTS);
                }
                this._list = null;
                obj = list2;
            }
            if (this._parent.isObject()) {
                return this._parent.putDeferredValue(obj);
            }
            this._parent.addValue(obj);
            return this._parent;
        }

        public Scope finishBranchObject() {
            Object obj = this._map;
            if (obj == null) {
                obj = new LinkedHashMap();
            } else {
                this._map = null;
            }
            if (this._parent.isObject()) {
                return this._parent.putDeferredValue(obj);
            }
            this._parent.addValue(obj);
            return this._parent;
        }

        public Object finishRootArray(boolean z2) {
            List<Object> list = this._list;
            return list == null ? z2 ? UntypedObjectDeserializerNR.NO_OBJECTS : emptyList() : z2 ? list.toArray(UntypedObjectDeserializerNR.NO_OBJECTS) : list;
        }

        public Object finishRootObject() {
            Map<String, Object> map = this._map;
            return map == null ? emptyMap() : map;
        }

        public boolean isObject() {
            return this._isObject;
        }

        public Scope putDeferredValue(Object obj) {
            String str = this._deferredKey;
            Objects.requireNonNull(str);
            this._deferredKey = null;
            if (this._squashDups) {
                _putValueHandleDups(str, obj);
                return this;
            }
            if (this._map == null) {
                this._map = new LinkedHashMap();
            }
            this._map.put(str, obj);
            return this;
        }

        public void putValue(String str, Object obj) {
            if (this._squashDups) {
                _putValueHandleDups(str, obj);
                return;
            }
            if (this._map == null) {
                this._map = new LinkedHashMap();
            }
            this._map.put(str, obj);
        }

        public Scope childArray(String str) {
            this._deferredKey = str;
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this);
            }
            return scope.resetAsArray();
        }

        public Scope childObject(String str) {
            this._deferredKey = str;
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this, true, this._squashDups);
            }
            return scope.resetAsObject(this._squashDups);
        }

        private Scope(Scope scope, boolean z2, boolean z10) {
            this._parent = scope;
            this._isObject = z2;
            this._squashDups = z10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001a, code lost:
    
        if (r0 != 5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if ((r7 instanceof java.util.Map) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r0 = (java.util.Map) r7;
        r1 = r5.currentName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        r5.nextToken();
        r2 = r0.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r3 = deserialize(r5, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r3 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        r0.put(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r1 = r5.nextFieldName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        r3 = deserialize(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0043, code lost:
    
        if (r5.nextToken() == com.fasterxml.jackson.core.JsonToken.END_OBJECT) goto L28;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deserialize(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.DeserializationContext r6, java.lang.Object r7) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r4._nonMerging
            if (r0 == 0) goto L9
            java.lang.Object r5 = r4.deserialize(r5, r6)
            return r5
        L9:
            int r0 = r5.currentTokenId()
            r1 = 1
            if (r0 == r1) goto L3d
            r1 = 2
            if (r0 == r1) goto L45
            r1 = 3
            if (r0 == r1) goto L1d
            r1 = 4
            if (r0 == r1) goto L45
            r1 = 5
            if (r0 == r1) goto L46
            goto L6f
        L1d:
            com.fasterxml.jackson.core.JsonToken r0 = r5.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r0 != r1) goto L26
            goto L45
        L26:
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L6f
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
        L2d:
            java.lang.Object r1 = r4.deserialize(r5, r6)
            r0.add(r1)
            com.fasterxml.jackson.core.JsonToken r1 = r5.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r1 != r2) goto L2d
            return r7
        L3d:
            com.fasterxml.jackson.core.JsonToken r0 = r5.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 != r1) goto L46
        L45:
            return r7
        L46:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L6f
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = r5.currentName()
        L51:
            r5.nextToken()
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L5f
            java.lang.Object r3 = r4.deserialize(r5, r6, r2)
            goto L63
        L5f:
            java.lang.Object r3 = r4.deserialize(r5, r6)
        L63:
            if (r3 == r2) goto L68
            r0.put(r1, r3)
        L68:
            java.lang.String r1 = r5.nextFieldName()
            if (r1 != 0) goto L51
            return r7
        L6f:
            java.lang.Object r5 = r4.deserialize(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }
}
