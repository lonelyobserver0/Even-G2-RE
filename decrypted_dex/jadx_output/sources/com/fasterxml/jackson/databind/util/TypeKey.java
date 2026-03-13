package com.fasterxml.jackson.databind.util;

import Xa.h;
import com.fasterxml.jackson.databind.JavaType;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TypeKey {
    protected Class<?> _class;
    protected int _hashCode;
    protected boolean _isTyped;
    protected JavaType _type;

    public TypeKey(Class<?> cls, boolean z2) {
        this._class = cls;
        this._type = null;
        this._isTyped = z2;
        this._hashCode = z2 ? typedHash(cls) : untypedHash(cls);
    }

    public static final int typedHash(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int untypedHash(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        TypeKey typeKey = (TypeKey) obj;
        if (typeKey._isTyped != this._isTyped) {
            return false;
        }
        Class<?> cls = this._class;
        return cls != null ? typeKey._class == cls : this._type.equals(typeKey._type);
    }

    public Class<?> getRawType() {
        return this._class;
    }

    public JavaType getType() {
        return this._type;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public boolean isTyped() {
        return this._isTyped;
    }

    public final String toString() {
        Class<?> cls = this._class;
        String string2 = StubApp.getString2(265);
        String string22 = StubApp.getString2(11147);
        if (cls != null) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(11148));
            h.w(this._class, sb2, string22);
            sb2.append(this._isTyped);
            sb2.append(string2);
            return sb2.toString();
        }
        return StubApp.getString2(11149) + this._type + string22 + this._isTyped + string2;
    }

    public static final int typedHash(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    public static final int untypedHash(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    public TypeKey(JavaType javaType, boolean z2) {
        this._type = javaType;
        this._class = null;
        this._isTyped = z2;
        this._hashCode = z2 ? typedHash(javaType) : untypedHash(javaType);
    }
}
