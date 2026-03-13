package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.stub.StubApp;
import kotlin.text.Typography;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class MapLikeType extends TypeBase {
    protected final JavaType _keyType;
    protected final JavaType _valueType;

    public MapLikeType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z2) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2.hashCode() ^ javaType3.hashCode(), obj, obj2, z2);
        this._keyType = javaType2;
        this._valueType = javaType3;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this._class.getName());
        if (this._keyType != null && _hasNTypeParameters(2)) {
            sb2.append(Typography.less);
            sb2.append(this._keyType.toCanonical());
            sb2.append(',');
            sb2.append(this._valueType.toCanonical());
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
        MapLikeType mapLikeType = (MapLikeType) obj;
        return this._class == mapLikeType._class && this._keyType.equals(mapLikeType._keyType) && this._valueType.equals(mapLikeType._valueType);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType getContentType() {
        return this._valueType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        return TypeBase._classSignature(this._class, sb2, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        TypeBase._classSignature(this._class, sb2, false);
        sb2.append(Typography.less);
        this._keyType.getGenericSignature(sb2);
        this._valueType.getGenericSignature(sb2);
        sb2.append(StubApp.getString2(11035));
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType getKeyType() {
        return this._keyType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean hasHandlers() {
        return super.hasHandlers() || this._valueType.hasHandlers() || this._keyType.hasHandlers();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean isContainerType() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean isMapLikeType() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withHandlersFrom(JavaType javaType) {
        JavaType withHandlersFrom;
        JavaType withHandlersFrom2;
        JavaType withHandlersFrom3 = super.withHandlersFrom(javaType);
        JavaType keyType = javaType.getKeyType();
        if ((withHandlersFrom3 instanceof MapLikeType) && keyType != null && (withHandlersFrom2 = this._keyType.withHandlersFrom(keyType)) != this._keyType) {
            withHandlersFrom3 = ((MapLikeType) withHandlersFrom3).withKeyType(withHandlersFrom2);
        }
        JavaType contentType = javaType.getContentType();
        return (contentType == null || (withHandlersFrom = this._valueType.withHandlersFrom(contentType)) == this._valueType) ? withHandlersFrom3 : withHandlersFrom3.withContentType(withHandlersFrom);
    }

    public abstract MapLikeType withKeyType(JavaType javaType);

    public abstract MapLikeType withKeyValueHandler(Object obj);
}
