package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.DatatypeFeature;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> implements Serializable {
    protected static final PrettyPrinter DEFAULT_PRETTY_PRINTER = new DefaultPrettyPrinter();
    private static final int SER_FEATURE_DEFAULTS = MapperConfig.collectFeatureDefaults(SerializationFeature.class);
    protected final PrettyPrinter _defaultPrettyPrinter;
    protected final int _formatWriteFeatures;
    protected final int _formatWriteFeaturesToChange;
    protected final int _generatorFeatures;
    protected final int _generatorFeaturesToChange;
    protected final int _serFeatures;

    public SerializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, DatatypeFeatures datatypeFeatures) {
        super(baseSettings, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, datatypeFeatures);
        this._serFeatures = SER_FEATURE_DEFAULTS;
        this._defaultPrettyPrinter = DEFAULT_PRETTY_PRINTER;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
    }

    public PrettyPrinter constructDefaultPrettyPrinter() {
        PrettyPrinter prettyPrinter = this._defaultPrettyPrinter;
        return prettyPrinter instanceof Instantiatable ? (PrettyPrinter) ((Instantiatable) prettyPrinter).createInstance() : prettyPrinter;
    }

    public PrettyPrinter getDefaultPrettyPrinter() {
        return this._defaultPrettyPrinter;
    }

    public FilterProvider getFilterProvider() {
        return null;
    }

    public void initialize(JsonGenerator jsonGenerator) {
        PrettyPrinter constructDefaultPrettyPrinter;
        if (SerializationFeature.INDENT_OUTPUT.enabledIn(this._serFeatures) && jsonGenerator.getPrettyPrinter() == null && (constructDefaultPrettyPrinter = constructDefaultPrettyPrinter()) != null) {
            jsonGenerator.setPrettyPrinter(constructDefaultPrettyPrinter);
        }
        boolean enabledIn = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._serFeatures);
        int i3 = this._generatorFeaturesToChange;
        if (i3 != 0 || enabledIn) {
            int i10 = this._generatorFeatures;
            if (enabledIn) {
                int mask = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i10 |= mask;
                i3 |= mask;
            }
            jsonGenerator.overrideStdFeatures(i10, i3);
        }
        int i11 = this._formatWriteFeaturesToChange;
        if (i11 != 0) {
            jsonGenerator.overrideFormatFeatures(this._formatWriteFeatures, i11);
        }
    }

    public BeanDescription introspect(JavaType javaType) {
        return getClassIntrospector().forSerialization(this, javaType, this);
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return (serializationFeature.getMask() & this._serFeatures) != 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _withMapperFeatures(long j) {
        return new SerializationConfig(this, j, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public final boolean isEnabled(DatatypeFeature datatypeFeature) {
        return this._datatypeFeatures.isEnabled(datatypeFeature);
    }

    private SerializationConfig(SerializationConfig serializationConfig, long j, int i3, int i10, int i11, int i12, int i13) {
        super(serializationConfig, j);
        this._serFeatures = i3;
        serializationConfig.getClass();
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = i10;
        this._generatorFeaturesToChange = i11;
        this._formatWriteFeatures = i12;
        this._formatWriteFeaturesToChange = i13;
    }
}
