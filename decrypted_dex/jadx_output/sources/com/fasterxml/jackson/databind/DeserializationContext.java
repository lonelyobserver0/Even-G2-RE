package com.fasterxml.jackson.databind;

import E1.a;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.DatatypeFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import i2.u;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class DeserializationContext extends DatabindContext implements Serializable {
    protected transient ArrayBuilders _arrayBuilders;
    protected transient ContextAttributes _attributes;
    protected final DeserializerCache _cache;
    protected final DeserializationConfig _config;
    protected LinkedNode<JavaType> _currentType;
    protected transient DateFormat _dateFormat;
    protected final DeserializerFactory _factory;
    protected final int _featureFlags;
    protected transient ObjectBuffer _objectBuffer;
    protected transient JsonParser _parser;
    protected final JacksonFeatureSet<StreamReadCapability> _readCapabilities;
    protected final Class<?> _view;

    /* renamed from: com.fasterxml.jackson.databind.DeserializationContext$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.NOT_AVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public DeserializationContext(DeserializerFactory deserializerFactory, DeserializerCache deserializerCache) {
        if (deserializerFactory == null) {
            throw new NullPointerException("Cannot pass null DeserializerFactory");
        }
        this._factory = deserializerFactory;
        this._cache = deserializerCache == null ? new DeserializerCache() : deserializerCache;
        this._featureFlags = 0;
        this._readCapabilities = null;
        this._config = null;
        this._view = null;
        this._attributes = null;
    }

    public DateFormat _getDateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    public String _shapeForToken(JsonToken jsonToken) {
        if (jsonToken == null) {
            return "<end of input>";
        }
        switch (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonToken.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "Object value";
            case 4:
            case 5:
                return "Array value";
            case 6:
            case 7:
                return "Boolean value";
            case 8:
                return "Embedded Object";
            case 9:
                return "Floating-point value";
            case 10:
                return "Integer value";
            case 11:
                return "String value";
            case 12:
                return "Null value";
            default:
                return "[Unavailable value]";
        }
    }

    public TokenBuffer bufferAsCopyOfValue(JsonParser jsonParser) throws IOException {
        TokenBuffer bufferForInputBuffering = bufferForInputBuffering(jsonParser);
        bufferForInputBuffering.copyCurrentStructure(jsonParser);
        return bufferForInputBuffering;
    }

    public TokenBuffer bufferForInputBuffering(JsonParser jsonParser) {
        return new TokenBuffer(jsonParser, this);
    }

    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public Calendar constructCalendar(Date date) {
        Calendar calendar = Calendar.getInstance(getTimeZone());
        calendar.setTime(date);
        return calendar;
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return javaType.hasRawClass(cls) ? javaType : getConfig().getTypeFactory().constructSpecializedType(javaType, cls, false);
    }

    public final JavaType constructType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this._config.constructType(cls);
    }

    public abstract JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object obj) throws JsonMappingException;

    public String extractScalarFromObject(JsonParser jsonParser, JsonDeserializer<?> jsonDeserializer, Class<?> cls) throws IOException {
        return (String) handleUnexpectedToken(cls, jsonParser);
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        return getTypeFactory().findClass(str);
    }

    public CoercionAction findCoercionAction(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        return this._config.findCoercionAction(logicalType, cls, coercionInputShape);
    }

    public CoercionAction findCoercionFromBlankString(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        return this._config.findCoercionFromBlankString(logicalType, cls, coercionAction);
    }

    public final JsonDeserializer<Object> findContextualValueDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer<Object> findValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        return findValueDeserializer != null ? handleSecondaryContextualization(findValueDeserializer, beanProperty, javaType) : findValueDeserializer;
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanProperty, Object obj2) throws JsonMappingException {
        return reportBadDefinition(ClassUtil.classOf(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj));
    }

    public final KeyDeserializer findKeyDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        try {
            return this._cache.findKeyDeserializer(this, this._factory, javaType);
        } catch (IllegalArgumentException e10) {
            reportBadDefinition(javaType, ClassUtil.exceptionMessage(e10));
            return null;
        }
    }

    public final JsonDeserializer<Object> findNonContextualValueDeserializer(JavaType javaType) throws JsonMappingException {
        return this._cache.findValueDeserializer(this, this._factory, javaType);
    }

    public abstract ReadableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, ObjectIdResolver objectIdResolver);

    public final JsonDeserializer<Object> findRootValueDeserializer(JavaType javaType) throws JsonMappingException {
        JsonDeserializer<Object> findValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        if (findValueDeserializer == null) {
            return null;
        }
        JsonDeserializer<?> handleSecondaryContextualization = handleSecondaryContextualization(findValueDeserializer, null, javaType);
        TypeDeserializer findTypeDeserializer = this._factory.findTypeDeserializer(this._config, javaType);
        return findTypeDeserializer != null ? new TypeWrappedDeserializer(findTypeDeserializer.forProperty(null), handleSecondaryContextualization) : handleSecondaryContextualization;
    }

    public final Class<?> getActiveView() {
        return this._view;
    }

    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public final ArrayBuilders getArrayBuilders() {
        if (this._arrayBuilders == null) {
            this._arrayBuilders = new ArrayBuilders();
        }
        return this._arrayBuilders;
    }

    public final Base64Variant getBase64Variant() {
        return this._config.getBase64Variant();
    }

    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final int getDeserializationFeatures() {
        return this._featureFlags;
    }

    public Locale getLocale() {
        return this._config.getLocale();
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._config.getNodeFactory();
    }

    public final JsonParser getParser() {
        return this._parser;
    }

    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public void handleBadMerge(JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        if (isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return;
        }
        JavaType constructType = constructType(jsonDeserializer.handledType());
        throw InvalidDefinitionException.from(getParser(), a.k("Invalid configuration: values of type ", ClassUtil.getTypeDescription(constructType), " cannot be merged"), constructType);
    }

    public Object handleInstantiationProblem(Class<?> cls, Object obj, Throwable th) throws IOException {
        LinkedNode<Object> problemHandlers = this._config.getProblemHandlers();
        if (problemHandlers != null) {
            problemHandlers.value().getClass();
            throw new ClassCastException();
        }
        ClassUtil.throwIfIOE(th);
        if (!isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            ClassUtil.throwIfRTE(th);
        }
        throw instantiationException(cls, th);
    }

    public Object handleMissingInstantiator(Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        if (jsonParser == null) {
            getParser();
        }
        String _format = _format(str, objArr);
        LinkedNode<Object> problemHandlers = this._config.getProblemHandlers();
        if (problemHandlers == null) {
            return valueInstantiator == null ? reportBadDefinition(cls, AbstractC1482f.i("Cannot construct instance of ", ClassUtil.nameOf(cls), ": ", _format)) : !valueInstantiator.canInstantiate() ? reportBadDefinition(cls, AbstractC1482f.i("Cannot construct instance of ", ClassUtil.nameOf(cls), " (no Creators, like default constructor, exist): ", _format)) : reportInputMismatch(cls, AbstractC1482f.i("Cannot construct instance of ", ClassUtil.nameOf(cls), " (although at least one Creator exists): ", _format), new Object[0]);
        }
        problemHandlers.value().getClass();
        throw new ClassCastException();
    }

    public JavaType handleMissingTypeId(JavaType javaType, TypeIdResolver typeIdResolver, String str) throws IOException {
        LinkedNode<Object> problemHandlers = this._config.getProblemHandlers();
        if (problemHandlers == null) {
            throw missingTypeIdException(javaType, str);
        }
        problemHandlers.value().getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonDeserializer<?> handlePrimaryContextualization(JsonDeserializer<?> jsonDeserializer, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        if (!(jsonDeserializer instanceof ContextualDeserializer)) {
            return jsonDeserializer;
        }
        this._currentType = new LinkedNode<>(javaType, this._currentType);
        try {
            return ((ContextualDeserializer) jsonDeserializer).createContextual(this, beanProperty);
        } finally {
            this._currentType = this._currentType.next();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonDeserializer<?> handleSecondaryContextualization(JsonDeserializer<?> jsonDeserializer, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        if (!(jsonDeserializer instanceof ContextualDeserializer)) {
            return jsonDeserializer;
        }
        this._currentType = new LinkedNode<>(javaType, this._currentType);
        try {
            return ((ContextualDeserializer) jsonDeserializer).createContextual(this, beanProperty);
        } finally {
            this._currentType = this._currentType.next();
        }
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonParser.currentToken(), jsonParser, (String) null, new Object[0]);
    }

    public boolean handleUnknownProperty(JsonParser jsonParser, JsonDeserializer<?> jsonDeserializer, Object obj, String str) throws IOException {
        LinkedNode<Object> problemHandlers = this._config.getProblemHandlers();
        if (problemHandlers != null) {
            problemHandlers.value().getClass();
            throw new ClassCastException();
        }
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw UnrecognizedPropertyException.from(this._parser, obj, str, jsonDeserializer == null ? null : jsonDeserializer.getKnownPropertyNames());
        }
        jsonParser.skipChildren();
        return true;
    }

    public JavaType handleUnknownTypeId(JavaType javaType, String str, TypeIdResolver typeIdResolver, String str2) throws IOException {
        LinkedNode<Object> problemHandlers = this._config.getProblemHandlers();
        if (problemHandlers != null) {
            problemHandlers.value().getClass();
            throw new ClassCastException();
        }
        if (isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            throw invalidTypeIdException(javaType, str, str2);
        }
        return null;
    }

    public Object handleWeirdKey(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String _format = _format(str2, objArr);
        LinkedNode<Object> problemHandlers = this._config.getProblemHandlers();
        if (problemHandlers == null) {
            throw weirdKeyException(cls, str, _format);
        }
        problemHandlers.value().getClass();
        throw new ClassCastException();
    }

    public Object handleWeirdNativeValue(JavaType javaType, Object obj, JsonParser jsonParser) throws IOException {
        LinkedNode<Object> problemHandlers = this._config.getProblemHandlers();
        Class<?> rawClass = javaType.getRawClass();
        if (problemHandlers == null) {
            throw weirdNativeValueException(obj, rawClass);
        }
        problemHandlers.value().getClass();
        throw new ClassCastException();
    }

    public Object handleWeirdNumberValue(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        String _format = _format(str, objArr);
        LinkedNode<Object> problemHandlers = this._config.getProblemHandlers();
        if (problemHandlers == null) {
            throw weirdNumberException(number, cls, _format);
        }
        problemHandlers.value().getClass();
        throw new ClassCastException();
    }

    public Object handleWeirdStringValue(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String _format = _format(str2, objArr);
        LinkedNode<Object> problemHandlers = this._config.getProblemHandlers();
        if (problemHandlers == null) {
            throw weirdStringException(str, cls, _format);
        }
        problemHandlers.value().getClass();
        throw new ClassCastException();
    }

    public final boolean hasSomeOfFeatures(int i3) {
        return (i3 & this._featureFlags) != 0;
    }

    public JsonMappingException instantiationException(Class<?> cls, Throwable th) {
        String exceptionMessage;
        if (th == null) {
            exceptionMessage = "N/A";
        } else {
            exceptionMessage = ClassUtil.exceptionMessage(th);
            if (exceptionMessage == null) {
                exceptionMessage = ClassUtil.nameOf(th.getClass());
            }
        }
        return ValueInstantiationException.from(this._parser, AbstractC1482f.i("Cannot construct instance of ", ClassUtil.nameOf(cls), ", problem: ", exceptionMessage), constructType(cls), th);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(AbstractC1482f.i("Could not resolve type id '", str, "' as a subtype of ", ClassUtil.getTypeDescription(javaType)), str2), javaType, str);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public abstract KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj) throws JsonMappingException;

    public final ObjectBuffer leaseObjectBuffer() {
        ObjectBuffer objectBuffer = this._objectBuffer;
        if (objectBuffer == null) {
            return new ObjectBuffer();
        }
        this._objectBuffer = null;
        return objectBuffer;
    }

    public JsonMappingException missingTypeIdException(JavaType javaType, String str) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Could not resolve subtype of %s", javaType), str), javaType, null);
    }

    public Date parseDate(String str) throws IllegalArgumentException {
        try {
            return _getDateFormat().parse(str);
        } catch (ParseException e10) {
            throw new IllegalArgumentException(AbstractC1482f.i("Failed to parse Date value '", str, "': ", ClassUtil.exceptionMessage(e10)));
        }
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        return (T) readValue(jsonParser, getTypeFactory().constructType(cls));
    }

    public <T> T reportBadCoercion(JsonDeserializer<?> jsonDeserializer, Class<?> cls, Object obj, String str, Object... objArr) throws JsonMappingException {
        throw InvalidFormatException.from(getParser(), _format(str, objArr), obj, cls);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, str, javaType);
    }

    public <T> T reportBadPropertyDefinition(BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, String str, Object... objArr) throws JsonMappingException {
        String _format = _format(str, objArr);
        StringBuilder t3 = u.t("Invalid definition for property ", ClassUtil.nameOf(beanPropertyDefinition), " (of type ", ClassUtil.nameOf(beanDescription.getBeanClass()), "): ");
        t3.append(_format);
        throw InvalidDefinitionException.from(this._parser, t3.toString(), beanDescription, beanPropertyDefinition);
    }

    public <T> T reportBadTypeDefinition(BeanDescription beanDescription, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, AbstractC1482f.i("Invalid type definition for type ", ClassUtil.nameOf(beanDescription.getBeanClass()), ": ", _format(str, objArr)), beanDescription, (BeanPropertyDefinition) null);
    }

    public <T> T reportInputMismatch(JsonDeserializer<?> jsonDeserializer, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), jsonDeserializer.handledType(), _format(str, objArr));
    }

    public <T> T reportPropertyInputMismatch(Class<?> cls, String str, String str2, Object... objArr) throws JsonMappingException {
        MismatchedInputException from = MismatchedInputException.from(getParser(), cls, _format(str2, objArr));
        if (str == null) {
            throw from;
        }
        from.prependPath(cls, str);
        throw from;
    }

    public <T> T reportTrailingTokens(Class<?> cls, JsonParser jsonParser, JsonToken jsonToken) throws JsonMappingException {
        throw MismatchedInputException.from(jsonParser, cls, "Trailing token (of type " + jsonToken + ") found after value (bound as " + ClassUtil.nameOf(cls) + "): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`");
    }

    public <T> T reportUnresolvedObjectId(ObjectIdReader objectIdReader, Object obj) throws JsonMappingException {
        return (T) reportInputMismatch(objectIdReader.idProperty, String.format("No Object Id found for an instance of %s, to assign to property '%s'", ClassUtil.classNameOf(obj), objectIdReader.propertyName), new Object[0]);
    }

    public void reportWrongTokenException(JsonDeserializer<?> jsonDeserializer, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), jsonDeserializer.handledType(), jsonToken, _format(str, objArr));
    }

    public final void returnObjectBuffer(ObjectBuffer objectBuffer) {
        if (this._objectBuffer == null || objectBuffer.initialCapacity() >= this._objectBuffer.initialCapacity()) {
            this._objectBuffer = objectBuffer;
        }
    }

    public JsonMappingException weirdKeyException(Class<?> cls, String str, String str2) {
        JsonParser jsonParser = this._parser;
        StringBuilder t3 = u.t("Cannot deserialize Map key of type ", ClassUtil.nameOf(cls), " from String ", _quotedString(str), ": ");
        t3.append(str2);
        return InvalidFormatException.from(jsonParser, t3.toString(), str, cls);
    }

    public JsonMappingException weirdNativeValueException(Object obj, Class<?> cls) {
        return InvalidFormatException.from(this._parser, AbstractC1482f.j("Cannot deserialize value of type ", ClassUtil.nameOf(cls), " from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type ", ClassUtil.classNameOf(obj), ": incompatible types"), obj, cls);
    }

    public JsonMappingException weirdNumberException(Number number, Class<?> cls, String str) {
        JsonParser jsonParser = this._parser;
        StringBuilder t3 = u.t("Cannot deserialize value of type ", ClassUtil.nameOf(cls), " from number ", String.valueOf(number), ": ");
        t3.append(str);
        return InvalidFormatException.from(jsonParser, t3.toString(), number, cls);
    }

    public JsonMappingException weirdStringException(String str, Class<?> cls, String str2) {
        StringBuilder t3 = u.t("Cannot deserialize value of type ", ClassUtil.nameOf(cls), " from String ", _quotedString(str), ": ");
        t3.append(str2);
        return InvalidFormatException.from(this._parser, t3.toString(), str, cls);
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, JavaType javaType, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, javaType, _colonConcat("Unexpected token (" + jsonParser.currentToken() + "), expected " + jsonToken, str));
    }

    public final TokenBuffer bufferForInputBuffering() {
        return bufferForInputBuffering(getParser());
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public DeserializationConfig getConfig() {
        return this._config;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonToken, jsonParser, str, objArr);
    }

    public final boolean isEnabled(DatatypeFeature datatypeFeature) {
        return this._config.isEnabled(datatypeFeature);
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        JsonDeserializer<Object> findRootValueDeserializer = findRootValueDeserializer(javaType);
        if (findRootValueDeserializer != null) {
            return (T) findRootValueDeserializer.deserialize(jsonParser, this);
        }
        return (T) reportBadDefinition(javaType, "Could not find JsonDeserializer for type " + ClassUtil.getTypeDescription(javaType));
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(javaType, jsonParser.currentToken(), jsonParser, (String) null, new Object[0]);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._featureFlags) != 0;
    }

    public <T> T reportInputMismatch(Class<?> cls, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), cls, _format(str, objArr));
    }

    public void reportWrongTokenException(JavaType javaType, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), javaType, jsonToken, _format(str, objArr));
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        String _format = _format(str, objArr);
        LinkedNode<Object> problemHandlers = this._config.getProblemHandlers();
        if (problemHandlers == null) {
            if (_format == null) {
                String typeDescription = ClassUtil.getTypeDescription(javaType);
                if (jsonToken == null) {
                    _format = a.j("Unexpected end-of-input when trying read value of type ", typeDescription);
                } else {
                    StringBuilder t3 = u.t("Cannot deserialize value of type ", typeDescription, " from ", _shapeForToken(jsonToken), " (token `JsonToken.");
                    t3.append(jsonToken);
                    t3.append("`)");
                    _format = t3.toString();
                }
            }
            if (jsonToken != null && jsonToken.isScalarValue()) {
                jsonParser.getText();
            }
            reportInputMismatch(javaType, _format, new Object[0]);
            return null;
        }
        problemHandlers.value().getClass();
        throw new ClassCastException();
    }

    public final boolean isEnabled(StreamReadCapability streamReadCapability) {
        return this._readCapabilities.isEnabled(streamReadCapability);
    }

    public <T> T reportInputMismatch(JavaType javaType, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), javaType, _format(str, objArr));
    }

    public <T> T reportPropertyInputMismatch(JavaType javaType, String str, String str2, Object... objArr) throws JsonMappingException {
        return (T) reportPropertyInputMismatch(javaType.getRawClass(), str, str2, objArr);
    }

    public void reportWrongTokenException(Class<?> cls, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), cls, jsonToken, _format(str, objArr));
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, Class<?> cls, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, cls, _colonConcat("Unexpected token (" + jsonParser.currentToken() + "), expected " + jsonToken, str));
    }

    public <T> T reportInputMismatch(BeanProperty beanProperty, String str, Object... objArr) throws JsonMappingException {
        MismatchedInputException from = MismatchedInputException.from(getParser(), beanProperty == null ? null : beanProperty.getType(), _format(str, objArr));
        if (beanProperty != null) {
            AnnotatedMember member = beanProperty.getMember();
            if (member != null) {
                from.prependPath(member.getDeclaringClass(), beanProperty.getName());
                throw from;
            }
            throw from;
        }
        throw from;
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._readCapabilities = jsonParser == null ? null : jsonParser.getReadCapabilities();
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = deserializationConfig.getActiveView();
        this._parser = jsonParser;
        this._attributes = deserializationConfig.getAttributes();
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._readCapabilities = null;
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = null;
        this._parser = null;
        this._attributes = null;
    }
}
