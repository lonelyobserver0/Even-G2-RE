package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class TypeSerializer {

    /* renamed from: com.fasterxml.jackson.databind.jsontype.TypeSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As;

        static {
            int[] iArr = new int[JsonTypeInfo.As.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = iArr;
            try {
                iArr[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.As.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public abstract TypeSerializer forProperty(BeanProperty beanProperty);

    public abstract String getPropertyName();

    public abstract JsonTypeInfo.As getTypeInclusion();

    public WritableTypeId typeId(Object obj, JsonToken jsonToken) {
        WritableTypeId writableTypeId = new WritableTypeId(obj, jsonToken);
        int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[getTypeInclusion().ordinal()];
        if (i3 == 1) {
            writableTypeId.include = WritableTypeId.Inclusion.PAYLOAD_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
            return writableTypeId;
        }
        if (i3 == 2) {
            writableTypeId.include = WritableTypeId.Inclusion.PARENT_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
            return writableTypeId;
        }
        if (i3 == 3) {
            writableTypeId.include = WritableTypeId.Inclusion.METADATA_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
            return writableTypeId;
        }
        if (i3 == 4) {
            writableTypeId.include = WritableTypeId.Inclusion.WRAPPER_ARRAY;
            return writableTypeId;
        }
        if (i3 != 5) {
            VersionUtil.throwInternal();
            return writableTypeId;
        }
        writableTypeId.include = WritableTypeId.Inclusion.WRAPPER_OBJECT;
        return writableTypeId;
    }

    public abstract WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    public abstract WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    public WritableTypeId typeId(Object obj, JsonToken jsonToken, Object obj2) {
        WritableTypeId typeId = typeId(obj, jsonToken);
        typeId.id = obj2;
        return typeId;
    }

    public WritableTypeId typeId(Object obj, Class<?> cls, JsonToken jsonToken) {
        WritableTypeId typeId = typeId(obj, jsonToken);
        typeId.forValueType = cls;
        return typeId;
    }
}
