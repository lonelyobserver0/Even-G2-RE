package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.DatatypeFeature;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.util.Collection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig> implements Serializable {
    private static final int DESER_FEATURE_DEFAULTS = MapperConfig.collectFeatureDefaults(DeserializationFeature.class);
    protected final CoercionConfigs _coercionConfigs;
    protected final ConstructorDetector _ctorDetector;
    protected final int _deserFeatures;
    protected final int _formatReadFeatures;
    protected final int _formatReadFeaturesToChange;
    protected final JsonNodeFactory _nodeFactory;
    protected final int _parserFeatures;
    protected final int _parserFeaturesToChange;
    protected final LinkedNode<Object> _problemHandlers;

    public DeserializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, CoercionConfigs coercionConfigs, DatatypeFeatures datatypeFeatures) {
        super(baseSettings, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, datatypeFeatures);
        this._deserFeatures = DESER_FEATURE_DEFAULTS;
        this._problemHandlers = null;
        this._nodeFactory = JsonNodeFactory.instance;
        this._ctorDetector = null;
        this._coercionConfigs = coercionConfigs;
        this._parserFeatures = 0;
        this._parserFeaturesToChange = 0;
        this._formatReadFeatures = 0;
        this._formatReadFeaturesToChange = 0;
    }

    public CoercionAction findCoercionAction(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        return this._coercionConfigs.findCoercion(this, logicalType, cls, coercionInputShape);
    }

    public CoercionAction findCoercionFromBlankString(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        return this._coercionConfigs.findCoercionFromBlankString(this, logicalType, cls, coercionAction);
    }

    public TypeDeserializer findTypeDeserializer(JavaType javaType) throws JsonMappingException {
        Collection<NamedType> collectAndResolveSubtypesByTypeId;
        AnnotatedClass classInfo = introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> findTypeResolver = getAnnotationIntrospector().findTypeResolver(this, classInfo, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = getDefaultTyper(javaType);
            collectAndResolveSubtypesByTypeId = null;
            if (findTypeResolver == null) {
                return null;
            }
        } else {
            collectAndResolveSubtypesByTypeId = getSubtypeResolver().collectAndResolveSubtypesByTypeId(this, classInfo);
        }
        return findTypeResolver.buildTypeDeserializer(this, javaType, collectAndResolveSubtypesByTypeId);
    }

    public ConstructorDetector getConstructorDetector() {
        ConstructorDetector constructorDetector = this._ctorDetector;
        return constructorDetector == null ? ConstructorDetector.DEFAULT : constructorDetector;
    }

    public final int getDeserializationFeatures() {
        return this._deserFeatures;
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._nodeFactory;
    }

    public LinkedNode<Object> getProblemHandlers() {
        return this._problemHandlers;
    }

    public JsonParser initialize(JsonParser jsonParser) {
        int i3 = this._parserFeaturesToChange;
        if (i3 != 0) {
            jsonParser.overrideStdFeatures(this._parserFeatures, i3);
        }
        int i10 = this._formatReadFeaturesToChange;
        if (i10 != 0) {
            jsonParser.overrideFormatFeatures(this._formatReadFeatures, i10);
        }
        return jsonParser;
    }

    public BeanDescription introspect(JavaType javaType) {
        return getClassIntrospector().forDeserialization(this, javaType, this);
    }

    public BeanDescription introspectForBuilder(JavaType javaType, BeanDescription beanDescription) {
        return getClassIntrospector().forDeserializationWithBuilder(this, javaType, this, beanDescription);
    }

    public BeanDescription introspectForCreation(JavaType javaType) {
        return getClassIntrospector().forCreation(this, javaType, this);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._deserFeatures) != 0;
    }

    public boolean useRootWrapping() {
        return this._rootName != null ? !r0.isEmpty() : isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withMapperFeatures(long j) {
        return new DeserializationConfig(this, j, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public final boolean isEnabled(DatatypeFeature datatypeFeature) {
        return this._datatypeFeatures.isEnabled(datatypeFeature);
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, long j, int i3, int i10, int i11, int i12, int i13) {
        super(deserializationConfig, j);
        this._deserFeatures = i3;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = i10;
        this._parserFeaturesToChange = i11;
        this._formatReadFeatures = i12;
        this._formatReadFeaturesToChange = i13;
    }
}
