package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class EnumValues implements Serializable {
    private final Class<Enum<?>> _enumClass;
    private final SerializableString[] _textual;
    private final Enum<?>[] _values;

    private EnumValues(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        this._enumClass = cls;
        this._values = cls.getEnumConstants();
        this._textual = serializableStringArr;
    }

    public static EnumValues construct(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        return new EnumValues(cls, serializableStringArr);
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> findEnumType = ClassUtil.findEnumType(cls);
        Enum<?>[] enumArr = (Enum[]) findEnumType.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(cls.getName()));
        }
        String[] findEnumValues = mapperConfig.getAnnotationIntrospector().findEnumValues(findEnumType, enumArr, new String[enumArr.length]);
        SerializableString[] serializableStringArr = new SerializableString[enumArr.length];
        int length = enumArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            Enum<?> r52 = enumArr[i3];
            String str = findEnumValues[i3];
            if (str == null) {
                str = r52.name();
            }
            serializableStringArr[r52.ordinal()] = mapperConfig.compileString(str);
        }
        return construct(cls, serializableStringArr);
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public SerializableString serializedValueFor(Enum<?> r22) {
        return this._textual[r22.ordinal()];
    }
}
