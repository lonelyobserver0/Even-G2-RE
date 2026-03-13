package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DatatypeFeatures implements Serializable {
    private final int _enabledFor1;
    private final int _enabledFor2;
    private final int _explicitFor1;
    private final int _explicitFor2;

    public static class DefaultHolder {
        private static final DatatypeFeatures DEFAULT_FEATURES = new DatatypeFeatures(collectDefaults(EnumFeature.values()), 0, collectDefaults(JsonNodeFeature.values()), 0);

        /* JADX WARN: Incorrect types in method signature: <F:Ljava/lang/Enum<TF;>;:Lcom/fasterxml/jackson/core/util/JacksonFeature;>([TF;)I */
        /* JADX WARN: Multi-variable type inference failed */
        private static int collectDefaults(Enum[] enumArr) {
            int i3 = 0;
            for (CBORParser.Feature feature : enumArr) {
                if (feature.enabledByDefault()) {
                    i3 |= feature.getMask();
                }
            }
            return i3;
        }

        public static DatatypeFeatures getDefault() {
            return DEFAULT_FEATURES;
        }
    }

    public DatatypeFeatures(int i3, int i10, int i11, int i12) {
        this._enabledFor1 = i3;
        this._explicitFor1 = i10;
        this._enabledFor2 = i11;
        this._explicitFor2 = i12;
    }

    public static DatatypeFeatures defaultFeatures() {
        return DefaultHolder.getDefault();
    }

    public boolean isEnabled(DatatypeFeature datatypeFeature) {
        int featureIndex = datatypeFeature.featureIndex();
        if (featureIndex == 0) {
            return datatypeFeature.enabledIn(this._enabledFor1);
        }
        if (featureIndex == 1) {
            return datatypeFeature.enabledIn(this._enabledFor2);
        }
        VersionUtil.throwInternal();
        return false;
    }
}
