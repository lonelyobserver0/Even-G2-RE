package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.stub.StubApp;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ResolvedRecursiveType extends TypeBase {
    protected JavaType _referencedType;

    public ResolvedRecursiveType(Class<?> cls, TypeBindings typeBindings) {
        super(cls, typeBindings, null, null, 0, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public TypeBindings getBindings() {
        JavaType javaType = this._referencedType;
        return javaType != null ? javaType.getBindings() : super.getBindings();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        JavaType javaType = this._referencedType;
        return javaType != null ? javaType.getErasedSignature(sb2) : sb2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        JavaType javaType = this._referencedType;
        if (javaType != null) {
            return javaType.getErasedSignature(sb2);
        }
        sb2.append(StubApp.getString2(DilithiumEngine.DilithiumPolyT1PackedBytes));
        return sb2;
    }

    public JavaType getSelfReferencedType() {
        return this._referencedType;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public JavaType getSuperClass() {
        JavaType javaType = this._referencedType;
        return javaType != null ? javaType.getSuperClass() : super.getSuperClass();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean isContainerType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    public void setReference(JavaType javaType) {
        if (this._referencedType == null) {
            this._referencedType = javaType;
            return;
        }
        throw new IllegalStateException(StubApp.getString2(11046) + this._referencedType + StubApp.getString2(11047) + javaType);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(StubApp.getString2(11048));
        JavaType javaType = this._referencedType;
        if (javaType == null) {
            sb2.append(StubApp.getString2(11049));
        } else {
            sb2.append(javaType.getRawClass().getName());
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentValueHandler(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withStaticTyping() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withTypeHandler(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withValueHandler(Object obj) {
        return this;
    }
}
