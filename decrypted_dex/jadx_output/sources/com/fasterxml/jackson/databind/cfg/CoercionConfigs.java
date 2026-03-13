package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Serializable;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CoercionConfigs implements Serializable {
    private static final int TARGET_TYPE_COUNT = LogicalType.values().length;
    protected CoercionAction _defaultAction;
    protected final MutableCoercionConfig _defaultCoercions;
    protected Map<Class<?>, MutableCoercionConfig> _perClassCoercions;
    protected MutableCoercionConfig[] _perTypeCoercions;

    /* renamed from: com.fasterxml.jackson.databind.cfg.CoercionConfigs$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape;

        static {
            int[] iArr = new int[CoercionInputShape.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape = iArr;
            try {
                iArr[CoercionInputShape.EmptyArray.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape[CoercionInputShape.Float.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape[CoercionInputShape.Integer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CoercionConfigs() {
        this(CoercionAction.TryConvert, new MutableCoercionConfig(), null, null);
    }

    public boolean _isScalarType(LogicalType logicalType) {
        return logicalType == LogicalType.Float || logicalType == LogicalType.Integer || logicalType == LogicalType.Boolean || logicalType == LogicalType.DateTime;
    }

    public CoercionAction findCoercion(DeserializationConfig deserializationConfig, LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        MutableCoercionConfig mutableCoercionConfig;
        CoercionAction findAction;
        MutableCoercionConfig mutableCoercionConfig2;
        CoercionAction findAction2;
        Map<Class<?>, MutableCoercionConfig> map = this._perClassCoercions;
        if (map != null && cls != null && (mutableCoercionConfig2 = map.get(cls)) != null && (findAction2 = mutableCoercionConfig2.findAction(coercionInputShape)) != null) {
            return findAction2;
        }
        MutableCoercionConfig[] mutableCoercionConfigArr = this._perTypeCoercions;
        if (mutableCoercionConfigArr != null && logicalType != null && (mutableCoercionConfig = mutableCoercionConfigArr[logicalType.ordinal()]) != null && (findAction = mutableCoercionConfig.findAction(coercionInputShape)) != null) {
            return findAction;
        }
        CoercionAction findAction3 = this._defaultCoercions.findAction(coercionInputShape);
        if (findAction3 != null) {
            return findAction3;
        }
        int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape[coercionInputShape.ordinal()];
        if (i3 == 1) {
            return deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) ? CoercionAction.AsNull : CoercionAction.Fail;
        }
        if (i3 != 2) {
            if (i3 == 3 && logicalType == LogicalType.Enum && deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return CoercionAction.Fail;
            }
        } else if (logicalType == LogicalType.Integer) {
            return deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT) ? CoercionAction.TryConvert : CoercionAction.Fail;
        }
        boolean _isScalarType = _isScalarType(logicalType);
        return (!_isScalarType || deserializationConfig.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS) || (logicalType == LogicalType.Float && coercionInputShape == CoercionInputShape.Integer)) ? coercionInputShape == CoercionInputShape.EmptyString ? (_isScalarType || deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) ? CoercionAction.AsNull : logicalType == LogicalType.OtherScalar ? CoercionAction.TryConvert : CoercionAction.Fail : this._defaultAction : CoercionAction.Fail;
    }

    public CoercionAction findCoercionFromBlankString(DeserializationConfig deserializationConfig, LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        Boolean bool;
        CoercionAction coercionAction2;
        MutableCoercionConfig mutableCoercionConfig;
        MutableCoercionConfig mutableCoercionConfig2;
        Map<Class<?>, MutableCoercionConfig> map = this._perClassCoercions;
        if (map == null || cls == null || (mutableCoercionConfig2 = map.get(cls)) == null) {
            bool = null;
            coercionAction2 = null;
        } else {
            bool = mutableCoercionConfig2.getAcceptBlankAsEmpty();
            coercionAction2 = mutableCoercionConfig2.findAction(CoercionInputShape.EmptyString);
        }
        MutableCoercionConfig[] mutableCoercionConfigArr = this._perTypeCoercions;
        if (mutableCoercionConfigArr != null && logicalType != null && (mutableCoercionConfig = mutableCoercionConfigArr[logicalType.ordinal()]) != null) {
            if (bool == null) {
                bool = mutableCoercionConfig.getAcceptBlankAsEmpty();
            }
            if (coercionAction2 == null) {
                coercionAction2 = mutableCoercionConfig.findAction(CoercionInputShape.EmptyString);
            }
        }
        if (bool == null) {
            bool = this._defaultCoercions.getAcceptBlankAsEmpty();
        }
        if (coercionAction2 == null) {
            coercionAction2 = this._defaultCoercions.findAction(CoercionInputShape.EmptyString);
        }
        if (!Boolean.FALSE.equals(bool)) {
            if (coercionAction2 != null) {
                return coercionAction2;
            }
            if (_isScalarType(logicalType) || deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return CoercionAction.AsNull;
            }
        }
        return coercionAction;
    }

    public CoercionConfigs(CoercionAction coercionAction, MutableCoercionConfig mutableCoercionConfig, MutableCoercionConfig[] mutableCoercionConfigArr, Map<Class<?>, MutableCoercionConfig> map) {
        this._defaultCoercions = mutableCoercionConfig;
        this._defaultAction = coercionAction;
        this._perTypeCoercions = mutableCoercionConfigArr;
        this._perClassCoercions = map;
    }
}
