package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class TypeBase extends JavaType implements JsonSerializable {
    private static final TypeBindings NO_BINDINGS = TypeBindings.emptyBindings();
    private static final JavaType[] NO_TYPES = new JavaType[0];
    protected final TypeBindings _bindings;
    volatile transient String _canonicalName;
    protected final JavaType _superClass;
    protected final JavaType[] _superInterfaces;

    public TypeBase(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i3, Object obj, Object obj2, boolean z2) {
        super(cls, i3, obj, obj2, z2);
        this._bindings = typeBindings == null ? NO_BINDINGS : typeBindings;
        this._superClass = javaType;
        this._superInterfaces = javaTypeArr;
    }

    public static StringBuilder _classSignature(Class<?> cls, StringBuilder sb2, boolean z2) {
        if (!cls.isPrimitive()) {
            sb2.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = name.charAt(i3);
                if (charAt == '.') {
                    charAt = '/';
                }
                sb2.append(charAt);
            }
            if (z2) {
                sb2.append(';');
            }
            return sb2;
        }
        if (cls == Boolean.TYPE) {
            sb2.append('Z');
            return sb2;
        }
        if (cls == Byte.TYPE) {
            sb2.append('B');
            return sb2;
        }
        if (cls == Short.TYPE) {
            sb2.append('S');
            return sb2;
        }
        if (cls == Character.TYPE) {
            sb2.append('C');
            return sb2;
        }
        if (cls == Integer.TYPE) {
            sb2.append('I');
            return sb2;
        }
        if (cls == Long.TYPE) {
            sb2.append('J');
            return sb2;
        }
        if (cls == Float.TYPE) {
            sb2.append('F');
            return sb2;
        }
        if (cls == Double.TYPE) {
            sb2.append('D');
            return sb2;
        }
        if (cls == Void.TYPE) {
            sb2.append('V');
            return sb2;
        }
        throw new IllegalStateException(StubApp.getString2(11054).concat(cls.getName()));
    }

    public boolean _hasNTypeParameters(int i3) {
        return this._class.getTypeParameters().length == i3;
    }

    public String buildCanonicalName() {
        return this._class.getName();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType containedType(int i3) {
        return this._bindings.getBoundType(i3);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public int containedTypeCount() {
        return this._bindings.size();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType findSuperType(Class<?> cls) {
        JavaType findSuperType;
        JavaType[] javaTypeArr;
        if (cls == this._class) {
            return this;
        }
        if (cls.isInterface() && (javaTypeArr = this._superInterfaces) != null) {
            int length = javaTypeArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                JavaType findSuperType2 = this._superInterfaces[i3].findSuperType(cls);
                if (findSuperType2 != null) {
                    return findSuperType2;
                }
            }
        }
        JavaType javaType = this._superClass;
        if (javaType == null || (findSuperType = javaType.findSuperType(cls)) == null) {
            return null;
        }
        return findSuperType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public TypeBindings getBindings() {
        return this._bindings;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public List<JavaType> getInterfaces() {
        int length;
        JavaType[] javaTypeArr = this._superInterfaces;
        if (javaTypeArr != null && (length = javaTypeArr.length) != 0) {
            return length != 1 ? Arrays.asList(javaTypeArr) : Collections.singletonList(javaTypeArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType getSuperClass() {
        return this._superClass;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(toCanonical());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writableTypeId = new WritableTypeId(this, JsonToken.VALUE_STRING);
        typeSerializer.writeTypePrefix(jsonGenerator, writableTypeId);
        serialize(jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeId);
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public String toCanonical() {
        String str = this._canonicalName;
        return str == null ? buildCanonicalName() : str;
    }
}
