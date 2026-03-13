package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.stub.StubApp;
import kotlin.text.Typography;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SimpleType extends TypeBase {
    public SimpleType(Class<?> cls) {
        this(cls, TypeBindings.emptyBindings(), null, null);
    }

    public static SimpleType constructUnsafe(Class<?> cls) {
        return new SimpleType(cls, null, null, null, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this._class.getName());
        int size = this._bindings.size();
        if (size > 0 && _hasNTypeParameters(size)) {
            sb2.append(Typography.less);
            for (int i3 = 0; i3 < size; i3++) {
                JavaType containedType = containedType(i3);
                if (i3 > 0) {
                    sb2.append(',');
                }
                sb2.append(containedType.toCanonical());
            }
            sb2.append(Typography.greater);
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        SimpleType simpleType = (SimpleType) obj;
        if (simpleType._class != this._class) {
            return false;
        }
        return this._bindings.equals(simpleType._bindings);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        return TypeBase._classSignature(this._class, sb2, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        TypeBase._classSignature(this._class, sb2, false);
        int size = this._bindings.size();
        if (size > 0) {
            sb2.append(Typography.less);
            for (int i3 = 0; i3 < size; i3++) {
                sb2 = containedType(i3).getGenericSignature(sb2);
            }
            sb2.append(Typography.greater);
        }
        sb2.append(';');
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean hasContentType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean isContainerType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(StubApp.getString2(11050));
        sb2.append(buildCanonicalName());
        sb2.append(']');
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        throw new IllegalArgumentException(StubApp.getString2(11051));
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        throw new IllegalArgumentException(StubApp.getString2(11052));
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        this(cls, typeBindings, javaType, javaTypeArr, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withContentValueHandler(Object obj) {
        throw new IllegalArgumentException(StubApp.getString2(11053));
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withStaticTyping() {
        return this._asStatic ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, this._typeHandler, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withTypeHandler(Object obj) {
        return this._typeHandler == obj ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, obj, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withValueHandler(Object obj) {
        return obj == this._valueHandler ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, obj, this._typeHandler, this._asStatic);
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z2) {
        super(cls, typeBindings, javaType, javaTypeArr, 0, obj, obj2, z2);
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i3, Object obj, Object obj2, boolean z2) {
        super(cls, typeBindings, javaType, javaTypeArr, i3, obj, obj2, z2);
    }
}
