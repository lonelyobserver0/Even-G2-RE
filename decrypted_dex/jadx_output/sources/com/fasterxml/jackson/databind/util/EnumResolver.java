package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import i2.u;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class EnumResolver implements Serializable {
    protected final Enum<?> _defaultValue;
    protected final Class<Enum<?>> _enumClass;
    protected final Enum<?>[] _enums;
    protected final HashMap<String, Enum<?>> _enumsById;
    protected final boolean _isFromIntValue;
    protected final boolean _isIgnoreCase;

    public EnumResolver(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> hashMap, Enum<?> r42, boolean z2, boolean z10) {
        this._enumClass = cls;
        this._enums = enumArr;
        this._enumsById = hashMap;
        this._defaultValue = r42;
        this._isIgnoreCase = z2;
        this._isFromIntValue = z10;
    }

    public static EnumResolver _constructFor(Class<?> cls, AnnotationIntrospector annotationIntrospector, boolean z2) {
        Class<Enum<?>> _enumClass = _enumClass(cls);
        Enum<?>[] _enumConstants = _enumConstants(cls);
        String[] findEnumValues = annotationIntrospector.findEnumValues(_enumClass, _enumConstants, new String[_enumConstants.length]);
        String[][] strArr = new String[findEnumValues.length][];
        annotationIntrospector.findEnumAliases(_enumClass, _enumConstants, strArr);
        HashMap hashMap = new HashMap();
        int length = _enumConstants.length;
        for (int i3 = 0; i3 < length; i3++) {
            Enum<?> r72 = _enumConstants[i3];
            String str = findEnumValues[i3];
            if (str == null) {
                str = r72.name();
            }
            hashMap.put(str, r72);
            String[] strArr2 = strArr[i3];
            if (strArr2 != null) {
                for (String str2 : strArr2) {
                    if (!hashMap.containsKey(str2)) {
                        hashMap.put(str2, r72);
                    }
                }
            }
        }
        return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, _enumClass), z2, false);
    }

    public static EnumResolver _constructUsingMethod(Class<?> cls, AnnotatedMember annotatedMember, AnnotationIntrospector annotationIntrospector, boolean z2) {
        Class<Enum<?>> _enumClass = _enumClass(cls);
        Enum<?>[] _enumConstants = _enumConstants(cls);
        HashMap hashMap = new HashMap();
        int length = _enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, _enumClass), z2, _isIntType(annotatedMember.getRawType()));
            }
            Enum<?> r42 = _enumConstants[length];
            try {
                Object value = annotatedMember.getValue(r42);
                if (value != null) {
                    hashMap.put(value.toString(), r42);
                }
            } catch (Exception e10) {
                StringBuilder sb2 = new StringBuilder("Failed to access @JsonValue of Enum value ");
                sb2.append(r42);
                sb2.append(": ");
                throw new IllegalArgumentException(u.r(e10, sb2));
            }
        }
    }

    public static EnumResolver _constructUsingToString(Class<?> cls, AnnotationIntrospector annotationIntrospector, boolean z2) {
        Class<Enum<?>> _enumClass = _enumClass(cls);
        Enum<?>[] _enumConstants = _enumConstants(cls);
        HashMap hashMap = new HashMap();
        String[][] strArr = new String[_enumConstants.length][];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumAliases(_enumClass, _enumConstants, strArr);
        }
        int length = _enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, _enumClass), z2, false);
            }
            Enum<?> r42 = _enumConstants[length];
            hashMap.put(r42.toString(), r42);
            String[] strArr2 = strArr[length];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, r42);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<Enum<?>> _enumClass(Class<?> cls) {
        return cls;
    }

    public static Enum<?>[] _enumConstants(Class<?> cls) {
        Enum<?>[] enumConstants = _enumClass(cls).getEnumConstants();
        if (enumConstants != null) {
            return enumConstants;
        }
        throw new IllegalArgumentException("No enum constants for class ".concat(cls.getName()));
    }

    public static Enum<?> _enumDefault(AnnotationIntrospector annotationIntrospector, Class<?> cls) {
        if (annotationIntrospector != null) {
            return annotationIntrospector.findDefaultEnumValue(_enumClass(cls));
        }
        return null;
    }

    public static boolean _isIntType(Class<?> cls) {
        if (cls.isPrimitive()) {
            cls = ClassUtil.wrapperType(cls);
        }
        return cls == Long.class || cls == Integer.class || cls == Short.class || cls == Byte.class;
    }

    public static EnumResolver constructFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        return _constructFor(cls, deserializationConfig.getAnnotationIntrospector(), deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS));
    }

    public static EnumResolver constructUsingMethod(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMember annotatedMember) {
        return _constructUsingMethod(cls, annotatedMember, deserializationConfig.getAnnotationIntrospector(), deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS));
    }

    public static EnumResolver constructUsingToString(DeserializationConfig deserializationConfig, Class<?> cls) {
        return _constructUsingToString(cls, deserializationConfig.getAnnotationIntrospector(), deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS));
    }

    public Enum<?> _findEnumCaseInsensitive(String str) {
        for (Map.Entry<String, Enum<?>> entry : this._enumsById.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public CompactStringObjectMap constructLookup() {
        return CompactStringObjectMap.construct(this._enumsById);
    }

    public Enum<?> findEnum(String str) {
        Enum<?> r02 = this._enumsById.get(str);
        return (r02 == null && this._isIgnoreCase) ? _findEnumCaseInsensitive(str) : r02;
    }

    public Enum<?> getDefaultValue() {
        return this._defaultValue;
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public Collection<String> getEnumIds() {
        return this._enumsById.keySet();
    }

    public Enum<?>[] getRawEnums() {
        return this._enums;
    }

    public boolean isFromIntValue() {
        return this._isFromIntValue;
    }
}
